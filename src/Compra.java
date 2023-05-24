public class Compra {
    // Atributo de la clase compra
    private String fecha;
    private double precio;
    private Cliente cliente;
    private Obra obra;

    // contructor por parametros para la creación del objeto
    public Compra(String fecha, double precio, Cliente cliente, Obra obra) {
        this.fecha = fecha;
        this.precio = precio;
        this.cliente = cliente;
        this.obra = obra;
    }

    // Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    // Metodo para devolver toda la informacion del objeto
    public String toString() {
        return "Compra{" +
                "fecha='" + fecha + '\'' +
                ", precio=" + precio +
                ", cliente=" + cliente.getNombre() +
                ", obra=" + obra.getTitulo() +
                '}';
    }
}
