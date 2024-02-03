package edu.upvictoria.fpoo;

// import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;
// import edu.upvictoria.fpoo.*;

import edu.upvictoria.fpoo.EstructurasSelectivas.Menu2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Mando llamar una funcion que ejecuta un menu, declarada mas abajo
        try {
            Menu();
        }catch (Exception e){
            System.out.println("Ha ocurrido un error");
        }
    }
    //Creo una funcion para que ejecute un  menu
    public static void Menu() throws Exception {
        int opcion;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("A donde desea ir?\n[1]Ejercicios Selectivas\n[5]SALIR");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1: Menu2.run();break;
                case 5:break;
                default:System.out.println("Esa opcion no esta disponible");
            }
        } while (opcion != 5);
    }
}