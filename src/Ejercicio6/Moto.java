package Ejercicio6;

import java.util.List;
import java.util.Scanner;

public class Moto {

    private String placa;
    private String marca;
    Persona dueño;

    Scanner sc = new Scanner(System.in);
    Scanner num = new Scanner(System.in);

    public Moto() {
    }

    public Moto(String placa, String marca) {
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

    public void ingresarMoto(List placaMotos, List marcaMotos, List dueños, List documentos, Persona dueño) {
        System.out.println("Ingrese la placa de la moto");
        placa = sc.nextLine();

        if (placaMotos.contains(placa)) {
            System.out.println("Ya hay una moto con la placa: " + placa + "\n");

            //m.menuInicio();
        } else {
            placaMotos.add(placa);

            System.out.println("\nIngrese la marca de la moto");
            marca = sc.nextLine();
            marcaMotos.add(marca);

            System.out.println("\nIngrese el nombre completo del propietario");
            String nombre = sc.nextLine();
            dueños.add(nombre);
            dueño.setNombre(nombre);

            System.out.println("\nIngrese el numero de identificación del propietario");
            String documento = sc.nextLine();
            documentos.add(documento);
            dueño.setIdentificacion(documento);

            System.out.println("\nIngresa al taller la moto " + getMarca()
                    + " con placa " + getPlaca() + " se registra su dueño con nombre " + dueño.getNombre() + "\n");
        }
    }

    public void sacarMoto(List placaMotos, List marcaMotos, List dueños, List documentos) {
        System.out.println("Ingrese la placa de la moto");
        String placa2 = sc.nextLine();
        int pos = -1;
        for (int i = 0; i < placaMotos.size(); i++) {
            System.out.println(placaMotos.get(i));
            if (((String) placaMotos.get(i)).equals(placa2)) {
                pos = i;
                System.out.println("La moto con placa " + placaMotos.get(i)
                        + " registrada a nombre de " + dueños.get(i) + " sale del taller");
                placaMotos.remove(i);
                marcaMotos.remove(i);
                dueños.remove(i);
                documentos.remove(i);
                break;
            }

        }
        if (pos == -1) {
            System.out.println("La placa " + placa + " de la moto no esta en el taller");
        }
    }

    public void arreglarMoto(List placaMotos, List marcaMotos) {
        System.out.println("Ingrese la placa de la moto a arreglar");
        String placaA = sc.nextLine();
        int pos = -1;
        for (int i = 0; i < placaMotos.size(); i++) {
            if (((String) placaMotos.get(i)).equals(placaA)) {
                pos = i;
                System.out.println("Ingrese el tipo de arreglo a realizar a la moto "
                        + marcaMotos.get(i) + " con placa " + placaMotos.get(i));
                String arreglo = sc.nextLine();
            }
        }
        if (pos == -1) {
            System.out.println("La moto con placa " + placa + " "
                    + "debe primero ingresar y realizar el respectivo registro para realizarle los arreglos");

        }

    }
}
