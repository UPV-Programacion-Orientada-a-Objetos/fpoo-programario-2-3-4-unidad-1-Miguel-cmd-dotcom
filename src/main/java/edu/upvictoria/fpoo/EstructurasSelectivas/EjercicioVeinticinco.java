package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeinticinco {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los años de antigüedad del trabajador:");
        int antiguedad = sc.nextInt();

        int bono;

        if (antiguedad <= 0) {
            bono = 0;
        } else if (antiguedad <= 5) {
            bono = antiguedad * 100;
        } else {
            bono = 1000;
        }

        System.out.println("El bono que recibirá el trabajador es: $" + bono);

    }
}
