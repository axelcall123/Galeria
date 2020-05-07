package fotos;

import java.io.Serializable;

public class NodoDo implements Serializable{
    private String nombre;
    public Object nodo;
    private NodoDo siguiente;
    
    static NodoDo aCarp;
    static dobleEnlaCir aImg; 

    /*public NodoDo(Object nod){//NODO USUARIOS
        this.nodo=nod;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
    }*/
    public NodoDo(String name,Object nod){//NODO CARPETAS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.nodo=nod;
    }
       
    public NodoDo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(NodoDo n){
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
