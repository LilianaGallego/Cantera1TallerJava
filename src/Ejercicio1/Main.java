package Ejercicio1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Figura figura = new Figura();
        List asterisco = new ArrayList();

        String linea = "**********";
        for (int i = 0; i < 11; i++) {

            figura.setAsterisco(linea.substring(0, i));
            asterisco.add(figura.getAsterisco());

        }
        figura.crearFigura(asterisco);
    }
}
