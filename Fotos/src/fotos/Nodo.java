package fotos;

import java.io.Serializable;

public class Nodo implements Serializable{
    private String nombre;
    public Object nodo;
    private Nodo siguiente;
    
    static Nodo aCarp;
    static dobleEnlaCir aImg;
   /* private int nivel1;
    private int nivel2;
    private int nivel3;*/
    

    public Nodo(Object nod){//NODO USUARIOS
        this.nodo=nod;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
    }
    public Nodo(String name,Object nod){//NODO CARPETAS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.nodo=nod;
    }
   /*public Nodo(String name,Object nod){//NODO CARPETAS
        this.nombre=name;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.nodo=nod;
    }*/
    /*public Nodo(Object dat,int uno,int dos){
        this.dato=dat;//DATO OBJETO
        this.siguiente=null;//SIGUIENTE
        this.nivel1=uno;
        this.nivel2=dos;
        this.nivel3=tres;
    }*/

    
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

    public Object getNodo() {
        return nodo;
    }
    public void setNodo(Object nodo) {
        this.nodo = nodo;
    }
    
   

}
