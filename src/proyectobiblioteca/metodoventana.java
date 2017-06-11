/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author f_mor
 */
public class metodoventana {
    
      private Dimension d;
    private JPanel contenedor;
    private JPanel contenido;
    private int px=0;
    private int py=0;
    
    public void ventana( JPanel contenedor , JPanel contenido ){

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
    
}
