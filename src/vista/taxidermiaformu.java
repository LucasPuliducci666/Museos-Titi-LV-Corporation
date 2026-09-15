
package vista;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import vista.Añadir;

/**
 *
 * @author lucas
 */
public class taxidermiaformu extends javax.swing.JFrame {

    /**
     * Creates new form taxidermiaformu
     */
    public taxidermiaformu() {
        initComponents();
        setVisible(true);
    }

public static Connection getConnection (){
    Connection con = null;
    String base="museotitilv";
    String url = "jdbc:mysql://localhost:3306/" + base;
    String user = "root";
    String password = "";
    
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException | SQLException e){
    System.err.println(e);
    }
    
        return con;
        }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSecTax = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtDEStax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFINtax = new javax.swing.JTextField();
        txtNombreT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtVMtax = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEspe = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPerio = new javax.swing.JTextField();
        txtAmb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtIdTax = new javax.swing.JTextField();
        CargarImagen = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 255, 189));

        txtDEStax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDEStaxActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de ingreso");

        txtFINtax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFINtaxActionPerformed(evt);
            }
        });

        txtNombreT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor Monetario");

        jLabel1.setText("Nombre");

        txtVMtax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVMtaxActionPerformed(evt);
            }
        });

        jLabel4.setText("Descubridor");

        jLabel8.setText("Familia");

        jLabel9.setText("Especie");

        jLabel10.setText("Edad");

        jLabel11.setText("Periodo");

        jLabel12.setText("Ambiente");

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        jButton1.setText("Crear pieza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CargarImagen.setText("Cargar imagen");
        CargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarImagenActionPerformed(evt);
            }
        });

        lblimagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2))
                            .addComponent(txtIdTax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVMtax, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(txtNombreT))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(txtDEStax, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFINtax, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAmb, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPerio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CargarImagen)
                                .addGap(37, 37, 37)
                                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(txtIdTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtDEStax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFINtax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtVMtax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(txtPerio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(CargarImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFINtaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFINtaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFINtaxActionPerformed

    private void txtNombreTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTActionPerformed

    private void txtVMtaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVMtaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVMtaxActionPerformed

    private void txtDEStaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDEStaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDEStaxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Connection conn = null;

    try {
        String nombre = txtNombreT.getText(); // Nombre
        String fechaText = txtFINtax.getText();
        String descubridor = txtDEStax.getText(); // Descubridor
        double valor = Double.parseDouble(txtVMtax.getText()); // Valor Monetario
        

        String familia = txtFam.getText(); // Familia
        String especie = txtEspe.getText(); // Especie
        int edad = Integer.parseInt(txtEdad.getText()); // Edad
        String periodo = txtPerio.getText(); // Periodo
        String ambiente = txtAmb.getText(); // Ambiente

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fechaUtil = sdf.parse(fechaText);
        java.sql.Date fecha = new java.sql.Date(fechaUtil.getTime());

        conn = getConnection();

        PreparedStatement ps = conn.prepareStatement(
            "INSERT INTO pieza (nombre, descubridor, fechaing, valormon, imagen) VALUES (?, ?, ?, ?, ?)",
            Statement.RETURN_GENERATED_KEYS
        );
        ps.setString(1, nombre);
        ps.setString(2, descubridor);
        ps.setDate(3, fecha);
        ps.setDouble(4, valor);
        
          if (archivoImagen != null && archivoImagen.exists()) {
            FileInputStream fis = new FileInputStream(archivoImagen);
            ps.setBinaryStream(5, fis, (int) archivoImagen.length());
        } else {
            ps.setNull(5, java.sql.Types.BLOB);
        }
        
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        int idPieza = 0;
        if (rs.next()) {
            idPieza = rs.getInt(1);
        }

        // Insertar en tabla TAXIDERMIA
        PreparedStatement ps2 = conn.prepareStatement(
            "INSERT INTO taxidermia (familia, especie, edad, periodo, ambiente, pieza_idpieza) VALUES (?, ?, ?, ?, ?, ?)"
        );
        ps2.setString(1, familia);
        ps2.setString(2, especie);
        ps2.setInt(3, edad);
        ps2.setString(4, periodo);
        ps2.setString(5, ambiente);
        ps2.setInt(6, idPieza);
        
        int res = ps2.executeUpdate();

        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Pieza de taxidermia guardada correctamente.");
            // Limpiar campos después de guardar
            limpiarCampos();
            lblimagen.setIcon(null);
            lblimagen.setText("Sin imagen");
            archivoImagen = null;
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar la pieza de taxidermia.");
        }

        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
        e.printStackTrace();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error en formato de números: Verifica Edad y Valor Monetario");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        e.printStackTrace();
    }
}

// Método para limpiar campos después de guardar
private void limpiarCampos() {
    txtNombreT.setText("");
    txtFINtax.setText("");
    txtDEStax.setText("");
    txtVMtax.setText("");
    txtFam.setText("");
    txtEspe.setText("");
    txtEdad.setText("");
    txtPerio.setText("");
    txtAmb.setText("");
}
{
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Añadir().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private File archivoImagen;
    
    private void CargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarImagenActionPerformed
         JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Seleccionar imagen de la pieza");
    
    // Filtro para mostrar solo imágenes
    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
        "Archivos de imagen", "jpg", "jpeg", "png", "gif", "bmp", "svg"));
    
    int resultado = fileChooser.showOpenDialog(this);
    
    if (resultado == JFileChooser.APPROVE_OPTION) {
        archivoImagen = fileChooser.getSelectedFile();
        
        try {
            // Mostrar preview de la imagen
            ImageIcon imageIcon = new ImageIcon(archivoImagen.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            lblimagen.setIcon(new ImageIcon(image));
            lblimagen.setText(""); // Limpiar texto si había
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_CargarImagenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(taxidermiaformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(taxidermiaformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(taxidermiaformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(taxidermiaformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new taxidermiaformu().setVisible(true);
            }
        });
    }
 public static Connection getConection (){
    Connection con = null;
    String base="museotitilv";
    String url = "jdbc:mysql://localhost:3306/" + base;
    String user = "root";
    String password = "";
    
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException | SQLException e){
    System.err.println(e);
    }
    
        return con;
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarImagen;
    private javax.swing.ButtonGroup btnSecTax;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTextField txtAmb;
    private javax.swing.JTextField txtDEStax;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspe;
    private javax.swing.JTextField txtFINtax;
    private javax.swing.JTextField txtFam;
    private javax.swing.JTextField txtIdTax;
    private javax.swing.JTextField txtNombreT;
    private javax.swing.JTextField txtPerio;
    private javax.swing.JTextField txtVMtax;
    // End of variables declaration//GEN-END:variables
}
