public abstract class Persona {
    // atributos de la clase asbtracta, como los objetos concretos seran cliente y
    // artista
    protected String nombre;

    // el constructor de la clase aun cuando no se instancia si puede llamarse desde
    // el constructor del objeto en concreto
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // se ponen los setter y getter para la unica variable
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Enunciado del Metodo para devolver toda la informacion de la clase
    public abstract String toString();
}
