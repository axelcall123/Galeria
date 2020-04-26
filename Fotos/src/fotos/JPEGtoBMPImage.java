
package fotos;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JPEGtoBMPImage extends ImageHandler {
    protected byte[] filebytes;
    protected String copyname;

    public JPEGtoBMPImage(String imagename) {
	super(imagename);
	this.copyname = "copy-" + imagename;
    }

    @Override
    public void readFile() throws Exception {
        try (
            FileInputStream input = new FileInputStream(this.handledFileName)) {
            filebytes = new byte[input.available()];
            input.read(filebytes);
        }
	System.out.println("Imagen leida: " + this.handledFileName);
    }
    
    @Override
    public void generateFiles() throws Exception {
        try (FileOutputStream output = new FileOutputStream(copyname)) {
            output.write(filebytes);
        }
	System.out.println("Imagen generada: " + copyname);
    }
    
}
