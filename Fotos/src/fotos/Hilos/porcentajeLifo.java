/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotos.Hilos;

import fotos.Apoyo.opcionesConvertir;
import fotos.Listas.dobleEnlaCir;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author axelc
 */
public class porcentajeLifo extends Thread{
    private dobleEnlaCir imagenes;
    opcionesConvertir generador= new opcionesConvertir();
    
    public porcentajeLifo(dobleEnlaCir img){
        this.imagenes=img;
    }
    ///////////////////
    public void run(){
        fotos.Convertidor.areaProcesamiento.setText("Procesando..."+"\n");
        String area="";
        File archivos;
        int ayuda=1;//AYUDA AL AUMENTO DEL PORCENTAJE
        for(int a=imagenes.getTamaño()-1;a>=0;a--){    //CICLO PARA TODAS LA IMAGNES
            System.out.println(imagenes.obtenerNodo(a));
            archivos=(File) imagenes.obtenerNodo(a);
            
            int porcentaje=(100*(ayuda))/imagenes.getTamaño();//PORCENAJE
            fotos.Convertidor.porcent.setValue(porcentaje);
            
            System.out.println(area);
            if(fotos.Convertidor.jU_d.isSelected()==true){//MULTIPLES OPCIONES JPG
                generador.jpgToBmp(archivos);
                area="JPG A BMP O VICERVERSA: "+archivos.getName()+'\n';//QUITA TODO DEJA SOLO EL NOMBRE
                fotos.Convertidor.areaProcesamiento.append(area);//LO AGRAGA 
            }else if(fotos.Convertidor.jD_d.isSelected()==true){//COPIA JPG
                generador.copia(archivos);
                area="COPIA JPG: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else if(fotos.Convertidor.jT_d.isSelected()==true){// RJO AZUL VERDE SEPIA
                generador.redGreenBlue(archivos);
                area="ROJO VERDE AZUL SEPIA: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else if(fotos.Convertidor.jC_d.isSelected()==true){// MODIFICAR IMAGEN
                generador.modificarImagen(archivos);
                area="ROTAR: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else if(fotos.Convertidor.jCin_d.isSelected()==true){//BLANCO Y NEGRO
                generador.blancoNegro(archivos);
                area="BLANCO NEGRO: "+archivos.getName()+'\n';
                fotos.Convertidor.areaProcesamiento.append(area);
            }else{
                JOptionPane.showMessageDialog(null, "NO ELIGIO UNA OPCION");
            }
            ayuda++;
        }
    }
}
