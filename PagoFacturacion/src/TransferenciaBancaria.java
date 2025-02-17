public class TransferenciaBancaria implements MetodoPago{
    public void procesarPago(double monto) {
        System.out.println("se pago con transferencia bancaria un total de : " + monto);
    }
}
