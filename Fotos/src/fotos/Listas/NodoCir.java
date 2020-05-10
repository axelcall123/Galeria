package fotos.Listas;

import java.io.Serializable;

public class NodoCir implements Serializable{
    private String nombre;
    private Object nodo;
    private NodoCir siguiente;
    
    static NodoCir aCarp;
    static dobleEnlaCir aImg;
  

    public NodoCir(Object nod){//NODO USUARIOS
        this.nodo=nod;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
    }
    /*public NodoCir(String name,Object nod){//NODO CARPETAS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.nodo=nod;
    }*/

    
    public NodoCir getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(NodoCir n){
        this.siguiente=n;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getNodo() {
        return nodo;
    }
    public void setNodo(Object nodo) {
        this.nodo = nodo;
    }
    
   

}
