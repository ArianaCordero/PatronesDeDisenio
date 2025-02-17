import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Empleado> empleadosContratados = new ArrayList<>();

    public void contratarNuevosEmpleados(Empleado empleado){
        empleadosContratados.add(empleado);
        System.out.println("Bienvenido a la empresa UPB " + empleado );
    }

    public void personasEnLaEmpresa(){
        System.out.println("Personas que trabajan en la empresa");
        for(Empleado empleado : empleadosContratados){
            if(empleado instanceof Gerente){
                Gerente gerente = (Gerente) empleado;
                gerente.obtenerCargo();
                gerente.calcularSalario();
                gerente.calcularBono();
            } else {
                empleado.obtenerCargo();
                empleado.calcularSalario();
            }
        }
    }

    public void despedirEmpleados(Empleado empleado){
        empleadosContratados.remove(empleado);
        System.out.println(empleado + " esta despedido");
    }
}
