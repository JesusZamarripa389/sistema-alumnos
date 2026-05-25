-- Crear la base de datos llamada AlumnosDB
CREATE DATABASE Escuela;

--EJERCICIO 1.		CRUD

-- Seleccionar la base de datos para trabajar con ella
USE Escuela;

-- Crear la tabla Alumnos con sus respectivas columnas y restricciones
CREATE TABLE Alumnos (
    ID INT PRIMARY KEY IDENTITY(1,1), -- Columna ID como llave primaria autoincremental
    Matricula VARCHAR(8) NOT NULL UNIQUE, -- Columna Matricula, obligatoria y única, de 8 caracteres máximo
    Nombre VARCHAR(30) NOT NULL, -- Columna Nombre, obligatoria, de hasta 30 caracteres
    Sexo CHAR(1) NOT NULL CHECK (Sexo IN ('F', 'M')), -- Columna Sexo, obligatoria, solo acepta 'F' o 'M'
    Email VARCHAR(30) NOT NULL UNIQUE, -- Columna Email, obligatoria, única, de hasta 30 caracteres
	Edad INT NOT NULL CHECK (Edad > 0), -- Campo Edad, no nulo, almacena la edad del alumno (mayor a 0).
	Activo BIT NOT NULL  -- Estado activo/inactivo representado como 0 o 1.
);

-- Insertar registros en la tabla Alumnos
INSERT INTO Alumnos (Matricula, Nombre, Sexo, Email, Edad, Activo) VALUES
('A0000001', 'Juan Pérez', 'M', 'juan.perez@example.com', 20, 1),
('A0000002', 'María López', 'F', 'maria.lopez@example.com', 22, 1),
('A0000003', 'Luis García', 'M', 'luis.garcia@example.com', 19, 1),
('A0000004', 'Ana Torres', 'F', 'ana.torres@example.com', 23, 1),
('A0000005', 'Pedro Martínez', 'M', 'pedro.martinez@example.com', 21, 1),
('A0000006', 'Lucía Fernández', 'F', 'lucia.fernandez@example.com', 20, 1),
('A0000007', 'Carlos Gómez', 'M', 'carlos.gomez@example.com', 18, 1),
('A0000008', 'Sofía Ramírez', 'F', 'sofia.ramirez@example.com', 22, 1),
('A0000009', 'Jorge Díaz', 'M', 'jorge.diaz@example.com', 25, 1),
('A0000010', 'Valeria Sánchez', 'F', 'valeria.sanchez@example.com', 20, 1),
('A0000011', 'Andrés Castro', 'M', 'andres.castro@example.com', 24, 1),
('A0000012', 'Carmen Reyes', 'F', 'carmen.reyes@example.com', 21, 1),
('A0000013', 'Fernando Ruiz', 'M', 'fernando.ruiz@example.com', 23, 1),
('A0000014', 'Laura Navarro', 'F', 'laura.navarro@example.com', 19, 1),
('A0000015', 'Miguel Ortiz', 'M', 'miguel.ortiz@example.com', 22, 1),
('A0000016', 'Paula Domínguez', 'F', 'paula.dominguez@example.com', 20, 1),
('A0000017', 'Roberto Morales', 'M', 'roberto.morales@example.com', 23, 1),
('A0000018', 'Adriana Vega', 'F', 'adriana.vega@example.com', 21, 1),
('A0000019', 'Diego Hernández', 'M', 'diego.hernandez@example.com', 22, 1),
('A0000020', 'Daniela Lara', 'F', 'daniela.lara@example.com', 20, 1),
('A0000021', 'Pablo Álvarez', 'M', 'pablo.alvarez@example.com', 19, 1),
('A0000022', 'Marta Rivera', 'F', 'marta.rivera@example.com', 22, 1),
('A0000023', 'Ricardo Campos', 'M', 'ricardo.campos@example.com', 23, 1),
('A0000024', 'Elena Paredes', 'F', 'elena.paredes@example.com', 21, 1),
('A0000025', 'Héctor Silva', 'M', 'hector.silva@example.com', 25, 1),
('A0000026', 'Isabel Soto', 'F', 'isabel.soto@example.com', 22, 1),
('A0000027', 'Oscar Cabrera', 'M', 'oscar.cabrera@example.com', 18, 1),
('A0000028', 'Claudia Aguilar', 'F', 'claudia.aguilar@example.com', 20, 1),
('A0000029', 'Francisco Cruz', 'M', 'francisco.cruz@example.com', 24, 1),
('A0000030', 'Rosa Jiménez', 'F', 'rosa.jimenez@example.com', 23, 1);
			
--EJERCICIO 4.			ENCRIPTACIÓN

--Crear Llave Maestra
CREATE MASTER KEY ENCRYPTION BY PASSWORD = 'Testing01'; -- Contraseña principal

-- Crear un certificado para encriptación
CREATE CERTIFICATE CertificadoAES
    WITH SUBJECT = 'Certificado para Encriptación AES256';

