package Ejercicio2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Numeros numero = new Numeros();
        List numerosPares = new ArrayList();
        List numerosImpares = new ArrayList();

        numero.tipoNumero(numerosPares, numerosImpares);

        System.out.println("\nNumeros Pares");
        numero.listaNumeros(numerosPares);
        System.out.println("");
        System.out.println("\nNumeros Impares");
        numero.listaNumeros(numerosImpares);
        System.out.println("");
    }

}
