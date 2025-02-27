/**
 * Interfaz Coleccion
 *
 * Interfaz que define los métodos que debe implementar una colección
 * genérica.
 */
public interface Coleccion<T> extends Iterable<T> {

    /**
     * Método que inserta un elemento en la colección.
     * @param elemento Elemento a insertar.
     */
    public void insertar(T elemento);

    /**
     * Método que elimina un elemento de la colección.
     * @param indice Índice del elemento a eliminar.
     */
    public void eliminar(int indice);

    /**
     * Método que accede a un elemento de la colección.
     * @param indice Índice del elemento a acceder.
     * @return Elemento de la colección.
     */
    public T acceder(int indice);

    /**
     * Método que busca un elemento en la colección.
     * @param elemento Elemento a buscar.
     * @return `true` si el elemento está en la colección, `false` en caso contrario.
     */
    public boolean buscar(T elemento);

    /**
     * Método que vacía la colección eliminando todos sus elementos.
     */
    public void vaciar();
}
