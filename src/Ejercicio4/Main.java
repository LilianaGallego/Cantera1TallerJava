package Ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el nombre de una ciudad capital");
        String ciudadCapital = lectura.nextLine();
        System.out.println("Ingrese el país de la ciudad capital");
        String pais = lectura.nextLine();

        Ciudad ciudad1 = new Ciudad(ciudadCapital, pais);

        System.out.println("La ciudad " + ciudad1.getCiudadCapital() + " es la capital del país "
                + ciudad1.getPais());
    }
}
