package fotos;

import static fotos.vPrincipal.usuariosID;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ingresarBiblioteca extends javax.swing.JFrame {
    JTemp temp = new JTemp();
    static Enlazada usuario= new Enlazada();
    public dobleEnlazada carpeta=new dobleEnlazada();
    public dobleEnlaCir imagen=new dobleEnlaCir();
    static BinManager bin = new BinManager();//ENLAZADA SIMPLE
    static int idCarpeta;
    public ingresarBiblioteca() {
        initComponents();
        this.nombreUsuario.setText(usuariosID[0].getNombre());
        this.Picture.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN,10));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        Picture = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jToggleButton1.setText("AGREGAR IMAGEN");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("ELIMINAR IMAGEN");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        Picture.setOpaque(true);

        nombreUsuario.setBackground(new java.awt.Color(0, 0, 0));
        nombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreUsuario.setText("jLabel2");

        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N

        jButton3.setText("ELIMINAR CATEGORIA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("AGREGAR CATEGORIA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("CARGAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(55, 55, 55))
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addGap(96, 96, 96)
                        .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(251, 251, 251))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(jToggleButton2)
                            .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButton6))
        );

        jToggleButton1.getAccessibleContext().setAccessibleDescription("");
        jToggleButton1.getAccessibleContext().setAccessibleParent(jToggleButton1);

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
    File archivo;
    static int correrImagen=-1;
    static int idImagen;
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //PARA IMAGENES
        Guardar ventana = new Guardar();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.Cargar.setFileFilter(filtro);//FILTRO DE IMAGENES
        int resulta = ventana.Cargar.showOpenDialog(null);//DEVULVE UN ENTERO
        archivo = ventana.Cargar.getSelectedFile();
        //URLS
        String url = archivo.getPath();//URL
        //String nuevaUrl=url.substring(url.lastIndexOf("D:")+0,+url.lastIndexOf(".jpg"))+".bmp";
        String nuevaUrl="BMP\\"+url.substring(url.lastIndexOf("\\")+1,+url.lastIndexOf(".jpg"))+".bmp";
        String nombre = archivo.getName();//NOMBRE
        System.out.println(url+" ;; "+nuevaUrl);
        //OBTENER IMAGEN
        Picture.setIcon(new ImageIcon(url)); 
        this.Titulo.setText(nombre);//TITULO DE LA IMAGEN
        //GUARDAR
        imagen.insertarFinal(archivo);
         /*492,358*/
        ImageIcon icon = new ImageIcon(url);
        this.Picture.setIcon(icon);
        
        Convertir conv = new Convertir();
        try {
            boolean result = conv.convertFormat(url,nuevaUrl, "BMP");
        } catch (IOException ex) {
            System.out.println("ERROR");
            ex.printStackTrace();
        }
        //JPEGtoBMPImage bmp= new JPEGtoBMPImage(url)
        //archivo.delete();
        //ImageIcon icon = new ImageIcon(nuevaUrl);
        //this.Picture.setIcon(icon);
        System.out.println("ID: "+idCarpeta);
        correrImagen++;
        idImagen++;
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        correrImagen++;
        if(correrImagen<imagen.getTamaño()){
            File ayuda=(File) imagen.obtenerNodo(correrImagen);//TOMA EL ELEMENTO ENCERRADO
            String url=ayuda.getPath();
            String nombre=ayuda.getName();
            this.Titulo.setText(nombre);
            System.out.println("URLs: "+url+" ;;NUM: "+correrImagen);
            this.Picture.setIcon(new ImageIcon(url));
        }else{
            correrImagen=0;
            File ayuda=(File) imagen.obtenerNodo(correrImagen);//TOMA EL ELEMENTO ENCERRADO
            String url=ayuda.getPath();
            String nombre=ayuda.getName();
            this.Titulo.setText(nombre);
            System.out.println("URLs: "+url+" ;;NUM: "+correrImagen);
            this.Picture.setIcon(new ImageIcon(url));
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       correrImagen--;//CORRER IMAGENES
        if(correrImagen>=0){
            File ayuda=(File) imagen.obtenerNodo(correrImagen);
            String url=ayuda.getPath();
            String nombre=ayuda.getName();
            this.Titulo.setText(nombre);
            System.out.println("URLs: "+url+" ;;NUM: "+correrImagen);
            this.Picture.setIcon(new ImageIcon(url));
        }else{
            correrImagen=(imagen.getTamaño())-1;
            File ayuda=(File) imagen.obtenerNodo(correrImagen);
            String url=ayuda.getPath();
            String nombre=ayuda.getName();
            this.Titulo.setText(nombre);
            System.out.println("URLs: "+url+" ;;NUM: "+correrImagen);
            this.Picture.setIcon(new ImageIcon(url));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String categoria= (String) this.jComboBox1.getSelectedItem();
       int idArchivo=(int) this.jComboBox1.getSelectedIndex();
       
       if(categoria=="GENERAL"){
           JOptionPane.showMessageDialog(null, "NO SE PUEDE ELMINAR LA CATEGORIA GENERAL");
       }else{
           System.out.println(idArchivo+";;"+categoria);
           this.jComboBox1.removeItemAt(idArchivo);
           for (int a = 0; a < carpeta.getTamaño(); a++) {
               if (categoria == carpeta.obtenerNombre(a)) {
                   carpeta.eliminar(a);
               }
           }
       }
        idCarpeta--;
    }//GEN-LAST:event_jButton3ActionPerformed
    static String nombreCarpeta="GENERAL";
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /*nombreCarpeta = JOptionPane.showInputDialog("NOMBRE SU CARPETA");
        carpeta.insertarFinal(nombreCarpeta,imagen);
        jComboBox1.addItem(nombreCarpeta);*/
        carpeta.insertarFinal(nombreCarpeta,imagen);
        for(int a=0;a<idImagen;a++){
            if(imagen.getTamaño()==1){
                imagen.eliminar(0);
            }else{
                imagen.eliminar(1);
            }
            System.out.println(imagen.getTamaño());
        }
        nombreCarpeta = JOptionPane.showInputDialog("NOMBRE SU CARPETA");
        System.out.println("ID: "+idCarpeta);
        jComboBox1.addItem(nombreCarpeta);
        idImagen=0;
        idCarpeta++;
//        JPEGtoBMPImage img= new JPEGtoBMPImage();
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       System.out.println();
        for(int a=0;a<usuario.getTamaño();a++){
           System.out.println("USUARIOS: "); usuario.ver(a);
        }
        System.out.println();
        for(int a=0;a<carpeta.getTamaño();a++){
            System.out.println("CARPETAS"); carpeta.ver(a);
        }
        System.out.println();
        for(int a=0;a<imagen.getTamaño();a++){
           System.out.println("IMAGEN: "+a); imagen.ver(a);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        imagen.eliminar(correrImagen);
        String mensaje=this.Titulo.getText();
        this.Picture.setText(mensaje+" ELIMINADA");
         System.out.println(imagen.getTamaño());
         idImagen--;
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       carpeta.insertarFinal(nombreCarpeta,imagen);
       String nombre=this.nombreUsuario.getText();
       int idArchivo=(int) this.jComboBox1.getSelectedIndex();
       for(int a=0;a<carpeta.tamaño;a++){
           if(carpeta.tamaño==a+1){
               
           }else{
               carpeta.eliminar(carpeta.tamaño);
           }
       }
       
       usuario.insertarInicio(nombre, carpeta);
       bin.writeObject(usuario);
       for(int a=0;a<idImagen;a++){
            if(imagen.getTamaño()==1){
                imagen.eliminar(0);
            }else{
                imagen.eliminar(1);
            }
            System.out.println(imagen.getTamaño());
        }
        while(carpeta.getTamaño()!=0){
            carpeta.eliminar(0);
        }
        idCarpeta=0;
        idImagen=0;
        nombreCarpeta="GENERAL";
        new vPrincipal().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresarBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Picture;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
