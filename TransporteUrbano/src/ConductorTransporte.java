public class ConductorTransporte implements Conductor{
    @Override
    public void acptarPasajero() {
        System.out.println("Conductor acepta al pasajero");
    }

    @Override
    public void finalizarViaje() {
        System.out.println("Conductor finaliza el viaje");
    }
}
