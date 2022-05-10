package Ejercicio8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Torta torta = new Torta();
        Torta torta1 = new Torta("Chocolate", "Cuadrada  ", 10, "10");
        Torta torta2 = new Torta("Chocolate", "Redonda   ", 10, " 8");
        Torta torta3 = new Torta("Chocolate", "Cuadrada  ", 10, "20");
        Torta torta4 = new Torta("Vainilla ", "Cuadrada  ", 10, "10");
        Torta torta5 = new Torta("Vainilla ", "Redonda   ", 10, " 8");
        Torta torta6 = new Torta("Vainilla ", "Cuadrada  ", 10, "20");

        int cantidadInicial = 60;
        Menu menu1 = new Menu();
        Scanner lectura = new Scanner(System.in);
        //List saborTorta=new ArrayList();
        //List porcionesTorta=new ArrayList();
        //List decoracionTorta=new ArrayList();

        //Creación del diccionario 
        Map<Integer, Torta> tortas = new TreeMap<Integer, Torta>();

        tortas.put(1, torta1);
        tortas.put(2, torta2);
        tortas.put(3, torta3);
        tortas.put(4, torta4);
        tortas.put(5, torta5);
        tortas.put(6, torta6);

        boolean menu = true;

        while (menu) {
            menu1.menuInicio();
            int opcion = lectura.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:

                    torta.mostrarTortas(tortas);
                    int opcionTorta = lectura.nextInt();
                    if (1 <= opcionTorta && opcionTorta <= 8) {
                        switch (opcionTorta) {
                            case 1:

                                int nuevaCantidad = torta1.getDisponibilidad() - 1;
                                torta1 = new Torta("Chocolate", "Cuadrada  ", nuevaCantidad, "10");
                                tortas.put(opcionTorta, torta1);
                                System.out.println("");
                                menu = menu1.volverMenu();
                                break;

                            case 2:
                                int nuevaCantidad2 = torta2.getDisponibilidad() - 1;
                                torta2 = new Torta("Chocolate", "Cuadrada  ", nuevaCantidad2, "10");
                                tortas.put(opcionTorta, torta2);
                                System.out.println("");
                                menu = menu1.volverMenu();
                                break;

                            case 3:
                                int nuevaCantidad3 = torta3.getDisponibilidad() - 1;
                                torta3 = new Torta("Chocolate", "Cuadrada  ", nuevaCantidad3, "10");
                                tortas.put(opcionTorta, torta3);
                                System.out.println("");
                                menu = menu1.volverMenu();
                                break;

                            case 4:

                                int nuevaCantidad4 = torta4.getDisponibilidad() - 1;
                                torta4 = new Torta("Chocolate", "Cuadrada  ", nuevaCantidad4, "10");
                                tortas.put(opcionTorta, torta4);
                                System.out.println("");
                                menu = menu1.volverMenu();
                                break;

                            case 5:
                                int nuevaCantidad5 = torta5.getDisponibilidad() - 1;
                                torta5 = new Torta("Chocolate", "Cuadrada  ", nuevaCantidad5, "10");
                                tortas.put(opcionTorta, torta5);
                                System.out.println("");
                                menu = menu1.volverMenu();
                                break;

                            case 6:
                                int nuevaCantidad6 = torta6.getDisponibilidad() - 1;
                                torta6 = new Torta("Chocolate", "Cuadrada  ", nuevaCantidad6, "10");
                                tortas.put(opcionTorta, torta6);
                                System.out.println("");
                                menu = menu1.volverMenu();
                                break;
                        }
                    }
                    break;

                case 2:
                    torta.mostrarTortas(tortas);
                    System.out.println("");
                    menu = menu1.volverMenu();
                    break;

                case 3:
                    int cantidadFinal = torta1.getDisponibilidad() + torta2.getDisponibilidad()
                            + torta3.getDisponibilidad() + torta4.getDisponibilidad()
                            + torta5.getDisponibilidad() + torta6.getDisponibilidad();
                    int ventas = cantidadInicial - cantidadFinal;
                    System.out.println("Las ventas del dia de hoy son: " + ventas + " torta(s)");
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
