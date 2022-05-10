package Ejercicio9;

import java.util.Scanner;

public class Rectangulo {

    private float base;
    private float altura;
    private float areaRectangulo;
    Scanner lectura = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura, float areaRectangulo) {
        this.base = base;
        this.altura = altura;
        this.areaRectangulo = areaRectangulo;
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
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
     * @return the areaRectangulo
     */
    public float getAreaRectangulo() {
        return areaRectangulo;
    }

    /**
     * @param areaRectangulo the areaRectangulo to set
     */
    public void setAreaRectangulo(float areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
    }

    public void areaRectangulo() {
        System.out.println("Ingrese el valor de la base en cm");
        base = lectura.nextFloat();
        System.out.println("Ingrese el valor de la altura en cm");
        altura = lectura.nextFloat();
        areaRectangulo = (base * altura);
        System.out.println("El area del rectangulo es " + areaRectangulo + " centimetros cuadrados");
    }
}
