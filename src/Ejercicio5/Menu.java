package Ejercicio5;

import java.util.Scanner;

public class Menu {

    Scanner lectura = new Scanner(System.in);

    public void bienvenida() {

        System.out.println("Por favor elija la opcion de menú que desea\n");

        System.out.println("Menú de Usuario");
        System.out.println("1. Captura nombre");
        System.out.println("2. Saludar persona");
        System.out.println("3. Salir del sistema");
    }

    public boolean volverMenu() {
        System.out.println("\nElija una opcion:");
        System.out.println("1. Volver al menu anterior");
        System.out.println("2. Salir\n");

        int opcion = lectura.nextInt();

        if (opcion == 1) {
            System.out.println("");
            return true;
        } else if (opcion == 2) {
            System.out.println("'GRACIAS POR VISITARNOS, VUELVA PRONTO'");
            return false;
        }
        System.out.println("La opcion no es valida\n");
        return true;

    }
}
