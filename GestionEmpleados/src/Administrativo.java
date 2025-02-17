import java.io.Serializable;

public class Administrativo implements Empleado {
    private int salario;

    public Administrativo(int salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        System.out.println("El salario es "+salario);
    }

    @Override
    public String toString() {
        return "Administrativo";
    }

    public void obtenerCargo() {
        System.out.println("El cargo es " + this);
    }
}
