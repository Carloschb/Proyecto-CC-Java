package CentroComercial;

import java.util.Scanner;
import java.util.List;

public class Visitante {
    private String nombre;
    private String interes; 

    public static Visitante registrar(Scanner scanner) {
        System.out.println("\n--- REGISTRO DE VISITANTE ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("¿Qué te interesa? (Ropa/Comida/Entretenimiento): ");
        String interes = scanner.nextLine();
        return new Visitante(nombre, interes);
    }

    public Visitante(String nombre, String interes) {
        this.nombre = nombre;
        this.interes = interes;
    }

    public void sugerirTiendas(CentroComercial centro) {
    
        if (!interes.equalsIgnoreCase("Ropa") && 
            !interes.equalsIgnoreCase("Comida") && 
            !interes.equalsIgnoreCase("Entretenimiento")) {
            System.out.println("\n⚠️ Interés no válido. Las opciones son: Ropa, Comida, Entretenimiento");
            return;
        }

        List<Tienda> tiendasRecomendadas = centro.buscarTiendas(interes);
        
        if (tiendasRecomendadas.isEmpty()) {
            System.out.println("\n⚠️ No hay tiendas de " + interes + " en MADSHOP.");
        } else {
            System.out.println("\n🎯 Recomendaciones para " + nombre + ":");
            for (Tienda tienda : tiendasRecomendadas) {
                tienda.mostrarInfo();
            }
        }
    }
}