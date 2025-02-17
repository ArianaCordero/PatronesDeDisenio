public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a transporte Urbano UPB");

        ConductorTransporte conductorTransporte = new ConductorTransporte();
        Taxi taxi = new Taxi(conductorTransporte);
        Bus bus = new Bus();
        BicicletaCompartida bicicleta = new BicicletaCompartida();

        Usuario usuario = new Usuario("Fulano");
        double tarifa = 17;

        usuario.solicitarViaje(taxi, "Calle Illimani", "Postgrado UPB",tarifa);
    }
}