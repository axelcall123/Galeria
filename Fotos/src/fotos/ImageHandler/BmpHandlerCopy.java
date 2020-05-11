package fotos.ImageHandler;

/* 
	Codigo creado para el curso de ipc1 
 */
import fotos.ImageHandler.ImageHandler;
import fotos.Apoyo.JTemp;
import java.io.*;

/**
*	BmpHandlerCopy class es una subclase de ImageHandler. A BmpHandlerCopy object 
* 	lets us handle an original bmp file by being able of making an exact copy of it.
*
*	@author Jorge Daniel Monterroso Nowell - @jorged104
*	@version 1.0
**///CREA UNA COPIA BMP y JPG
public class BmpHandlerCopy extends ImageHandler {
	protected byte[] filebytes;
	protected String copyname;
        JTemp temp= new JTemp();
	/*no ma*/
	public BmpHandlerCopy(String imagename) {
            super(imagename);
            String obtenerNombre=imagename.substring(imagename.lastIndexOf("\\")+1,imagename.lastIndexOf(".")+4);
            System.out.println(obtenerNombre+" nombre");
            this.copyname ="TEMP\\BMP\\"+"copy-"+obtenerNombre;
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
                JPEGHandler ja= new JPEGHandler();
	}
        
        
        
}