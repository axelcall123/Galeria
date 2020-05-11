package fotos;

import fotos.Apoyo.opcionesConvertir;
import Hilos.*;
import fotos.Listas.dobleEnlaCir;
import static fotos.ingresarBiblioteca.usuario;
import java.io.File;
import javax.swing.JOptionPane;

public class Convertidor extends javax.swing.JFrame{    
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
        jU_d = new javax.swing.JRadioButton();
        jD_d = new javax.swing.JRadioButton();
        jT_d = new javax.swing.JRadioButton();
        jC_d = new javax.swing.JRadioButton();
        jCin_d = new javax.swing.JRadioButton();
        ingBiblio2 = new javax.swing.JButton();
        ingBiblio3 = new javax.swing.JButton();
        ingBiblio4 = new javax.swing.JButton();
        ingBiblio5 = new javax.swing.JButton();
        ingBiblio6 = new javax.swing.JButton();
        areaProcesamiento = new java.awt.TextArea();
        jButton6 = new javax.swing.JButton();
        porcent = new javax.swing.JProgressBar();

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

        jU_d.setText("JPEG a BMP y Viceversa");
        jU_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jU_dActionPerformed(evt);
            }
        });

        jD_d.setText("copia JPEG");

        jT_d.setText("Rojo Verde Azul Sepia");
        jT_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_dActionPerformed(evt);
            }
        });

        jC_d.setText("Modifica imagen");
        jC_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_dActionPerformed(evt);
            }
        });

        jCin_d.setText("Blacno y negro");

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

        ingBiblio5.setText("VER CARPETAS");
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

        areaProcesamiento.setEditable(false);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(porcent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jC_d)
                                .addComponent(jU_d)
                                .addComponent(jD_d)
                                .addComponent(jT_d)
                                .addComponent(jCin_d)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nombreUsuario1)
                                        .addComponent(nombreUsuario))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ingBiblio5)
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ingBiblio6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ingBiblio4)
                                        .addComponent(ingBiblio2)
                                        .addComponent(ingBiblio3, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areaProcesamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(areaProcesamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingBiblio6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jU_d)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jD_d)
                                .addGap(10, 10, 10)
                                .addComponent(jT_d)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jC_d)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCin_d))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ingBiblio3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingBiblio2)
                                .addGap(6, 6, 6)
                                .addComponent(ingBiblio4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(ingBiblio5)))))
                .addGap(12, 12, 12)
                .addComponent(porcent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
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
    opcionesConvertir generador= new opcionesConvertir();
    dobleEnlaCir imagenes= new dobleEnlaCir();
    private void jCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarpetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCarpetaActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jU_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jU_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jU_dActionPerformed

    private void jT_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_dActionPerformed

    private void jC_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_dActionPerformed

    private void ingBiblio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio2ActionPerformed
        porcent.setValue(0);
        porcentajeLifo lifo= new porcentajeLifo(imagenes);
        lifo.start();
    }//GEN-LAST:event_ingBiblio2ActionPerformed

    private void ingBiblio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio3ActionPerformed
        this.areaProcesamiento.setText("Procesando..."+"\n");//INCIALIZAR
        porcent.setValue(0);
        if(this.jU_d.isSelected()==true){
            procesoMultiJpgToBmp[] vec= new procesoMultiJpgToBmp[imagenes.getTamaño()];
            for(int a=0;a<vec.length;a++){
                vec[a] = new procesoMultiJpgToBmp((File) imagenes.obtenerNodo(a),imagenes.getTamaño());
                vec[a].start();
            }
        }
        else if(this.jD_d.isSelected()==true){//INCIALIZAR
            procesoMulticopiaJpg[] vec= new procesoMulticopiaJpg[imagenes.getTamaño()];
            for(int a=0;a<vec.length;a++){
                vec[a] = new procesoMulticopiaJpg((File) imagenes.obtenerNodo(a),imagenes.getTamaño());
                vec[a].start();
            }
        }
        else if(this.jT_d.isSelected()==true){
            procesoMultiRgb[] vec= new procesoMultiRgb[imagenes.getTamaño()];
            for(int a=0;a<vec.length;a++){
                vec[a] = new procesoMultiRgb((File) imagenes.obtenerNodo(a),imagenes.getTamaño());
                vec[a].start();
            }
        }
        else if(this.jC_d.isSelected()==true){
            procesoMultiModificar[] vec= new procesoMultiModificar[imagenes.getTamaño()];
            for(int a=0;a<vec.length;a++){
                vec[a] = new procesoMultiModificar((File) imagenes.obtenerNodo(a),imagenes.getTamaño());
                vec[a].start();
            }
        }
        else if(this.jCin_d.isSelected()==true){
            procesoMultiBW[] vec= new procesoMultiBW[imagenes.getTamaño()];
            for(int a=0;a<vec.length;a++){
                vec[a] = new procesoMultiBW((File) imagenes.obtenerNodo(a),imagenes.getTamaño());
                vec[a].start();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "NO ELIGIO UNA OPCION");
        }
    }//GEN-LAST:event_ingBiblio3ActionPerformed

    private void ingBiblio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio4ActionPerformed
        porcent.setValue(0);
        porcentajeFifo fifo= new porcentajeFifo(imagenes);//EJECTUA EL METODO EN HILOS
        fifo.start();
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
        this.jCarpeta.removeAllItems();
        for(int z=0;z<usuario.getTamaño();z++){
            String nombreUsuario=(String) this.jUsuario.getSelectedItem();
            if(nombreUsuario==usuario.obtenerNombre(z)){
                for(int y=0;y<usuario.obtenerNodo(z).getArchivo().getTamaño();y++){
                    this.jCarpeta.addItem(usuario.obtenerNodo(z).getArchivo().obtenerNombre(y));
                }
            }
        }
        
    }//GEN-LAST:event_ingBiblio5ActionPerformed
    
    
    private void ingBiblio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio6ActionPerformed
        String area="";
        this.areaProcesamiento.setText("COLA: "+'\n');
        File help;
        String nombreUsuario=(String) this.jUsuario.getSelectedItem();
        String nombreArchivo=(String) this.jCarpeta.getSelectedItem();
        for(int z=0;z<usuario.getTamaño();z++){
            if(nombreUsuario==usuario.obtenerNombre(z)){
                for(int y=0;y<usuario.obtenerNodo(z).getArchivo().getTamaño();y++){  
                    if(nombreArchivo==usuario.obtenerNodo(z).getArchivo().obtenerNombre(y)){
                        for(int x=0;x<usuario.obtenerNodo(z).getArchivo().obtenerNodo(y).getImagen().getTamaño();x++){
                            help =(File) usuario.obtenerNodo(z).getArchivo().obtenerNodo(y).getImagen().obtenerNodo(x);
                            imagenes.insertarFinal(help);
                        }  
                    }else{
                        continue;
                    }
                }
            }else{
                continue;
            }
        }
        for(int a=0;a<imagenes.getTamaño();a++){
            area=area+imagenes.obtenerNodo(a)+'\n';
        }
        this.areaProcesamiento.append(area);
    }//GEN-LAST:event_ingBiblio6ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        new vPrincipal().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.TextArea areaProcesamiento;
    private javax.swing.JButton ingBiblio2;
    private javax.swing.JButton ingBiblio3;
    private javax.swing.JButton ingBiblio4;
    private javax.swing.JButton ingBiblio5;
    private javax.swing.JButton ingBiblio6;
    private javax.swing.JButton jButton6;
    public static javax.swing.JRadioButton jC_d;
    private javax.swing.JComboBox<String> jCarpeta;
    public static javax.swing.JRadioButton jCin_d;
    public static javax.swing.JRadioButton jD_d;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton jT_d;
    public static javax.swing.JRadioButton jU_d;
    private javax.swing.JComboBox<String> jUsuario;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JLabel nombreUsuario1;
    public static javax.swing.JProgressBar porcent;
    // End of variables declaration//GEN-END:variables
}
