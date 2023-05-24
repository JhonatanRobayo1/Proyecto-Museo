public class Artista extends Persona {
    // Atributos de la clase
    private String fechaNacimiento;
    private String nacionalidad;
    private String biografia;

    // Constructor por parametros
    public Artista(String nombre, String fechaNacimiento, String nacionalidad, String biografia) {
        super(nombre);// super llama al contructor de la clase padre
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }

    // Getters y setters

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    // la clase que permite obtener toda la informacion del objeto
    @Override
    public String toString() {
        return ("Artista: " + nombre + "\n" + "Fecha de Nacimiento: " + fechaNacimiento + "\n" + "Nacionalidad: "
                + nacionalidad + "\n" + "Biografía: " + biografia + "\n");
    }

}
