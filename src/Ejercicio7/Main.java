package Ejercicio7;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo();
        List listaVehiculo1 = new ArrayList();
        List listaVehiculo2 = new ArrayList();
        List listaVehiculo3 = new ArrayList();
        List listaVehiculo4 = new ArrayList();
        List listaVehiculo5 = new ArrayList();

        Menu menu1 = new Menu();
        Scanner lectura = new Scanner(System.in);

        boolean menu = true;

        for (int x = 0; x <= 4; x++) {
            while (menu) {
                menu1.bienvenida();

                int opcion = lectura.nextInt();

                switch (opcion) {
                    case 1:
                        if (x > 4) {
                            System.out.println("No se pueden ingresar mas vehiculos");
                            menu = menu1.volverMenu();
                            break;
                        }
                        x++;
                        if (x == 1) {
                            menu = vehiculo.condicionIngresar(listaVehiculo1);
                        } else if (x == 2) {
                            menu = vehiculo.condicionIngresar(listaVehiculo1);
                        } else if (x == 3) {
                            menu = vehiculo.condicionIngresar(listaVehiculo3);
                        } else if (x == 4) {
                            menu = vehiculo.condicionIngresar(listaVehiculo4);
                        } else if (x == 5) {
                            menu = vehiculo.condicionIngresar(listaVehiculo5);
                        }
                        break;

                    case 2:
                        vehiculo.buscarVehiculo(listaVehiculo1, listaVehiculo2, listaVehiculo3, listaVehiculo4, listaVehiculo5);
                        menu = menu1.volverMenu();
                        break;

                    case 3:
                        vehiculo.retirarVehiculo(listaVehiculo1, listaVehiculo2, listaVehiculo3, listaVehiculo4, listaVehiculo5);
                        menu = menu1.volverMenu();
                        break;

                    case 4:
                        menu = false;
                }
            }
        }
    }
}
