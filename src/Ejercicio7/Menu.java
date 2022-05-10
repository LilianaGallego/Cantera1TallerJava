package Ejercicio7;

import java.util.Scanner;

public class Menu {

    Scanner lectura = new Scanner(System.in);

    public void bienvenida() {

        System.out.println("PARQUEADERO EL GUARDIÁN");
        System.out.println("---------------------------------------------");
        
        System.out.println("Por favor elija la opcion de menú que desea");
        System.out.println("1. Ingresar vehiculo");
        System.out.println("2. Buscar vehiculo en parqueadero");
        System.out.println("3. Retirar vehiculo");
        System.out.println("4. Salir del sistema");
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

