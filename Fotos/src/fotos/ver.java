package fotos;

import static fotos.ingresarBiblioteca.bin;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ver extends javax.swing.JFrame {
    
    public ver() {
        initComponents();
    }
    Enlazada ayudaUsuario= new Enlazada();
    dobleEnlazada ayudaCarpeta=new dobleEnlazada();
    dobleEnlaCir ayudaImagen=new dobleEnlaCir();
    
    Enlazada VerayudaUsuario= new Enlazada();
    dobleEnlazada VerayudaCarpeta=new dobleEnlazada();
    dobleEnlaCir VerayudaImagen=new dobleEnlaCir();
     Enlazada leeer = (Enlazada) bin.readObject();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ingBiblio1 = new javax.swing.JButton();
        nombreUsuario = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        nombreUsuario1 = new javax.swing.JLabel();
        nombreUsuario2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        ingBiblio1.setText("VER");
        ingBiblio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBiblio1ActionPerformed(evt);
            }
        });

        nombreUsuario.setBackground(new java.awt.Color(0, 0, 0));
        nombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreUsuario.setText("USUARIOS");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        nombreUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        nombreUsuario1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreUsuario1.setText("CARPETAS");

        nombreUsuario2.setBackground(new java.awt.Color(0, 0, 0));
        nombreUsuario2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreUsuario2.setText("IMAGENES");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreUsuario1)
                            .addComponent(nombreUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ingBiblio1)
                            .addComponent(nombreUsuario2))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(614, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ingBiblio1)
                .addContainerGap(63, Short.MAX_VALUE))
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

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed
    static int idVeces=0;
    private void ingBiblio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio1ActionPerformed
        BmpHandlerCopy h= new BmpHandlerCopy("XD//HOLA//TEMP//copy-1.jpg");
        /*try {
            h.readFile();
            h.generateFiles();
        } catch (Exception ex) {
            Logger.getLogger(ver.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        /*String Tusuario= (String) this.jComboBox1.getSelectedItem();
        int idUsuario=(int) this.jComboBox1.getSelectedIndex();
        ayudaUsuario=leeer;
        for (int a = 0; a < ayudaUsuario.getTamaño(); a++) {
            VerayudaUsuario.insertarInicio(ayudaUsuario.obtenerNombre(a), (dobleEnlazada) ayudaUsuario.obtenerNodo(a));
            System.out.println("NOMBRE USER: "+ayudaUsuario.obtenerNombre(a) +" ID: "+a/*+ " ;; " + ayudaUsuario.obtenerNodo(a)*//*);
            /*ayudaCarpeta = (dobleEnlazada) ayudaUsuario.obtenerNodo(a);
            jComboBox1.addItem("NOMBRE USER: "+ayudaUsuario.obtenerNombre(a));
            System.out.println();
            for (int b = 0; b < ayudaCarpeta.getTamaño(); b++) {
                VerayudaCarpeta.insertarInicio(ayudaCarpeta.obtenerNombre(b), (dobleEnlazada) ayudaCarpeta.obtenerNodo(b));
                System.out.println("    NOMBRE CARPETA: "+ayudaCarpeta.obtenerNombre(b)+" ID: "+b/*+" ;; "+ayudaCarpeta.obtenerNodo(b)*//*);
                /*System.out.println();
                jComboBox2.addItem("NOMBRE CARPETA: "+ayudaCarpeta.obtenerNombre(b)+" ;; NOMBRE USER: "+ayudaUsuario.obtenerNombre(a));
                ayudaImagen=(dobleEnlaCir) ayudaCarpeta.obtenerNodo(b);
                for (int c = 0; c < ayudaImagen.getTamaño(); c++) {
                    System.out.println("        NOMBRE IMAGEN: "+ayudaImagen.obtenerNodo(c));
                    archivo=(File) ayudaImagen.obtenerNodo(c);
                    String nombre = archivo.getName();
                    jComboBox3.addItem(nombre+" ;; NOMBRE CARPETA: "+ayudaCarpeta.obtenerNombre(b)+" ;; NOMBRE USER: "+ayudaUsuario.obtenerNombre(a));
                }
            }
        }*/
        idVeces++;
    }//GEN-LAST:event_ingBiblio1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed
    File archivo;
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingBiblio1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JLabel nombreUsuario1;
    private javax.swing.JLabel nombreUsuario2;
    // End of variables declaration//GEN-END:variables
}
