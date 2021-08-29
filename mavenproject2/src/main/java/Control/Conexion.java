/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
/**
 *
 * @author cesar
 */
import java.sql.*;

public class Conexion {
    public static Connection getConnection(){
    String url, userName, password;
    
    url = "jdbc:mysql://lacalhost/paciente";
    userName = "root";
    password = "n0m310";
    
    Connection con = null;
    
        try {
                    Class.forName("com.mysql.jdbc.Drive");
            
            con = DriverManager.getConnection(url, userName, password);
            
            System.out.println("Conexion Exitosa con la BD");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conecta la BD");
            System.out.println(e.getMessage());
        }
        return con; 
    }  
}
