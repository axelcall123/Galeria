
package Hilos;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class procesoMultiJpgToBmp extends Thread{
    private File archivo;
    private int tamaño;
    public procesoMultiJpgToBmp(File img,int tamaño){
        this.archivo=img;
        this.tamaño=tamaño;
    }
    static int a=1; 
    public void run(){
        fotos.Convertidor.areaProcesamiento.setText("Procesando..."+"\n");//CREA LO PRIMERO EN EL AREA
        String extension=archivo.getName().substring(archivo.getName().lastIndexOf(".")+1);//EXTENSION       
        if(extension.toUpperCase().equals("JPG")){//VER SI ES JPG
            String url="TEMP\\BMP\\"+"converted-"+archivo.getPath().substring(archivo.getPath().lastIndexOf("\\")+1,archivo.getPath().lastIndexOf(".jpg"))+".bmp";//OBTIENE EL NOMBRE
            try {
                BufferedImage input_image=ImageIO.read(new File(archivo.getPath()));//LEE EL NATERIOR ARCHIVO
                File outputfile = new File(url);//NUEVA URL
                boolean result=ImageIO.write(input_image,"BMP",outputfile);//CONVIERTE A OTRO TIPO
                fotos.Convertidor.areaProcesamiento.append("JPG A BMP O VICERVERSA: "+archivo   .getName()+'\n');
            } catch (IOException ex) {
                Logger.getLogger(procesoMultiJpgToBmp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            String url="TEMP\\JPG\\"+"converted-"+archivo.getPath().substring(archivo.getPath().lastIndexOf("\\")+1,archivo.getPath().lastIndexOf(".bmp"))+".jpg";
            try {
                BufferedImage input_image=ImageIO.read(new File(archivo.getPath()));
                File outputfile = new File(url);
                boolean result=ImageIO.write(input_image,"JPG",outputfile);
                fotos.Convertidor.areaProcesamiento.append("JPG A BMP O VICERVERSA: "+archivo.getName()+'\n');
            } catch (IOException ex) {
                Logger.getLogger(procesoMultiJpgToBmp.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
        fotos.Convertidor.porcent.setValue((100*a)/tamaño);
        a++;
    }
    /////////////////
    
}
