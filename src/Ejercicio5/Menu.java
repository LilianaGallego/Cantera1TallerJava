package Ejercicio5;

import java.util.Scanner;

public class Menu {

    Scanner lectura = new Scanner(System.in);

    public void menuInicio() {
        System.out.println("Bienvenidos a la Droguería Mi Salud\n");
        System.out.println("Seleccione la opcion que requiere");
        System.out.println("1. Compra de productos");
        System.out.println("2. Devolución de productos");
        System.out.println("3. Salir");
    }

    public boolean volverMenu() {
        System.out.println("\nElija una opcion:");
        System.out.println("1. Volver al menu anterior");
        System.out.println("2. Salir");
        int opcion = lectura.nextInt();

        if (opcion == 1) {
            return true;
        } else if (opcion == 2) {
            System.out.println("'GRACIAS POR VISITARNOS, VUELVA PRONTO'");
            return false;

        }
        System.out.println("La opcion no es valida");
        return true;
    }
}
