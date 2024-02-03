package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;

public class EjercicioOnce {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        double costoHamburguesaSencilla = 20.00;
        double costoHamburguesaDoble = 25.00;
        double costoHamburguesaTriple = 28.00;

        System.out.println("Ingrese la cantidad de hamburguesas: ");
        int cantidadHamburguesas = scanner.nextInt();

        System.out.println("Seleccione el tipo de hamburguesa (1 - Sencilla, 2 - Doble, 3 - Triple): ");
        int tipoHamburguesa = scanner.nextInt();

        double costoTotal;

        switch (tipoHamburguesa) {
            case 1:
                costoTotal = costoHamburguesaSencilla * cantidadHamburguesas;
                break;
            case 2:
                costoTotal = costoHamburguesaDoble * cantidadHamburguesas;
                break;
            case 3:
                costoTotal = costoHamburguesaTriple * cantidadHamburguesas;
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("¿Desea pagar con tarjeta de crédito? (Sí/No): ");
        String opcionPago = scanner.next();

        if (opcionPago.equalsIgnoreCase("Sí")) {
            double cargoTarjeta = costoTotal * 0.05;
            costoTotal += cargoTarjeta;
            System.out.println("El costo total con el cargo de tarjeta es: $" + costoTotal);
        } else {
            System.out.println("El costo total es: $" + costoTotal);
        }
    }
}
