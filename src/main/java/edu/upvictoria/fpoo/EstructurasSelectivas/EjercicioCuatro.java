package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del traje: ");
        double precio = scanner.nextDouble();

        double descuento;

        if (precio > 2500.00) {
            descuento = precio * 0.15;
        } else {
            descuento = precio * 0.08;
        }

        double precioFinal = precio - descuento;

        System.out.println("El precio final a pagar es: $" + precioFinal);
        System.out.println("El descuento aplicado es: $" + descuento);

    }
}
