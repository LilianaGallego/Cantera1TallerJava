package Ejercicio1;

public class Persona {

    private int edad;

    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mayorEdad(int edad) {
        if (this.edad >= 18) {
            System.out.println("Usted es mayor de edad");
        };
    }
}
