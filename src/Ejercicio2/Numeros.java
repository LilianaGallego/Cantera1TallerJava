package Ejercicio2;

import java.util.*;

public class Numeros {

    private int dato;
    private int control;

    Scanner lectura = new Scanner(System.in);

    public Numeros() {
    }

    public Numeros(int dato, int control) {
        this.dato = dato;
        this.control = control;
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
     * @return the control
     */
    public int getControl() {
        return control;
    }

    /**
     * @param control the control to set
     */
    public void setControl(int control) {
        this.control = control;
    }

    public void tipoNumero(List numerosPares, List numerosImpares) {
        this.control = 0;
        System.out.println("Ingrese 20 numeros aleatorios de 0 a 100");

        while (control <= 19) {
            System.out.println("N°" + (getControl() + 1));
            this.dato = lectura.nextInt();
            if (dato >= 0 && dato <= 100) {
                System.out.println("");
                if (dato % 2 == 0) {
                    numerosPares.add(dato);
                } else {
                    numerosImpares.add(dato);
                }
                control++;
            } else {
                System.out.println("Debe ingresar numeros de 0 a 100");
            }
        }

    }

    public void listaNumeros(List listaNumeros) {

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.print(listaNumeros.get(i) + ", ");
        }
    }

}
