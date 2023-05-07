public class Provincia {
    private String nombre;
    private int habitantes;

    public Provincia() {}

    public Provincia(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    // set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    // get


    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public String toString() {
        return String.format("PROVINCIA\n"
        +"\nNombre Provincia: %s"
        +"\nHabitantes: %d");
    }
}
