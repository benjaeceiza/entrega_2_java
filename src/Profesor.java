public class Profesor extends Persona implements MiembroUniversidad {

    private String especialidad;
    private int aniosExperiencia;
    private Materia materiaAsignada;

    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad,
            int aniosExperiencia, Materia materiaAsignada) {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.materiaAsignada = materiaAsignada;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setMateriasAsignadas(Materia materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public Materia getMateriaAsignada() {
        return materiaAsignada;
    }

    public void asignarMateria(Materia materia) {

    }

    @Override
    public String toString() {

        return "Profesor - Nombre: " + getNombre() + " - Apellido: " + getApellido() + " - Documento: "
                + getDocumento();
    }

    @Override
    public void obtenerRol() {
        
        System.out.println("Profesor");
    }

    @Override
    public void obtenerInformacionCompleta() {
       System.out.println("Profesor - Nombre: "+getNombre()+" - Apellido: "+getApellido()+" - Documento: "+getDocumento()+" - Materia asignada: "+getMateriaAsignada());
    }

}
