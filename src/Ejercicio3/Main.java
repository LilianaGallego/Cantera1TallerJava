package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = lectura.nextLine();
        System.out.println("¿Cuáles son tus apellidos?");
        String apellidos = lectura.nextLine();
        System.out.println("Por favor ingrese su edad");
        int edad = lectura.nextInt();

        Persona persona1 = new Persona(nombre, apellidos, edad);
        persona1.mayorEdad(edad);
        persona1.menorEdad(edad);

    }
}
