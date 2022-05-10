package Ejercicio10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu1 = new Menu();
        Persona persona = new Persona();
        Cuenta cuenta = new Cuenta();
        Scanner lectura = new Scanner(System.in);

        boolean menu = true;
        while (menu) {
            menu1.menuInicio();
            int opcion = lectura.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    cuenta.crearTitular(persona);
                    menu1.proceso();
                    int opcionProceso = lectura.nextInt();
                    System.out.println("");
                    switch (opcionProceso) {
                        case 1:
                            cuenta.realizarIngresos(persona);
                            menu = menu1.volverMenu();
                            break;

                        case 2:
                            cuenta.realizarRetiros(persona);
                            menu = menu1.volverMenu();
                            break;

                        case 3:
                            cuenta.consultarSaldo(persona);
                            menu = menu1.volverMenu();
                            break;

                        case 4:
                            menu = menu1.volverMenu();
                            break;

                        case 5:
                            menu = false;
                            break;
                    }
                    break;

                case 2:
                    menu1.ingresoCuenta();
                    int opcionIngreso = lectura.nextInt();
                    if (opcionIngreso == 1) {
                        cuenta.ingresarCuenta(persona);
                        menu1.proceso();
                        int opcionProceso2 = lectura.nextInt();
                        System.out.println("");
                        switch (opcionProceso2) {
                            case 1:
                                cuenta.realizarIngresos(persona);
                                menu = menu1.volverMenu();
                                break;

                            case 2:
                                cuenta.realizarRetiros(persona);
                                menu = menu1.volverMenu();
                                break;

                            case 3:
                                cuenta.consultarSaldo(persona);
                                menu = menu1.volverMenu();
                                break;

                            case 4:
                                menu = menu1.volverMenu();
                                break;

                            case 5:
                                menu = false;
                                break;
                        }
                    } else if (opcionIngreso == 2) {
                        System.out.println("'GRACIAS POR VISITARNOS, VUELVA PRONTO'");
                        menu = false;
                    }
                    break;

                case 3:
                    menu = false;
                    break;
            }
        }
    }

}
