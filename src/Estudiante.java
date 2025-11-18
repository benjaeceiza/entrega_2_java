public class Estudiante extends Persona implements MiembroUniversidad {

    private String carrera;
    private double promedio;
    private ListaEnlazadaMateria materias;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, double promedio) {
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new ListaEnlazadaMateria();
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setMateriaAlInicio(Materia materia) {
        this.materias.agregarAlInicio(materia);
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public ListaEnlazadaMateria getMaterias() {
        return materias;
    }

    public void mostrarMaterias() {
        this.materias.imprimirMaterias();
    }

    @Override
    public void obtenerRol() {

        System.out.println("Estudiante");
    }

    @Override
    public void obtenerInformacionCompleta() {
        System.out.println("Estudiante - Nombre: " + getNombre() + " - Apellido: " + getApellido() + " - Documento: "
                + getDocumento() + " - Materias:\n");

        this.materias.imprimirMaterias();
    }

    // // METODOS RECURSIVOS E ITERATIVOS

    // // PROMEDIOS

    public static double calcularPromedioRecursivo(NodoMateria actual, int contador, double suma) {
        if (actual == null) {
            return contador == 0 ? 0 : suma / contador;
        }
        Materia materia = (Materia) actual.getDato();
        return calcularPromedioRecursivo(actual.getSiguiente(), contador + 1, suma + materia.getNota());
    }


    

    
}