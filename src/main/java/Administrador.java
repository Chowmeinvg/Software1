class Administrador extends Usuario {
    public Administrador(int id, String nombre, String correo, String rol) {
        super(id, nombre, correo, rol);
    }

    public void gestionarUsuarios() {
        System.out.println("Gestionando usuarios...");
    }

    public Reporte generarReportes() {
        return new Reporte();
    }
}
