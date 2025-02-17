import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Camara", "Electrónica", 12000);
        Producto p2 = new Producto("Impresora", "Electrónica", 3000);
        Producto p3 = new Producto("Celular", "Electrónica", 1000);
        Producto p4 = new Producto("TV", "Electrónica", 1300);

        List<Producto> historial = new ArrayList<>();
        historial.add(p1);
        historial.add(p2);
        historial.add(p3);
        historial.add(p4);

        List<Producto> recomendacion = new ArrayList<>();
        recomendacion.add(p1);
        recomendacion.add(p3);

        UsuarioPremium premium = new UsuarioPremium("Alfonso", historial);
        UsuarioRegular regular = new UsuarioRegular("Sali", recomendacion);

        SistemaRecomendaciones.recomendar(premium);
        SistemaRecomendaciones.recomendar(regular);
    }
}