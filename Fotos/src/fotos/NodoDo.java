package fotos;

import java.io.Serializable;

public class NodoDo implements Serializable{
    private String nombre;
    private NodoDo siguiente;
    
    private dobleEnlaCir aImg;
    

    public NodoDo(String name){//NODO USUARIOS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.aImg= new dobleEnlaCir();
    }
   /* public NodoDo(String name,Object nod){//NODO CARPETAS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.nodo=nod;
    }*/
    
    public NodoDo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(NodoDo n){
        this.siguiente=n;
    }
    //////
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    ///////
    public dobleEnlaCir getImagen(){
        return aImg;
    }
}
