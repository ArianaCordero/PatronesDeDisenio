public class Video implements Interactuable{
    public void comentar(String comentario) {
        System.out.println("comento el video: " + comentario);
    }
    public void reaccionar (String tipoReaccion){
        System.out.println("Reacciono " + tipoReaccion);
    }
    public void compartir (){
        System.out.println("compartio el video");
    }
}
