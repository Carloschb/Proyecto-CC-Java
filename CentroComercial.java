package CentroComercial;

import java.util.ArrayList;
import java.util.List;

public class CentroComercial {
    private List<Tienda> tiendas;
    private Estacionamiento estacionamiento;

    public CentroComercial() {
        this.tiendas = new ArrayList<>();
        this.estacionamiento = new Estacionamiento(200, 80, 15, 5);
        inicializarTiendasFijas();
    }

    private void inicializarTiendasFijas() {
        // Tiendas en planta 1 (Ropa)
        tiendas.add(new Tienda("Zara", "Ropa", 1));
        tiendas.add(new Tienda("Nike", "Ropa Deportiva", 1));
        
        // Tiendas en planta 2 (Entretenimiento)
        tiendas.add(new Tienda("CinemaX", "Cine", 2));
        
        // Tiendas en planta 3 (Comida)
        tiendas.add(new Tienda("McDonald's", "Comida Rápida", 3));
    }

    public List<Tienda> getTodasLasTiendas() {
        return new ArrayList<>(tiendas); 
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void mostrarTodasLasTiendas() {
        System.out.println("\n🛍️ TIENDAS DISPONIBLES:");
        for (Tienda tienda : tiendas) {
            tienda.mostrarInfo();
        }
    }
    
    public List<Tienda> buscarTiendas(String categoria) {
        List<Tienda> resultado = new ArrayList<>();
        for (Tienda tienda : tiendas) {
            if (tienda.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(tienda);
            }
        }
        return resultado;
    }
}