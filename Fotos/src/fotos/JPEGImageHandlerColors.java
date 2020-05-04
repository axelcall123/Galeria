package fotos;

import fotos.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;

public class JPEGImageHandlerColors extends ImageHandler {
	/*protected byte[] filebytes;
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
                
	}*/
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
        
        int l,s,red,green,blue;
	public void generateFiles() throws Exception {
             int posicion=0;
             Color colorOriginal;
             for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    
                    /*IMAGEN AZUL imagenActual.setRGB(a, b,promedio);
                     promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    imagenActual.setRGB(b, promedio,a);
                    */
                    /*IMAGEN ROJO
                    promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    colorSRGB=(promedio << 16) | (promedio << 16) | (promedio<<16);
                    imagenActual.setRGB(a, b,colorSRGB);*/
                    /*MORADO 0,0,16*/
                    /*
                    0 azul o 0,0,0,
                    16 rojo o 16,16,16
                    8 verde o 8,8,8
                    16,8,16 amarillo o 16,8
                    8,0,0 celeste
                    */
                    int max,min;
                    red=colorOriginal.getRed();
                    green=colorOriginal.getGreen();
                    blue=colorOriginal.getBlue();
                    min=Math.min(Math.min(red, green),blue);
                    max=Math.max(Math.max(red, green),blue);
                    l=(int)(0.5*(max+min));
                    if(max==min){
                        s=0;
                    }else if(l<=0.5){
                        s=(max-min)/(2*l);
                    }else{
                        s=(max+min)/(2-(max+min));
                    }
                    //System.out.println(s);
                    Color hsl=Color.getHSBColor(32, s, l);
                    imagenActual.setRGB(a, b,hsl.getRGB());
                    //posicion++;
                        
                }
             }
             File outputfile = new File(copyname);
             boolean result=ImageIO.write(imagenActual, "bmp", outputfile);
             System.out.println("se acabo");
	}
    
}
/*
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    /*IMAGEN AZUL imagenActual.setRGB(a, b,promedio);
                     promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    imagenActual.setRGB(b, promedio,a);
                    */
                    /*IMAGEN ROJO
                    promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    colorSRGB=(promedio << 16) | (promedio << 16) | (promedio<<16);
                    imagenActual.setRGB(a, b,colorSRGB);*/
                    /*MORADO 0,0,16*/
                    /*
                    0 azul o 0,0,0,
                    16 rojo o 16,16,16
                    8 verde o 8,8,8
                    16,8,16 amarillo o 16,8
                    8,0,0 celeste
                    */
                    //colorSRGB=(colorOriginal.getRed() << 1)|(colorOriginal.getGreen() <<1)|(colorOriginal.getBlue() <<1);
                    /*int green=(int) (colorOriginal.getGreen()*0.59);
                    int blue= (int) (colorOriginal.getBlue()*0.49);
                    int rgb=new Color(102,green,blue).getRGB();
                    imagenActual.setRGB(a, b, rgb);
                    //posicion++;
                        
                }
             }
             File outputfile = new File(copyname);
             boolean result=ImageIO.write(imagenActual, "BMP", outputfile);
             System.out.println("se acabo"); 
*/
 /* int promedio;
             int colorSRGB;
             int posicion=0;
             Color colorOriginal;
             for(int a=0;a<imagenActual.getWidth();a++){
                for(int b=0;b<imagenActual.getHeight();b++){
                    colorOriginal=new Color(this.imagenActual.getRGB(a, b));
                    /*IMAGEN AZUL imagenActual.setRGB(a, b,promedio);
                     promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    imagenActual.setRGB(b, promedio,a);
                    */
                    /*IMAGEN ROJO
                    promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    colorSRGB=(promedio << 16) | (promedio << 16) | (promedio<<16);
                    imagenActual.setRGB(a, b,colorSRGB);*/
                    /*MORADO 0,0,16*/
                    /*
                    0 azul o 0,0,0,
                    16 rojo o 16,16,16
                    8 verde o 8,8,8
                    16,8,16 amarillo o 16,8
                    8,0,0 celeste
                    */
                   /* promedio=(colorOriginal.getRed()+colorOriginal.getGreen()+colorOriginal.getBlue())/3;
                    colorSRGB=(promedio << 32)|(promedio <<59)|(promedio <<98);
                    imagenActual.setRGB(a, b,colorSRGB);
                    //posicion++;
                        
                }
             }
             File outputfile = new File(copyname);
             boolean result=ImageIO.write(imagenActual, "BMP", outputfile);
             System.out.println("se acabo");*/