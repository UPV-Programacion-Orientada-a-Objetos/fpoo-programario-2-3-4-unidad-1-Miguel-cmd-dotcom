package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioTreinta {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el salario mínimo:");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Ingrese los puntos del profesor:");
        int puntos = sc.nextInt();

        double bono;

        if (puntos >= 0 && puntos <= 100) {
            bono = salarioMinimo;
        } else if (puntos >= 101 && puntos <= 150) {
            bono = salarioMinimo * 2;
        } else if (puntos >= 151) {
            bono = salarioMinimo * 3;
        } else {
            System.out.println("Puntos inválidos");
            return;
        }

        System.out.println("El monto del bono que percibirá el profesor es: $" + bono);
    }
}
