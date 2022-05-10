package Ejercicio4;

public class Ciudad {

    private String ciudadCapital;
    private String pais;

    public Ciudad() {
    }

    public Ciudad(String ciudadCapital, String pais) {
        this.ciudadCapital = ciudadCapital;
        this.pais = pais;
    }

    /**
     * @return the ciudadCapital
     */
    public String getCiudadCapital() {
        return ciudadCapital;
    }

    /**
     * @param ciudadCapital the ciudadCapital to set
     */
    public void setCiudadCapital(String ciudadCapital) {
        this.ciudadCapital = ciudadCapital;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

}
