package fotos;

import fotos.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
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
	     /*int mediaPixel;
             int colorSRGB;*/
             int posicion=0;
             Color colorOriginal;
             for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    System.out.println(posicion+" ;; "+colorOriginal);
                    posicion++;
                }
             }
             
	}
}