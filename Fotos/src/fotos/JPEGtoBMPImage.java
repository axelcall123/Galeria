package fotos;

import fotos.ImageHandler;
import java.io.*;

public class JPEGtoBMPImage extends ImageHandler {
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
		output.close();
		System.out.println("Imagen generada: " + copyname);
                
               
	}
}