
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.swing.JOptionPane;
public class Conexion {
    
    
    public Connection conexionBD;
    public final String bd ="bd_miempresa";
    public final String urlConexio =String.format("jdbc:mysql://localhost:3306/%s",bd);
    public final String usuario ="usr_miempresa";
    public final String contraseña ="Empresa123*9";
    public final String jdbc ="com.mysql.jdbc.Driver";
    
    public void Abrir_Conexion(){
        
        try {
            Class.forName(jdbc);
            conexionBD=DriverManager.getConnection(urlConexio,usuario,contraseña);
            //JOptionPane.showMessageDialog(null,"Conecion Exitosa","Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
    
    public void cerrar_conexion(){
        try {
            conexionBD.close();
        } catch (SQLException ex) {
            System.out.println("Error.." + ex.getMessage());
        }
}
  
    
}
