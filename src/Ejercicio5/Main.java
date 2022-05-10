package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Scanner dato = new Scanner(System.in);
        Persona persona = new Persona();
        Menu menu1 = new Menu();
        String nombre = "";

        boolean menu = true;

        while (menu) {
            menu1.bienvenida();
            int opcion = lectura.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("Por favor digite su nombre");
                    nombre = dato.nextLine();
                    persona.setNombre(nombre);

                    menu = menu1.volverMenu();
                    break;

                case 2:
                    if (nombre.isEmpty()) {
                        System.out.println("Debe elegir la opcion captura nombre para saludarlo");
                        menu = menu1.volverMenu();
                        break;
                    } else {
                        persona.saludar();
                        menu = menu1.volverMenu();
                        break;
                    }

                case 3:
                    menu = false;
                    break;
            }
        }

    }

}
