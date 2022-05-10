package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = lectura.nextLine();
        System.out.println("¿Cuáles son tus apellidos?");
        String apellidos = lectura.nextLine();
        System.out.println("¿Cuál es el nombre de tu padre?");
        String nombrePadre = lectura.nextLine();
        System.out.println("¿Cuáles son los apellidos de tu padre??");
        String apellidosPadre = lectura.nextLine();
        System.out.println("¿Cuál es el nombre de tu madre?");
        String nombreMadre = lectura.nextLine();
        System.out.println("¿Cuáles son los apellidos de tu madre??");
        String apellidosMadre = lectura.nextLine();

        Persona persona1 = new Persona(nombre, apellidos, nombrePadre, apellidosPadre, nombreMadre, apellidosMadre);

        System.out.println("Yo " + persona1.getNombre() + " " + persona1.getApellidos() + " soy hija de "
                + persona1.getNombreMadre() + " " + persona1.getApellidosMadre() + " y " + persona1.getNombrePadre() + " " + persona1.getApellidosPadre());
    }
}
