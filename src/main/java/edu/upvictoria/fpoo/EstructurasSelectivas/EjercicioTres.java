package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;
public class EjercicioTres {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de lápices: ");
        int cantidad = scanner.nextInt();

        double costo;

        if (cantidad >= 1000) {
            costo = cantidad * 3.65;
        } else {
            costo = cantidad * 4.83;
        }

        System.out.println("El costo total es: $" + costo);
    }
}
