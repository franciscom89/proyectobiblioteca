/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.sql.Connection;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DatosLibros {
    
    Conexion conectar= new Conexion();
    
    
    public void AgregarLibros(JTextField txt_nombre, JComboBox cbx_seccion, ButtonGroup bg_botongroup, 
            JRadioButton rb_radiobuton, Connection conexion){
        
        String titulo=txt_nombre.getText(); // NO ES NECESARIO COMENTAR
        String seccion=cbx_seccion.getSelectedItem().toString(); // TOMA EL ITEM SELECCIONADO DEL COMBOBOX Y LO TRANSFORMA EN UN STRING
        ButtonModel disponible=rb_radiobuton.getModel(); // HACE ALGO
        ButtonModel btm=bg_botongroup.getSelection();
        Boolean disponibilidad=bg_botongroup.isSelected(disponible);
        int estado=0;       
        
        
     
         if(disponibilidad==true){
             
             estado=1;
             
         }
         
         System.out.println(disponibilidad);
      
        String sql= "Insert into libros (titulo, seccion,estado) VALUES('"+titulo+"','"+seccion+"','"+estado+"')";
        conectar.Actualizar(conexion, sql);
        
        
        
       
        
        
        
        
        
        
        
    }
    
}
