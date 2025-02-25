public class Main {
    public static void main(String[] args) {
        Usuario nuevoUsuario = new Usuario(0, "Juan Perez", "juan@example.com", "Empleado");
        nuevoUsuario.guardarEnBD();

        Usuario usuarioRecuperado = Usuario.obtenerPorCorreo("juan@example.com");
        if (usuarioRecuperado != null) {
            System.out.println("Usuario encontrado: " + usuarioRecuperado.nombre);
        } else {
            System.out.println("Usuario no encontrado");
        }
    }
}