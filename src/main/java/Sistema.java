import java.util.*;

class Sistema {
    private List<Usuario> usuarios;
    private List<Curso> cursos;
    private List<Reporte> reportes;

    public Sistema() {
        usuarios = new ArrayList<>();
        cursos = new ArrayList<>();
        reportes = new ArrayList<>();
    }

    public Usuario autenticarUsuario(String email, String password) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(email)) {
                return u; // Aquí se debería verificar la contraseña
            }
        }
        return null;
    }

    public void asignarCurso(Empleado empleado, Curso curso) {
        curso.inscribirEmpleado(empleado);
    }
}