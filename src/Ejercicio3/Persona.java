package Ejercicio3;

public class Persona {

    private String nombre;
    private String apellidos;
    private String nombrePadre;
    private String apellidosPadre;
    private String nombreMadre;
    private String apellidosMadre;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String nombrePadre, String apellidosPadre, String nombreMadre, String apellidosMadre) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombrePadre = nombrePadre;
        this.apellidosPadre = apellidosPadre;
        this.nombreMadre = nombreMadre;
        this.apellidosMadre = apellidosMadre;
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the nombrePadre
     */
    public String getNombrePadre() {
        return nombrePadre;
    }

    /**
     * @param nombrePadre the nombrePadre to set
     */
    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    /**
     * @return the apellidosPadre
     */
    public String getApellidosPadre() {
        return apellidosPadre;
    }

    /**
     * @param apellidosPadre the apellidosPadre to set
     */
    public void setApellidosPadre(String apellidosPadre) {
        this.apellidosPadre = apellidosPadre;
    }

    /**
     * @return the nombreMadre
     */
    public String getNombreMadre() {
        return nombreMadre;
    }

    /**
     * @param nombreMadre the nombreMadre to set
     */
    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    /**
     * @return the apellidosMadre
     */
    public String getApellidosMadre() {
        return apellidosMadre;
    }

    /**
     * @param apellidosMadre the apellidosMadre to set
     */
    public void setApellidosMadre(String apellidosMadre) {
        this.apellidosMadre = apellidosMadre;
    }

}
