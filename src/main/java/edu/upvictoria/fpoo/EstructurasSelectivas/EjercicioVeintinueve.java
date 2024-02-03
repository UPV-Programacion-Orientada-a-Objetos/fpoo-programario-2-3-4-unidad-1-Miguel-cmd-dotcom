package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeintinueve {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 7:");
        int numeroDia = sc.nextInt();

        String diaSemana;

        switch (numeroDia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("Número inválido");
                return;
        }

        System.out.println("El día de la semana correspondiente es: " + diaSemana);

    }
}
