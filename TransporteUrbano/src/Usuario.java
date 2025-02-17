public class Usuario {
    private String nombre;

    public Usuario (String nombre){
        this.nombre = nombre;
    }
    public void solicitarViaje(TransportePublico transportePublico, String origen,String destino,double tarifa){
        System.out.println(nombre + " solicito viaje");
        transportePublico.iniciarViaje(origen,destino);

        transportePublico.calcularTarifa(tarifa);
        System.out.println("la tarifa es " + tarifa);
    }
}
