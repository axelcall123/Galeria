package fotos;
import java.io.Serializable;
public class Enlazada implements Serializable{
    private Nodo inicio;
    private Nodo fin;
    private int tamaño;
    
    public Enlazada(){
        inicio=null;
        fin=null;
        tamaño=0;
    }
    
    public void insertarInicio(String nombre/*,dobleEnlazada dato*/){
        Nodo nuevo= new Nodo(nombre/*,dato*/);
        if(inicio==null){
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
        tamaño++;
    } 
    /*ELMINAR*/
    public int getTamaño(){
        return tamaño;
    }
    
    public Nodo obtenerNodo(int id){
        Nodo temp=inicio;
        for(int z=0;z<id;z++){
            temp=temp.getSiguiente();//BUSCAR POR ID SOLO PARA ADELANTE
        }
        return temp;
    }
    
    public String obtenerNombre(int id){
        Nodo temp=inicio;
        for(int z=0;z<id;z++){
            temp=temp.getSiguiente();//BUSCAR POR ID SOLO PARA ADELANTE
        }
        return temp.getNombre();
    }
    
    public void ver(int id){
        System.out.println(" NODO: "+obtenerNodo(id)+" ;; NOMBRE STRING: "+obtenerNombre(id));
    }
   
}
