import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Clase principal del sistema
 * Controla el menú y las operaciones del programa.
 */
public class Simulador {

    static Cola cola = new Cola();
    static Pila historial = new Pila();
    static Scanner sc = new Scanner(System.in);

    /**
     * Método principal
     */
    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cargar clientes desde archivo");
            System.out.println("2. Agregar cliente manualmente");
            System.out.println("3. Atender siguiente cliente");
            System.out.println("4. Ver cola de espera");
            System.out.println("5. Ver historial");
            System.out.println("6. Consultar ultimo atendido");
            System.out.println("7. Salir");
            System.out.print("Seleccione opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    cargarArchivo();
                    break;

                case 2:
                    agregarCliente();
                    break;

                case 3:
                    atenderCliente();
                    break;

                case 4:
                    cola.mostrarCola();
                    break;

                case 5:
                    historial.mostrarHistorial();
                    break;

                case 6:
                    consultarUltimo();
                    break;

                case 7:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 7);
    }

    /**
     * Lee clientes desde archivo TXT
     */
    public static void cargarArchivo() {

        try {
            BufferedReader br = new BufferedReader(new FileReader("data/clientes.txt"));

            String linea = br.readLine(); // omite encabezado

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                Cliente cliente = new Cliente(
                        datos[0],
                        datos[1],
                        datos[2]
                );

                cola.encolar(cliente);
            }

            br.close();

            System.out.println("Clientes cargados correctamente.");

        } catch (Exception e) {
            System.out.println("Error al abrir archivo.");
        }
    }

    /**
     * Agrega cliente desde teclado
     */
    public static void agregarCliente() {

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Servicio: ");
        String servicio = sc.nextLine();

        Cliente cliente = new Cliente(id, nombre, servicio);

        cola.encolar(cliente);

        System.out.println("Cliente agregado.");
    }

    /**
     * Atiende al siguiente cliente
     */
    public static void atenderCliente() {

        Cliente cliente = cola.desencolar();

        if (cliente == null) {
            System.out.println("No hay clientes en espera.");
        } else {
            historial.push(cliente);
            System.out.println("Cliente atendido: " + cliente);
        }
    }

    /**
     * Consulta último cliente atendido
     */
    public static void consultarUltimo() {

        Cliente cliente = historial.peek();

        if (cliente == null) {
            System.out.println("No hay historial.");
        } else {
            System.out.println("Ultimo atendido: " + cliente);
        }
    }
}