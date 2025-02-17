public class Usuario {
    Reproducible reproducible;
    public Usuario(Reproducible reproducible) {
        this.reproducible = reproducible;
    }


    public void favorito(){
        System.out.println(reproducible + "se agrego a favoritos");
        reproducible.reproducir();
        reproducible.detener();
        reproducible.pausar();

    }
}
