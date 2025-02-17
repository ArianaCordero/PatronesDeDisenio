import java.util.List;

class UsuarioRegular implements Recomendable {
    private String nombre;
    private List<Producto> masVendidos;
    public UsuarioRegular(String nombre, List<Producto> masVendidos) {
        this.nombre = nombre;
        this.masVendidos = masVendidos;
    }

    public void obtenerRecomendaciones() {
        System.out.println("Recomendaciones para usuario regular " + nombre + ":");
        for (Producto p : masVendidos) {
            System.out.println("más vendidos como " + p.getNombre() + " en la categoría de "
                    + p.getCategoria() + " con un precio de " + p.getPrecio());
        }
        System.out.println(" O las ofertas más destacadas");
    }
}
