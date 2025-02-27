/**
 * @autor Kevin Jair Torres Valencia.
 */

public class Main {
    /**
     * Método principal que ejecuta el programa.
     * Se crea una lista doblemente ligada de películas, se insertan varias películas,
     * se imprimen en pantalla y luego se eliminan algunas para mostrar la lista actualizada.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        ListaDobleLigada<Pelicula> listaPeliculas = new ListaDobleLigada<>();

        // Insertando películas en la lista
        listaPeliculas.insertar(new Pelicula("El Padrino", 1972));
        listaPeliculas.insertar(new Pelicula("Spiderman into the spiderverse", 2018));
        listaPeliculas.insertar(new Pelicula("Inception", 2010));
        listaPeliculas.insertar(new Pelicula("Interstellar", 2014));
        listaPeliculas.insertar(new Pelicula("The Dark Knight", 2008));
        listaPeliculas.insertar(new Pelicula("Spiderman across the spiderverse", 2023));
        listaPeliculas.insertar(new Pelicula("Avatar", 2009));
        listaPeliculas.insertar(new Pelicula("Transformers", 2007));
        listaPeliculas.insertar(new Pelicula("Laberinto del Fauno", 2006));
        listaPeliculas.insertar(new Pelicula("El infierno", 2010));

        // Imprimir la lista de películas
        System.out.println("Lista de Películas: \n");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }

        // Eliminando películas en posiciones específicas
        System.out.println("\nEliminando la película en la posición 0,3 y 7...");
        listaPeliculas.eliminar(0);
        listaPeliculas.eliminar(3);
        listaPeliculas.eliminar(7);

        // Imprimir la lista actualizada de películas
        System.out.println("\nLista actualizada de Películas: \n");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }

        // Imprimir la lista inveritida de películas
        System.out.println("\nLista de Películas en orden inverso: \n");
        listaPeliculas.imprimirInverso();
    }
}

/**
 * Representa una película con un nombre y un año de lanzamiento.
 */
class Pelicula {
    private String nombre;
    private int anio;

    /**
     * Constructor de la clase Pelicula.
     * @param nombre Nombre de la película.
     * @param anio Año de estreno de la película.
     */
    public Pelicula(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    /**
     * Representación en cadena de la película.
     * @return Nombre y año de la película en formato "Nombre (Año)".
     */
    @Override
    public String toString() {
        return nombre + " (" + anio + ")";
    }
}


