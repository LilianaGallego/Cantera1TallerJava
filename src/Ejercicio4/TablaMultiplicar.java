package Ejercicio4;

import java.util.Scanner;

public class TablaMultiplicar {

    private int tabla;
    private int resultado;

    Scanner lectura = new Scanner(System.in);

    public TablaMultiplicar() {
    }

    public TablaMultiplicar(int tabla, int resultado) {
        this.tabla = tabla;
        this.resultado = resultado;
    }

    /**
     * @return the tabla
     */
    public int getTabla() {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(int tabla) {
        this.tabla = tabla;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void multiplicar() {

        System.out.println("Digite  el numero de la tabla de multiplicar");
        this.tabla = lectura.nextInt();

        for (int numero = 1; numero <= 10; numero++) {
            this.resultado = numero * this.tabla;
            System.out.println(numero + " x " + this.tabla + " = " + this.resultado);
        }
    }

}
