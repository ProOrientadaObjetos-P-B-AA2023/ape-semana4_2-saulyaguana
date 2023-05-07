public class Ejecutor {
    public static void main(String[] args) {
        Fabricante fb = new Fabricante("Artur", "Luxemburgo");
        Automotor auto = new Automotor("115066658-2", 2025, 45000, fb);
        auto.setCalcularMatricual();
        System.out.println(auto);

    }
}
