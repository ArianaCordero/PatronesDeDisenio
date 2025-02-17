public class Documental implements Reproducible{

    public void reproducir() {
        System.out.println("Documental reproducida");
    }


    public void detener() {
        System.out.println("Documental detenida");
    }


    public void pausar() {
        System.out.println("Documental pausada");
    }

    public void tema(){
        System.out.println("Tema documental");
    }
}
