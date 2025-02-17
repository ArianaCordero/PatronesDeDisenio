public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        Administrativo administrativo = new Administrativo(2500);
        Gerente gerente = new Gerente(3000,500);
        Tecnico tecnico = new Tecnico(700);

        empresa.contratarNuevosEmpleados(administrativo);
        empresa.contratarNuevosEmpleados(gerente);
        empresa.contratarNuevosEmpleados(tecnico);

        empresa.personasEnLaEmpresa();
        empresa.despedirEmpleados(tecnico);
        empresa.personasEnLaEmpresa();
    }
}