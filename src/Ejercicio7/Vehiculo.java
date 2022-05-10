package Ejercicio7;

import java.util.*;

public class Vehiculo {

    private String placa;
    private String marca;

    Persona cliente = new Persona();
    Scanner lectura = new Scanner(System.in);
    Scanner dato = new Scanner(System.in);
    Menu menu1 = new Menu();
    boolean condicion;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean condicionIngresar(List listaVehiculos) {
        System.out.println("Ingrese la placa del vehiculo");
        this.placa = dato.nextLine();

        if (listaVehiculos.contains(placa)) {
            System.out.println("La placa ingresada pertenece a un vehiculo que esta en el parqueadero");
            System.out.println("\nIngrese una placa diferente a " + this.placa);
            this.placa = dato.nextLine();
            if (listaVehiculos.contains(placa)) {
                System.out.println("La placa ingresada pertenece a un vehiculo que esta en el parqueadero");
                System.out.println("");
                return true;
            }
            listaVehiculos.add(this.placa);
            ingresarVehiculo(listaVehiculos);
            return true;
        }
        listaVehiculos.add(this.placa);
        ingresarVehiculo(listaVehiculos);
        return true;
    }

    public void ingresarVehiculo(List listaVehiculos) {

        System.out.println("\nIngrese la marca del vehiculo");
        this.marca = dato.nextLine();
        listaVehiculos.add(this.marca);
        System.out.println("\nIngrese el nombre completo del cliente");
        String nombre = dato.nextLine();
        cliente.setNombre(nombre);
        listaVehiculos.add(cliente.getNombre());
        System.out.println("\nIngrese su teléfono");
        String telefono = dato.nextLine();
        cliente.setTelefono(telefono);
        listaVehiculos.add(cliente.getTelefono());
        System.out.println("\nEl ingreso del vehiculo se realizo correctamente\n");
    }

    public boolean condicionVehiculo(List listaVehiculo, int vehiculo) {

        if (listaVehiculo.isEmpty()) {

            System.out.println("El vehiculo N° " + vehiculo + " no ha ingresado al parqueadero");
            System.out.println("");
            return false;
        }
        System.out.println("Los datos del vehiculo N° " + vehiculo + " son los siguientes:");
        for (int i = 0; i < 4; i++) {
            System.out.print(listaVehiculo.get(i) + " ");
        }
        System.out.println("");
        return true;
    }

    public boolean condicionEliminar(List listaVehiculo, int vehiculo) {

        if (listaVehiculo.isEmpty()) {

            System.out.println("El vehiculo N° " + vehiculo + "  no ha ingresado al parqueadero");
            System.out.println("");
            return false;
        }
        for (int i = 0; i < 4; i++) {
            listaVehiculo.removeAll(listaVehiculo);
        }
        System.out.print("El vehiculo N° " + vehiculo + " se ha retirado correctamente");
        System.out.println("");
        return true;
    }

    public void buscarVehiculo(List listaVehiculo1, List listaVehiculo2, List listaVehiculo3, List listaVehiculo4, List listaVehiculo5) {

    System.out.println("\nElija que vehiculo desea consultar");
    System.out.println("1. Vehiculo N°1");
    System.out.println("2. Vehiculo N°2");
    System.out.println("3. Vehiculo N°3");
    System.out.println("4. Vehiculo N°4");
    System.out.println("5. Vehiculo N°5");
    int vehiculo = lectura.nextInt();
    System.out.println("");

    switch (vehiculo) {

        case 1:
            condicion = condicionVehiculo(listaVehiculo1, vehiculo);
            break;

        case 2:
            condicion = condicionVehiculo(listaVehiculo2, vehiculo);
            break;

        case 3:
            condicion = condicionVehiculo(listaVehiculo3, vehiculo);
            break;

        case 4:
            condicion = condicionVehiculo(listaVehiculo4, vehiculo);
            break;

        case 5:
            condicion = condicionVehiculo(listaVehiculo5, vehiculo);
            break;
    }
    }

    public void retirarVehiculo(List listaVehiculo1, List listaVehiculo2, List listaVehiculo3, List listaVehiculo4, List listaVehiculo5) {

        System.out.println("\nElija el numero del estacionamiento del vehiculo a retirar");
        System.out.println("1. Vehiculo N°1");
        System.out.println("2. Vehiculo N°2");
        System.out.println("3. Vehiculo N°3");
        System.out.println("4. Vehiculo N°4");
        System.out.println("5. Vehiculo N°5");
        int vehiculo = lectura.nextInt();
        System.out.println("");

        switch (vehiculo) {

            case 1:
                condicion = condicionEliminar(listaVehiculo1, vehiculo);
                break;

            case 2:

                condicion = condicionEliminar(listaVehiculo2, vehiculo);
                break;

            case 3:
                condicion = condicionEliminar(listaVehiculo3, vehiculo);
                break;

            case 4:
                condicion = condicionEliminar(listaVehiculo4, vehiculo);
                break;

            case 5:
                condicion = condicionEliminar(listaVehiculo5, vehiculo);
                break;
        }

    }

}
