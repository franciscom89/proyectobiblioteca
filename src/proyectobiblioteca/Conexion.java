
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Conexion {
    
    public Connection abrirConexion(){
        
             Connection cnx=null;
        try {
           
            
            String user="root";
            String password="";
            
            String protocolo="jdbc:mysql://";
            String server= "localhost";
            String puerto="3306";
            String bd= "mydb";
            String url= protocolo+server+":"+puerto+"/"+bd;
            
            Class.forName("com.mysql.jdbc.Driver");
            cnx= DriverManager.getConnection(url, user, password);
            
            
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de drivers");
        } catch (SQLException ex) {
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de conexion");
        }
        
        return cnx;
        
    }
    
    
    public void cerrarConexion(Connection conexion){
        
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
      public ResultSet Consulta(Connection conexion, String sql){
        
                ResultSet resultado=null;
        try {
            Statement consulta= conexion.createStatement();
            resultado= consulta.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado;
    }
      
        public int Actualizar(Connection conexion, String sql)
{
   int resultado =0;
   
        try {
            Statement update = conexion.createStatement();
            resultado = update.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   return resultado;

}
}
