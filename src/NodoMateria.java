public class NodoMateria {
    
    private Materia dato;
    private NodoMateria siguiente;

    public NodoMateria(Materia dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public NodoMateria(Materia dato, NodoMateria siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void setDato(Materia dato) {
        this.dato = dato;
    }

    public Materia getDato() {
        return this.dato;
    }

    public void setSiguiente(NodoMateria siguiente) {
        this.siguiente = siguiente;
    }

    public NodoMateria getSiguiente() {
        return this.siguiente;
    }

}