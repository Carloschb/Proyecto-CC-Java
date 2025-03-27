package CentroComercial;

public class Tienda {
    private String nombre;
    private String categoria;
    private int piso;

    public Tienda(String nombre, String categoria, int piso) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.piso = piso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPiso() {
        return piso;
    }

    public void mostrarInfo() {
        System.out.println("🔹 " + nombre + " | " + categoria + " | Piso " + piso);
    }
}
