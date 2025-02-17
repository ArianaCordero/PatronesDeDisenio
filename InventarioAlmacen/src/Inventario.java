import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;
    public Inventario(){
        this.productos = new ArrayList<>();}
    public void agregarProducto (Producto producto) {
        if (producto instanceof Alimento) {
            Alimento alimento = (Alimento) producto;
            if (!alimento.retirarDeBodega()) {
                productos.add(alimento);
                System.out.println("Alimento no vencido");
            } else {
                System.out.println("Este alimento está vencido");
            }
        } else {
            productos.add(producto);
            System.out.println("Producto agregado al inventario.");
        }
    }
    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            System.out.println("Eliminado del inventario.");
        } else {
            System.out.println("No encontrado en el inventario.");
        }
    }

    public void mostrarInventario() {
        System.out.println(" Inventario Actualizado ");
        for (Producto producto : productos) {
            producto.obtenerPrecio();
            producto.obtenerStock();
        }
    }
}

