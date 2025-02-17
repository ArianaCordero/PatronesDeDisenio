public class Main {
    public static void main(String[] args) {
        System.out.printf("Bienvenido al almacen UPB");
        Alimento alimento = new Alimento(2025,"fideo");
        Inventario inventario = new Inventario();
        Electronico electronico = new Electronico();
        Ropa ropa = new Ropa();

        inventario.agregarProducto(alimento);
        inventario.agregarProducto(ropa);
        inventario.agregarProducto(electronico);

        inventario.mostrarInventario();
        inventario.eliminarProducto(electronico);
        inventario.mostrarInventario();
    }
}