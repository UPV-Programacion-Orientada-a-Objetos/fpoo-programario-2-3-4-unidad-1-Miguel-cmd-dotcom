package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;

public class EjercicioDos {
    public static void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
