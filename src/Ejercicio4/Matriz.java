package Ejercicio4;

import java.util.*;

public class Matriz {

    private int fila;
    private int columna;
    private String cero;
    private String celda;

    public Matriz() {
    }

    public Matriz(int fila, int columna, String cero, String celda) {
        this.fila = fila;
        this.columna = columna;
        this.cero = cero;
        this.celda = celda;
    }

    /**
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the cero
     */
    public String getCero() {
        return cero;
    }

    /**
     * @param cero the cero to set
     */
    public void setCero(String cero) {
        this.cero = cero;
    }

    /**
     * @return the celda
     */
    public String getCelda() {
        return celda;
    }

    /**
     * @param celda the celda to set
     */
    public void setCelda(String celda) {
        this.celda = celda;
    }

    public void crearMatriz(List matriz) {
        this.cero = "0";
        for (int i = 1; i < 21; i++) {
            if (i >= 1 && i < 10) {
                this.celda = this.cero + i;
                matriz.add(this.celda);
            } else if (i <= 20) {
                matriz.add(i);
            }
        }
    }

    public void mostrarMatriz(List matriz) {

        for (this.fila = 0; this.fila < 5; this.fila++) {

            System.out.print(matriz.get(fila) + " ");
        }
        System.out.println("");

        for (this.fila = 9; this.fila >= 5; this.fila--) {

            System.out.print(matriz.get(fila) + " ");
        }
        System.out.println("");

        for (this.fila = 10; this.fila < 15; this.fila++) {

            System.out.print(matriz.get(fila) + " ");
        }
        System.out.println("");

        for (this.fila = 19; this.fila >= 15; this.fila--) {

            System.out.print(matriz.get(fila) + " ");
        }
        System.out.println("");

    }
}
