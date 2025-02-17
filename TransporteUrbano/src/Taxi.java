public class Taxi implements TransportePublico{
    private Conductor conductor;

    public Taxi(Conductor conductor){
        this.conductor = conductor;
    }
    @Override
    public void iniciarViaje(String origen, String destino) {
        System.out.println("se inicio la ruta desde " + origen +" a " + destino );
    }
    @Override
    public void calcularTarifa(double tarifa) {
        System.out.println("Se calculo la tarifa de " + tarifa);
    }

}
