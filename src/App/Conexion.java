/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Zamarripa
 */
public class Conexion {
    public static Connection getConexion(){
       // Reemplaza los valores con tus credenciales locales o usa variables de entorno
    String servidor = System.getenv("DB_SERVER") != null ? System.getenv("DB_SERVER") : "localhost";
    String baseDatos = "escuela";
    String usuario = System.getenv("DB_USER") != null ? System.getenv("DB_USER") : "TU_USUARIO";
    String password = System.getenv("DB_PASSWORD") != null ? System.getenv("DB_PASSWORD") : "TU_CONTRASEÑA";

    String url = "jdbc:sqlserver://" + servidor + ":1433;"
               + "database=" + baseDatos + ";"
               + "user=" + usuario + ";"
               + "password=" + password + ";";
    try { 
        Connection con = DriverManager.getConnection(url);
        return con;
    } catch (SQLException e) { 
        System.out.println(e.toString());
        return null; 
    }
    }
}