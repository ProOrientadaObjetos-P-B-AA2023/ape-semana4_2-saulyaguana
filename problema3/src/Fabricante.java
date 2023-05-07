public class Fabricante {
    private String nombre;
    private String ciudad;

    public Fabricante () {}

    public Fabricante(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    // set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // get

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String toString() {
        return String.format("Nombre: %s\n"
        +"\nCiudad: %s");
    }
}
