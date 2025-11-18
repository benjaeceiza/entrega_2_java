public class Materia {

    private String nombre;
    private Profesor profesor;
    private double nota;

    public Materia(String nombre, Profesor profesor, double nota) {
       this.nombre = nombre;
       this.profesor = profesor;
       this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public double getNota() {
        return nota;
    }

    public String toString(){
        return "Nombre Materia: "+ getNombre();
    }

    
}
