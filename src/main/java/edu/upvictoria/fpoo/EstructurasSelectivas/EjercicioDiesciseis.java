package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;

public class EjercicioDiesciseis {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese el pago por hora: ");
        double pagoHora = scanner.nextDouble();

        double sueldoSemanal;

        if (horasTrabajadas > 40) {
            int horasExtra = horasTrabajadas - 40;
            sueldoSemanal = (40 * pagoHora) + (horasExtra * (pagoHora * 2));
        } else {
            sueldoSemanal = horasTrabajadas * pagoHora;
        }

        System.out.println("El sueldo semanal del trabajador es: $" + sueldoSemanal);
    }
}
