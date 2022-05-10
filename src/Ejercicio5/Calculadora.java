package Ejercicio5;

import java.util.Scanner;

public class Calculadora {

    String signo, titulo1, titulo2, linea1, linea2, linea3, espacio, espacio2;
    int fila, columna, resultado;

    Scanner lectura = new Scanner(System.in);

    public Calculadora() {
    }

    public void crearCalculadora() {
        signo = "x";
        linea1 = "|";
        linea2 = " ________________________________________________________________________________________________________________________________________________________________";
        linea3 = " ______________________________________________________________________________________________________________________________________________________________________";
        titulo1 = "               C O L U M N A S            ";
        titulo2 = "FILAS";
        espacio = "                          ";
        espacio2 = "       ";

        System.out.println(espacio2 + linea2);
        System.out.println(espacio2 + linea1 + espacio + espacio2 + espacio + titulo1 + espacio2 + espacio + espacio + linea1);
        System.out.println(espacio2 + linea2);
        System.out.print(espacio2);
        for (int i = 0; i < 10; i++) {
            System.out.print(linea1 + espacio2 + i + espacio2);
        }
        System.out.println(" " + linea1);
        System.out.println(" " + linea3 + linea1);
        System.out.print(linea1);

        int i = 1;

        while (i <= 9) {
            for (fila = i; fila <= 9; fila++) {
                for (columna = 0; columna <= 11; columna++) {

                    for (columna = 0; columna < 1; columna++) {

                        if (fila == 1) {
                            System.out.print("   ");
                        }

                        if (fila == 2 || fila == 8 || fila == 9) {
                            System.out.print(linea1 + "   ");
                        }

                        int j = 0;
                        if (fila == 3) {
                            String letra = titulo2.substring(j, j + 1);
                            System.out.print(linea1 + " " + letra + " ");
                        }
                        j++;
                        if (fila == 4) {
                            String letra = titulo2.substring(j, j + 1);
                            System.out.print(linea1 + " " + letra + " ");
                        }
                        j++;
                        if (fila == 5) {
                            String letra = titulo2.substring(j, j + 1);
                            System.out.print(linea1 + " " + letra + " ");
                        }
                        j++;
                        if (fila == 6) {
                            String letra = titulo2.substring(j, j + 1);
                            System.out.print(linea1 + " " + letra + " ");
                        }
                        j++;
                        if (fila == 7) {
                            String letra = titulo2.substring(j, j + 1);
                            System.out.print(linea1 + " " + letra + " ");
                        }
                    }
                    for (columna = 1; columna < 2; columna++) {

                        System.out.print(" " + linea1 + (fila - 1) + "");
                    }
                    for (columna = 3; columna <= 12; columna++) {
                        System.out.print(linea1 + "       " + fila + signo + (columna - 2) + "     ");
                    }
                    System.out.print(linea1);
                }
                i++;
                System.out.println("");
                System.out.println(linea1 + linea3 + linea1);
            }

        }
        for (fila = 1; fila < 2; fila++) {
            for (columna = 0; columna <= 11; columna++) {
                if (columna == 0 && columna == 10 && columna == 11) {
                    System.out.print(linea1);
                }
                for (columna = 0; columna < 1; columna++) {
                    if (fila == 1) {
                        System.out.print(linea1);
                    }
                }
                for (columna = 1; columna < 2; columna++) {
                    System.out.print("   " + linea1 + (fila + 8) + " ");
                }
                for (columna = 3; columna <= 12; columna++) {
                    System.out.print(linea1 + "      " + (fila + 9) + signo + (columna - 2) + "     ");
                }
                System.out.print(linea1);
            }
            System.out.println("");
        }
        System.out.println(linea1 + linea3 + linea1);

    }

    public void realizarOperacion() {
        System.out.println("\nQue multiplicacion desea ver: ");
        System.out.println("Ingrese el numero de la fila (0-9)");
        fila = lectura.nextInt();
        System.out.println("Ingrese el numero de la columna (0-9)");
        columna = lectura.nextInt();

        if (fila <= 9 && fila >= 0 && columna <= 9 && columna >= 0) {
            resultado = (fila + 1) * (columna + 1);
            System.out.println("\nEl resultado es: " + resultado);
        } else {
            System.out.println("\nDebe ingresar un numero de 0 a 9\n");
        }
    }

}
