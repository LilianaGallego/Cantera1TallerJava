package Ejercicio10;

import java.util.Scanner;

public class Menu {

    Scanner lectura = new Scanner(System.in);

    public void menuInicio() {
        System.out.println("¡Bienvenid@ a Su Banco Fiel!");
        System.out.println("¿Desea abrir una cuenta?, elija una opcion");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println("3. Salir del sistema");

    }

    public void proceso() {
        System.out.println("\nElija el proceso que desea:");
        System.out.println("1. Realizar ingresos");
        System.out.println("2. Realizar retiros");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Volver al menu Inicial");
        System.out.println("5. Salir");
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

    public void ingresoCuenta() {
        System.out.println("¿Desea ingresar a la cuenta del titular?");
        System.out.println("1. Si");
        System.out.println("2. No");
    }

}
