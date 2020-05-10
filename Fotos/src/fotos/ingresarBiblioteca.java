package fotos;

import static fotos.vPrincipal.usuariosID;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ingresarBiblioteca extends javax.swing.JFrame {
    JTemp temp = new JTemp();
    static Enlazada usuario= new Enlazada();
    static BinManager bin = new BinManager();//ENLAZADA SIMPLE
    
   //static int idCarpeta;
    
    public ingresarBiblioteca() {
        initComponents();
        this.nombreUsuario.setText(usuariosID[0].getNombre());
        this.Picture.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN,10));
        usuario.insertarInicio(this.nombreUsuario.getText()/*, carpeta*/);
        usuario.obtenerNodo(0).getArchivo().insertarFinal("GENERAL");//carpeta.insertarFinal("GENERAL");
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
                        .addGap(14, 14, 14)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)))
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2)
                .addGap(96, 96, 96)
                .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton5)
                        .addGap(55, 55, 55)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        /*Guardar ventana = new Guardar();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.Cargar.setFileFilter(filtro);//FILTRO DE IMAGENES
        int resulta = ventana.Cargar.showOpenDialog(null);//DEVULVE UN ENTERO
        archivo = ventana.Cargar.getSelectedFile();
        //URLS
        String url = archivo.getPath();//URL
        //String nuevaUrl=url.substring(url.lastIndexOf("D:")+0,+url.lastIndexOf(".jpg"))+".bmp";
        String nuevaUrl="DES\\"+url.substring(url.lastIndexOf("\\")+1,+url.lastIndexOf(".jpg"))+".jpg";//DA LO MISM JPG O BMP
        String nombre = archivo.getName();//NOMBRE
        System.out.println(url+" ;; "+nuevaUrl);
        //OBTENER IMAGEN
        Picture.setIcon(new ImageIcon(url)); 
        this.Titulo.setText(nombre);//TITULO DE LA IMAGEN
        //GUARDAR
        String categoria= (String) this.jComboBox1.getSelectedItem();
        for(int z=0;z<usuario.obtenerNodo(0).getArchivo().getTamaño();z++){     
            if(categoria==usuario.obtenerNodo(0).getArchivo().obtenerNombre(z)){
                usuario.obtenerNodo(0).getArchivo().obtenerNodo(z).getImagen().insertarInicio(archivo);//carpeta.obtenerNodo(z).getImagen().insertarInicio(archivo);
            }
        }
        //492,358
        ImageIcon icon = new ImageIcon(url);
        Icon iconos = new ImageIcon(icon.getImage().getScaledInstance(Picture.getWidth(), Picture.getHeight(), Image.SCALE_DEFAULT));///AJUSTA EL TAMAÑO DE LA IMAGEN
        this.Picture.setIcon(iconos);
       // System.out.println("ID: "+idCarpeta);
        correrImagen++;
        idImagen++;*/
        
        Guardar ventana = new Guardar();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        ventana.Cargar.setFileFilter(filtro);//FILTRO DE IMAGENES
        int resulta = ventana.Cargar.showOpenDialog(null);//DEVULVE UN ENTERO
        
        File[] archivos = ventana.Cargar.getSelectedFiles();
        for(int i=0;i<archivos.length;i++){
            //URLS
            archivo=archivos[i];
            String url = archivo.getPath();//URL
            //String nuevaUrl=url.substring(url.lastIndexOf("D:")+0,+url.lastIndexOf(".jpg"))+".bmp";
            String nuevaUrl="DES\\"+url.substring(url.lastIndexOf("\\")+1,+url.lastIndexOf(".jpg"))+".jpg";//DA LO MISM JPG O BMP
            String nombre = archivo.getName();//NOMBRE
            System.out.println(url+" ;; "+nuevaUrl);
            //OBTENER IMAGEN
            Picture.setIcon(new ImageIcon(url));
            this.Titulo.setText(nombre);//TITULO DE LA IMAGEN
            //GUARDAR
            
            String categoria= (String) this.jComboBox1.getSelectedItem();
            for(int z=0;z<usuario.obtenerNodo(0).getArchivo().getTamaño();z++){     
                if(categoria==usuario.obtenerNodo(0).getArchivo().obtenerNombre(z)){
                    usuario.obtenerNodo(0).getArchivo().obtenerNodo(z).getImagen().insertarInicio(archivo);//carpeta.obtenerNodo(z).getImagen().insertarInicio(archivo);
                }
            }
            //492,358
            ImageIcon icon = new ImageIcon(url);
            Icon iconos = new ImageIcon(icon.getImage().getScaledInstance(Picture.getWidth(), Picture.getHeight(), Image.SCALE_DEFAULT));///AJUSTA EL TAMAÑO DE LA IMAGEN
            this.Picture.setIcon(iconos);
           // System.out.println("ID: "+idCarpeta);
            correrImagen++;
            idImagen++;
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*correrImagen++; FUNCIONA EN LA ANTERIOR VERSION
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
        }*/
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
/*       correrImagen--;//CORRER IMAGENES FUNCIONA EN LA ANTERIRO VERSION
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
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       /*String categoria= (String) this.jComboBox1.getSelectedItem();
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
        idCarpeta--;*/
    }//GEN-LAST:event_jButton3ActionPerformed
    static String nombreCarpeta;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        nombreCarpeta = JOptionPane.showInputDialog("NOMBRE SU CARPETA");
        usuario.obtenerNodo(0).getArchivo().insertarFinal(nombreCarpeta);//carpeta.insertarFinal(nombreCarpeta/*,imagen*/);
        //carpeta.getCabeza().getImagen().insertarInicio(evt);
        jComboBox1.addItem(nombreCarpeta);
        idImagen=0;
        //idCarpeta++;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       System.out.println();
       for(int z=0;z<usuario.getTamaño();z++){
            System.out.println("NOMBRE: "+usuario.obtenerNombre(z));
            for(int y=0;y<usuario.obtenerNodo(z).getArchivo().getTamaño();y++){
                System.out.println("    ARCHIVO: "+usuario.obtenerNodo(z).getArchivo().obtenerNombre(y));
                for(int x=0;x<usuario.obtenerNodo(z).getArchivo().obtenerNodo(y).getImagen().getTamaño();x++){
                    System.out.println("        IMAGEN:"+usuario.obtenerNodo(z).getArchivo().obtenerNodo(y).getImagen().obtenerNodo(x));
                }
            }
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        /*imagen.eliminar(correrImagen);
        String mensaje=this.Titulo.getText();
        this.Picture.setText(mensaje+" ELIMINADA");
         System.out.println(imagen.getTamaño());
         idImagen--;*/
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

       //bin.writeObject(usuario);
        /*while(carpeta.getTamaño()!=0){
            carpeta.eliminar(0);
        }*/
        idImagen=0;
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
