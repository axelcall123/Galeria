package fotos.ImageHandler;
/*holis*/
import fotos.ImageHandler.ImageHandler;
import fotos.Apoyo.JTemp;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/*otro tes para ver no mas*/
public class BMPtoJPEGImage extends ImageHandler {  
	protected String copyname;
        JTemp temp= new JTemp();
        static String url;
        BufferedImage input_image = null;
        
	public BMPtoJPEGImage(String imagename) {
            super(imagename);
            url=imagename;
            String nombre=imagename.substring(imagename.lastIndexOf("\\")+1,+imagename.lastIndexOf(".bmp"))+".jpg";
            System.out.println(nombre+"de bmp a jpg");
            this.copyname ="TEMP\\JPG\\"+"converted-"+nombre;
	}
	public void readFile() throws Exception {
		input_image = ImageIO.read(new File(url));
                System.out.println("Imagen leida: " + this.handledFileName);
	}
	public void generateFiles() throws Exception {
               File outputfile = new File(copyname); //CREA EL BMP
               boolean result=ImageIO.write(input_image, "BMP", outputfile);
               System.out.println("Imagen generada: " + copyname);
	}
}/*

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
*/