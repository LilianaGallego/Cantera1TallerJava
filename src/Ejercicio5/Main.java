package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        Scanner lectura = new Scanner(System.in);

        boolean calculadora = true;
        calculadora1.crearCalculadora();
        while (calculadora) {
            calculadora1.realizarOperacion();

            System.out.println("Por favor elija el numero de la opcion que desea");
            System.out.println("1. Realizar otra operación");
            System.out.println("2. Salir del sistema");

            int opcion = lectura.nextInt();

            if (opcion == 1) {
                calculadora = true;
            } else {
                calculadora = false;
            }
        }
    }
}
