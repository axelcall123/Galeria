package fotos.Apoyo;
public class JTemp {
    static int idUsuario;//ID TEMPORAL DEL NOMBRE
    public int getIdUsuario(){
        return idUsuario;
    }
    public void setIdUsuario(int IDUSUARIO){
        this.idUsuario=IDUSUARIO;
    }
    
    static int idArchivo;//ID TEMPORAL DE LOS ARCHIVOS
    public int getIdArchivo(){
        return idArchivo;
    }
    public void setIdArhcivo(int IDARCHIVO){
        this.idArchivo=IDARCHIVO;
    }
    
    static String url;
    public String getUrl(){
        return url;
    }
    public void setUrl(String Url){
        this.url=Url;
    }
}
