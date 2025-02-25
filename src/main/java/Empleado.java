class Empleado extends Usuario {
    public Empleado(int id, String nombre, String correo, String rol) {
        super(id, nombre, correo, rol);
    }

    public void verProgreso() {
        System.out.println("Viendo progreso...");
    }

    public void tomarCurso(Curso curso) {
        curso.inscribirEmpleado(this);
    }

    public void descargarCertificado() {
        System.out.println("Descargando certificado...");
    }
}