package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.util.Scanner;
public class EjercicioVeintidos {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el consumo de energía eléctrica en kilowatts: ");
        double consumoKW = scanner.nextDouble();

        double costoKW = obtenerCostoKW();
        double pagoEnergia = calcularPagoEnergia(consumoKW, costoKW);

        System.out.println("El pago por consumo de energía eléctrica es: $" + pagoEnergia);
    }

    public static double obtenerCostoKW() {
        // Aquí puedes incluir tu lógica para obtener el costo por kilowatt
        // por ejemplo, puedes consultar una base de datos o un archivo

        double costoKW = 0.8; // Costo en tu moneda local por kilowatt de energía eléctrica
        return costoKW;
    }

    public static double calcularPagoEnergia(double consumoKW, double costoKW) {
        double pagoEnergia = consumoKW * costoKW;
        return pagoEnergia;
    }
}
