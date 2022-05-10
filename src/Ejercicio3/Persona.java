package Ejercicio3;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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
            System.out.println(this.nombre + " " + this.apellidos + " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }
    }

    public void menorEdad(int edad) {
        if (this.edad < 18) {
            System.out.println(this.nombre + " " + this.apellidos
                    + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}
