public class PedidoMesa implements Pedido{
@Override
    public void preparar(){
        System.out.println("se prepara el pedido para la mesa");
    }
@Override
    public void entregar(){
        System.out.println("se entrega el pedido para la mesa");
    }
}
// tod o bieen
