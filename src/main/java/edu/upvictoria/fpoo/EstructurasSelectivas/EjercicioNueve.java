package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioNueve {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();

        System.out.println("Ingrese el día de la semana (1-7): ");
        int diaSemana = scanner.nextInt();

        System.out.println("Ingrese el turno (1: Matutino, 2: Vespertino): ");
        int turno = scanner.nextInt();

        double costoLlamada = 0.0;

        if (duracionLlamada <= 5) {
            costoLlamada = duracionLlamada * 1.00;
        } else if (duracionLlamada <= 8) {
            costoLlamada = 5.00 + (duracionLlamada - 5) * 0.80;
        } else if (duracionLlamada <= 10) {
            costoLlamada = 7.40 + (duracionLlamada - 8) * 0.70;
        } else {
            costoLlamada = 9.40 + (duracionLlamada - 10) * 0.50;
        }

        if (diaSemana == 1) {
            costoLlamada += costoLlamada * 0.03;
        } else if (diaSemana >= 2 && diaSemana <= 5) {
            if (turno == 1) {
                costoLlamada += costoLlamada * 0.15;
            } else if (turno == 2) {
                costoLlamada += costoLlamada * 0.10;
            }
        }

        System.out.println("El costo de la llamada es: $" + costoLlamada);
    }
}
