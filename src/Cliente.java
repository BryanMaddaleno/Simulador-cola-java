/**
 * Clase Cliente
 * Representa la información de cada cliente del sistema.
 */
public class Cliente {

    String id;
    String nombre;
    String servicio;

    /**
     * Constructor del cliente
     * @param id Código o ID del cliente
     * @param nombre Nombre completo
     * @param servicio Tipo de servicio solicitado
     */
    public Cliente(String id, String nombre, String servicio) {
        this.id = id;
        this.nombre = nombre;
        this.servicio = servicio;
    }

    /**
     * Devuelve la información del cliente en formato texto
     */
    @Override
    public String toString() {
        return id + " - " + nombre + " (" + servicio + ")";
    }
}