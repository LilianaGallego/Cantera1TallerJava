package Ejercicio9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu1 = new Menu();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Trapecio trapecio = new Trapecio();

        Scanner lectura = new Scanner(System.in);

        boolean menu = true;

        while (menu) {
            menu1.menuInicio();

            int opcion = lectura.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    rectangulo.areaRectangulo();
                    menu = menu1.volverMenu();
                    break;

                case 2:
                    triangulo.areaTriangulo();
                    menu = menu1.volverMenu();
                    break;

                case 3:
                    trapecio.areaTrapecio();
                    menu = menu1.volverMenu();
                    break;

                case 4:
                    System.out.println("'GRACIAS POR VISITARNOS, VUELVA PRONTO'");
                    menu = false;
                    break;

            }
        }
    }
}
