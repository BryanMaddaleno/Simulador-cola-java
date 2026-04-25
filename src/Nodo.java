/**
 * Clase Nodo
 * Representa un nodo simple utilizado en la Cola y la Pila.
 * Cada nodo almacena un objeto Cliente y una referencia al siguiente nodo.
 */
public class Nodo {

    // Cliente almacenado en el nodo
    Cliente dato;

    // Referencia al siguiente nodo
    Nodo siguiente;

    /**
     * Constructor del nodo
     * @param dato Cliente que se almacenará en el nodo
     */
    public Nodo(Cliente dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}