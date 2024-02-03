package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.IOException;
import java.util.Scanner;

public class Menu2 {
    public static void run() throws IOException {
        Menu();
    }
    public static void Menu() throws IOException {
        int opcion;
        System.out.println("Se encuentra en la carpeta de Estructura Selectiva");
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite 0 para regresar\n" +
                    "[1]Ejercicio1\n"+
                    "[2]Ejercicio2\n" +
                    "[3]Ejercicio3\n" +
                    "[4]Ejercicio4\n" +
                    "[5]Ejercicio5\n" +
                    "[6]Ejercicio6\n" +
                    "[7]Ejercicio7\n" +
                    "[8]Ejercicio8\n" +
                    "[9]Ejercicio9\n" +
                    "[10]Ejercicio10\n" +
                    "[11]Ejercicio11\n" +
                    "[12]Ejercicio12\n" +
                    "[13]Ejercicio13\n" +
                    "[14]Ejercicio14\n" +
                    "[15]Ejercicio15\n" +
                    "[16]Ejercicio16\n" +
                    "[17]Ejercicio17\n" +
                    "[18]Ejercicio18\n" +
                    "[19]Ejercicio19\n" +
                    "[20]Ejercicio20\n" +
                    "[21]Ejercicio21\n" +
                    "[22]Ejercicio22\n" +
                    "[23]Ejercicio23\n" +
                    "[24]Ejercicio24\n" +
                    "[25]Ejercicio25\n" +
                    "[26]Ejercicio26\n" +
                    "[27]Ejercicio27\n" +
                    "[28]Ejercicio28\n" +
                    "[29]Ejercicio29\n" +
                    "[30]Ejercicio30\n");
            opcion = teclado.nextInt();
            switch (opcion){
                case 0: break;
                case 1:EjercicioUno.run();break;
                case 2:EjercicioDos.run();break;
                case 3:EjercicioTres.run();break;
                case 4:EjercicioCuatro.run();break;
                case 5:EjercicioCinco.run();break;
                case 6:EjercicioSeis.run();break;
                case 7:EjercicioSiete.run();break;
                case 8:EjercicioOcho.run();break;
                case 9:EjercicioNueve.run();break;
                case 10:EjercicioDiez.run();break;
                case 11:EjercicioOnce.run();break;
                case 12:EjercicioDoce.run();break;
                case 13:EjercicioTrece.run();break;
                case 14:EjercicioCatorce.run();break;
                case 15:EjercicioQuince.run();break;
                case 16:EjercicioDiesciseis.run();break;
                case 17:EjercicioDiescisiete.run();break;
                case 18:EjercicioDiesciocho.run();break;
                case 19:EjercicioDiescinueve.run();break;
                case 20:EjercicioVeinte.run();break;
                case 21:EjercicioVeintiuno.run();break;
                case 22:EjercicioVeintidos.run();break;
                case 23:EjercicioVeintitres.run();break;
                case 24:EjercicioVeinticuatro.run();break;
                case 25:EjercicioVeinticinco.run();break;
                case 26:EjercicioVeintiseis.run();break;
                case 27:EjercicioVeintisiete.run();break;
                case 28:EjercicioVeintiocho.run();break;
                case 29:EjercicioVeintinueve.run();break;
                case 30:EjercicioTreinta.run();break;
                default:System.out.println("Esa opcion no esta disponible");break;
            }
        } while (opcion != 0);
    }
}
