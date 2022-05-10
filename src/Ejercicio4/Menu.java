package Ejercicio4;

import java.util.Scanner;

public class Menu {

    Scanner lectura = new Scanner(System.in);

    public void bienvenida() {

        System.out.println("Programa para alquilar peliculas");
        System.out.println("Por favor digite su nombre completo");
        String nombre = lectura.nextLine();
        System.out.println("");
        Persona persona1 = new Persona(nombre);

        System.out.println("Buen día, " + persona1.getNombre() + " Por favor elija una opcion");
        System.out.println("1. Alquilar pelicula");
        System.out.println("2. Consultar peliculas disponibles");
        System.out.println("3. Devolver pelicula");

    }

    public void menuAnterior() {

        System.out.println("Por favor elija una opcion");
        System.out.println("1. Alquilar pelicula");
        System.out.println("2. Consultar peliculas disponibles");
        System.out.println("3. Devolver pelicula");

    }

    public boolean volver() {
        System.out.println("\nElija una opcion:");
        System.out.println("1. Volver al inicio");
        System.out.println("2. Volver al menu anterior");
        System.out.println("3. Salir\n");

        int opcionM = lectura.nextInt();
        switch (opcionM) {
            case 1:
                return true;

            case 2:
                System.out.println("");
                menuAnterior();
                break;
            case 3:
                return false;

        }
        System.out.println("La opcion no es valida");
        return true;
    }
}
