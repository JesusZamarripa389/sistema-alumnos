-- =====================================================================
-- SCRIPT DE CONFIGURACIÓN DE BASE DE DATOS (ESQUELETO)
-- Proyecto: Sistema de Control de Alumnos (CRUD)
-- =====================================================================

-- 1. CREACIÓN DE LA BASE DE DATOS
CREATE DATABASE Escuela;
GO

USE Escuela;
GO

-- 2. CREACIÓN DE LA ESTRUCTURA (TABLAS)
CREATE TABLE Alumnos (
    ID INT PRIMARY KEY IDENTITY(1,1),           -- Llave primaria autoincremental
    Matricula VARCHAR(100) NOT NULL UNIQUE,     -- Tamaño ajustado para soportar datos encriptados
    Nombre VARCHAR(30) NOT NULL,                -- Nombre del alumno
    Sexo CHAR(1) NOT NULL CHECK (Sexo IN ('F', 'M')), -- Restricción de género
    Email VARCHAR(100) NOT NULL UNIQUE,         -- Tamaño ajustado para soportar datos encriptados
    Edad INT NOT NULL CHECK (Edad > 0),         -- Validación de edad mayor a 0
    Activo BIT NOT NULL                         -- Estado activo (1) o inactivo (0)
);
GO

-- 3. CONFIGURACIÓN DE ENCRIPTACIÓN (LLAVE MAESTRA Y CERTIFICADOS)
-- Reemplaza 'TuPasswordSeguro123!' con una contraseña propia en producción
CREATE MASTER KEY ENCRYPTION BY PASSWORD = 'TuPasswordSeguro123!';
GO

CREATE CERTIFICATE CertificadoAES 
WITH SUBJECT = 'Certificado para Encriptación AES256';
GO

CREATE SYMMETRIC KEY AES_Key 
WITH ALGORITHM = AES_256 ENCRYPTION BY CERTIFICATE CertificadoAES;
GO


-- 4. INSERCIÓN DE DATOS SEMILLA (REGISTROS DE PRUEBA)
-- Abrimos la llave simétrica para encriptar los datos iniciales
OPEN SYMMETRIC KEY AES_Key DECRYPTION BY CERTIFICATE CertificadoAES;

INSERT INTO Alumnos (Matricula, Nombre, Sexo, Email, Edad, Activo) 
VALUES 
(ENCRYPTBYKEY(KEY_GUID('AES_Key'), 'A0000001'), 'Juan Pérez', 'M', ENCRYPTBYKEY(KEY_GUID('AES_Key'), 'juan.perez@example.com'), 20, 1),
(ENCRYPTBYKEY(KEY_GUID('AES_Key'), 'A0000002'), 'María López', 'F', ENCRYPTBYKEY(KEY_GUID('AES_Key'), 'maria.lopez@example.com'), 22, 1),
(ENCRYPTBYKEY(KEY_GUID('AES_Key'), 'A0000003'), 'Luis García', 'M', ENCRYPTBYKEY(KEY_GUID('AES_Key'), 'luis.garcia@example.com'), 19, 1);

CLOSE SYMMETRIC KEY AES_Key;
GO


-- 5. COMPONENTES PROGRAMABLES (VISTAS, PROCEDIMIENTOS Y TRIGGERS)

-- Vista para consultar únicamente alumnos activos
CREATE VIEW VistaAlumnosActivos AS 
SELECT 
    ID, 
    CONCAT(Nombre, ' ', Sexo) AS Nombre_Completo,
    Edad, 
    Email 
FROM Alumnos 
WHERE Activo = 1;
GO

-- Procedimiento almacenado para actualizar el correo electrónico
CREATE PROCEDURE ActualizarCorreoAlumno 
    @Matricula VARCHAR(8), 
    @NuevoEmail VARCHAR(30)
AS 
BEGIN 
    IF EXISTS (SELECT 1 FROM Alumnos WHERE Matricula = @Matricula) 
    BEGIN 
        UPDATE Alumnos SET Email = @NuevoEmail WHERE Matricula = @Matricula;
    END 
    ELSE 
    BEGIN 
        PRINT 'No se encontró el alumno con la matrícula proporcionada';
    END 
END;
GO

-- Trigger para verificar e informar sobre la edad del alumno tras una actualización
CREATE TRIGGER VerificarEdadAlumno 
ON Alumnos 
AFTER UPDATE 
AS 
BEGIN 
    DECLARE @Edad INT;
    SELECT @Edad = Edad FROM INSERTED; 
    
    IF @Edad > 30 
    BEGIN 
        PRINT '¡Advertencia! El alumno tiene más de 30 años.';
    END 
END;
GO