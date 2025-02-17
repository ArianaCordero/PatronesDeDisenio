public class Paypal implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("se pago con Paypal un total de : " + monto);
    }
}
