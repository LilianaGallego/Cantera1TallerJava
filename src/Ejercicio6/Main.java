package Ejercicio6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Persona contacto = new Persona();
        List listaContacto1 = new ArrayList();
        List listaContacto2 = new ArrayList();
        List listaContacto3 = new ArrayList();

        Menu menu1 = new Menu();
        Scanner lectura = new Scanner(System.in);

        boolean menu = true;

        for (int x = 0; x <= 2; x++) {
            while (menu) {
                menu1.bienvenida();

                int opcion = lectura.nextInt();

                switch (opcion) {
                    case 1:
                        if (x > 2) {
                            System.out.println("No se pueden registrar mas contactos");
                            menu = menu1.volverMenu();
                            break;
                        }
                        x++;
                        if (x == 1) {
                            menu = contacto.crearContacto(listaContacto1);
                        } else if (x == 2) {
                            menu = contacto.crearContacto(listaContacto2);
                        } else if (x == 3) {
                            menu = contacto.crearContacto(listaContacto2);
                        }

                        break;

                    case 2:

                        contacto.consultarContacto(listaContacto1, listaContacto2, listaContacto3);
                        menu = menu1.volverMenu();
                        break;

                    case 3:
                        if (listaContacto1.isEmpty() || listaContacto2.isEmpty() || listaContacto3.isEmpty()) {
                            System.out.println("No hay contactos creados");
                            System.out.println("");
                            menu1.bienvenida();
                        }
                        contacto.eliminarContacto(listaContacto1, listaContacto2, listaContacto3);
                        menu = menu1.volverMenu();
                        break;

                    case 4:
                        menu = false;
                        break;
                }
            }
        }
    }
}
