package Ejercicio9;

import java.util.Scanner;

public class Triangulo {
    private float base;
    private float altura;
    private float areaTriangulo;
    Scanner lectura = new Scanner(System.in);

    public Triangulo() {
    }

    public Triangulo(float base, float altura, float areaRectangulo) {
        this.base = base;
        this.altura = altura;
        this.areaTriangulo = areaRectangulo;
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
    public float getAreaTriangulo() {
        return areaTriangulo;
    }

    /**
     * @param areaRectangulo the areaRectangulo to set
     */
    public void setAreaTriangulo(float areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }
    
    public void areaTriangulo() {
        System.out.println("Ingrese el valor de la base en cm");
        base = lectura.nextFloat();
        System.out.println("Ingrese el valor de la altura en cm");
        altura = lectura.nextFloat();
        areaTriangulo = (base * altura) / 2;
        System.out.println("El area del triangulo es " + areaTriangulo + " centimetros cuadrados");
    }
}
