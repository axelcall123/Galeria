package fotos.Listas;


import java.io.Serializable;

public class dobleEnlaCir implements Serializable{
    private NodoCir inicio;
    private NodoCir fin;
    private int tamaño;
    
    public dobleEnlaCir(){
        inicio=null;
        fin=null;
        tamaño=0;
    }
    
    public void insertarInicio(Object img){
        NodoCir nuevo= new NodoCir(img);
        if (inicio==null) {
            inicio = nuevo;
            fin = nuevo;  
            fin.setSiguiente(inicio);//CREA UN ENLZACE
        } else{//CREA EL DOBLE ENLACE DOBLE
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
        }
        tamaño++;
    }
     
    public void insertarFinal(Object img){
        NodoCir nuevo= new NodoCir(img);
         if (inicio==null) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
        } else{//CREA EL DOBLE ENLACE DOBLE
            fin.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            fin = nuevo;
        }
        tamaño++;
    }
    
    public void eliminar(int id) {
        if (tamaño == 1) {
            fin.setSiguiente(null);
            inicio.setSiguiente(null);
            inicio = inicio.getSiguiente();
            fin = fin.getSiguiente();
            tamaño--;
        }else if (tamaño == 2) {
            if (id == 0) {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
                inicio.setSiguiente(fin);
                tamaño--;
                /*
                inicio=inicio.getSiguiente();
                fin.setSiguiente(inicio);
                fin=fin.getSiguiente().getSiguiente();
                */
            } else {
                inicio=inicio.getSiguiente().getSiguiente();
                fin.getSiguiente().setSiguiente(inicio);
                fin=fin.getSiguiente().getSiguiente();                 
                   tamaño--;
            }
        } else if (id != 0 && id != tamaño - 1) {
            NodoCir in = inicio;//funciona solo con 3 sin ser final e inicio
            NodoCir fn = fin;
            for (int z = 0; z < id - 1; z++) {
                in = in.getSiguiente();//OBTENER EL ANTERIOR DEL ID
            }
            for (int z = 0; z < id + 1; z++) {
                fn = fn.getSiguiente();//OBTENER EL DESPUES DEL ID
            }
            in.setSiguiente(in.getSiguiente().getSiguiente());//SIG DE LA SIG
            fn.setSiguiente(in);//ANTERIOR ES : ANT DE ANT
            tamaño--;
        }else{
            if (id == tamaño - 1) {//ELMINA LA POS ULTIMA
                 NodoCir in = inicio;
                  for (int z = 0; z < id - 1; z++) {
                      in = in.getSiguiente();
                  }
                  in.setSiguiente(inicio);
                  fin.setSiguiente(in);
                  fin=in;
                tamaño--;
            } else {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
                //inicio.setSiguiente(fin);
                tamaño--;
            }
        }
    }
    
    public int getTamaño(){
        return tamaño;
    }
     
    public Object obtenerNodo(int id){
        NodoCir temp=inicio;
        for(int z=0;z<id;z++){
            temp=temp.getSiguiente();//BUSCAR POR ID SOLO PARA ADELANTE
        }
        return temp.getNodo();
    }
    
    public void ver(int id){
        System.out.println(" NODO: "+obtenerNodo(id));
    }
}
