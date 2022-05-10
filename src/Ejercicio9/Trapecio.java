package Ejercicio9;

import java.util.Scanner;

public class Trapecio {

    private float baseMayor;
    private float baseMenor;
    private float altura;
    private float areaTrapecio;

    Scanner lectura = new Scanner(System.in);

    public Trapecio() {
    }

    public Trapecio(float baseMayor, float baseMenor, float altura, float areaTrapecio) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.areaTrapecio = areaTrapecio;
    }

    /**
     * @return the baseMyor
     */
    public float getBaseMyor() {
        return baseMayor;
    }

    /**
     * @param baseMyor the baseMyor to set
     */
    public void setBaseMayor(float baseMyor) {
        this.baseMayor = baseMyor;
    }

    /**
     * @return the baseMenor
     */
    public float getBaseMenor() {
        return baseMenor;
    }

    /**
     * @param baseMenor the baseMenor to set
     */
    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the areaTrapecio
     */
    public float getAreaTrapecio() {
        return areaTrapecio;
    }

    /**
     * @param areaTrapecio the areaTrapecio to set
     */
    public void setAreaTrapecio(float areaTrapecio) {
        this.areaTrapecio = areaTrapecio;
    }

    public void areaTrapecio() {
        System.out.println("Ingrese el valor de la base en cm");
        baseMayor = lectura.nextFloat();
        System.out.println("Ingrese el valor de la altura en cm");
        baseMenor = lectura.nextFloat();
        System.out.println("Ingrese el valor de la altura en cm");
        altura = lectura.nextFloat();
        areaTrapecio = (baseMayor + baseMenor) * altura / 2;
        System.out.println("El area del rectangulo es " + areaTrapecio + " centimetros cuadrados");
    }

}
