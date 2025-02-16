public class Main {
    public static void main(String[] args) {
        System.out.println("Cafeteria Upb");

        PedidoParaLlevar pedido1 = new PedidoParaLlevar();
        PedidoMesa pedido2 = new PedidoMesa();
        Motorizado motorizado = new Motorizado();
        Ciclista ciclista = new Ciclista();
        // simula que el pedido sera enviado por un repartidor motorizado
        PedidoDomicilio pedido3 = new PedidoDomicilio(motorizado);

        //simula que un pedido sera enviado por un repartidor ciclista
        PedidoDomicilio pedido4 = new PedidoDomicilio(ciclista);
        Restaurante restaurante = new Restaurante();

        restaurante.recibirPedido(pedido1);
        restaurante.recibirPedido(pedido2);
        restaurante.recibirPedido(pedido3);
        restaurante.recibirPedido(pedido4);

        restaurante.gestionarPedidos();
    }

}