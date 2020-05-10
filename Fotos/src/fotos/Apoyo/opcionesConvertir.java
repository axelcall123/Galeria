package fotos.Apoyo;

import fotos.ImageHandler.JPEGImageHandlerColors;
import fotos.ImageHandler.JPEGImageHandlerBN;
import fotos.ImageHandler.JPEGImageHandlerRotator;
import fotos.ImageHandler.BmpHandlerCopy;
import fotos.ImageHandler.BMPtoJPEGImage;
import fotos.ImageHandler.JPEGtoBMPImage;
import fotos.editor;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class opcionesConvertir {
    
    public void jpgToBmp(File archivo){
        String nombre = archivo.getName();//OBTENER EL NOMBRE
        String extension = nombre.substring(nombre.lastIndexOf(".") + 1);//VER SU EXTENSION
        if (extension.toUpperCase().equals("JPG")) {//CONVIERTE UNA IMAGEN JPG A BMP                   
            JPEGtoBMPImage bmp = new JPEGtoBMPImage(archivo.getPath().toString());
            try {
                bmp.readFile();
                bmp.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (extension.toUpperCase().equals("BMP")) {//CONVIETRE UNA IMAGEN BMP A JPG
            BMPtoJPEGImage jpg = new BMPtoJPEGImage(archivo.getPath().toString());
            try {
                jpg.readFile();
                jpg.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //////////////////
    public void copia(File archivo){
        String nombre = archivo.getName();//NOMBRE
        String extension = nombre.substring(nombre.lastIndexOf(".") + 1);//EXTENSION BMP O JPG
        if (extension.toUpperCase().equals("JPG")) {
            JPEGtoBMPImage bmp = new JPEGtoBMPImage(archivo.getPath().toString());//LEE EL ARCHIBO LA CONVIERTE A BMP
            System.out.println(archivo.getPath() + " url path");//EL NUEVO URL
            try {
                bmp.readFile();
                bmp.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            JTemp temp = new JTemp();
            BmpHandlerCopy copia = new BmpHandlerCopy(temp.getUrl());//LEE LA URL Y CREA UNA COPIA DEL BMP
            try {
                copia.readFile();
                copia.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println();
            BMPtoJPEGImage jpg = new BMPtoJPEGImage(temp.getUrl());//LEE LA NUEVA URL QUE ES BMP Y LA CONVIERTE A JPG
            try {
                jpg.readFile();
                jpg.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ES UNA IMAGEN BMP");
        }
    }
    ///////////////
    public void redGreenBlue(File archivo){
        String nombre = archivo.getName();//NOMBRE
        String extension = nombre.substring(nombre.lastIndexOf(".") + 1);//ESXTENSION
        if (extension.toUpperCase().equals("JPG")) {//SI ES JPG O NO
            JPEGtoBMPImage bmp = new JPEGtoBMPImage(archivo.getPath().toString());
            try {
                bmp.readFile();//GENERA PRIMERO EL ARCHIVO BMP
                bmp.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            JTemp temp = new JTemp();
            JPEGImageHandlerColors sepia = new JPEGImageHandlerColors(temp.getUrl());//NUEVA URL
            try {
                sepia.readFile();
                sepia.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }

            File eliminar = new File(temp.getUrl());
            System.out.println(eliminar.getPath() + " ulr a elminar");
            //eliminar.delete();
        } else {
            JOptionPane.showMessageDialog(null, "ES UNA IMAGEN BMP");
        }
    }
    ///////////////
    public void modificarImagen(File archivo){
        String nombre = archivo.getName();//NOMBRE
        String extension = nombre.substring(nombre.lastIndexOf(".") + 1);//ESXTENSION
        if (extension.toUpperCase().equals("JPG")) {//SI ES JPG O NO
            JPEGtoBMPImage bmp = new JPEGtoBMPImage(archivo.getPath().toString());
            try {
                bmp.readFile();//GENERA PRIMERO EL ARCHIVO BMP
                bmp.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            JTemp temp = new JTemp();
            JPEGImageHandlerRotator rotar = new JPEGImageHandlerRotator(temp.getUrl());
            try {
                rotar.readFile();
                rotar.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            File eliminar = new File(temp.getUrl());
            System.out.println(eliminar.getPath() + " ulr a elminar");
        } else {
            JOptionPane.showMessageDialog(null, "ES UNA IMAGEN BMP");
        }
    }
    ///////////////////////
    public void blancoNegro(File archivo){
        String nombre = archivo.getName();//NOMBRE
        String extension = nombre.substring(nombre.lastIndexOf(".") + 1);//ESXTENSION
        if (extension.toUpperCase().equals("JPG")) {//SI ES JPG O NO
            JPEGtoBMPImage bmp = new JPEGtoBMPImage(archivo.getPath().toString());
            try {
                bmp.readFile();//GENERA PRIMERO EL ARCHIVO BMP
                bmp.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            JTemp temp = new JTemp();
            JPEGImageHandlerBN bn = new JPEGImageHandlerBN(temp.getUrl());
            try {
                bn.readFile();
                bn.generateFiles();
            } catch (Exception ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            File eliminar = new File(temp.getUrl());
            System.out.println(eliminar.getPath() + " ulr a elminar");
        } else {
            JOptionPane.showMessageDialog(null, "ES UNA IMAGEN BMP");
        }
    }
}
