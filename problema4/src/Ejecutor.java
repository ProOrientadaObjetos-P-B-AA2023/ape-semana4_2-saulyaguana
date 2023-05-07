public class Ejecutor {
    public static void main(String[] args) {
        Cliente cl = new Cliente("Alan", "Wake", "115066658-2");
        Banco bn = new Banco("Banco", 32);
        Cheques ch = new Cheques(cl, bn, 45.67);
        ch.calcularComision();
        System.out.println(ch);

    }
}
