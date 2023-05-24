public class Cliente extends Persona {
    // Atributos pripos del objeto concreto
    private String direccion;
    private String correoElectronico;

    // constructo de los objetos
    public Cliente(String nombre, String direccion, String correoElectronico) {
        super(nombre); // super llama al contructor de la clase padre
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    // metodos getter y setter
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // devolver toda la informacion de la clase
    @Override
    public String toString() {
        return ("Cliente: " + nombre + "\t" + "Dirección: " + direccion + "\t" + "Correo Electrónico: "
                + correoElectronico + "\t");
    }
}
