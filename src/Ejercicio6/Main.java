package Ejercicio6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Menu menu1 = new Menu();
        Moto moto = new Moto();

        List placaMotos = new ArrayList();

        List marcaMoto = new ArrayList();
        List dueños = new ArrayList();
        List documentos = new ArrayList();

        Scanner lectura = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            menu1.menuInicio();
            int opcion = lectura.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:

                    moto.ingresarMoto(placaMotos, marcaMoto, dueños, documentos, persona);
                    menu = menu1.volverMenu();
                    break;

                case 2:
                    moto.sacarMoto(placaMotos, marcaMoto, dueños, documentos);
                    menu = menu1.volverMenu();
                    break;
                case 3:
                    moto.arreglarMoto(placaMotos, marcaMoto);
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
