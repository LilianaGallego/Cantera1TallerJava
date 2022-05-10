package Ejercicio1;

import java.util.*;

public class Arreglo {

    private int dato;
    private int posicion;

    Scanner lectura = new Scanner(System.in);

    public Arreglo() {
    }

    public Arreglo(int dato, int posicion) {
        this.dato = dato;
        this.posicion = posicion;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the posicion
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void agregarDatos(List listaNumeros) {
        this.posicion = 0;
        System.out.println("Ingrese 5 numeros");

        while (posicion <= 4) {
            System.out.println("N°" + (getPosicion() + 1));
            this.dato = lectura.nextInt();
            listaNumeros.add(this.dato);
            System.out.println("");
            this.posicion++;
        }
        System.out.println("\nEsta es la informacion del arreglo:\n");

        for (int i = 0; i < 5; i++) {
            System.out.println("[" + i + "]=" + listaNumeros.get(i));
        }
    }

}
