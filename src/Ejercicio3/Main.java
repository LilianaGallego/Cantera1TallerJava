package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Numeros numero = new Numeros();
        List listaNumeros = new ArrayList();

        numero.numerosPrimos(listaNumeros);
        numero.mostrarPrimos(listaNumeros);
        System.out.println("");
    }
}
