package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeintiseis {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas:");
        int horasTrabajadas = sc.nextInt();

        System.out.println("Ingrese el pago por hora:");
        double pagoHora = sc.nextDouble();

        double sueldoSemanal;

        if (horasTrabajadas <= 40) {
            sueldoSemanal = horasTrabajadas * pagoHora;
        } else if (horasTrabajadas <= 45) {
            sueldoSemanal = 40 * pagoHora + (horasTrabajadas - 40) * pagoHora * 2;
        } else if (horasTrabajadas <= 50) {
            sueldoSemanal = 40 * pagoHora + 5 * pagoHora * 2 + (horasTrabajadas - 45) * pagoHora * 3;
        } else {
            System.out.println("No se permite trabajar más de 50 horas");
            return;
        }

        System.out.println("El sueldo semanal del trabajador es: $" + sueldoSemanal);
    }
}
