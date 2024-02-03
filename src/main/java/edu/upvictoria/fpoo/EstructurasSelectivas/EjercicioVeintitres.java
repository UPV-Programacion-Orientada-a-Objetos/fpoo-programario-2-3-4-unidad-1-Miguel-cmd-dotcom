package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;
public class EjercicioVeintitres {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        double cuotaBaseA = 1200;
        double cuotaBaseB = 950;

        System.out.println("Seleccione el tipo de póliza:");
        System.out.println("A) Cobertura amplia");
        System.out.println("B) Daños a terceros");
        String tipoPoliza = sc.nextLine();

        System.out.println("¿La persona que conduce tiene por hábito beber alcohol? (s/n)");
        String bebeAlcohol = sc.nextLine();

        System.out.println("¿La persona que conduce utiliza lentes? (s/n)");
        String usaLentes = sc.nextLine();

        System.out.println("¿La persona que conduce padece alguna enfermedad? (s/n)");
        String tieneEnfermedad = sc.nextLine();

        System.out.println("¿La persona que conduce tiene más de 40 años? (s/n)");
        String esMayor40 = sc.nextLine();

        double costoPoliza;
        if (tipoPoliza.equalsIgnoreCase("A")) {
            costoPoliza = cuotaBaseA;
        } else if (tipoPoliza.equalsIgnoreCase("B")) {
            costoPoliza = cuotaBaseB;
        } else {
            System.out.println("Tipo de póliza inválido");
            return;
        }

        if (bebeAlcohol.equalsIgnoreCase("s")) {
            costoPoliza += costoPoliza * 0.1;
        }

        if (usaLentes.equalsIgnoreCase("s")) {
            costoPoliza += costoPoliza * 0.05;
        }

        if (tieneEnfermedad.equalsIgnoreCase("s")) {
            costoPoliza += costoPoliza * 0.05;
        }

        if (esMayor40.equalsIgnoreCase("s")) {
            costoPoliza += costoPoliza * 0.2;
        } else {
            costoPoliza += costoPoliza * 0.1;
        }

        System.out.println("El costo de la póliza es: $" + costoPoliza);
    }
}
