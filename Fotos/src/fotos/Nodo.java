package fotos;

import java.io.Serializable;

public class Nodo implements Serializable{
    private String nombre;
    private dobleEnlazada nodo;
    private Nodo siguiente;
    
    public Nodo(String name){//NODO USUARIOS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
    }
    public Nodo(String name,dobleEnlazada nod){//NODO CARPETAS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.nodo=nod;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo n){
        this.siguiente=n;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public dobleEnlazada getNodo() {
        return nodo;
    }
    public void setNodo(dobleEnlazada nodo) {
        this.nodo = nodo;
    }
    
   

}
