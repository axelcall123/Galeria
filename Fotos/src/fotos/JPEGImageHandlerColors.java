package fotos;

import fotos.ImageHandler;
import java.awt.image.BufferedImage;

public class JPEGImageHandlerColors extends ImageHandler {
	protected String copyname;
        protected BufferedImage actualImagen;
        JTemp temp= new JTemp();
	public JPEGImageHandlerColors(String imagename) {
            super(imagename);
	}
	public void readFile() throws Exception {
		
	}
	public void generateFiles() throws Exception {
		     
	}
}