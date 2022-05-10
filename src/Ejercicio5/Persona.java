package Ejercicio5;

public class Persona {

    private String nombre;
    private String saludo;

    public Persona() {
    }

    public Persona(String nombre, String saludo) {
        this.nombre = nombre;
        this.saludo = saludo;
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
     * @return the saludo
     */
    public String getSaludo() {
        return saludo;
    }

    /**
     * @param saludo the saludo to set
     */
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public void saludar() {
        System.out.println("Hola " + this.nombre + " bienvenid@ a nuestro sistema");

    }
}
