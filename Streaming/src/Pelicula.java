public class Pelicula implements Reproducible{

    @Override
    public void reproducir() {
        System.out.println("Pelicula reproducida");
    }

    @Override
    public void detener() {
        System.out.println("Pelicula detenida");
    }

    @Override
    public void pausar() {
        System.out.println("Pelicula pausada");
    }
    public void duracion(){
        System.out.println("Pelicula duro 2 horas");
    }
}
