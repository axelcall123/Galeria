package fotos.ImageHandler;
import fotos.ImageHandler.ImageHandler;
import fotos.Apoyo.JTemp;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class JPEGImageHandlerBN extends ImageHandler {
        protected String copyname;
        protected BufferedImage imagenActual;
        JTemp temp= new JTemp();
	public JPEGImageHandlerBN(String imagename) {
            super(imagename);
            copyname=imagename;
            System.out.println(copyname+" url de la sepia etc...");
	}
	public void readFile() throws Exception {
            File nuevaImagen= new File(temp.getUrl());//OBTINE LA IMAGEN BMP
            BufferedImage imagenNew= ImageIO.read(nuevaImagen);
            imagenActual= imagenNew;
            System.out.println("Imagen leida: " + this.handledFileName);
	}
        
	public void generateFiles() throws Exception {
             int promedio,colorSRGB=0;
             Color colorOriginal;
             String obtenerNombre,nuevaUrl,JPG;
             File outputfile;
             boolean result;
             
             //CONVIERTE BLANCO Y NEGRO
            for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    //0 azul o 0,0,0,
                    //16 rojo o 16,16,16
                    //8 verde o 8,8,8
                    //16,8,16 amarillo o 16,8
                    //8,0,0 celeste
                    //morado 0,0,16
                    promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    colorSRGB=(promedio << 16)|(promedio << 8)|promedio;
                    imagenActual.setRGB(a, b,colorSRGB);    
                }
             }
             obtenerNombre=copyname.substring(copyname.lastIndexOf("\\")+1,copyname.lastIndexOf(".")+4);//NOMBRE
             nuevaUrl="TEMP\\JPG\\"+"blancoNegro-"+obtenerNombre;//NUEVA URL
             JPG=nuevaUrl.substring(nuevaUrl.lastIndexOf("\\")+1,+nuevaUrl.lastIndexOf(".bmp"))+".jpg";//CONVIETRE BMP A JPG
             nuevaUrl="TEMP\\JPG\\"+JPG;
             outputfile = new File(nuevaUrl);
             result=ImageIO.write(imagenActual, "jpg", outputfile);//REGRESA UNA JPG
             JPEGHandler ja= new JPEGHandler();
            
	}        
}