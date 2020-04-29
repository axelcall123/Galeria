package fotos;
import static fotos.ingresarBiblioteca.bin;
/*import static fotos.ingresarBiblioteca.carpeta;
import static fotos.ingresarBiblioteca.idImagen;
import static fotos.ingresarBiblioteca.imagen;*/
import static fotos.ingresarBiblioteca.usuario;
import javax.swing.JOptionPane;
public class vPrincipal extends javax.swing.JFrame {
    //OBJETOS Y NODOS
    static ParaAlmacen usuariosID[]=new ParaAlmacen[1];
   
    Enlazada ayudaUsuario= new Enlazada();
    dobleEnlazada ayudaCarpeta=new dobleEnlazada();
    dobleEnlaCir ayudaImagen=new dobleEnlaCir();
    Enlazada leer = (Enlazada) bin.readObject();
    
    JTemp temp= new JTemp();
    public vPrincipal() {
        initComponents();
        if (leer == null) {
            
        } else {
            ayudaUsuario=leer;
            for (int a = 0; a < ayudaUsuario.getTamaño(); a++) {
                usuario.insertarInicio(ayudaUsuario.obtenerNombre(a), (dobleEnlazada) ayudaUsuario.obtenerNodo(a));
                //System.out.println(ayudaUsuario.obtenerNombre(a) + " ;; " + ayudaUsuario.obtenerNodo(a));
            }
            System.out.println();
            /*for (int a = 0; a < ayudaCarpeta.getTamaño(); a++) {
                carpeta.insertarInicio(ayudaCarpeta.obtenerNombre(a), ayudaCarpeta.obtenerNodo(a));
                System.out.println(ayudaCarpeta.obtenerNombre(a) + " ;; " + ayudaCarpeta.obtenerNodo(a));
            }
            for (int a = 0; a < carpeta.getTamaño(); a++) {
                ayudaImagen = (dobleEnlaCir) carpeta.obtenerNodo(a);
                System.out.println(ayudaImagen.obtenerNodo(a));
            }
            for (int a = 0; a < ayudaImagen.getTamaño(); a++) {
                imagen.insertarFinal(ayudaImagen.obtenerNodo(a));
                idImagen++;
            }*/
            
        }
  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Usuario = new javax.swing.JTextField();
        ingBiblio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        ingBiblio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        ingBiblio.setText("INGRESAR A BIBLIOTECA");
        ingBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBiblioActionPerformed(evt);
            }
        });

        jLabel1.setText("USUARIO");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("MENU");

        jToggleButton1.setText("INGRESAR A CONVERTIRDOR");

        jToggleButton2.setText("INGRESAR A EDITOR");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        ingBiblio1.setText("VER");
        ingBiblio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBiblio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(283, 283, 283))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ingBiblio)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ingBiblio1, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jToggleButton2)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingBiblio)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton1))
                .addGap(18, 18, 18)
                .addComponent(ingBiblio1)
                .addContainerGap(209, Short.MAX_VALUE))
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
    
    int id=temp.getIdUsuario();
    private void ingBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblioActionPerformed
        String user=Usuario.getText();
        Object ayuda=null;
        if(user.equals("")){//USUARIO SIN NOMBRE NO DEJA ENTRAR
            JOptionPane.showMessageDialog(null, "INGRESE UN NOMBRE DE USUARIO");
        }else{
            usuariosID[0]=new ParaAlmacen(user,ayuda);
            new ingresarBiblioteca().setVisible(true);
            Usuario.setText("");
            id++;
            temp.setIdUsuario(id);
            System.out.println("ID AL ENTRAR: "+temp.getIdUsuario());
            dispose();
        }
        temp.setIdArhcivo(0);
        
    }//GEN-LAST:event_ingBiblioActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        new editor().setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void ingBiblio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBiblio1ActionPerformed
        new ver().setVisible(true);
        dispose();
    }//GEN-LAST:event_ingBiblio1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton ingBiblio;
    private javax.swing.JButton ingBiblio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
