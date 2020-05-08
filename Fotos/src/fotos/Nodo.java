package fotos;

import java.io.Serializable;

public class Nodo implements Serializable{
    private String nombre;
    private dobleEnlazada nodo;
    private Nodo siguiente;
    
    public Nodo(String name/*,dobleEnlazada nod*/){//NODO CARPETAS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.nodo= new dobleEnlazada();
    }
    ///////////////
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo n){
        this.siguiente=n;
    }
    ////////////////
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    ///////////////
    public dobleEnlazada getArchivo() {
        return nodo;
    }
}
