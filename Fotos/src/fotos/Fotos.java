package fotos;
public class Fotos {
    public static void main(String[] args) {
        new vPrincipal().setVisible(true);
        /*ProcesamientoImagen bmp= new ProcesamientoImagen();
        bmp.abrirImagen();
        bmp.escalaGrises();*/
        /*Enlazada enlaA= new Enlazada();
        for(int z=0;z<10;z++){
            enlaA.insertarInicio(z);
        }
        for(int z=0;z<enlaA.getTamaño();z++){
            System.out.println(enlaA.obtener(z)+" NORMAL");
        }
        
        System.out.println();
        dobleEnlazada dobleA=new dobleEnlazada();
        dobleA.insertarInicio("1");
        dobleA.insertarInicio("2");
        dobleA.insertarInicio("3");
        dobleA.insertarInicio("INICIO");
        dobleA.insertarFinal("FINAL");
        dobleA.eliminar(4);
        for(int z=0;z<dobleA.getTamaño();z++){
            System.out.println(dobleA.obtener(z)+" DOBLE");
        }
        
        System.out.println();
        dobleEnlaCir cirA= new dobleEnlaCir();
        /*cirA.insertarInicio(0,2,3);
        cirA.insertarInicio(1,2,3);
        cirA.insertarInicio(2,2,3);
        cirA.insertarInicio(3,2,3);
        cirA.insertarInicio("0",2,3);
       cirA.insertarInicio("1",2,3);
       cirA.insertarInicio("2",2,3);
       cirA.insertarInicio("3",2,3);
       cirA.insertarInicio("4",2,3);
       cirA.insertarInicio("FIN",2,3);
        
        
        
        for(int z=0;z<cirA.getTamaño()*2;z++){
             System.out.println(cirA.obtenerDato(z)+" CIR");
        }*/

    }
}
