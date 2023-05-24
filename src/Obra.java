public class Obra {
    // Atributos de la clase private por que no hay herencia
    private String titulo;
    private String tecnica;
    private String anioCreacion;
    private double precio;
    private Artista artista;
    private int cantidad;

    // contructor por parametros para la creacion del objeto ya definido
    public Obra(String titulo, String tecnica, String anioCreacion, double precio, Artista artista, int cantidad) {
        this.titulo = titulo;
        this.tecnica = tecnica;
        this.anioCreacion = anioCreacion;
        this.precio = precio;
        this.artista = artista;
        this.cantidad = cantidad;
    }
    // Getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(String anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    // Método toString() permite sacar toda la informacion del objeto

    @Override
    public String toString() {
        return "Obra{" +
                "titulo='" + titulo + '\'' +
                ", tecnica='" + tecnica + '\'' +
                ", anioCreacion=" + anioCreacion +
                ", precio=" + precio +
                ", artista=" + artista.getNombre() +
                '}';
    }

}
