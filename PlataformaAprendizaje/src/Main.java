public class Main {
    public static void main(String[] args) {
        System.out.println("Plataforma de aprendizaje Upb virtual");

        Estudiante estudiante = new Estudiante("Fulano Menlgano");

        CursoExamen cursoExamen = new CursoExamen();
        CursoPdf cursoPdf = new CursoPdf();
        CursoVideo cursoVideo = new CursoVideo();

        estudiante.inscribirse(cursoExamen);
        estudiante.terminarCurso();

    }
}