package fotos;

import fotos.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class JPEGImageHandlerColors extends ImageHandler {
	protected byte[] filebytes;
	protected String copyname;
        JTemp temp= new JTemp();
	public JPEGImageHandlerColors(String imagename) {
            super(imagename);
            String obtenerNombre=imagename.substring(imagename.lastIndexOf("\\")+1,imagename.lastIndexOf(".")+4);
            System.out.println(obtenerNombre+" nombre");
            this.copyname ="TEMP\\BMP\\"+obtenerNombre;
            temp.setUrl(copyname);
	}
	public void readFile() throws Exception {
		FileInputStream input = new FileInputStream(this.handledFileName);
		filebytes = new byte[input.available()];
		input.read(filebytes);
		input.close();
		System.out.println("Imagen leida: " + this.handledFileName);
                for(int a=0;a<filebytes.length;a++){
                    System.out.println(filebytes[a]);
                }
                
	}
	public void generateFiles() throws Exception {
		FileOutputStream output = new FileOutputStream(copyname);
		output.write(filebytes);
		output.close();
		System.out.println("Imagen generada: " + copyname);
                
	}
        /*protected String copyname;
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
	     int promedio;
             int colorSRGB;
             int posicion=0;
             Color colorOriginal;
             for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    System.out.println(colorOriginal);
                    //promedio=colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue();
                    posicion++;
                }
             }
             
	}*/

    
}