package CentroComercial;
 
// El codigo presentado a continuacion es un prototipo para una persona a saber donde esta una tienda,
// vamos a añadir datos fijos como, el centro comercial se llamara, MADSHOP, 
// tendrá 3 plantas y dos sótanos con capacidad para 200 vehículos, 80 coches 15 para motos y 5 para bicicletas por planta.

// Primera planta será todo para tiendas de ropa (casual, deportiva, etc) 
// por lo cual añadiremos unas tiendas mezclando entre las típicas Adidas Nike under armor Zara guess etc.

// La segunda planta será de mas ropa y algunas tiendas de entretenimiento como cines y maquinas recreativas.

// Tercera planta todo de comidas. 

// Entonces el código lo que hará es dar información al usuario sobre el centro comercial para ubicarse y saber que hay en su interior, 
// se le preguntaran cosas como su nombre y que le gustaría hacer hoy en el centro comercial.

// Para hacer que el codigo sea ma apto tendriamos que añadir muchas mas tiendas. 

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentroComercial madshop = new CentroComercial();

        System.out.println("¡Bienvenido a MADSHOP! 🛍️\n");

        Visitante visitante = Visitante.registrar(scanner);

        madshop.mostrarTodasLasTiendas();
        madshop.getEstacionamiento().mostrarDisponibilidad(); // Ahora funciona

        visitante.sugerirTiendas(madshop);

        System.out.print("\n¿Buscar tienda específica? (si/no): ");
        if (scanner.nextLine().equalsIgnoreCase("si")) {
            System.out.print("Nombre de la tienda: ");
            buscarTiendaPorNombre(madshop.getTodasLasTiendas(), scanner.nextLine()); // Ahora funciona
        }

        System.out.println("\n¡Gracias por visitar MADSHOP! 😊");
    }

    private static void buscarTiendaPorNombre(List<Tienda> tiendas, String nombre) {
        boolean encontrada = false;
        for (Tienda tienda : tiendas) {
            if (tienda.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("✅ Tienda encontrada:");
                tienda.mostrarInfo();
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("❌ No se encontró: " + nombre);
        }
    }
} 