public class Foto implements Interactuable{
    public void comentar(String comentario) {
        System.out.println( "Comento la foto: " + comentario);
    }
    public void reaccionar (String tipoReaccion) {
        System.out.println("Reacciono la foto con " + tipoReaccion );
    }
    public void compartir () {
        System.out.println("compartio la foto");
    }
}
