
package fotos.Apoyo;

import fotos.Listas.dobleEnlaCir;
import java.io.File;

public class procesoMulti extends Thread{
    private dobleEnlaCir packImg;
    private File archivo;
    public procesoMulti(File img){
        /*this.id=id;*/
        this.archivo=img;
    }
    public procesoMulti(dobleEnlaCir imgs){
        this.packImg=imgs;
    }
    ///////////////////
    public void run(){
        //opcionesConvertir generador= new opcionesConvertir();
        //generador.redGreenBlue(archivo);
        System.out.println("soy la imagen;"+archivo.getName());
    }
    /////////////////
    public void nel(){
        procesoMulti[] vec= new procesoMulti[packImg.getTamaño()];
        for(int a=0;a<vec.length;a++){
            vec[a] = new procesoMulti((File) packImg.obtenerNodo(a));
            vec[a].start();
        }
        /*procesoMulti[] vec = new procesoMulti[25];
        for(int a=0;a<vec.length;a++){
            vec[a]= new procesoMulti(a+1);
            vec[a].start();
        }*/
        
    }
}
