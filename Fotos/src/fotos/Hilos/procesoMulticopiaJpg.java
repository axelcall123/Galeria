package fotos.Hilos;

import static fotos.Hilos.procesoMultiJpgToBmp.a;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class procesoMulticopiaJpg extends Thread{
    private File archivo;
    private int tamaño;
    public procesoMulticopiaJpg(File img,int tamaño){
        this.archivo=img;
        this.tamaño=tamaño;
    }
    static int a=1;
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
        ///COPIPA BMP
        String nUrl="TEMP\\BMP\\"+"copy-"+url.substring(url.lastIndexOf("\\")+1,url.lastIndexOf(".bmp"))+".bmp";
        try {
            BufferedImage input_image=ImageIO.read(new File(url));//LEE EL NATERIOR ARCHIVO
            File outputfile = new File(nUrl);//NUEVA URL
            boolean result=ImageIO.write(input_image,"BMP",outputfile);//CONVIERTE A OTRO TIPO
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiJpgToBmp.class.getName()).log(Level.SEVERE, null, ex);
        }
        //CONVETIR JPG
        url=nUrl;
        nUrl="TEMP\\JPG\\"+"converted-"+nUrl.substring(nUrl.lastIndexOf("\\")+1,nUrl.lastIndexOf(".bmp"))+".jpg";
        try {
            BufferedImage input_image=ImageIO.read(new File(url));//LEE EL NATERIOR ARCHIVO
            File outputfile = new File(nUrl);//NUEVA URL
            boolean result=ImageIO.write(input_image,"JPG",outputfile);//CONVIERTE A OTRO TIPO
        } catch (IOException ex) {
            Logger.getLogger(procesoMultiJpgToBmp.class.getName()).log(Level.SEVERE, null, ex);
        }
        fotos.Convertidor.areaProcesamiento.append("COPIA JPG: "+archivo   .getName()+'\n');
        fotos.Convertidor.porcent.setValue((100*a)/tamaño);
        a++;
    }
}
