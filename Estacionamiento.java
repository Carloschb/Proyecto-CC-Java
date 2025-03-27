package CentroComercial;

public class Estacionamiento {
    private int espaciosCoches;
    private int espaciosMotos;
    private int espaciosBicicletas;

    public Estacionamiento(int total, int coches, int motos, int bicis) {
        this.espaciosCoches = coches;
        this.espaciosMotos = motos;
        this.espaciosBicicletas = bicis;
    }

    public void mostrarDisponibilidad() {
        System.out.println("\n🚗 ESTACIONAMIENTO:");
        System.out.println("Coches: " + espaciosCoches + " espacios");
        System.out.println("Motos: " + espaciosMotos + " espacios");
        System.out.println("Bicicletas: " + espaciosBicicletas + " espacios");
    }
}