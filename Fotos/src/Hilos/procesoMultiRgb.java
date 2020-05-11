
package Hilos;

import static Hilos.procesoMultiJpgToBmp.a;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class procesoMultiRgb extends Thread{
    private File archivo;
    private int tamaño;
    public procesoMultiRgb(File img,int tamaño){
        this.archivo=img;
        this.tamaño=tamaño;
    }
    
    static int a=1;
    BufferedImage imagenRojo,imagenVerde,imagenAzul,imagenSepia;
    public void run(){
        fotos.Convertidor.areaProcesamiento.setText("Procesando..."+"\n");//CREA LO PRIMERO EN EL AREA
        String url="TEMP\\BMP\\"+"converted-"+archivo.getPath().substring(archivo.getPath().lastIndexOf("\\")+1,archivo.getPath().lastIndexOf(".jpg"))+".bmp";//OBTIENE EL NOMBRE
        try {
            BufferedImage input_image=ImageIO.read(new File(archivo.getPath()));//LEE EL ANTERIOR ARCHIVO
            File outputfile = new File(url);//NUEVA URL
            boolean result=ImageIO.write(input_image,"BMP",outputfile);//CONVIERTE A OTRO TIPO
            //
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiJpgToBmp.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///CONVETIR COLORES
        try {
            File unoF= new File(url);//OBTINE LA IMAGEN BMP
            BufferedImage unoB= ImageIO.read(unoF);
            imagenRojo= unoB;
            
            File dosF= new File(url);//OBTINE LA IMAGEN BMP
            BufferedImage dosB= ImageIO.read(dosF);
            imagenVerde= dosB;
            
            File tresF= new File(url);//OBTINE LA IMAGEN BMP
            BufferedImage tresB= ImageIO.read(tresF);
            imagenAzul= tresB;
            
            File cuatroF= new File(url);//OBTINE LA IMAGEN BMP
            BufferedImage cuatroB= ImageIO.read(cuatroF);
            imagenSepia= cuatroB;  
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiRgb.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////GENERANDO LAS OPCIONES
        int promedio,colorSRGB=0;
        Color colorOriginal;
        String obtenerNombre,nUrl,jpg;
        obtenerNombre=archivo.getPath().substring(archivo.getPath().lastIndexOf("\\")+1,archivo.getPath().lastIndexOf(".")+4);//OBTIENE EL NOMBRE
        File outputfile;
        
        //COLOR ROJO
        for (int a = 0; a < imagenRojo.getWidth(); a++) {
            for (int b = 0; b < imagenRojo.getHeight(); b++) {
                colorOriginal = new Color(this.imagenRojo.getRGB(a, b));
                promedio = (colorOriginal.getRed() + colorOriginal.getGreen() + colorOriginal.getBlue()) / 3;
                colorSRGB = (promedio << 16);
                imagenRojo.setRGB(a, b, colorSRGB);
            }
        }
       nUrl="TEMP\\JPG\\"+"rojo-"+obtenerNombre;
       jpg=nUrl.substring(nUrl.lastIndexOf("\\")+1,nUrl.lastIndexOf('.'))+".jpg";
       nUrl="TEMP\\JPG\\"+jpg;
       outputfile = new File(nUrl);       
        try {
            ImageIO.write(imagenRojo, "jpg", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiRgb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //COLOR VERDE
        for (int a = 0; a < imagenVerde.getWidth(); a++) {
            for (int b = 0; b < imagenVerde.getHeight(); b++) {
                colorOriginal = new Color(this.imagenVerde.getRGB(a, b));
                promedio = (colorOriginal.getRed() + colorOriginal.getGreen() + colorOriginal.getBlue()) / 3;
                colorSRGB = (promedio << 8);
                imagenVerde.setRGB(a, b, colorSRGB);
            }
        }
        nUrl="TEMP\\JPG\\"+"verde-"+obtenerNombre;
        jpg=nUrl.substring(nUrl.lastIndexOf("\\")+1,nUrl.lastIndexOf('.'))+".jpg";
        nUrl="TEMP\\JPG\\"+jpg;
        outputfile = new File(nUrl);
        try {
            ImageIO.write(imagenVerde, "jpg", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiRgb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //COLOR AZUL
        for (int a = 0; a < imagenAzul.getWidth(); a++) {
            for (int b = 0; b < imagenAzul.getHeight(); b++) {
                colorOriginal = new Color(this.imagenAzul.getRGB(a, b));
                promedio = (colorOriginal.getRed() + colorOriginal.getGreen() + colorOriginal.getBlue()) / 3;
                colorSRGB = (promedio << 0) | (promedio << 0) | (promedio << 0);
                imagenAzul.setRGB(a, b, colorSRGB);
            }
        }
        nUrl="TEMP\\JPG\\"+"azul-"+obtenerNombre;
        jpg=nUrl.substring(nUrl.lastIndexOf("\\")+1,nUrl.lastIndexOf('.'))+".jpg";
        nUrl="TEMP\\JPG\\"+jpg;
        outputfile = new File(nUrl);
        try {
            ImageIO.write(imagenAzul, "jpg", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiRgb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //COLOR SEPIA
        for (int a = 0; a < imagenSepia.getWidth(); a++) {
            for (int b = 0; b < imagenSepia.getHeight(); b++) {
                colorOriginal = new Color(this.imagenSepia.getRGB(a, b));
                int green = (int) (colorOriginal.getGreen() * 0.59);
                int blue = (int) (colorOriginal.getBlue() * 0.49);
                int rgb = new Color(102, green, blue).getRGB();
                imagenSepia.setRGB(a, b, rgb);
            }
        }
        nUrl="TEMP\\JPG\\"+"sepia-"+obtenerNombre;
        jpg=nUrl.substring(nUrl.lastIndexOf("\\")+1,nUrl.lastIndexOf('.'))+".jpg";
        nUrl="TEMP\\JPG\\"+jpg;
        outputfile = new File(nUrl);
        try {
            ImageIO.write(imagenSepia, "jpg", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiRgb.class.getName()).log(Level.SEVERE, null, ex);
        }
        fotos.Convertidor.areaProcesamiento.append("ROJO VERDE AZUL SEPIA: "+archivo.getName()+'\n');
        fotos.Convertidor.porcent.setValue((100*a)/tamaño);
        a++;
    }
}
