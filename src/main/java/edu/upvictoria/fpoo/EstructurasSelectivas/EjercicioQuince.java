package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;

public class EjercicioQuince {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("La persona puede votar en las próximas elecciones.");
        } else {
            System.out.println("La persona no puede votar en las próximas elecciones.");
        }
    }
}
