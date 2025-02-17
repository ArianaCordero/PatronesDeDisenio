//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("PLATAFORMA DE STREAMING");
        Pelicula p = new Pelicula();
        Serie serie = new Serie();
        Documental documental = new Documental();
        Usuario usuario = new Usuario(p);
        usuario.favorito();
    }
}