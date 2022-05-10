package Ejercicio5;

public class Mascota {

    private String nombreMascota;
    private String edadMascota;
    private String tipoMascota;
    private String propietarioMascota;

    public Mascota() {
    }

    public Mascota(String nombreMascota, String edadMascota, String tipoMascota, String propietarioMascota) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
        this.tipoMascota = tipoMascota;
        this.propietarioMascota = propietarioMascota;
    }

    /**
     * @return the nombreMascota
     */
    public String getNombreMascota() {
        return nombreMascota;
    }

    /**
     * @param nombreMascota the nombreMascota to set
     */
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    /**
     * @return the edadMascota
     */
    public String getEdadMascota() {
        return edadMascota;
    }

    /**
     * @param edadMascota the edadMascota to set
     */
    public void setEdadMascota(String edadMascota) {
        this.edadMascota = edadMascota;
    }

    /**
     * @return the tipoMascota
     */
    public String getTipoMascota() {
        return tipoMascota;
    }

    /**
     * @param tipoMascota the tipoMascota to set
     */
    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    /**
     * @return the propietarioMascota
     */
    public String getPropietarioMascota() {
        return propietarioMascota;
    }

    /**
     * @param propietarioMascota the propietarioMascota to set
     */
    public void setPropietarioMascota(String propietarioMascota) {
        this.propietarioMascota = propietarioMascota;
    }

}
