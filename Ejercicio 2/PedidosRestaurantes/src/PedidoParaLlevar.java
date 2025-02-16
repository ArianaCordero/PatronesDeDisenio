public class PedidoParaLlevar implements Pedido{
    @Override
    public void preparar(){
        System.out.println("se prepara el pedido para llevar");
    }
    @Override
    public void entregar(){
        System.out.println("se entrega el pedido para llevar");
    }
}
// se puede poner override o podemos hacerlo obvio , mejor si usamos eso