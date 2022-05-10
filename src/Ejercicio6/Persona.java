package Ejercicio6;

import java.util.*;

public class Persona {

    private String nombre;
    private String telefono;
    private String organizacion;

    Scanner dato = new Scanner(System.in);
    Scanner lectura = new Scanner(System.in);
    Menu menu1 = new Menu();
    boolean condicion;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String organizacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.organizacion = organizacion;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the oganizacion
     */
    public String getOrganizacion() {
        return organizacion;
    }

    /**
     * @param organizacion the organizacion to set
     */
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public boolean crearContacto(List listaContactos) {
        System.out.println("\nIngrese su nombe completo");
        this.nombre = dato.nextLine();
        listaContactos.add(this.nombre);
        System.out.println("\nIngrese su teléfono");
        this.telefono = dato.nextLine();

        if (listaContactos.contains(telefono)) {
            System.out.println("Ya existe un contacto con este numero de teléfono");
            System.out.println("\nIngrese un telefono diferente a " + this.telefono);
            this.telefono = dato.nextLine();
            if (listaContactos.contains(telefono)) {
                System.out.println("Ya existe un contacto con este numero de teléfono");
                System.out.println("");
                return true;
            }
            listaContactos.add(this.telefono);
            System.out.println("\nIngrese el nombre de su organización");
            this.organizacion = dato.nextLine();
            listaContactos.add(this.organizacion);
            System.out.println("");

        }
        listaContactos.add(this.telefono);
        System.out.println("\nIngrese el nombre de su organización");
        this.organizacion = dato.nextLine();
        listaContactos.add(this.organizacion);
        System.out.println("\nContacto guardado exitosamente");
        System.out.println("");
        return true;
    }

    public boolean condicionContacto(List listaContacto, int contacto) {

        if (listaContacto.isEmpty()) {

            System.out.println("El contacto N° " + contacto + " no ha sido creado");
            System.out.println("");
            return false;
        }
        System.out.println("Los datos del contacto N° "+ contacto + " son los siguientes:");
        for (int i = 0; i < 3; i++) {
            System.out.print(listaContacto.get(i) + " ");
        }
        System.out.println("");
        return true;
    }

    public boolean condicionEliminar(List listaContacto, int contacto) {

        if (listaContacto.isEmpty()) {

            System.out.println("El contacto N° " + contacto + " no ha sido creado");
            System.out.println("");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            listaContacto.removeAll(listaContacto);
        }
        System.out.print("El contacto N° "+contacto+" eliminado correctamente");
        System.out.println("");
        return true;
    }

    public void consultarContacto(List listaContacto1, List listaContacto2, List listaContacto3) {
        
        System.out.println("\nElija que contacto desea consultar");
        System.out.println("1. Contacto N°1");
        System.out.println("2. Contacto N°2");
        System.out.println("3. Contacto N°3");
        int contacto = lectura.nextInt();
        System.out.println("");

        switch (contacto) {

            case 1:
                condicion = condicionContacto(listaContacto1, contacto);
                break;

            case 2:

                condicion = condicionContacto(listaContacto2, contacto);
                break;

            case 3:
                condicion = condicionContacto(listaContacto3, contacto);
                break;
        }
    }

    public void eliminarContacto(List listaContacto1, List listaContacto2, List listaContacto3) {

        System.out.println("\nElija que contacto desea eliminar");
        System.out.println("1. Contacto N°1");
        System.out.println("2. Contacto N°2");
        System.out.println("3. Contacto N°3");
        int contacto = lectura.nextInt();
        System.out.println("");

        switch (contacto) {

            case 1:
                condicion = condicionEliminar(listaContacto1, contacto);
                break;

            case 2:

                condicion = condicionEliminar(listaContacto2, contacto);
                break;

            case 3:
                condicion = condicionEliminar(listaContacto3, contacto);
                break;
        }

    }
}
