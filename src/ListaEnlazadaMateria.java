public class ListaEnlazadaMateria {
    private NodoMateria inicio;



    // CONSTRUCTOR

    public ListaEnlazadaMateria() {
        this.inicio = null;

    }

    public ListaEnlazadaMateria(NodoMateria inicio) {
        this.inicio = inicio;
    }



    public void recorrer() {
        NodoMateria aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }


    public NodoMateria buscarNodo(Materia valor) {
        NodoMateria actual;
        actual = this.inicio;
        while (actual.getDato() != valor && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        if (actual.getDato() == valor) {
            return actual;
        } else {
            return null;
        }
    }

    public void agregarAlInicio(Materia valor) {
        NodoMateria nuevoNodo = new NodoMateria(valor);
        if (this.inicio == null) {
            this.inicio = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(this.inicio);
            this.inicio = nuevoNodo;
        }
    }

   public void agregarMiembroAlFinal(Materia miembro) {

        NodoMateria nuevoNodo = new NodoMateria(miembro);
        if (this.inicio == null) {
            this.inicio = nuevoNodo;
        } else {

            NodoMateria actual = this.inicio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(nuevoNodo);
        }

    }

    public void agregarMiembroAlMedio(Materia miembro, Materia miembroAnterior) {

        NodoMateria nuevoNodo = new NodoMateria(miembro);

        if (this.inicio == null) {
            this.inicio = nuevoNodo;
            return;
        }

        NodoMateria actual = this.inicio;
        while (actual != null) {

            if (actual.getDato().equals(miembroAnterior)) {

                nuevoNodo.setSiguiente(actual.getSiguiente());

                actual.setSiguiente(nuevoNodo);

                return;
            }

            actual = actual.getSiguiente();
        }

        System.out.println("Error: La materia anterior  no se encontró en la lista");
    }

    public void eliminarNodo(Materia valor) {
        if (inicio == null) {
            return;
        }

        if (inicio.getDato() == valor) {
            inicio = inicio.getSiguiente();
            return;
        }

        NodoMateria actual = inicio;
        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() != valor) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }


    public void imprimirMaterias() {
        NodoMateria actual = this.inicio;
        
        while (actual != null) {
            System.out.println(actual.getDato().toString()); 
            actual = actual.getSiguiente();
        }
    }
}