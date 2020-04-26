
package fotos;

import javax.swing.JOptionPane;

public class dobleEnlazada extends Enlazada{
    //private int tamaño;
    public void insertarInicio(String nombre,Object nodo){
        Nodo nuevo= new Nodo(nombre,nodo);
        if(inicio==null){
            inicio=nuevo;
            fin=nuevo;
        }else{
            nuevo.setSiguiente(inicio);//CONECTAR
            fin.setSiguiente(nuevo);
            inicio=nuevo;
        }
        tamaño++;
    }
    public void insertarFinal(String nombre,Object  nodo){
        Nodo nuevo= new Nodo(nombre,nodo);
        if(inicio==null){
            fin=nuevo;
            inicio=nuevo;
        }else{
            fin.setSiguiente(nuevo);//CONECTAR
            nuevo.setSiguiente(fin);
            fin=nuevo;
        }
        tamaño++;
    }
    public void eliminar(int id){
            if (id == 0) {
                inicio = inicio.getSiguiente();
                tamaño--;
            } else {
                if (id != tamaño - 1) {
                    Nodo in = inicio;
                    Nodo fn = fin;
                    for (int z = 0; z < id - 1; z++) {
                        in = in.getSiguiente();//BUSCAR POR ID SOLO PARA ADELANTE
                    }
                    for (int z = 0; z < id + 1; z++) {
                        fn = fn.getSiguiente();//BUSCAR POR ID SOLO PARA ADELANTE
                    }
                    in.setSiguiente(in.getSiguiente().getSiguiente());
                    fn.setSiguiente(in);
                    tamaño--;//NO VERLO COMO ATRAS ADELANTE SI NO DOS ENLACES PARA ADELANTE LLAMDO ATRAS Y OTRO ADELANTE    
                }else{
                    Nodo in=inicio;
                    for (int z = 0; z < id-1; z++) {
                        in = in.getSiguiente();
                    }
                    in.setSiguiente(in.getSiguiente().getSiguiente());
                    fin=in;
                    tamaño--;
                }       
        }
    }
    public int getTamaño(){
        return tamaño;
    }
}
