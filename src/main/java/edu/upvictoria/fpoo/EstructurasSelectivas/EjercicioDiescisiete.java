package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;

public class EjercicioDiescisiete {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el presupuesto disponible: ");
        double presupuesto = scanner.nextDouble();

        String regalo;

        if (presupuesto <= 10.00) {
            regalo = "Tarjeta";
        } else if (presupuesto <= 100.00) {
            regalo = "Chocolates";
        } else if (presupuesto <= 250.00) {
            regalo = "Flores";
        } else {
            regalo = "Anillo";
        }

        System.out.println("Se puede comprar un(a) " + regalo + " para ese ser especial.");
    }
}
