public class Gerente implements Empleado,Bonificable{
    private int salario;
    private int bono;

    public Gerente(int salario, int bono) {
        this.salario = salario;
        this.bono = bono;
    }

    public void calcularSalario() {
        System.out.println("El salario es "+salario);
    }

    @Override
    public String toString() {
        return "Gerente";
    }

    public void obtenerCargo() {
        System.out.println("El cargo es" + this);
    }

    public void calcularBono() {
        int total = bono+salario;
        System.out.println("El bono es " + bono + " y su salario, con un total de " + total );
    }
}
