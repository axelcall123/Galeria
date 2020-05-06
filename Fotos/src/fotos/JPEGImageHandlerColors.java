package fotos;

import fotos.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class JPEGImageHandlerColors extends ImageHandler {
        protected String copyname;
        protected BufferedImage imagenActual;
        JTemp temp= new JTemp();
	public JPEGImageHandlerColors(String imagename) {
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
             /*String obtenerNombre,nuevaUrl,JPG;
             File outputfile;
             boolean result;*/
             //COLOR ROJO
            /*for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    //0 azul o 0,0,0,
                    //16 rojo o 16,16,16
                    //8 verde o 8,8,8
                    //16,8,16 amarillo o 16,8
                    //8,0,0 celeste
                    //morado 0,0,16
                    promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    colorSRGB=(promedio << 16);
                    imagenActual.setRGB(a, b,colorSRGB);    
                }
             }
             obtenerNombre=copyname.substring(copyname.lastIndexOf("\\")+1,copyname.lastIndexOf(".")+4);
             nuevaUrl="TEMP\\JPG\\"+"rojo-"+obtenerNombre;
             JPG=nuevaUrl.substring(nuevaUrl.lastIndexOf("\\")+1,+nuevaUrl.lastIndexOf(".bmp"))+".jpg";
             nuevaUrl="TEMP\\JPG\\"+JPG;
             outputfile = new File(nuevaUrl);
             result=ImageIO.write(imagenActual, "jpg", outputfile);
             //COLOR VERDE
             for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    colorSRGB=(promedio << 8);
                    imagenActual.setRGB(a, b,colorSRGB);    
                }
             }
             obtenerNombre=copyname.substring(copyname.lastIndexOf("\\")+1,copyname.lastIndexOf(".")+4);
             nuevaUrl="TEMP\\JPG\\"+"verde-"+obtenerNombre;
             JPG=nuevaUrl.substring(nuevaUrl.lastIndexOf("\\")+1,+nuevaUrl.lastIndexOf(".bmp"))+".jpg";
             nuevaUrl="TEMP\\JPG\\"+JPG;
             outputfile = new File(nuevaUrl);
             result=ImageIO.write(imagenActual, "jpg", outputfile);

             //COLOR AZUL
             for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    colorSRGB=(promedio << 0)|(promedio << 0)|(promedio << 0);
                    imagenActual.setRGB(a, b,colorSRGB);    
                }
             }
             obtenerNombre=copyname.substring(copyname.lastIndexOf("\\")+1,copyname.lastIndexOf(".")+4);
             nuevaUrl="TEMP\\JPG\\"+"azul-"+obtenerNombre;
             JPG=nuevaUrl.substring(nuevaUrl.lastIndexOf("\\")+1,+nuevaUrl.lastIndexOf(".bmp"))+".jpg";
             nuevaUrl="TEMP\\JPG\\"+JPG;
             outputfile = new File(nuevaUrl);
             result=ImageIO.write(imagenActual, "jpg", outputfile);
             */
             //COLOR SEPIA
             for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                   colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                   int green=(int) (colorOriginal.getGreen()*0.59);
                   int blue= (int) (colorOriginal.getBlue()*0.49);
                   int rgb=new Color(100,green,blue).getRGB();
                   imagenActual.setRGB(a, b, rgb);   
                }
             }
            /*obtenerNombre=copyname.substring(copyname.lastIndexOf("\\")+1,copyname.lastIndexOf(".")+4);
            nuevaUrl="TEMP\\JPG\\"+"sepia-"+obtenerNombre;
            JPG=nuevaUrl.substring(nuevaUrl.lastIndexOf("\\")+1,+nuevaUrl.lastIndexOf(".bmp"))+".bmp";
            nuevaUrl="TEMP\\JPG\\"+JPG;*/
            File outputfile = new File(copyname);
            boolean result=ImageIO.write(imagenActual, "bmp", outputfile);
            ///////////////////////////////////////////////////
            System.out.println("se acabo");
	}        
}
