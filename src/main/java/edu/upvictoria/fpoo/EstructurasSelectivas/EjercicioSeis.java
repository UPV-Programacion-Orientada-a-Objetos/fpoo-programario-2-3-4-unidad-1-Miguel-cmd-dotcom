package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;

public class EjercicioSeis {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de personas: ");
        int numeroPersonas = scanner.nextInt();

        double costoPorPersona;

        if (numeroPersonas > 300) {
            costoPorPersona = 75.00;
        } else if (numeroPersonas > 200) {
            costoPorPersona = 85.00;
        } else {
            costoPorPersona = 95.00;
        }

        double presupuesto = numeroPersonas * costoPorPersona;

        System.out.println("El presupuesto para el evento es: $" + presupuesto);
    }
}
