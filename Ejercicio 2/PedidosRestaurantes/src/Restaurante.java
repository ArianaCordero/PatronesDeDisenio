import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Pedido> pedidos;
// caja de solo una cosa
    public Restaurante(){
        this.pedidos = new ArrayList<>();
    }
    public void recibirPedido(Pedido pedido){
        pedidos.add(pedido);
        System.out.println("tenemos un nuevo pedido");
    }
    public void gestionarPedidos() {
        for (Pedido pedido : pedidos){ // repasar un poco mas este tipo de for
            pedido.preparar();
            pedido.entregar();
            System.out.println("---------------");
        }
    }
    // nombre de la lista se va a iterar cada uno de los elemmentos \
    // list iterrator
    // variable unica de mi lista de pedidos
}

