public class TarjetaCredito implements MetodoPago{
    public void procesarPago(double monto) {
        System.out.println("se pago con tarjeta de credito un total de : " + monto);
    }
}
