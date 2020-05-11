
package Hilos;


import static Hilos.procesoMultiRgb.a;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class procesoMultiModificar extends Thread{
    private File archivo;
    private int tamaño;
    public procesoMultiModificar(File img,int tamaño){
        this.archivo=img;
        this.tamaño=tamaño;
    }
    static int a=1;
    BufferedImage imagenActual,imagenNew,nueva;
    public void run(){
        fotos.Convertidor.areaProcesamiento.setText("Procesando..." + "\n");//CREA LO PRIMERO EN EL AREA
        String url = "TEMP\\BMP\\" + "converted-" + archivo.getPath().substring(archivo.getPath().lastIndexOf("\\") + 1, archivo.getPath().lastIndexOf(".jpg")) + ".bmp";//OBTIENE EL NOMBRE
        try {
            BufferedImage input_image = ImageIO.read(new File(archivo.getPath()));//LEE EL ANTERIOR ARCHIVO
            File outputfile = new File(url);//NUEVA URL
            boolean result = ImageIO.write(input_image, "BMP", outputfile);//CONVIERTE A OTRO TIPO
            //
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiJpgToBmp.class.getName()).log(Level.SEVERE, null, ex);
        }
        //INVERTIR
        try {
            File nuevaImagen= new File(url);//OBTINE LA IMAGEN BMP
            imagenNew= ImageIO.read(nuevaImagen);
            imagenActual= imagenNew;
            nueva=imagenNew;
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiRgb.class.getName()).log(Level.SEVERE, null, ex);
        }
        Color colorOriginal;
        String obtenerNombre,nUrl,jpg;
        File outputfile;
        obtenerNombre=archivo.getPath().substring(archivo.getPath().lastIndexOf("\\")+1,archivo.getPath().lastIndexOf(".")+4);
        int[][]  matrizColores = new int[imagenActual.getWidth()][imagenActual.getHeight()];
        
        for (int a = 0; a < imagenActual.getWidth(); a++) {
            for (int b = 0; b < imagenActual.getHeight(); b++) {
                colorOriginal = new Color(this.imagenActual.getRGB(a, b));
                int red = colorOriginal.getRed();
                int green = colorOriginal.getGreen();
                int blue = colorOriginal.getBlue();
                matrizColores[a][b] = new Color(red, green, blue).getRGB();
            }
        }
        //ALREVES
        int x = imagenActual.getWidth() - 1, y = imagenActual.getHeight() - 1;
        for (int a = 0; a < imagenActual.getWidth(); a++) {
            for (int b = 0; b < imagenActual.getHeight(); b++) {
                imagenActual.setRGB(a, b, matrizColores[x][y]);
                y--;
            }
            y = imagenActual.getHeight() - 1;
            x--;
        }
        nUrl="TEMP\\JPG\\"+"Hrotation-"+obtenerNombre;
        jpg=nUrl.substring(nUrl.lastIndexOf("\\")+1,nUrl.lastIndexOf('.'))+".jpg";
        nUrl="TEMP\\JPG\\"+jpg;
        outputfile = new File(nUrl);       
        try {
            ImageIO.write(imagenActual, "jpg", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiRgb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //DE OTRA MANERA
        x = nueva.getWidth() - 1;
        y = 0;
        for (int a = 0; a < nueva.getWidth(); a++) {
            for (int b = 0; b < nueva.getHeight(); b++) {
                nueva.setRGB(a, b, matrizColores[x][y]);
                y++;
            }
            y = 0;
            x--;
        }
        nUrl="TEMP\\JPG\\"+"Vrotation-"+obtenerNombre;
        jpg=nUrl.substring(nUrl.lastIndexOf("\\")+1,nUrl.lastIndexOf('.'))+".jpg";
        nUrl="TEMP\\JPG\\"+jpg;
        outputfile = new File(nUrl);       
        try {
            ImageIO.write(nueva, "jpg", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiRgb.class.getName()).log(Level.SEVERE, null, ex);
        }
        fotos.Convertidor.areaProcesamiento.append("ROJO VERDE AZUL SEPIA: "+archivo.getName()+'\n');
        fotos.Convertidor.porcent.setValue((100*a)/tamaño);
        a++;
    }
}
