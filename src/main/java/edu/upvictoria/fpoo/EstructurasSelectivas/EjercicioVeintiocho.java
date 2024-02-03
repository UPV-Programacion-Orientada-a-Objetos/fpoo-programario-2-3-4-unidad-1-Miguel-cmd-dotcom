package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeintiocho {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificación (0-10):");
        int calificacion = sc.nextInt();

        String letraCalificacion;

        if (calificacion == 10) {
            letraCalificacion = "A";
        } else if (calificacion == 9) {
            letraCalificacion = "B";
        } else if (calificacion == 8) {
            letraCalificacion = "C";
        } else if (calificacion >= 6 && calificacion <= 7) {
            letraCalificacion = "D";
        } else if (calificacion >= 0 && calificacion <= 5) {
            letraCalificacion = "F";
        } else {
            System.out.println("Calificación inválida");
            return;
        }

        System.out.println("La calificación en letra es: " + letraCalificacion);
    }
}
