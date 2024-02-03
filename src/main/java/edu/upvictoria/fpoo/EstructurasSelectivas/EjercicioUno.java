package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioUno {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println("El primer valor es mayor.");
        } else if (valor2 > valor1) {
            System.out.println("El segundo valor es mayor.");
        } else {
            System.out.println("Ambos valores son iguales.");
        }
    }
}
