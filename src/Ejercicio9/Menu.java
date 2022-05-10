package Ejercicio9;

import java.util.Scanner;

public class Menu {

    Scanner lectura = new Scanner(System.in);

    public void menuInicio() {
        System.out.println("Seleccione la figura a la cual quiere calcular el area:");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Trapecio");
        System.out.println("4. Salir del sistema");

    }

    public boolean volverMenu() {
        System.out.println("\nElija una opcion:");
        System.out.println("1. Volver al menu Inicial");
        System.out.println("2. Salir\n");

        int opcion = lectura.nextInt();

        if (opcion == 1) {
            System.out.println("");
            return true;
        } else if (opcion == 2) {
            System.out.println("'GRACIAS POR VISITARNOS, VUELVA PRONTO'");
            return false;
        }
        System.out.println("La opcion no es valida");
        return true;

    }

}
