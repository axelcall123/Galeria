package fotos;

import fotos.ImageHandler;
import java.io.*;

public class BMPtoJPEGImage extends ImageHandler {
        
	protected byte[] filebytes;
	protected String copyname;
        static String urls;
	public BMPtoJPEGImage(String imagename) {
            super(imagename);
            String nombre=imagename.substring(imagename.lastIndexOf("\\")+1,+imagename.lastIndexOf(".bmp"))+".jpg";
            System.out.println(nombre+"de bmp a jpg");
            this.copyname ="TEMP\\JPG\\"+"converted-"+nombre;
            
            
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