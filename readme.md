<img width="1114" height="566" alt="captura-interfaz" src="https://github.com/user-attachments/assets/f3487d66-3066-4605-8d6b-39af725d5161" />
\# Sistema de Control de Alumnos (CRUD)






Este proyecto es una aplicación de escritorio desarrollada en Java utilizando la interfaz gráfica Swing y conectada a una base de datos relacional en SQL Server. El sistema permite realizar el mantenimiento completo de los registros de estudiantes (Crear, Leer, Actualizar, Eliminar) implementando capas de seguridad mediante encriptación de datos, control de concurrencia y estructuras avanzadas en el servidor de base de datos.



\## ¿Qué hace?



\* \*\*Operaciones CRUD Completas:\*\* Gestión de información de alumnos mediante formularios dinámicos y tablas interactivas.

\* \*\*Seguridad de Datos:\*\* Encriptación de campos sensibles (Matrícula y Email) en la base de datos utilizando el algoritmo AES\_256 mediante llaves simétricas y certificados de SQL Server.

\* \*\*Robustez en Transacciones:\*\* Control de transacciones con bloques Try-Catch y mecanismos de Rollback para garantizar la integridad referencial y prevenir la corrupción de datos ante fallos.

\* \*\*Componentes del Servidor:\*\* Integración de vistas personalizadas, procedimientos almacenados y disparadores (triggers) para automatizar lógicas de negocio directamente en el motor de base de datos.



\## Requisitos



\* \*\*Java Development Kit (JDK):\*\* Versión 8 o superior.

\* \*\*Entorno de Desarrollo (IDE):\*\* NetBeans IDE o cualquier editor compatible con proyectos Ant/Maven.

\* \*\*Gestor de Base de Datos:\*\* Microsoft SQL Server (2012 o superior) y SQL Server Management Studio (SSMS).

\* \*\*Controlador JDBC:\*\* Driver oficial de Microsoft para SQL Server (`mssql-jdbc`).



\---



\## Instrucciones de instalación y despliegue



\### Configuración de la Base de Datos

1\. Abra SQL Server Management Studio y conéctese a su instancia local.

2\. Abra el archivo situado en `database/schema.sql`.

3\. Ejecute el script completo para crear la base de datos Escuela, las tablas correspondientes, los certificados de encriptación, las funciones programables y los datos semilla iniciales.



\### Configuración de Credenciales en el Proyecto

El sistema obtiene las credenciales de conexión mediante variables de entorno para evitar la exposición de datos sensibles. Configure las siguientes variables en su sistema operativo o entorno de ejecución:



\* `DB\_SERVER`: Dirección del servidor (por defecto: localhost).

\* `DB\_USER`: Su usuario de SQL Server.

\* `DB\_PASSWORD`: Su contraseña de SQL Server.



Alternativamente, para pruebas rápidas en entornos locales de desarrollo, puede modificar directamente las cadenas de texto dentro del método `getConexion()` en la clase `Conexion.java`:



```java

String servidor = "localhost";

String baseDatos = "Escuela";

String usuario = "SU\_USUARIO";

String password = "SU\_CONTRASEÑA";

