
public class Universidad {

    private ListaEnlazadaMiembros miembros;

    public Universidad() {
        this.miembros = new ListaEnlazadaMiembros();
    }

    public void agregarMiembroInicio(Persona miembro) {
        this.miembros.agregarMiembroAlInicio(miembro);
    }

    public void agregarMiembroMedio(Persona miembro, Persona anterior) {
        this.miembros.agregarMiembroAlMedio(miembro, anterior);
    }

    public void agregarMiembroFinal(Persona miembro) {
        this.miembros.agregarMiembroAlFinal(miembro);
    }

    public void listarMiembros() {
        this.miembros.imprimirMiembros();
    }

    public MiembroUniversidad buscarPorRol() {
        MiembroUniversidad encontrado = null;
        return encontrado;
    }

    // // BUSQUEDA BINARIA
    public Persona busquedaBinariaMiembro(String apellido) {

        Persona[] arrayMiembros = this.miembros.convertirAArrayMiembros();

        int izquierda = 0;
        int derecha = arrayMiembros.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            String apellidoMedio = arrayMiembros[medio].getApellido();

            int comparacion = apellidoMedio.compareToIgnoreCase(apellido);

            if (comparacion == 0) {
              return arrayMiembros[medio];
                
            } else if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
    
       return arrayMiembros[-1];
    }

    public ListaEnlazadaMiembros convertirALista(Persona encontrado){
        return this.miembros.convertirArrayALista(encontrado);


    }

}
