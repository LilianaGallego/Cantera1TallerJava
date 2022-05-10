package Ejercicio8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Persona usuario = new Persona();

        List listaUsuario1 = new ArrayList();
        List listaUsuario2 = new ArrayList();
        List listaUsuario3 = new ArrayList();
        List listaUsuario4 = new ArrayList();
        List listaUsuario5 = new ArrayList();
        List listaUsuario6 = new ArrayList();
        List listaUsuario7 = new ArrayList();
        List listaUsuario8 = new ArrayList();

        Menu menu1 = new Menu();
        Scanner lectura = new Scanner(System.in);

        boolean menu = true;

        for (int x = 0; x <= 7; x++) {
            while (menu) {
                menu1.bienvenida();

                int opcion = lectura.nextInt();

                switch (opcion) {
                    case 1:
                        if (x > 7) {
                            System.out.println("No se pueden ingresar mas usuarios");
                            menu = menu1.volverMenu();
                            break;
                        }
                        x++;
                        if (x == 1) {
                            usuario.registrarUsuario(listaUsuario1);
                            menu = menu1.volverMenu();
                        } else if (x == 2) {
                            usuario.registrarUsuario(listaUsuario2);
                            menu = menu1.volverMenu();
                        } else if (x == 3) {
                            usuario.registrarUsuario(listaUsuario3);
                            menu = menu1.volverMenu();
                        } else if (x == 4) {
                            usuario.registrarUsuario(listaUsuario4);
                            menu = menu1.volverMenu();
                        } else if (x == 5) {
                            usuario.registrarUsuario(listaUsuario5);
                            menu = menu1.volverMenu();
                        } else if (x == 6) {
                            usuario.registrarUsuario(listaUsuario6);
                            menu = menu1.volverMenu();
                        } else if (x == 7) {
                            usuario.registrarUsuario(listaUsuario7);
                            menu = menu1.volverMenu();
                        } else if (x == 8) {
                            usuario.registrarUsuario(listaUsuario8);
                            menu = menu1.volverMenu();
                        }
                        break;

                    case 2:
                        usuario.consultarUsuario(listaUsuario1, listaUsuario2, listaUsuario3, listaUsuario4, listaUsuario5, listaUsuario6, listaUsuario7, listaUsuario8);
                        menu = menu1.volverMenu();
                        break;

                    case 3:
                        usuario.resultadoPrueba(listaUsuario1, listaUsuario2, listaUsuario3, listaUsuario4, listaUsuario5, listaUsuario6, listaUsuario7, listaUsuario8);
                        menu = menu1.volverMenu();
                        break;

                    case 4:
                        menu = false;
                }
            }
        }
    }

}
