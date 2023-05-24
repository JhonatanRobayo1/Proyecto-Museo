import java.util.*;
import java.time.LocalDate;

public class ControlGaleria implements PantallaGaleria, ControlCliente, GestionObras {
    // Dado que el objeto obreas indica la cantidad para hacer mas facil su lectura
    // y que no se repitan tanto las listas de
    // De tipo artista, y clientes
    // hay que limpiar el buffer y cerrar el scanner para liberar recursos
    static Scanner sc = new Scanner(System.in);
    private HashSet<Artista> artistas;
    private List<Compra> compras;
    private HashSet<Cliente> clientes;
    private HashSet<Obra> obras;

    // creacion de las listas
    public ControlGaleria() {
        artistas = new HashSet<>();
        compras = new ArrayList<>();
        clientes = new HashSet<>();
        obras = new HashSet<>();
    }

    // Implementación de los métodos de PantallaGaleria sobrecargados por que son de
    // interfaces, estos metodos mostraran la informacion de los objetos en las
    // listas

    @Override
    public void mostrarObras() {
        System.out.println("Lista de obras:");
        for (Obra obra : obras) {
            System.out.println(obra);
        }
    }

    @Override
    public void mostrarArtistas() {
        System.out.println("Lista de artistas:");
        for (Artista artista : artistas) {
            System.out.println(artista);
        }

    }

    @Override
    public void mostrarCompras() {
        System.out.println("Lista de compras:");
        for (Compra compra : compras) {
            System.out.println(compra);
        }
    }

    // Implementación de los métodos de ControlCliente sobrecargados por que vienen
    // de interfaces

