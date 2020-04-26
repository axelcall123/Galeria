package fotos;

public class ParaAlmacen {
    public String Nombre;
    public Object nodo;
    ParaAlmacen(){
        Nombre="";
        nodo=null;
    }
    public ParaAlmacen(String name,Object nod){
        Nombre=name;
        nodo=nod;

    }
    public String Carpeta;
    public ParaAlmacen(String name,String carp,Object nod){
        Nombre=name;
        nodo=nod;
        Carpeta=carp;
    }
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String name){
        this.Nombre= name;  
    }
    
    public Object getNodo(){
        return nodo;
    }
    public void setNodo(Object nod){
        this.nodo= nod;  
    }

    public String getCarpeta() {
        return Carpeta;
    }
    public void setCarpeta(String Carpeta) {
        this.Carpeta = Carpeta;
    }  
}
