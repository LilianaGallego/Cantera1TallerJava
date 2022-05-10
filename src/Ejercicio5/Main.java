package Ejercicio5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Producto producto = new Producto();
        Menu menu1 = new Menu();

        List productos = new ArrayList();
        productos.add("Aspirina");
        productos.add("Ibuprofeno");
        productos.add("Acetaminofen");
        productos.add("Dolex");

        List productosVendidos = new ArrayList();
        for (int i = 0; i < productos.size(); i++) {
            productosVendidos.add(productos.get(i));
        }

        List precio = new ArrayList();
        precio.add("$3000");
        precio.add("$4000");
        precio.add("$2000");
        precio.add("$3000");

        Scanner lectura = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            menu1.menuInicio();
            int opcion = lectura.nextInt();
            System.out.println("");
            switch (opcion) {

                case 1:
                    System.out.println("Elija el producto que desea comprar");
                    producto.listaproductos(productosVendidos);
                    int opcionP = lectura.nextInt();
                    System.out.println("");

                    if (1 <= opcionP && opcionP <= 4) {
                        producto.comprarProducto(productosVendidos, productos, precio, opcionP - 1);
                        int opcionC = lectura.nextInt();
                        producto.opcionCompra(opcionC, productos, precio, productosVendidos, opcionC - 1);
                        menu = menu1.volverMenu();
                    }
                    break;

                case 2:
                    System.out.println("Elija el producto que desea devolver");
                    producto.listaproductos(productos);
                    int opcionD = lectura.nextInt();
                    System.out.println("");

                    if (1 <= opcionD && opcionD <= 4) {
                        producto.devolverProducto(productos, productosVendidos, precio, opcionD - 1);
                        String observacion = texto.nextLine();
                        System.out.println("\nNovedad registrada correctamente\n");

                        menu = menu1.volverMenu();
                    }
                    break;

                case 3:
                    System.out.println("'GRACIAS POR VISITARNOS, VUELVA PRONTO'");
                    menu = false;

            }
        }
    }

}
