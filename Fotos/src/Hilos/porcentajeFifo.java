
package Hilos;

import fotos.Apoyo.opcionesConvertir;
import fotos.Listas.dobleEnlaCir;
import java.io.File;
import javax.swing.JOptionPane;

public class porcentajeFifo extends Thread{
    private dobleEnlaCir imagenes;
    opcionesConvertir generador= new opcionesConvertir();
    
    public porcentajeFifo(dobleEnlaCir img){
        this.imagenes=img;
    }
    ///////////////////
    public void run(){
        fotos.Convertidor.areaProcesamiento.setText("Procesando..."+"\n");
        String area="";
        File archivos;
        for(int a=0;a<imagenes.getTamaño();a++){    //CICLO PARA TODAS LA IMAGNES
            System.out.println(imagenes.obtenerNodo(a));
            archivos=(File) imagenes.obtenerNodo(a);
            int porcentaje=(100*(a+1))/imagenes.getTamaño();//PORCENAJE
            fotos.Convertidor.porcent.setValue(porcentaje);
            
            System.out.println(area);
            if(fotos.Convertidor.jU_d.isSelected()==true){
                generador.jpgToBmp(archivos);//LLENA EL TEXT AREA
                area="JPG A BMP O VICERVERSA: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else if(fotos.Convertidor.jD_d.isSelected()==true){
                generador.copia(archivos);
                area="COPIA JPG: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else if(fotos.Convertidor.jT_d.isSelected()==true){
                generador.redGreenBlue(archivos);
                area="ROJO VERDE AZUL SEPIA: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else if(fotos.Convertidor.jC_d.isSelected()==true){
                generador.modificarImagen(archivos);
                area="ROTAR: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else if(fotos.Convertidor.jCin_d.isSelected()==true){
                generador.blancoNegro(archivos);
                area="BLANCO NEGRO: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else{
                JOptionPane.showMessageDialog(null, "NO ELEIGIO UNA OPCION");
            }
        }
    }
    /////////////////
}
