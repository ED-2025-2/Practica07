import java.util.Iterator;

/**
 * @autor Kevin Jair Torres Valencia.
 */

/**
 * Implementación de una lista doblemente ligada genérica.
 *
 * @param <T> El tipo de elementos almacenados en la lista.
 */
public class ListaDobleLigada<T> implements Coleccion<T> {

    /**
     * Clase interna que representa un nodo de la lista doblemente ligada.
     */
    private class Nodo {
        /** Elemento almacenado en el nodo. */
        public T elemento;
        /** Apuntador al siguiente nodo en la lista. */
        public Nodo siguiente;
        /** Apuntador al nodo anterior en la lista. */
        public Nodo anterior;

        /**
         * Crea un nuevo nodo con el elemento proporcionado.
         * @param elemento El elemento a almacenar en el nodo.
         */
        public Nodo(T elemento) {
            this.elemento = elemento;
            this.siguiente = null;
            this.anterior = null;
        }
    }

    /**
     * Clase interna que implementa un iterador para la lista doblemente ligada.
     */
    private class IteradorListaDoble implements Iterator<T> {
        private Nodo iteradorLista;

        /**
         * Constructor del iterador. Inicializa el iterador en la cabeza de la lista.
         */
        public IteradorListaDoble() {
            iteradorLista = new Nodo(null);
            iteradorLista.siguiente = cabeza;
        }

        /**
         * Verifica si hay un elemento siguiente en la lista.
         * @return true si hay un siguiente elemento, false en caso contrario.
         */
        @Override
        public boolean hasNext() {
            return iteradorLista.siguiente != null;
        }

        /**
         * Devuelve el siguiente elemento en la iteración.
         * @return El siguiente elemento en la lista.
         */
        @Override
        public T next() {
            iteradorLista = iteradorLista.siguiente;
            return iteradorLista.elemento;
        }
    }

    /** Referencia al primer nodo de la lista. */
    private Nodo cabeza;
    /** Referencia al último nodo de la lista. */
    private Nodo rabo;
    /** Número de elementos en la lista. */
    private int longitud;

    /**
     * Constructor de la lista doblemente ligada.
     */
    public ListaDobleLigada() {
        cabeza = null;
        rabo = null;
        longitud = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorListaDoble();
    }

    /**
     * Inserta un elemento al final de la lista.
     * @param elemento Elemento a insertar.
     * @throws IllegalArgumentException si el elemento es nulo.
     */
    @Override
    public void insertar(T elemento) {
        // Aqui va su codigo

        
    }

    /**
     * Accede al elemento en la posición especificada.
     * @param i Índice del elemento a acceder.
     * @return El elemento en la posición indicada.
     * @throws IllegalArgumentException si el índice está fuera de rango.
     */
    @Override
    public T acceder(int i) {
        // Aqui va su codigo


    }

    /**
     * Busca un elemento en la lista.
     * @param elemento Elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    @Override
    public boolean buscar(T elemento) {
        // Aqui va su codigo


    }

    /**
     * Elimina el elemento en la posición especificada.
     * @param i Índice del elemento a eliminar.
     * @throws IllegalArgumentException si el índice está fuera de rango.
     */
    @Override
    public void eliminar(int i) {
        // Aqui va su codigo
        
        
    }

    /**
     * Imprime la lista en orden inverso.
     */
     public void imprimirInverso() {
        // Aqui va su codigo


    }

    /**
     * Vacía la lista, eliminando todos los elementos.
     */
    @Override
    public void vaciar() {
        cabeza = null;
        rabo = null;
        longitud = 0;
    }

    /**
     * Devuelve la cantidad de elementos en la lista.
     * @return Número de elementos en la lista.
     */
    public int darLongitud() {
        return this.longitud;
    }

}
