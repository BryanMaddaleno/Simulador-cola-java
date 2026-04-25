/**
 * Clase Cola
 * Implementa una estructura FIFO (First In First Out)
 * El primer cliente en entrar será el primero en salir.
 */
public class Cola {

    // Primer nodo de la cola
    private Nodo frente;

    // Último nodo de la cola
    private Nodo fin;

    /**
     * Constructor de la cola
     */
    public Cola() {
        frente = null;
        fin = null;
    }

    /**
     * Verifica si la cola está vacía
     * @return true si está vacía
     */
    public boolean estaVacia() {
        return frente == null;
    }

    /**
     * Agrega un cliente al final de la cola
     * @param cliente Cliente a ingresar
     */
    public void encolar(Cliente cliente) {

        Nodo nuevo = new Nodo(cliente);

        // Si la cola está vacía
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            // Se agrega al final
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    /**
     * Atiende al primer cliente de la cola
     * @return Cliente atendido
     */
    public Cliente desencolar() {

        if (estaVacia()) {
            return null;
        }

        Cliente cliente = frente.dato;

        // Avanza el frente al siguiente nodo
        frente = frente.siguiente;

        // Si quedó vacía
        if (frente == null) {
            fin = null;
        }

        return cliente;
    }

    /**
     * Muestra todos los clientes en espera
     */
    public void mostrarCola() {

        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        Nodo actual = frente;

        System.out.println("\nClientes en espera:");

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}