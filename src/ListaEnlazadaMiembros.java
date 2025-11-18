public class ListaEnlazadaMiembros {
    private NodoPersona inicio;

    // CONSTRUCTOR
    public ListaEnlazadaMiembros() {
        this.inicio = null;

    }

    public ListaEnlazadaMiembros(NodoPersona inicio) {
        this.inicio = inicio;
    }

    public void recorrerListaMiembros() {
        NodoPersona aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public NodoPersona buscarNodoMiembro(Persona valor) {
        NodoPersona actual;
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

    public void agregarMiembroAlInicio(Persona miembro) {

        NodoPersona nuevoNodo = new NodoPersona(miembro);
        if (this.inicio == null) {
            this.inicio = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(this.inicio);
            this.inicio = nuevoNodo;
        }
    }

    public void agregarMiembroAlFinal(Persona miembro) {

        NodoPersona nuevoNodo = new NodoPersona(miembro);
        if (this.inicio == null) {
            this.inicio = nuevoNodo;
        } else {

            NodoPersona actual = this.inicio;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(nuevoNodo);
        }

    }

    public void agregarMiembroAlMedio(Persona miembro, Persona miembroAnterior) {

        NodoPersona nuevoNodo = new NodoPersona(miembro);

        if (this.inicio == null) {
            this.inicio = nuevoNodo;
            return;
        }

        NodoPersona actual = this.inicio;
        while (actual != null) {

            if (actual.getDato().equals(miembroAnterior)) {

                nuevoNodo.setSiguiente(actual.getSiguiente());

                actual.setSiguiente(nuevoNodo);

                return;
            }

            actual = actual.getSiguiente();
        }

        System.out.println("Error: El miembro anterior  no se encontró en la lista");
    }

    public void eliminarNodoMiembro(Persona miembro) {
        if (inicio == null) {
            return;
        }

        if (inicio.getDato() == miembro) {
            inicio = inicio.getSiguiente();
            return;
        }

        NodoPersona actual = inicio;
        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() != miembro) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }

    public void imprimirMiembros() {
        NodoPersona actual = this.inicio;

        while (actual != null) {
            System.out.println(actual.getDato().toString());
            actual = actual.getSiguiente();
        }
    }

    public Persona[] convertirAArrayMiembros() {
        // Primero, contar cuántos elementos hay en la lista
        int tamaño = 0;
        NodoPersona actual = this.inicio;
        while (actual != null) {
            tamaño++;
            actual = actual.getSiguiente();
        }

        // Crear un array del tamaño apropiado
        Persona[] array = new Persona[tamaño];

        // Recorrer la lista y copiar cada elemento al array
        actual = this.inicio;
        int indice = 0;
        while (actual != null) {
            array[indice] = actual.getDato();
            actual = actual.getSiguiente();
            indice++;
        }

        return array;
    }

    public  ListaEnlazadaMiembros convertirArrayALista(Persona encontrado) {
        ListaEnlazadaMiembros nuevaLista = new ListaEnlazadaMiembros();

        nuevaLista.agregarMiembroAlInicio(encontrado);

        return nuevaLista;
    }

}