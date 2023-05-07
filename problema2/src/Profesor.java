public class Profesor {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia prov;

    public Profesor() {}

    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula, Provincia prov) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.prov = prov;
    }

    // set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setProv(Provincia prov) {
        this.prov = prov;
    }

    // calcular

    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico * 0.2);
    }

    // get

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public Provincia getProv() {
        return prov;
    }

    // to string

    public String toString() {
        return String.format("PROFESOR\n"
        +"\nNombre: %s"
        +"\nApellido: %s"
        +"\nSueldo Básico: %.2f"
        +"\nCédula: %s"
        +"\nProvincia: %s"
        +"\nSueldo Total: %.2f"
        , this.getNombre(), this.getApellido(), this.getSueldoBasico(), this.getCedula(), this.getProv(), this.getSueldoTotal());
    }

}
