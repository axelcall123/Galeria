
package fotos;

import java.io.Serializable;

public class dobleEnlazada implements Serializable{
    //private int tamaño;
    public NodoDo inicio;
    public NodoDo fin;
    int tamaño;
    
    public dobleEnlazada(){
        inicio=null;
        fin=null;
        tamaño=0;
    }
    
    public void insertarInicio(String nombre,Object nodo){
        NodoDo nuevo= new NodoDo(nombre,nodo);
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
        NodoDo nuevo= new NodoDo(nombre,nodo);
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
                    NodoDo in = inicio;
                    NodoDo fn = fin;
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
                    NodoDo in=inicio;
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
    
    public Object obtenerNodo(int id){
        NodoDo temp=inicio;
        for(int z=0;z<id;z++){
            temp=temp.getSiguiente();//BUSCAR POR ID SOLO PARA ADELANTE
        }
        return temp.getNodo();
    }
    
    public String obtenerNombre(int id){
        NodoDo temp=inicio;
        for(int z=0;z<id;z++){
            temp=temp.getSiguiente();//BUSCAR POR ID SOLO PARA ADELANTE
        }
        return temp.getNombre();
    }
    
    public void ver(int id){
        System.out.println(" NODO: "+obtenerNodo(id)+" ;; NOMBRE STRING: "+obtenerNombre(id));
    }
}
