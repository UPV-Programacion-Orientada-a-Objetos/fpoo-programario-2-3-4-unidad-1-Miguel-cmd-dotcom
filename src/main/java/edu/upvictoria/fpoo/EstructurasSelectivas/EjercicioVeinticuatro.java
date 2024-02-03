package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeinticuatro {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia en kilómetros del lugar de destino:");
        int distancia = sc.nextInt();
        System.out.println("Ingrese el precio por kilometro:");
        int costoKm = sc.nextInt();
        int costoPasajeIda = distancia * costoKm;
        int costoPasajeVuelta = distancia * costoKm;

        System.out.println("El costo del pasaje de ida es: $" + costoPasajeIda);
        System.out.println("El costo del pasaje de vuelta es: $" + costoPasajeVuelta);

    }
}
