import java.util.ArrayList;
import java.util.List;

class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private int duracion;
    private List<Empleado> inscritos;

    public Curso() {
        inscritos = new ArrayList<>();
    }

    public void inscribirEmpleado(Empleado empleado) {
        inscritos.add(empleado);
        System.out.println("Empleado inscrito en el curso.");
    }

    public void completarCurso(Empleado empleado) {
        System.out.println("Curso completado por el empleado.");
    }
}