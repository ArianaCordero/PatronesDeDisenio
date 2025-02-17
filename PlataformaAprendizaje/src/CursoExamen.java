public class CursoExamen implements Curso,Evaluable{
    private int puntaje;

    public void iniciar(){
        System.out.println("se inicio el curso con un Examen");
    }
    public void completar(){
        System.out.println("se completo el examen");
    }
    public void calificar(int puntaje) {
        this.puntaje = puntaje;
       if (puntaje < 0 || puntaje > 100){
           System.out.println("nota invalida");
       }
        System.out.println("se obtuvo la nota de " + puntaje);
    }
}
