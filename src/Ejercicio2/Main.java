package Ejercicio2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Figura figura = new Figura();
        List asterisco = new ArrayList();

        String linea = "***********";
        String espacio = "           ";
        int n = 9;
        int i = 10;
        int x = 0;

        while (x < i) {
            espacio = espacio.substring(0, n);
            linea = linea.substring(0, x + 1);
            String fila = espacio + linea;
            System.out.println(fila);
            asterisco.add(fila);

            n = n - 1;
            x = x + 1;
            linea = linea + linea;
        }

        figura.crearFigura(asterisco);
    }
}
