public class Banco {
    private String nombre;
    private int sucursales;

    public Banco() {}

    public Banco(String nombre, int sucursales) {
        this.nombre = nombre;
        this.sucursales = sucursales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSucursales(int sucursales) {
        this.sucursales = sucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSucursales() {
        return sucursales;
    }

    public String toString() {
        return String.format("Nombre: %s\n"
        +"\nSucursales: %d");
    }
}
