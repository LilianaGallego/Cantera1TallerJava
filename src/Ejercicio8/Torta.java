package Ejercicio8;

import java.util.*;
import java.util.Map.Entry;

public class Torta {

    private String sabor;
    private String decoracion;
    private int disponibilidad;
    private String porciones;

    public Torta() {
    }

    public Torta(String sabor, String decoracion, int disponibilidad, String porciones) {
        this.sabor = sabor;
        this.decoracion = decoracion;
        this.disponibilidad = disponibilidad;
        this.porciones = porciones;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the decoracion
     */
    public String getDecoracion() {
        return decoracion;
    }

    /**
     * @param decoracion the decoracion to set
     */
    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    /**
     * @return the disponibilidad
     */
    public int getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @return the porciones
     */
    public String getPorciones() {
        return porciones;
    }

    /**
     * @param porciones the porciones to set
     */
    public void setPorciones(String porciones) {
        this.porciones = porciones;
    }

    @Override
    public String toString() {
        return "|    " + this.disponibilidad + "    " + "|" + this.sabor + " |" + this.decoracion + "|    " + this.porciones + "   |";

    }

    public void mostrarTortas(Map<Integer, Torta> tortas) {
        System.out.println(" _________________________________________________");
        System.out.println("|OPCION|DISPONIBLE|  SABOR   |DECORACION|PORCIONES|");
        System.out.println(" _________________________________________________");
        for (Entry<Integer, Torta> torta : tortas.entrySet()) {
            Integer clave = torta.getKey();
            Torta valor = torta.getValue();
            System.out.println("|  " + clave + ".  " + valor);
            System.out.println(" _________________________________________________");
        }
    }

}
