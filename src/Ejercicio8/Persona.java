package Ejercicio8;

import java.util.*;

public class Persona {

    private String nombre;
    private String telefono;
    private String cedula;

    Scanner lectura = new Scanner(System.in);
    Scanner dato = new Scanner(System.in);
    Menu menu1 = new Menu();
    boolean condicion;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
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
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void registrarUsuario(List listaUsuarios) {
        System.out.println("\nIngrese el numero de cedula");
        this.cedula = dato.nextLine();
        listaUsuarios.add(this.cedula);
        System.out.println("\nIngrese el nombre completo del usuario");
        this.nombre = dato.nextLine();
        listaUsuarios.add(this.nombre);
        System.out.println("\nIngrese su teléfono");
        this.telefono = dato.nextLine();
        listaUsuarios.add(this.telefono);
        System.out.println("\n¿Desea realizar la prueba?\n");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcion = lectura.nextInt();
        listaUsuarios.add(opcion);
        System.out.println("Usuario registrado correctamente\n");
    }

    public boolean condicionUsuario(List listaUsuarios, int usuario) {

        if (listaUsuarios.isEmpty()) {
            System.out.println("El usuario N° " + usuario + " no se ha registrado");
            System.out.println("");
            return false;
        }
        System.out.println("El usuario con  los siguientes datos:");
        for (int i = 0; i < 3; i++) {
            System.out.print(listaUsuarios.get(i) + " ");
        }
        System.out.println("");
        if ((int) listaUsuarios.get(3) == 1) {
            System.out.println("Presento la prueba\n");
            listaUsuarios.add("Aprobo");
            return true;
        } else {
            System.out.println("No presento la prueba\n");
            listaUsuarios.add("No aprobo");
        }

        return true;
    }

    public boolean condicionResultado(List listaUsuarios, int usuario) {
        if (listaUsuarios.isEmpty()) {
            System.out.println("El usuario N° " + usuario + " no se ha registrado");
            System.out.println("");
            return false;
        } else {
            if ((String) listaUsuarios.get(4) == "Aprobo") {
                System.out.println("El resultado de la prueba del usuario " + listaUsuarios.get(1) + " es aprobada\n");
                return true;
            } else {
                System.out.println("El resultado de la prueba del usuario " + listaUsuarios.get(1) + " es  No aprobada\n");
                return true;
            }
        }

    }

    public void consultarUsuario(List listaUsuario1, List listaUsuario2, List listaUsuario3, List listaUsuario4, List listaUsuario5, List listaUsuario6, List listaUsuario7, List listaUsuario8) {
        System.out.println("\nElija que usuario desea consultar");
        System.out.println("1. Usuario N°1");
        System.out.println("2. Usuario N°2");
        System.out.println("3. Usuario N°3");
        System.out.println("4. Usuario N°4");
        System.out.println("5. Usuario N°5");
        System.out.println("3. Usuario N°6");
        System.out.println("4. Usuario N°7");
        System.out.println("5. Usuario N°8");
        int usuario = lectura.nextInt();
        System.out.println("");

        switch (usuario) {

            case 1:
                condicion = condicionUsuario(listaUsuario1, usuario);
                break;

            case 2:
                condicion = condicionUsuario(listaUsuario2, usuario);
                break;

            case 3:
                condicion = condicionUsuario(listaUsuario3, usuario);
                break;

            case 4:
                condicion = condicionUsuario(listaUsuario4, usuario);
                break;

            case 5:
                condicion = condicionUsuario(listaUsuario5, usuario);
                break;

            case 6:
                condicion = condicionUsuario(listaUsuario6, usuario);
                break;

            case 7:
                condicion = condicionUsuario(listaUsuario7, usuario);
                break;

            case 8:
                condicion = condicionUsuario(listaUsuario8, usuario);
                break;
        }
    }

    public void resultadoPrueba(List listaUsuario1, List listaUsuario2, List listaUsuario3, List listaUsuario4, List listaUsuario5, List listaUsuario6, List listaUsuario7, List listaUsuario8) {
        System.out.println("\nElija el usuario para consultar el resultado de la prueba");
        System.out.println("1. Usuario N°1");
        System.out.println("2. Usuario N°2");
        System.out.println("3. Usuario N°3");
        System.out.println("4. Usuario N°4");
        System.out.println("5. Usuario N°5");
        System.out.println("3. Usuario N°6");
        System.out.println("4. Usuario N°7");
        System.out.println("5. Usuario N°8");
        int usuario = lectura.nextInt();
        System.out.println("");

        switch (usuario) {

            case 1:
                condicion = condicionResultado(listaUsuario1, usuario);
                break;

            case 2:
                condicion = condicionResultado(listaUsuario2, usuario);
                break;

            case 3:
                condicion = condicionResultado(listaUsuario3, usuario);
                break;

            case 4:
                condicion = condicionResultado(listaUsuario4, usuario);
                break;

            case 5:
                condicion = condicionResultado(listaUsuario5, usuario);
                break;

            case 6:
                condicion = condicionResultado(listaUsuario6, usuario);
                break;

            case 7:
                condicion = condicionResultado(listaUsuario7, usuario);
                break;

            case 8:
                condicion = condicionResultado(listaUsuario8, usuario);
                break;
        }
    }

}
