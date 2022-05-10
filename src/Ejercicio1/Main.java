package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = lectura.nextLine();
        System.out.println("¿Cuáles son tus apellidos?");
        String apellidos = lectura.nextLine();
        Persona persona1 = new Persona(nombre, apellidos);

        System.out.println(persona1.getNombre() + " " + persona1.getApellidos());
    }
}
