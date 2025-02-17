import java.util.ArrayList;
import java.util.List;

public class Estudiante  {
    private String nombre;
    private List<Curso> cursosCursados;

    public Estudiante (String nombre){
        this.nombre = nombre;
        this.cursosCursados = new ArrayList<>();
    }
    public void inscribirse(Curso curso){
        cursosCursados.add(curso);
        System.out.println(nombre +" esta pasando un curso ");
    }
    public void terminarCurso() {
        for (Curso curso : cursosCursados) {
            curso.iniciar();
            curso.completar();
            if (curso instanceof CursoExamen) {
                ((CursoExamen) curso).calificar(100);
            }
        }
    }
}
