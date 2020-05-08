package fotos;

import static fotos.ingresarBiblioteca.usuario;

public class Convertidor extends javax.swing.JFrame {
   
    
    public Convertidor() {
        initComponents();
        for(int z=0;z<usuario.getTamaño();z++){
            System.out.println("NOMBRE: "+usuario.obtenerNombre(z));
            this.jUsuario.addItem(usuario.obtenerNombre(z));
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jUsuario = new javax.swing.JComboBox<>();
        nombreUsuario = new javax.swing.JLabel();
        jCarpeta = new javax.swing.JComboBox<>();
        nombreUsuario1 = new javax.swing.JLabel();
        jU = new javax.swing.JRadioButton();
        jD = new javax.swing.JRadioButton();
        jT = new javax.swing.JRadioButton();
        jC = new javax.swing.JRadioButton();
        jCin = new javax.swing.JRadioButton();
        ingBiblio2 = new javax.swing.JButton();
        ingBiblio3 = new javax.swing.JButton();
        ingBiblio4 = new javax.swing.JButton();
        ingBiblio5 = new javax.swing.JButton();
        ingBiblio6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });

        nombreUsuario.setBackground(new java.awt.Color(0, 0, 0));
        nombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreUsuario.setText("USUARIOS");

        jCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarpetaActionPerformed(evt);
            }
        });

        nombreUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        nombreUsuario1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreUsuario1.setText("CARPETAS");

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

        ingBiblio2.setText("EJECTUAR EN SECUENCIAL LIFO");
        ingBiblio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBiblio2ActionPerformed(evt);
            }
        });

        ingBiblio3.setText("EJECTUAR EN PARALELO");
        ingBiblio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBiblio3ActionPerformed(evt);
            }
        });

        ingBiblio4.setText("EJECTUAR EN SECUENCIAL FIFO");
        ingBiblio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBiblio4ActionPerformed(evt);
            }
        });

        ingBiblio5.setText("VER USUARIOS");
        ingBiblio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBiblio5ActionPerformed(evt);
            }
        });

        ingBiblio6.setText("AGREGAR");
        ingBiblio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBiblio6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jC)
                    .addComponent(jU)
                    .addComponent(jD)
                    .addComponent(jT)
                    .addComponent(jCin)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreUsuario1)
                            .addComponent(nombreUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingBiblio5)
                    .addComponent(ingBiblio4)
                    .addComponent(ingBiblio2)
                    .addComponent(ingBiblio6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ingBiblio3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingBiblio6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jD)
                        .addGap(10, 10, 10)
                        .addComponent(jT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ingBiblio3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingBiblio2)
                        .addGap(6, 6, 6)
                        .addComponent(ingBiblio4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCin)
                    .addComponent(ingBiblio5))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarpetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCarpetaActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUActionPerformed

    private void jTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTActionPerformed

    private void jCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCActionPerformed

    private void ingBiblio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingBiblio2ActionPerformed

    private void ingBiblio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingBiblio3ActionPerformed

    private void ingBiblio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingBiblio4ActionPerformed

    private void ingBiblio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio5ActionPerformed
        for(int z=0;z<usuario.getTamaño();z++){
            System.out.println("NOMBRE: "+usuario.obtenerNombre(z));
            for(int y=0;y<usuario.obtenerNodo(z).getArchivo().getTamaño();y++){
                System.out.println("    ARCHIVO: "+usuario.obtenerNodo(z).getArchivo().obtenerNombre(y));
                for(int x=0;x<usuario.obtenerNodo(z).getArchivo().obtenerNodo(y).getImagen().getTamaño();x++){
                    System.out.println("        IMAGEN:"+usuario.obtenerNodo(z).getArchivo().obtenerNodo(y).getImagen().obtenerNodo(x));
                }
            }
        }
        //////////////
        for(int z=0;z<usuario.getTamaño();z++){
            String nombreUsuario=(String) this.jUsuario.getSelectedItem();
            if(nombreUsuario==usuario.obtenerNombre(z)){
                for(int y=0;y<usuario.obtenerNodo(z).getArchivo().getTamaño();y++){
                    this.jCarpeta.addItem(usuario.obtenerNodo(z).getArchivo().obtenerNombre(z));
                }
            }
        }
        
    }//GEN-LAST:event_ingBiblio5ActionPerformed

    private void ingBiblio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingBiblio6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingBiblio2;
    private javax.swing.JButton ingBiblio3;
    private javax.swing.JButton ingBiblio4;
    private javax.swing.JButton ingBiblio5;
    private javax.swing.JButton ingBiblio6;
    private javax.swing.JRadioButton jC;
    private javax.swing.JComboBox<String> jCarpeta;
    private javax.swing.JRadioButton jCin;
    private javax.swing.JRadioButton jD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jT;
    private javax.swing.JRadioButton jU;
    private javax.swing.JComboBox<String> jUsuario;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JLabel nombreUsuario1;
    // End of variables declaration//GEN-END:variables
}
