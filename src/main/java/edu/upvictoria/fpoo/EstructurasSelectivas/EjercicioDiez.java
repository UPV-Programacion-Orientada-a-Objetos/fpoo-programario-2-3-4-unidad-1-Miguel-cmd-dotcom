package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;

public class EjercicioDiez {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de autobús (A, B, C): ");
        String tipoAutobus = scanner.nextLine();

        System.out.println("Ingrese el número de kilómetros recorridos: ");
        int kilometrosRecorridos = scanner.nextInt();

        System.out.println("Ingrese el número de personas: ");
        int numeroPersonas = scanner.nextInt();

        double costoPorKilometro;

        if (tipoAutobus.equals("A")) {
            costoPorKilometro = 2.0;
        } else if (tipoAutobus.equals("B")) {
            costoPorKilometro = 2.5;
        } else {
            costoPorKilometro = 3.0;
        }

        double costoTotal;

        if (numeroPersonas >= 20) {
            costoTotal = kilometrosRecorridos * costoPorKilometro * numeroPersonas;
        } else {
            costoTotal = kilometrosRecorridos * costoPorKilometro * 20; // Cobro mínimo de 20 personas
        }

        double costoPorPersona = costoTotal / numeroPersonas;

        System.out.println("El costo total del viaje es: $" + costoTotal);
        System.out.println("El costo por persona es: $" + costoPorPersona);
    }
}
