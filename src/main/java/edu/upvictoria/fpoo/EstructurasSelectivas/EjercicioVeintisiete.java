package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeintisiete {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = sc.nextInt();

        int costoPasaje;

        if (numAlumnos > 100) {
            costoPasaje = 20;
        } else if (numAlumnos >= 50 && numAlumnos <= 100) {
            costoPasaje = 35;
        } else if (numAlumnos >= 20 && numAlumnos < 50) {
            costoPasaje = 40;
        } else if (numAlumnos < 20) {
            costoPasaje = 70;
        } else {
            System.out.println("Número de alumnos inválido");
            return;
        }

        int costoTotal = numAlumnos * costoPasaje;
        System.out.println("El costo del pasaje por alumno es: $" + costoPasaje);
        System.out.println("El costo total del pasaje es: $" + costoTotal);
    }
}
