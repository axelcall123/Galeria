package fotos;
import java.io.Serializable;
public class Enlazada implements Serializable{
    public Nodo inicio;
    public Nodo fin;
    int tamaño;
    
    private transient int excluded = 1;
    
    public Enlazada(){
        inicio=null;
        fin=null;
        tamaño=0;
    }
    public void insertarInicio(String nombre,Object dato){
        Nodo nuevo= new Nodo(nombre,dato);
        if(inicio==null){
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
        tamaño++;
    } 
    public int getTamaño(){
        return tamaño;
    }
    
    public Object obtenerNodo(int id){
        Nodo temp=inicio;
        for(int z=0;z<id;z++){
            temp=temp.getSiguiente();//BUSCAR POR ID SOLO PARA ADELANTE
        }
        return temp.getNodo();
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
