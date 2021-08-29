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
import Modelos.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccionesPaciente {
   
 
    public static int registropaciente(Paciente e){
    int estatus = 0;
        try {
        try (Connection con = Conexion.getConnection()) {
            String q = "insert into empleados (nom_pac, pass_pac, email_pac, est_pac)" + "values(?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(q);
            
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getPassword());
            ps.setString(3, e.getEmail());
            ps.setString(4, e.getPais());
            
            estatus = ps.executeUpdate();
            System.out.println("Registro exitoso");
        }
            
        } catch (SQLException ed) {
            System.out.println("error del registro");
//            System.out.println(ed.getMessage());
            
        }
        return estatus;
    }
        
    
}
