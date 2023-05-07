public class Ejecutor {
    public static void main(String[] args) {
        Provincia pr = new Provincia("Loja", 120000);
        Profesor prof = new Profesor("Alan", "Wake", 745.5, "115066658-2", pr);
        prof.calcularSueldoTotal();
        System.out.println(pr);

    }
}