    @Override
    public void agregarCliente() {
        /*
         * se deben pedir toda la inforacion para crear el objeto de tipo cliente y ser
         * agregado a la lista
         */
        System.out.println("Ingrese el nombre del cliente");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la dirección del cliente");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el correo electrónico del cliente");
        String correoElectronico = sc.nextLine();
        Cliente cliente = new Cliente(nombre, direccion, correoElectronico);
        clientes.add(cliente);

    }

    @Override
    public void eliminarCliente(String nombre) {
        /*
         * Creacion de un objetito cliente de tipo nulo, luego se busca si el cliente
         * esta en la lista, así al
         * objeto nulo se copia el objeto a eliminar y luego se pide la eliminacion de
         * la lista, todo esto sucede si lo encuentra
         * en los artistas de la lista
         */
        Cliente clienteAEliminar = null;

        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                clienteAEliminar = cliente;
                break;
            }
        }

        if (clienteAEliminar != null) {
            clientes.remove(clienteAEliminar);
            System.out.println("Cliente eliminado correctamente.");
        } else {
            System.out.println("No se encontró un cliente con ese nombre en la galería.");
        }
    }

    @Override
    public void listarClientes() {
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    // Implementación de los métodos de GestionObras se sobrecargan por que vienen
    // de interfaces

    @Override
    public void agregarObra() {/*
                                * se debe agregar la obra a la lista pidiendo todos sus atributos por la
                                * consola
                                */
        System.out.println("Ingrese el título de la obra:");
        String titulo = sc.nextLine();
        System.out.println("Ingrese la técnica utilizada:");
        String tecnica = sc.nextLine();
        System.out.println("Ingrese el año de creación de la obra:");
        String anioCreacion = sc.nextLine();
        System.out.println("Ingrese el precio de la obra:");
        double precio = sc.nextDouble();
        sc.nextLine(); // Limpiar el búfer de entrada
        System.out.println("Ingrese el nombre del artista:");
        String nombreArtista = sc.nextLine();

        Artista artista = buscarArtistaPorNombre(nombreArtista);
        /*
         * Se revisa si el artista de la obra esta registrado en la galería, en caso
         * negativo se debe agregar al artista a la galeria
         */
        if (artista == null) {
            System.out.println("No se encontró un artista con ese nombre en la galería. Agregando nuevo artista...");

            System.out.println("Ingrese la fecha de nacimiento del artista:");
            String fechaNacimiento = sc.nextLine();
            System.out.println("Ingrese la nacionalidad del artista:");
            String nacionalidad = sc.nextLine();
            System.out.println("Ingrese la biografía del artista:");
            String biografia = sc.nextLine();

            artista = new Artista(nombreArtista, fechaNacimiento, nacionalidad, biografia);
            artistas.add(artista);

            System.out.println("Artista agregado correctamente.");
        }

        System.out.println("Ingrese la cantidad de copias de la obra:");
        int cantidad = sc.nextInt();

        Obra obra = new Obra(titulo, tecnica, anioCreacion, precio, artista, cantidad);
        obras.add(obra);
        System.out.println("Obra agregada correctamente.");

    }

    @Override
    public void eliminarObra(String titulo) {
        /*
         * Se crea un objeto obra nulo y con el nombre se comienza a buscar si este
         * existe en la lista en caso de que sea positivo
         * se copia el objeto al objeto nulo EliminarObra y luego se pide que se elimine
         * de la lista, en caso de que no este se informa al usuario
         */
        Obra obraAEliminar = null;

        for (Obra obra : obras) {
            if (obra.getTitulo().equals(titulo)) {
                obraAEliminar = obra;
                break;
            }
        }

        if (obraAEliminar != null) {
            obras.remove(obraAEliminar);
            System.out.println("Obra eliminada correctamente.");
        } else {
            System.out.println("No se encontró una obra con ese título en la galería.");
        }
    }

    @Override
    public void listarObras() {
        System.out.println("Lista de obras:");
        for (Obra obra : obras) {
            System.out.println(obra);
        }
    }

    // Métodos adicionales
    // metodos usados necesarios en muchoss se crean los objetos y se añaden a las
    // listas.
    public void agregarArtista() {
        /*
         * Se comienza a pedir los atributo del objeto artista luego se crea el objeto y
         * se añade a la lista de los artistas
         */
        System.out.println("Ingrese el nombre del artista:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del artista:");
        String fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese la nacionalidad del artista:");
        String nacionalidad = sc.nextLine();
        System.out.println("Ingrese la biografía del artista:");
        String biografia = sc.nextLine();

        Artista artista = new Artista(nombre, fechaNacimiento, nacionalidad, biografia);
        artistas.add(artista);

        System.out.println("Artista agregado correctamente.");

    }

    public void eliminarArtista(String nombre) {
        /*
         * Se comienza a buscar el artista por el nombre en la lista de los artistas que
         * hay, si lo encuentra en el
         * objeto tipo Artista nulo se copia el objeto a eliminar y luego se elimina de
         * la lista el objeto artista
         */
        Artista artistaAEliminar = null;

        for (Artista artista : artistas) {
            if (artista.getNombre().equals(nombre)) {
                artistaAEliminar = artista;
                break;
            }
        }

        if (artistaAEliminar != null) {
            eliminarObrasPorArtista(artistaAEliminar);
            artistas.remove(artistaAEliminar);
            System.out.println("Artista eliminado correctamente.");
        } else {
            System.out.println("No se encontró un artista con ese nombre en la galería.");
        }
    }

    // se crea esta funcion para eliminar las obras del artista, cuando se elimina
    // el artista
    private void eliminarObrasPorArtista(Artista artista) {
        List<Obra> obrasAEliminar = new ArrayList<>();

        for (Obra obra : obras) {
            if (obra.getArtista().equals(artista)) {
                obrasAEliminar.add(obra);
            }
        }

        obras.removeAll(obrasAEliminar);
    }

    public void realizarCompra() {
        // se debe buscar al cliente si no hay ninguno se debe agregar los clientes,para
        // realizar la compra
        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = sc.nextLine();

        Cliente cliente = null;

        if (clientes.isEmpty()) {
            // si no esta el cliente se agrega a la lista
            System.out.println("No hay clientes en la galería. Agregando nuevo cliente...");
            System.out.println("Ingrese el nombre del cliente:");
            String nombreClienteA = sc.nextLine();

            System.out.println("Ingrese la dirección del cliente:");
            String direccion = sc.nextLine();
            System.out.println("Ingrese el correo electrónico del cliente:");
            String correoElectronico = sc.nextLine();

            cliente = new Cliente(nombreClienteA, direccion, correoElectronico);
            clientes.add(cliente);

            // Limpiar el buffer de entrada
            sc.nextLine();

            System.out.println("Cliente agregado correctamente.");
        } else {
            cliente = buscarClientePorNombre(nombreCliente);
            if (cliente == null) {
                System.out.println("No se encontró un cliente con ese nombre en la galería.");
                return;
            }
        }
        // Mostrar las obras a vender
        System.out.println("Obras disponibles:");
        listarObras();
        // se pide que obra es la que desea comprar
        System.out.println("Ingrese el título de la obra a comprar:");
        String tituloObra = sc.nextLine();

        Obra obra = buscarObraPorTitulo(tituloObra);
        if (obra != null) {
            if (obra.getCantidad() > 0) {
                // se revisa si hay existencias de la obra o si esta existe
                LocalDate fechaCompra = LocalDate.now();
                Compra compra = new Compra(fechaCompra.toString(), obra.getPrecio(), cliente, obra);
                actualizarCantidadCopias(obra);
                compras.add(compra);
                System.out.println("Compra realizada correctamente.");
            } else {
                System.out.println("No hay copias disponibles de esta obra.");
            }
        } else {
            System.out.println("No se encontró la obra en la galería.");
        }
    }

    private Cliente buscarClientePorNombre(String nombre) {
        // metodo para buscar el cliente por su nombre
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    private Obra buscarObraPorTitulo(String titulo) {
        for (Obra obra : obras) {
            if (obra.getTitulo().equals(titulo)) {
                return obra;
            }
        }
        return null;
    }

    // como es necesario ir actuaizando la cantidad de copias disponible se debe ir
    // eliminado las vendidas
    private void actualizarCantidadCopias(Obra obra) {
        int cantidadCopias = obra.getCantidad();
        obra.setCantidad(cantidadCopias - 1);
    }

    public Artista buscarArtistaPorNombre(String nombre) {
        // metodo para buscar al artista por nombre para el metodo de agregar obra
        for (Artista artista : artistas) {
            if (artista.getNombre().equals(nombre)) {
                return artista;
            }
        }
        return null;
    }
}