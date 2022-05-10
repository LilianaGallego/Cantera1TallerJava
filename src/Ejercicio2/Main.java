package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = lectura.nextLine();
        System.out.println("¿Cuáles son tus apellidos?");
        String apellidos = lectura.nextLine();
        System.out.println("¿Cuál es tu edad?");
        int edad = lectura.nextInt();
        System.out.println("¿Cuál es tu estatura en metros?");
        float estatura = lectura.nextFloat();
        Persona persona1 = new Persona(nombre, apellidos, edad, estatura);

        System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " " + persona1.getEdad() + persona1.getEstatura());
    }
}
