/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.sql.Connection;
import java.sql.ResultSet;
import sun.reflect.generics.visitor.Reifier;

/**
 *
 * @author f_mor
 */
public class RegistroLibros extends javax.swing.JPanel {

    /**
     * Creates new form RegistroLibros
     */
    public RegistroLibros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gruporadiobuton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombrelibro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        seccionlibro = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        registrarlibro = new javax.swing.JButton();
        modificarlibro = new javax.swing.JButton();
        eliminarlibro = new javax.swing.JButton();
        radiodisponible = new javax.swing.JRadioButton();
        radionodisponible = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalibros = new javax.swing.JTable();

        setBackground(new java.awt.Color(76, 134, 236));

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Registro Libros"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Seccion");

        seccionlibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicina", "Psicologia", "Matematicas", "Ingenieria", "Anatomia" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jButton1.setText("Agregar nueva seccion");

        jLabel3.setText("Disponibilidad");

        registrarlibro.setBackground(java.awt.SystemColor.inactiveCaption);
        registrarlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        registrarlibro.setText("Registrar");
        registrarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarlibroActionPerformed(evt);
            }
        });

        modificarlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        modificarlibro.setText("Modificar");
        modificarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarlibroActionPerformed(evt);
            }
        });

        eliminarlibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        eliminarlibro.setText("Eliminar");

        gruporadiobuton.add(radiodisponible);
        radiodisponible.setText("Disponible");

        gruporadiobuton.add(radionodisponible);
        radionodisponible.setText("No Disponible");

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nombrelibro, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(seccionlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(radiodisponible)
                        .addGap(18, 18, 18)
                        .addComponent(radionodisponible))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(registrarlibro)
                        .addGap(28, 28, 28)
                        .addComponent(modificarlibro)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarlibro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombrelibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(seccionlibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radiodisponible)
                    .addComponent(radionodisponible))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modificarlibro)
                        .addComponent(eliminarlibro))
                    .addComponent(registrarlibro))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(java.awt.SystemColor.activeCaption);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Registro de libros"));

        tablalibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablalibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarlibroActionPerformed
        // TODO add your handling code here:
        Connection cnx=conectar.abrirConexion();
        datoslibros.AgregarLibros(nombrelibro, seccionlibro, gruporadiobuton, radiodisponible, cnx);
        
         String sql= "select * from libros";
        ResultSet result=conectar.Consulta(cnx, sql);
        metodosadicionales.MostradDB(result, tablalibros);
        
        conectar.cerrarConexion(cnx);
        
        
    }//GEN-LAST:event_registrarlibroActionPerformed

    private void modificarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarlibroActionPerformed
        // TODO add your handling code here:
        Connection cnx=conectar.abrirConexion();
      
         String sql= "select * from alumno";
        ResultSet result=conectar.Consulta(cnx, sql);
        metodosadicionales.MostradDB(result, tablalibros);
        
        conectar.cerrarConexion(cnx);
        
    }//GEN-LAST:event_modificarlibroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Connection cnx=conectar.abrirConexion();
      
         String sql= "select * from alumno";
        ResultSet result=conectar.Consulta(cnx, sql);
        metodosadicionales.MostradDB(result, tablalibros);
        
        conectar.cerrarConexion(cnx);
    }//GEN-LAST:event_jButton2ActionPerformed


    DatosLibros datoslibros= new DatosLibros();
    Conexion conectar= new Conexion();
    MetodosAdicionales metodosadicionales= new MetodosAdicionales();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarlibro;
    private javax.swing.ButtonGroup gruporadiobuton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton modificarlibro;
    private javax.swing.JTextField nombrelibro;
    private javax.swing.JRadioButton radiodisponible;
    private javax.swing.JRadioButton radionodisponible;
    private javax.swing.JButton registrarlibro;
    private javax.swing.JComboBox<String> seccionlibro;
    private javax.swing.JTable tablalibros;
    // End of variables declaration//GEN-END:variables
}