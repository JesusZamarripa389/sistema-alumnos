<img width="1114" height="566" alt="captura-interfaz" src="https://github.com/user-attachments/assets/f3487d66-3066-4605-8d6b-39af725d5161" />
# Sistema de Control de Alumnos (CRUD)
Este proyecto es una aplicación de escritorio desarrollada en Java utilizando la interfaz gráfica **Swing** y conectada a una base de datos relacional en **SQL Server**. El sistema permite realizar el mantenimiento completo de los registros de estudiantes (Crear, Leer, Actualizar, Eliminar) implementando capas de seguridad mediante encriptación de datos, control de concurrencia y estructuras avanzadas en el servidor de base de datos.

##  ¿Qué hace el sistema?
* **Operaciones CRUD Completas:** Gestión de información de alumnos mediante formularios dinámicos y tablas interactivas.
* **Seguridad de Datos:** Encriptación de campos sensibles (Matrícula y Email) en la base de datos utilizando el algoritmo **AES_256** mediante llaves simétricas y certificados de SQL Server.
* **Robustez en Transacciones:** Control de transacciones con bloques `Try-Catch` y mecanismos de `Rollback` para garantizar la integridad referencial y prevenir la corrupción de datos ante fallos.
* **Componentes del Servidor:** Integración de vistas personalizadas, procedimientos almacenados y disparadores (*triggers*) para automatizar lógicas de negocio directamente en el motor de base de datos.

## Arquitectura y Componentes Técnicos

| Módulo / Capa | Tecnología / Implementación | Propósito |
| :--- | :--- | :--- |
| **Frontend (GUI)** | Java Swing | Interfaz gráfica clásica con formularios dinámicos y tablas interactivas. |
| **Persistencia / Driver** | Controlador JDBC (`mssql-jdbc`) | Conexión directa y segura entre la aplicación Java y el motor de BD. |
| **Base de Datos** | Microsoft SQL Server | Almacenamiento relacional, uso de vistas, *stored procedures* y *triggers*. |
| **Criptografía** | AES_256 (Llaves simétricas/Certificados) | Protección en reposo de datos sensibles (Matrícula y Email). |

## Requisitos del Sistema

Antes de iniciar, asegúrate de tener instalado lo siguiente:
* **Java Development Kit (JDK):** Versión 8 o superior.
* **Entorno de Desarrollo (IDE):** NetBeans IDE o cualquier editor compatible con proyectos Ant/Maven.
* **Gestor de Base de Datos:** Microsoft SQL Server (2012 o superior) y SQL Server Management Studio (SSMS).
* **Controlador JDBC:** Driver oficial de Microsoft para SQL Server.

##  Instrucciones de Instalación y Despliegue

### 1. Configuración de la Base de Datos
1. Abra **SQL Server Management Studio (SSMS)** y conéctese a su instancia local.
2. Abra el archivo situado en la ruta: `database/schema.sql`.
3. Ejecute el script completo para crear de manera automática:
   * La base de datos `Escuela` y sus tablas correspondientes.
   * Los certificados de encriptación y llaves simétricas.
   * Funciones programables, disparadores y datos semilla iniciales.

### 2. Configuración de Credenciales en el Proyecto
El sistema obtiene las credenciales de conexión mediante **variables de entorno** para evitar la exposición accidental de datos sensibles en el código fuente. Configure las siguientes variables en su sistema operativo o entorno de ejecución:

* `DB_SERVER`: Dirección del servidor (Por defecto: `localhost`).
* `DB_USER`: Su usuario de SQL Server.
* `DB_PASSWORD`: Su contraseña de SQL Server.

####  Configuración alternativa (Solo para desarrollo local)
Para pruebas rápidas en entornos locales de desarrollo, puede modificar directamente los parámetros dentro del método `getConexion()` en la clase `Conexion.java`:

```java
String servidor = "localhost";
String baseDatos = "Escuela";
String usuario = "SU_USUARIO";
String password = "SU_CONTRASEÑA";
