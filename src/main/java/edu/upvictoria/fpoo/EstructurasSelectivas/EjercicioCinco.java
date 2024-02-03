package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;

public class EjercicioCinco {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("Ingrese el tercer valor: ");
        int valor3 = scanner.nextInt();

        int mayor = valor1;

        if (valor2 > mayor) {
            mayor = valor2;
        }
        if (valor3 > mayor) {
            mayor = valor3;
        }

        System.out.println("El mayor valor es: " + mayor);
    }
}
