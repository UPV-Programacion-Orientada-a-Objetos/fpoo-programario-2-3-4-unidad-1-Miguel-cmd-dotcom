package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Calendar;
import java.util.Scanner;

public class EjercicioCatorce {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de tarjeta (1, 2, 3, u otro): ");
        int tipoTarjeta = scanner.nextInt();

        double aumentoLimite;

        if (tipoTarjeta == 1) {
            aumentoLimite = 0.25;
        } else if (tipoTarjeta == 2) {
            aumentoLimite = 0.35;
        } else if (tipoTarjeta == 3) {
            aumentoLimite = 0.40;
        } else {
            aumentoLimite = 0.50;
        }

        System.out.println("El aumento del límite de crédito es del " + (aumentoLimite * 100) + "%");
    }
}
