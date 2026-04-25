/**
 * Clase Pila
 * Implementa una estructura LIFO (Last In First Out)
 * El último cliente atendido será el primero en salir del historial.
 */
public class Pila {

    // Nodo superior de la pila
    private Nodo cima;

    /**
     * Constructor
     */
    public Pila() {
        cima = null;
    }

    /**
     * Verifica si la pila está vacía
     * @return true si no contiene elementos
     */
    public boolean estaVacia() {
        return cima == null;
    }

    /**
     * Inserta un cliente en la pila
     * @param cliente Cliente atendido
     */
    public void push(Cliente cliente) {

        Nodo nuevo = new Nodo(cliente);

        nuevo.siguiente = cima;
        cima = nuevo;
    }

    /**
     * Elimina el último cliente del historial
     * @return Cliente eliminado
     */
    public Cliente pop() {

        if (estaVacia()) {
            return null;
        }

        Cliente cliente = cima.dato;
        cima = cima.siguiente;

        return cliente;
    }

    /**
     * Consulta el último cliente atendido sin eliminarlo
     * @return Cliente en la cima
     */
    public Cliente peek() {

        if (estaVacia()) {
            return null;
        }

        return cima.dato;
    }

    /**
     * Muestra el historial completo
     */
    public void mostrarHistorial() {

        if (estaVacia()) {
            System.out.println("No hay historial.");
            return;
        }

        Nodo actual = cima;

        System.out.println("\nHistorial de atenciones:");

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}