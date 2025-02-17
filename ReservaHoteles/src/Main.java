public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("Toby");
        Cliente cliente3 = new Cliente("Jhon");


        Hotel hotel = new Hotel("Hotel 7 velas");
        Departamento departamento = new Departamento("Calle Estados Unidos");
        CasaVacaciones casa = new CasaVacaciones("Costa norte");

        cliente1.hacerReserva(hotel, "30 de febrero");
        cliente2.hacerReserva(departamento, "10 de junio");
        cliente3.hacerReserva(casa, "4 de marzo");

        cliente3.cancelarReserva(departamento);
        cliente2.calificar(hotel, 3);
    }
}