/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class DatosAlumnos {
    
    Conexion conectar= new Conexion();
    
     public void AgregarAlumno(JTextField txt_nombre, JTextField txt_apellidopat,JTextField txt_apellidomat, JTextField txt_rut, JTextField txt_dv,JTextField txt_matricula, Connection conexion){
       
        String nombre= txt_nombre.getText();
        String apellidopat= txt_apellidopat.getText();
        String apellidomat= txt_apellidomat.getText();
        int rut=Integer.parseInt(txt_rut.getText());
        String dv= txt_dv.getText();
        String matricula= txt_matricula.getText();
       
        String sql="Insert into alumno (rut,dv,nombres,apellido_pat, apellido_mat,numeroMatricula) VALUES('"+rut+"','"+dv+"','"+nombre+"','"+apellidopat+"','"+apellidomat+"','"+matricula+"')" ;
        
        conectar.Actualizar(conexion, sql);
        
        
        txt_nombre.setText("");
        txt_apellidopat.setText("");
        txt_apellidomat.setText("");
        txt_rut.setText("");
        txt_dv.setText("");
        txt_matricula.setText("");

    
}
     
      public void EliminarEstudiante(JTextField txt_id, Connection conexion){
        
        
        int id= Integer.parseInt(txt_id.getText());
        String sql="DELETE FROM alumno WHERE idalumno='"+id+"'";
        conectar.Actualizar(conexion, sql);
        txt_id.setText("");
        
     
        
    }
      
      public void ModificarEstudiante(Connection conexion, JTextField txt_id, JTextField txt_nombre, JTextField txt_apellidopat, JTextField txt_apellidomat, JTextField txt_rut, JTextField txt_dv, JTextField txt_matricula){
          String sql="UPDATE alumno SET rut=?, dv=?, nombres=?, apellido_pat=?, apellido_mat=?, numeroMatricula=? "
                    + "WHERE idalumno=?";
          
          PreparedStatement pstm = null;
        try {
            pstm = conexion.prepareStatement(sql);
            
            pstm.setInt(1, Integer.valueOf(txt_rut.getText()));
            pstm.setString(2, txt_dv.getText());
            pstm.setString(3, txt_nombre.getText());
            pstm.setString(4, txt_apellidopat.getText());
            pstm.setString(5, txt_apellidomat.getText());
            pstm.setString(6, txt_matricula.getText());
            pstm.setInt(7, Integer.valueOf(txt_id.getText()));
            pstm.execute();
            
        
        if(pstm.executeUpdate()>0){
            
            JOptionPane.showMessageDialog(null, "Los datos han sido actualizados satisfactoriamente", "Operacion exitosa", 0);
            
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos", "Error", 0);
        }
        
        pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//            int id= Integer.valueOf(txt_id.getText());
//            String nombre= txt_nombre.getText();
//        String apellidos= txt_apellidos.getText();
//        int edad= Integer.valueOf(txt_edad.getText());
   
//        pstm = conexion.prepareStatement("UPDATE alumno SET rut=?, dv=?, nombres=?, apellido_pat=?, apellido_mat=?, numeroMatricula=? "
//                    + "WHERE idalumno=?");

        
//
//Strng sql1="Update prueba2.estudiantes Set nombres = "+nombre+ ", apellidos="+apellidos+", edad="+edad+, nombre_campo2 = valor_campo2,... Where condiciones_de_selección";
        
//        String sql="Insert into prueba2.estudiante WHERE ID='"+id+"' (nombres,apellidos,edad) VALUES('"+nombre+"','"+apellidos+"','"+edad+"')" ;
//String sql="update prueba2.estudiante set nombres='"+nombre+"' WHERE ID="+id;
//conectar.Actualizar(conexion, sql);
            
        
    }
      
      
       
    
}
