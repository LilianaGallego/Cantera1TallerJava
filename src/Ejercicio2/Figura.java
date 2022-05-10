package Ejercicio2;

import java.util.List;

public class Figura {

    private String asterisco;
    private String espacio;
    private String fila;

    public Figura() {
    }

    public Figura(String asterisco, String espacio, String fila) {
        this.asterisco = asterisco;
        this.espacio = espacio;
        this.fila = fila;
    }

    /**
     * @return the asterisco
     */
    public String getAsterisco() {
        return asterisco;
    }

    /**
     * @param asterisco the asterisco to set
     */
    public void setAsterisco(String asterisco) {
        this.asterisco = asterisco;
    }

    /**
     * @return the espacio
     */
    public String getEspacio() {
        return espacio;
    }

    /**
     * @param espacio the espacio to set
     */
    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    /**
     * @return the fila
     */
    public String getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(String fila) {
        this.fila = fila;
    }

    public void crearFigura(List asterisco) {

        for (int i = 0; i < asterisco.size(); i++) {
            System.out.println((String) asterisco.get(i));

        }
    }

}
