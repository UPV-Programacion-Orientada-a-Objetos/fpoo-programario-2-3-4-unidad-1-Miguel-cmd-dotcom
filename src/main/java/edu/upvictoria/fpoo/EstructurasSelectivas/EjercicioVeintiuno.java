package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeintiuno {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        double beca = 0;

        if (edad > 18) {
            if (promedio >= 9) {
                beca = 3000.00;
            } else if (promedio >= 8) {
                beca = 2000.00;
            } else if (promedio >= 6) {
                beca = 100.00;
            }
        } else {
            if (promedio >= 9) {
                beca = 2000.00;
            } else if (promedio >= 8) {
                beca = 1000.00;
            } else if (promedio >= 6) {
                beca = 500.00;
            }
        }

        if (beca > 0) {
            System.out.println("El estudiante ha sido beneficiado con una beca de $" + beca);
        } else {
            System.out.println("Se enviará una carta de invitación al estudiante.");
        }
    }
}
