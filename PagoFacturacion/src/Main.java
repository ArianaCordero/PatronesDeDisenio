public class Main {
    public static void main(String[] args) {
        System.out.println("compra Upbstore");
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        Paypal paypal = new Paypal();
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria();
        FacturaElectronica facturaElectronica = new FacturaElectronica();
        FacturaFisica facturaFisica = new FacturaFisica();
        Compra compra = new Compra(paypal,facturaElectronica);
        compra.compraHecha(10.5);
    }
}