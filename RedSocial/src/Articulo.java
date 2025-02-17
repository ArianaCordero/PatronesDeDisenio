public class Articulo implements Interactuable{
    public void comentar(String comentario) {
        System.out.println( "Comento el articulo: " + comentario);
    }
    public void reaccionar (String tipoReaccion){
        System.out.println("Reacciono " + tipoReaccion);
    }
    public void compartir (){
        System.out.println("compartio el articulo ");
    }
}
