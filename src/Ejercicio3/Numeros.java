package Ejercicio3;

import java.util.*;

public class Numeros {

    private int dato;
    private int control;
    private int limite;

    Scanner lectura = new Scanner(System.in);

    public Numeros() {
    }

    public Numeros(int dato, int control, int limite) {
        this.dato = dato;
        this.control = control;
        this.limite = limite;
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

    /**
     * @return the limite
     */
    public int getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void numerosPrimos(List listaPrimos) {
        this.limite = 1000;
        System.out.println("NUMEROS PRIMOS DEL 1 AL 1000\n");
        for (int i = 1; i < limite; i++) {
            this.control = 1;
            this.dato = 0;

            while (this.control <= i) {
                if (i % this.control == 0) {
                    this.dato++;
                }
                this.control++;
            }
            if (this.dato == 2) {
                listaPrimos.add(i);

            }
        }

    }

    public void mostrarPrimos(List listaPrimos) {

        for (int i = 0; i < listaPrimos.size(); i++) {
            System.out.println(listaPrimos.get(i));
        }
    }

}
