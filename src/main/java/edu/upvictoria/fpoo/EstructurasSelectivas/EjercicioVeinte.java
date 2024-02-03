package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeinte {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();

        double descuento = 0;

        if (precio >= 200) {
            descuento = 0.15;
        } else if (precio > 100 && precio < 200) {
            descuento = 0.12;
        } else if (precio <= 100) {
            descuento = 0.10;
        }

        double costoFinal = precio - (precio * descuento);

        System.out.println("El costo del artículo es: $" + costoFinal);
        System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
    }

}
