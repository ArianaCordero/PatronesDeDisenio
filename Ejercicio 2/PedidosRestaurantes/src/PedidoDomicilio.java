

public class PedidoDomicilio implements Pedido{
    Repartidor repartidor;
    public PedidoDomicilio(Repartidor repartidor){
        this.repartidor = repartidor;
    }
    @Override
    public void preparar(){
        System.out.println("se prepara el pedido para domicilio");
    }
    @Override
    public void entregar(){
        System.out.println("se entrega el pedido para domicilio");
        repartidor.repartir();
    }
}
// la dependencia seria poner como atributo repartidor nombre de la interfaz pq se tiene dos opciones
// cuando se habla de composicion deja de existir la xada deja de existir la cosina
// nuestro pedido sin repartidor no podria existir
