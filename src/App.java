import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        ControlGaleria controlGaleria = new ControlGaleria();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("------- Menú -------");
            System.out.println("1. Agregar artista");
            System.out.println("2. Eliminar artista");
            System.out.println("3. Agregar obra");
            System.out.println("4. Eliminar obra");
            System.out.println("5. Listar obras");
            System.out.println("6. Listar artistas");
            System.out.println("7. Realizar compra");
            System.out.println("8. Listar compras");
            System.out.println("9. Agregar cliente");
            System.out.println("10. Eliminar cliente");
            System.out.println("0. Salir");
            System.out.println("--------------------");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    PantallaUtil.limpiarPantalla();
                    controlGaleria.agregarArtista();
                    // Agregar artista
                    // ...
                    break;
                case 2:
                    PantallaUtil.limpiarPantalla();
                    System.out.println("Ingrese el nombre del Artista a Eliminar: ");
                    String nombre = scanner.nextLine();
                    controlGaleria.eliminarArtista(nombre);
                    // Eliminar artista
                    break;
                case 3:
                    PantallaUtil.limpiarPantalla();
                    controlGaleria.agregarObra();
                    // Agregar obra
                    // ...
                    break;
                case 4:
                    PantallaUtil.limpiarPantalla();
                    System.out.println("Ingrese el nombre de la Obra a Eliminar: ");
                    String nombreO = scanner.nextLine();
                    controlGaleria.eliminarObra(nombreO);
                    // Eliminar obra
                    // ...
                    break;
                case 5:
                    PantallaUtil.limpiarPantalla();
                    controlGaleria.listarObras();
                    // Listar obras
                    // ...
                    break;
                case 6:
                    PantallaUtil.limpiarPantalla();
                    controlGaleria.mostrarArtistas();
                    // Listar artistas
                    // ...
                    break;
                case 7:
                    PantallaUtil.limpiarPantalla();
                    controlGaleria.realizarCompra();
                    // Realizar compra
                    // ...
                    break;
                case 8:
                    PantallaUtil.limpiarPantalla();
                    controlGaleria.mostrarCompras();
                    // Listar compras
                    // ...
                    break;
                case 9:
                    PantallaUtil.limpiarPantalla();
                    controlGaleria.agregarCliente();
                    // Agregar cliente
                    // ...
                    break;
                case 10:
                    PantallaUtil.limpiarPantalla();
                    System.out.println("Ingrese el nombre del Cliente a Eliminar: ");
                    String nombreC = scanner.nextLine();
                    controlGaleria.eliminarCliente(nombreC);
                    // Eliminar cliente
                    // ...
                    break;
                case 11:
                    PantallaUtil.limpiarPantalla();
                    controlGaleria.listarClientes();
                    // listar Clientes
                    break;
                case 0:
                    PantallaUtil.limpiarPantalla();
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    PantallaUtil.limpiarPantalla();
                    System.out.println("Opción inválida. Por favor, ingrese nuevamente.");
                    break;
            }
        }

    }
}
