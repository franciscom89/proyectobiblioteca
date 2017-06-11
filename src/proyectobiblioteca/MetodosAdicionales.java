/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author f_mor
 */
public class MetodosAdicionales {
    
    
    
        private Dimension d;
    private JPanel contenedor;
    private JPanel contenido;
    private int px=0;
    private int py=0;
    
    public void Ventanas( JPanel contenedor , JPanel contenido ){

        this.contenedor = contenedor;
        this.contenido = contenido;        
        this.contenedor.removeAll();
        
        d = new Dimension( contenedor.getSize().width , contenedor.getSize().height);
        this.contenido.setSize( d );//tamaño inicial
        //coordenadas iniciales     
        contenido.setLocation( px, py );
        contenido.setVisible(true);
        //se agrega al contenedor el JPanel contenido
        this.contenedor.add( contenido );
        
        contenedor.updateUI();
    }
    
       public void MostradDB(ResultSet rs,JTable t)
    {
            
            
          try {
              ResultSetMetaData rsm= rs.getMetaData();
              int c=rsm.getColumnCount();
              int y=0;

              String [] vector= new String[c];
              for (y=0; y<c; y++){
                  
                  vector[y]= rsm.getColumnName(y+1);
              }
             //String[] ti= {rsm.getColumnName(1),rsm.getColumnName(2),rsm.getColumnName(3),rsm.getColumnName(4)};
              rs.last();
              int f= rs.getRow();
              
              String[][] datos= new String[f][c];
              rs.beforeFirst();
              int f1=0;
              while(rs.next())
              {
                  for(int x=0;x<c;x++){
                      datos[f1][x]=rs.getString(x+1);
                  }
                  f1++;
              }
              
              DefaultTableModel dtm= new  DefaultTableModel(datos, vector);
              t.setModel(dtm);
              
          } catch (SQLException ex) {
              Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
          }
           
               
        }
       
       
       public void tablaycombo(JComboBox combobox, JTable tabla){
           
           int contador=combobox.getItemCount();
           int x;
           String [] vector= new String[1];
           vector[0]="Titulo columna";
           
           String [][] matriz= new String[contador][1];
           
           for(x=0; x<contador; x++){
               
               matriz[x][0]= combobox.getItemAt(x).toString();
           }
           
           DefaultTableModel dtm= new DefaultTableModel(matriz, vector);
           tabla.setModel(dtm);
       }
    
}
