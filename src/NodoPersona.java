public class NodoPersona {

    private Persona dato;
    private NodoPersona siguiente;
    private NodoPersona anterior;

    public NodoPersona(Persona dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoPersona(Persona dato, NodoPersona siguiente, NodoPersona anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public Persona getDato() {
        return this.dato;
    }

    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }

    public NodoPersona getSiguiente() {
        return this.siguiente;
    }

    
    public void setAnterior(NodoPersona anterior) {
        this.anterior = anterior;
    }

    public NodoPersona getAnterior() {
        return this.anterior;
    }

}