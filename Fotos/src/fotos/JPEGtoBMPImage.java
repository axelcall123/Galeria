
package fotos;

import fotos.ImageHandler;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class JPEGtoBMPImage extends ImageHandler {
	protected String copyname;
        JTemp temp= new JTemp();
        static String url;
        BufferedImage input_image = null;
	public JPEGtoBMPImage(String imagename) {
            super(imagename);
            url=imagename;
            String nombre=imagename.substring(imagename.lastIndexOf("\\")+1,+imagename.lastIndexOf(".jpg"))+".bmp";
            System.out.println(nombre+" de jpg a bmp");
            this.copyname ="TEMP\\BMP\\"+"converted-"+nombre;
            temp.setUrl(copyname);
	}
	public void readFile() throws Exception {
            input_image = ImageIO.read(new File(url)); //LEE EL JPG
            System.out.println("Imagen leida: " + this.handledFileName);
	}
	public void generateFiles() throws Exception {
            File outputfile = new File(copyname); //CREA EL BMP
            boolean result=ImageIO.write(input_image, "BMP", outputfile);
            System.out.println("Imagen generada: " + copyname);
	}
}
/*MANERA DE HACERLO
protected byte[] filebytes;
	protected String copyname;
        JTemp temp= new JTemp();
	public JPEGtoBMPImage(String imagename) {
            super(imagename);
            String nombre=imagename.substring(imagename.lastIndexOf("\\")+1,+imagename.lastIndexOf(".jpg"))+".bmp";
            System.out.println(nombre+" de jpg a bmp");
            this.copyname ="TEMP\\BMP\\"+"converted-"+nombre;
            
            temp.setUrl(copyname);
	}
	public void readFile() throws Exception {
		FileInputStream input = new FileInputStream(this.handledFileName);
		filebytes = new byte[input.available()];
		input.read(filebytes);
		input.close();
		System.out.println("Imagen leida: " + this.handledFileName);
	}
	public void generateFiles() throws Exception {
		FileOutputStream output = new FileOutputStream(copyname);
		output.write(filebytes);
                for(int a=0;a<filebytes.length;a++){
                    System.out.println("bits: "+a+" "+filebytes[a]);
                }
		output.close();
		System.out.println("Imagen generada: " + copyname);
       
	}
*/