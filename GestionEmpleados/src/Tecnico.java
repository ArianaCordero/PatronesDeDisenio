public class Tecnico implements Empleado{
    private int salario;

    public Tecnico(int salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        System.out.println("El salario es "+salario);
    }

    @Override
    public String toString() {
        return "Tecnico";
    }

    public void obtenerCargo() {
        System.out.println("El cargo es " + this);
    }
}