-- Crear una clave simétrica con el algoritmo AES256
	CREATE SYMMETRIC KEY AES_Key
    WITH ALGORITHM = AES_256
    ENCRYPTION BY CERTIFICATE CertificadoAES;

	-- Encriptar las columnas de Email y Matricula
OPEN SYMMETRIC KEY AES_Key
    DECRYPTION BY CERTIFICATE CertificadoAES;

	-- Cambiar el tamaño de las columnas para permitir almacenar datos encriptados
ALTER TABLE Alumnos
ALTER COLUMN Email VARCHAR(100); -- Aumentar el tamaño según lo necesario

ALTER TABLE Alumnos
ALTER COLUMN Matricula VARCHAR(100); -- Aumentar el tamaño según lo necesario

-- Actualizar los registros en la tabla Alumnos
UPDATE Alumnos
SET
    Email = ENCRYPTBYKEY(KEY_GUID('AES_Key'), Email),
    Matricula = ENCRYPTBYKEY(KEY_GUID('AES_Key'), Matricula);

	
-- Desencriptar las columnas de Email y Matricula
SELECT
    ID,
    CONVERT(VARCHAR(30), DECRYPTBYKEY(Email)) AS Email,
    CONVERT(VARCHAR(8), DECRYPTBYKEY(Matricula)) AS Matricula,
    Nombre,
    Sexo,
    Edad,
    Activo
FROM Alumnos;

CLOSE SYMMETRIC KEY AES_Key;


--EJERCICIO 5.			TRANSACCIONES Y CONCURRENCIA

-- Inicia una transacción, asegurando que las operaciones que sigan son atómicas
BEGIN TRANSACTION;

-- Establecer el nivel de aislamiento a Read Uncommitted para permitir lectura de datos no confirmados
SET TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;

-- Modificar un registro en la tabla Alumnos dentro de la transacción
UPDATE Alumnos
SET Nombre = 'Juan Pérez Actualizado'
WHERE Matricula = 'A0000001';

-- Hacer un commit para hacer permanentes los cambios
COMMIT;

-- Inicia otra transacción con un nivel de aislamiento diferente
BEGIN TRANSACTION;

-- Establecer el nivel de aislamiento a Serializable, el nivel más alto de aislamiento
SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;

-- Modificar otro registro en la tabla Alumnos dentro de esta transacción
UPDATE Alumnos
SET Edad = 25
WHERE Matricula = 'A0000002';

-- Simulación de un error que requiere deshacer cambios
ROLLBACK;

-- Verificar los resultados, el cambio en 'A0000002' no fue confirmado debido al rollback
SELECT * FROM Alumnos;

--EJERCICIO 6.			CONTENIENDO UNA VISTA, PROCEDIMIENTO ALMACENADO Y TRIGGERS

-- Crear una vista llamada VistaAlumnosActivos para consultar solo los alumnos activos
CREATE VIEW VistaAlumnosActivos AS
SELECT
    ID, 
    CONCAT(Nombre, ' ', Sexo) AS Nombre_Completo, -- Concatenar el nombre y el sexo para mostrar como 'Nombre Sexo'
    Edad, -- Mostrar la edad tal como está
    Email -- Mostrar el email
FROM Alumnos
WHERE Activo = 1; -- Solo mostrar alumnos activos

-- Crear un procedimiento almacenado que actualice el correo electrónico de un alumno por su matrícula
CREATE PROCEDURE ActualizarCorreoAlumno
    @Matricula VARCHAR(8), -- Parámetro de entrada: Matrícula del alumno a actualizar
    @NuevoEmail VARCHAR(30) -- Parámetro de entrada: Nuevo correo electrónico
AS
BEGIN
    -- Verificar si existe un alumno con la matrícula proporcionada
    IF EXISTS (SELECT 1 FROM Alumnos WHERE Matricula = @Matricula)
    BEGIN
        -- Si existe, actualizar el correo electrónico
        UPDATE Alumnos
        SET Email = @NuevoEmail
        WHERE Matricula = @Matricula;
    END
    ELSE
    BEGIN
        -- Si no existe, lanzar un error
        PRINT 'No se encontró el alumno con la matrícula proporcionada';
    END
END;

-- Crear un trigger que se active después de una actualización en la tabla Alumnos
CREATE TRIGGER VerificarEdadAlumno
ON Alumnos
AFTER UPDATE
AS
BEGIN
    -- Verificar si algún alumno tiene más de 30 años después de la actualización
    DECLARE @Edad INT;
    SELECT @Edad = Edad FROM INSERTED; -- Obtener la edad del alumno actualizado
    IF @Edad > 30
    BEGIN
        -- Si tiene más de 30 años, imprimir un mensaje de advertencia
        PRINT '¡Advertencia! El alumno tiene más de 30 años.';
    END
END;


SELECT * FROM VistaAlumnosActivos;
