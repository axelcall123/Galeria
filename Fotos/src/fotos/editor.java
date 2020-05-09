
package fotos;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class editor extends javax.swing.JFrame {

    public editor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jU = new javax.swing.JRadioButton();
        jD = new javax.swing.JRadioButton();
        jT = new javax.swing.JRadioButton();
        jC = new javax.swing.JRadioButton();
        jCin = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        url = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setForeground(new java.awt.Color(153, 153, 0));

        jU.setText("JPEG a BMP y Viceversa");
        jU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUActionPerformed(evt);
            }
        });

        jD.setText("copia JPEG");

        jT.setText("Rojo Verde Azul Sepia");
        jT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTActionPerformed(evt);
            }
        });

        jC.setText("Modifica imagen");
        jC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCActionPerformed(evt);
            }
        });

        jCin.setText("Blacno y negro");

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Seleccionar imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        url.setText("***");

        jButton6.setText("exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCin)
                                    .addComponent(jC)
                                    .addComponent(jT)
                                    .addComponent(jD)
                                    .addComponent(jU))
                                .addGap(128, 128, 128)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 148, Short.MAX_VALUE))
                    .addComponent(url, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCin)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addContainerGap(69, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static File archivo;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar ventana = new Guardar();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG , PNG y BMP", "jpg", "png","bmp");
        ventana.Cargar.setFileFilter(filtro);//FILTRO DE IMAGENES
        int resulta = ventana.Cargar.showOpenDialog(null);//DEVULVE UN ENTERO
        archivo = ventana.Cargar.getSelectedFile();
        this.url.setText(archivo.getPath());
        ///////////////////////////////////
        /*String url = archivo.getPath();
        String nuevaUrl="BMP\\"+"int-"+url.substring(url.lastIndexOf("\\")+1,+url.lastIndexOf(".jpg"))+".bmp";
        Convertir conv = new Convertir();
         try {
            boolean result = conv.convertFormat(url,nuevaUrl, "BMP");
        } catch (IOException ex) {
            System.out.println("ERROR");
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        opcionesConvertir generador= new opcionesConvertir();
        if(archivo==null){
            JOptionPane.showMessageDialog(null, "INGRESE UNA IMAGEN");
        }else{  
            if(this.jU.isSelected()==true){//PRIMER BOTON    
                generador.jpgToBmp(archivo);  
            }else if(this.jD.isSelected()==true){//SEGUNDO BOTON
                generador.copia(archivo);
            }else if(this.jT.isSelected()==true){//TERCER BOTON
                generador.redGreenBlue(archivo);
            }
            else if(this.jC.isSelected()==true){//TERCER BOTON               
                generador.modificarImagen(archivo);
            }
            else if(this.jCin.isSelected()==true){//TERCER BOTON   
                generador.blancoNegro(archivo);
            }
            System.out.println();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUActionPerformed

    private void jTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTActionPerformed

    private void jCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        new vPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed
    

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
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JRadioButton jC;
    private javax.swing.JRadioButton jCin;
    private javax.swing.JRadioButton jD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jT;
    private javax.swing.JRadioButton jU;
    private javax.swing.JLabel url;
    // End of variables declaration//GEN-END:variables
}
