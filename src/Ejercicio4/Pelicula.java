package Ejercicio4;

import java.util.List;
import java.util.Scanner;

public class Pelicula {

    private String nombre, costo, disponible, observacion;
    Scanner lectura = new Scanner(System.in);
    Scanner reporte = new Scanner(System.in);
    Menu menu1 = new Menu();
    boolean menu;

    public Pelicula() {
    }

    public Pelicula(String nombre, String costo, String disponible, String observacion) {
        this.nombre = nombre;
        this.costo = costo;
        this.disponible = disponible;
        this.observacion = observacion;
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
     * @return the costo
     */
    public String getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(String costo) {
        this.costo = costo;
    }

    /**
     * @return the disponible
     */
    public String getDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    /**
     * @return the observacion
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * @param observacion the observacion to set
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String valorAPagar() {
        costo = "$10000";

        return costo;
    }

    public String nombrePelicula(List peliAlquiladas, int index) {
        System.out.println((String) peliAlquiladas.get(index));
        nombre = (String) peliAlquiladas.get(index);
        return nombre;
    }

    public void listarPeliculas(List peliAlquiladas) {
        System.out.println("Lista de peliculas:");

        for (int i = 0; i < peliAlquiladas.size(); i++) {
            System.out.println((i + 1) + ": " + (String) peliAlquiladas.get(i));
        }
    }

    public void alquilarPelicula(List peliculas, List peliAlquiladas, int index) {

        if (peliculas.get(index) != peliAlquiladas.get(index)) {
            System.out.println("La pelicula no se puede alquilar porque no esta disponible");
            menu1.volver();

        } else {
            System.out.println("El costo del alquiler de la pelicula '" + peliAlquiladas.get(index)
                    + "' es: " + valorAPagar());
        }
    }

    public void peliculaAlquilada(List peliAlquiladas, int index) {
        String texto = peliAlquiladas.get(index) + ": PELICULA NO DISPONIBLE";
        peliAlquiladas.remove(index);
        peliAlquiladas.add(index, texto);
    }

    public void devolverPelicula(List peliculas, List peliAlquiladas, int index) {

        if (peliculas.get(index) == peliAlquiladas.get(index)) {
            System.out.println("La pelicula " + peliculas.get(index) + " no ha sido alquilada");
        } else {

            peliAlquiladas.remove(index);
            peliAlquiladas.add(index, peliculas.get(index));
            System.out.println("Desea agregar una anotacion en la devolucion de la pelicula");
            System.out.println("1. Si");
            System.out.println("2. No");
            int novedad1 = lectura.nextInt();
            switch (novedad1) {
                case 1:
                    System.out.println("Ingrese la observacion");
                    observacion = reporte.nextLine();

                    break;
                case 2:
                    System.out.println("La pelicula " + peliAlquiladas.get(index) + " devuelta no presenta novedad");
                    break;
            }
        }

    }

}
