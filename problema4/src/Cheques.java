public class Cheques {
    private Cliente cliente;
    private Banco banco;
    private double valorCheque;
    private double comisionBanco;

    public Cheques() {}

    public Cheques(Cliente cliente, Banco banco, double valorCheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorCheque = valorCheque;
    }

    // set


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    // calcular

    public void calcularComision() {
        this.comisionBanco = this.valorCheque * 0.00003;
    }

    // get


    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    // ToString

    public String toString() {
        return String.format("CHEQUE\n"
        +"\nCliente: "
        +"\nBanco: "
        +"\nValor Cheque: %.2f"
        +"\nComisión del Banco: %.2f");
    }

}
