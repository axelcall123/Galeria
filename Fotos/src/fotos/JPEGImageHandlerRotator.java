package fotos;
import fotos.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class JPEGImageHandlerRotator extends ImageHandler {
        protected String copyname;
        protected BufferedImage imagenActual,nueva;
        JTemp temp= new JTemp();
	public JPEGImageHandlerRotator(String imagename) {
            super(imagename);
            copyname=imagename;
            System.out.println(copyname+" url de la sepia etc...");
	}
	public void readFile() throws Exception {
            File nuevaImagen= new File(temp.getUrl());//OBTINE LA IMAGEN BMP
            BufferedImage imagenNew= ImageIO.read(nuevaImagen);
            imagenActual= imagenNew;
            nueva=imagenNew;
            System.out.println("Imagen leida: " + this.handledFileName);
	}
        static boolean result;;
	public void generateFiles() throws Exception {
             Color colorOriginal;
             String obtenerNombre,nuevaUrl,JPG;
             File outputfile;
             int[][]  matrizColores = new int[imagenActual.getWidth()][imagenActual.getHeight()];
            
            for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    int red=colorOriginal.getRed();
                    int green=colorOriginal.getGreen();
                    int blue=colorOriginal.getBlue();
                    matrizColores[a][b]=new Color(red,green,blue).getRGB();
                    //imagenActual.setRGB(a, b, matrizColores[posicion]);
                }
            }
            
            //ALREVES
            int x=imagenActual.getWidth()-1,y=imagenActual.getHeight()-1;
            for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    imagenActual.setRGB(a, b, matrizColores[x][y]);
                    y--;
                }
                y=imagenActual.getHeight()-1;
                x--;
            }    
            obtenerNombre=copyname.substring(copyname.lastIndexOf("\\")+1,copyname.lastIndexOf(".")+4);
            nuevaUrl="TEMP\\JPG\\"+"Hrotation-"+obtenerNombre;
            JPG=nuevaUrl.substring(nuevaUrl.lastIndexOf("\\")+1,+nuevaUrl.lastIndexOf(".bmp"))+".jpg";
            nuevaUrl="TEMP\\JPG\\"+JPG;
            outputfile = new File(nuevaUrl);
            result=ImageIO.write(imagenActual, "jpg", outputfile);
            
            //DE OTRA MANERA
            x=nueva.getWidth()-1;
            y=0;
            for(int a=0;a<nueva.getWidth();a++){
                for(int b=0;b<nueva.getHeight();b++){
                    nueva.setRGB(a, b, matrizColores[x][y]);
                    y++;
                }
                y=0;
                x--;
            }    
            obtenerNombre=copyname.substring(copyname.lastIndexOf("\\")+1,copyname.lastIndexOf(".")+4);
            nuevaUrl="TEMP\\JPG\\"+"Vrotation-"+obtenerNombre;
            JPG=nuevaUrl.substring(nuevaUrl.lastIndexOf("\\")+1,+nuevaUrl.lastIndexOf(".bmp"))+".jpg";
            nuevaUrl="TEMP\\JPG\\"+JPG;
            outputfile = new File(nuevaUrl);
            result=ImageIO.write(nueva, "jpg", outputfile);
            
            
            System.out.println("se acabo");
	}        
}