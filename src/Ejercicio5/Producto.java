package Ejercicio5;

import java.util.*;

public class Producto {

    private String nombre;
    private String precio;
    boolean menu;

    Menu menu1 = new Menu();
    Scanner lectura = new Scanner(System.in);

    public Producto() {
    }

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void listaproductos(List productosVendidos) {
        System.out.println("Lista de productos:");

        for (int i = 0; i < productosVendidos.size(); i++) {
            System.out.println((i + 1) + ": " + (String) productosVendidos.get(i));
        }
    }

    public void comprarProducto(List producto, List productosVendidos, List precio, int index) {
        if (producto.get(index) == productosVendidos.get(index)) {
            System.out.println("Seleccione la opcion de compra que desea para  el  producto "
                    + productosVendidos.get(index) + " y el costo es " + precio.get(index));
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta");
        } else {
            System.out.println("Lo sentimos en producto " + producto.get(index) + " esta 'AGOTADO'");

            menu = menu1.volverMenu();
        }
    }

    public void opcionCompra(int opcion, List producto, List precio, List productosVendidos, int index) {
        String texto = productosVendidos.get(index) + " 'AGOTADO'";
        productosVendidos.remove(index);
        productosVendidos.add(index, texto);
        if (opcion == 1) {
            System.out.println("Felicitaciones el pago del producto " + producto.get(index)
                    + " fue registrado en efectivo por un valor de " + precio.get(index));
        } else {
            System.out.println("Felicitaciones el pago del producto " + producto.get(index)
                    + " fue registrado con tarjeta por un valor de " + precio.get(index));
        }
    }

    public void devolverProducto(List producto, List productosVendidos, List precio, int index) {
        if (producto.get(index) == productosVendidos.get(index)) {
            System.out.println("El producto " + productosVendidos.get(index) + " no ha sido vendido en este punto");

            menu = menu1.volverMenu();
        } else {
            productosVendidos.remove(index);
            productosVendidos.add(index, producto.get(index));
            System.out.println("El producto a devolver es " + productosVendidos.get(index)
                    + " por favor ingrese la observacion de la devolucion:");
        }

    }
}
