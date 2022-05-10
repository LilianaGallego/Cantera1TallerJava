package Ejercicio10;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private float deposito;

    Scanner lectura = new Scanner(System.in);

    public Persona() {
    }

    public Persona(String nombre, float deposito) {
        this.nombre = nombre;
        this.deposito = deposito;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the deposito
     */
    public float getDeposito() {
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

}
