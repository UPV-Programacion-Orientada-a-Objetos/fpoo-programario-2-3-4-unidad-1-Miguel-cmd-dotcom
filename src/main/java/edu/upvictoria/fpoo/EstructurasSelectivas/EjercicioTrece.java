package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.util.Scanner;

public class EjercicioTrece {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la clave del artículo (1, 2, 3, 4, 5 o 6): ");
        int claveArticulo = scanner.nextInt();

        System.out.println("Ingrese el costo de la materia prima: ");
        double costoMateriaPrima = scanner.nextDouble();

        double costoProduccion = costoMateriaPrima;

        double costoManoObra;
        double costoGastosFabricacion;

        if (claveArticulo == 3 || claveArticulo == 4) {
            costoManoObra = 0.75 * costoMateriaPrima;
        } else if (claveArticulo == 1 || claveArticulo == 5) {
            costoManoObra = 0.80 * costoMateriaPrima;
        } else {
            costoManoObra = 0.85 * costoMateriaPrima;
        }

        if (claveArticulo == 2 || claveArticulo == 5) {
            costoGastosFabricacion = 0.30 * costoMateriaPrima;
        } else if (claveArticulo == 3 || claveArticulo == 6) {
            costoGastosFabricacion = 0.35 * costoMateriaPrima;
        } else {
            costoGastosFabricacion = 0.28 * costoMateriaPrima;
        }

        double precioVenta = costoProduccion + (0.45 * costoProduccion);

        System.out.println("El precio de venta del artículo es: $" + precioVenta);
    }
}
