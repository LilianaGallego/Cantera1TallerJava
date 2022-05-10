package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Por favor ingrese su edad");
        int edad = lectura.nextInt();

        Persona persona1 = new Persona(edad);
        persona1.menorEdad(edad);
    }
}
