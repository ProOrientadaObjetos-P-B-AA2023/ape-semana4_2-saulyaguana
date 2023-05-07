public class Automotor {
    private String cedulaDu;
    private int annioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private Fabricante fabricante;

    public Automotor() {}

    public Automotor(String cedulaDu, int annioFabricacion, double valorVehiculo, Fabricante fabricante) {
        this.cedulaDu = cedulaDu;
        this.annioFabricacion = annioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.fabricante = fabricante;
    }

    // set

    public void setCedulaDu(String cedulaDu) {
        this.cedulaDu = cedulaDu;
    }

    public void setAnnioFabricacion(int annioFabricacion) {
        this.annioFabricacion = annioFabricacion;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    // calcular

    public void setCalcularMatricual() {
        this.valorMatricula = (this.valorVehiculo * 0.00002) * this.annioFabricacion;
    }

    // get

    public String getCedulaDu() {
        return cedulaDu;
    }

    public int getAnnioFabricacion() {
        return annioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public String toString() {
        return String.format("AUTOMOTOR\n"
        +"\nCédula del Dueño: %s"
        +"\nAño de Fabricación: %d"
        +"\nValor del Vehículo: %.2f"
        +"\nValor de la Matrícula: %.2f"
        +"\nFabricante: "
        , this.getCedulaDu(), this.getAnnioFabricacion(), this.getValorVehiculo(), this.getValorMatricula(), this.getFabricante());
    }
}
