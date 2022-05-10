package Ejercicio10;

import java.util.Scanner;

public class Cuenta {

    private float ingreso;
    private float retiro;
    private float consultaSaldo;
    Persona titular;

    Scanner lectura = new Scanner(System.in);
    Menu menu1 = new Menu();

    public Cuenta() {
    }

    public Cuenta(float ingreso, float retiro, float consultaSaldo) {
        this.ingreso = ingreso;
        this.retiro = retiro;
        this.consultaSaldo = consultaSaldo;
    }

    /**
     * @return the ingreso
     */
    public float getIngreso() {
        return ingreso;
    }

    /**
     * @param ingreso the ingreso to set
     */
    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }

    /**
     * @return the retiro
     */
    public float getRetiro() {
        return retiro;
    }

    /**
     * @param retiro the retiro to set
     */
    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }

    /**
     * @return the consultaSaldo
     */
    public float getConsultaSaldo() {
        return consultaSaldo;
    }

    /**
     * @param consultaSaldo the consultaSaldo to set
     */
    public void setConsultaSaldo(float consultaSaldo) {
        this.consultaSaldo = consultaSaldo;
    }

    public Persona crearTitular(Persona titular) {
        System.out.println("Digite el nombre del titular");
        String nombre = lectura.nextLine();
        titular.setNombre(nombre);
        System.out.println("Digite la cantidad a depositar");
        float deposito = lectura.nextFloat();
        titular.setDeposito(deposito);
        System.out.println("\nBienvenid@ a su cuenta Sr(a) " + titular.getNombre());

        return titular;

    }

    public void realizarIngresos(Persona titular) {
        System.out.println("Digite la cantidad que desea ingresar a su cuenta");
        this.ingreso = lectura.nextFloat();

        if (this.ingreso > 0) {
            this.consultaSaldo = titular.getDeposito() + this.ingreso;
            System.out.println("\nFelicitaciones Sr(a) " + titular.getNombre() + " acaba de depositar: $" + this.ingreso);
            System.out.println("Sr(a) " + titular.getNombre() + " su saldo total es: $" + this.consultaSaldo + "\n");
        } else {
            System.out.println("\nSr(a) " + titular.getNombre() + " su ingreso $" + this.ingreso + " debe ser un valor positivo" + "\n");
        }
    }

    public void realizarRetiros(Persona titular) {
        System.out.println("Digite la cantidad que desea retirar su cuenta");
        this.retiro = lectura.nextFloat();

        if (this.retiro > 0 && this.retiro <= this.consultaSaldo) {
            this.consultaSaldo = this.consultaSaldo - this.retiro;
            System.out.println("\"Sr(a) \" " + titular.getNombre() + " acaba de retirar: $" + this.retiro);
            System.out.println("Sr(a) " + titular.getNombre() + " su saldo total es: $" + this.consultaSaldo);
        } else if (retiro > 0) {
            System.out.println("Sr(a) " + titular.getNombre() + " el valor a retirar: $" + this.retiro + " debe ser un valor positivo");
        }
        System.out.println("Sr(a) " + titular.getNombre() + " el valor a retirar: $" + this.retiro + " es superior a su saldo $" + this.consultaSaldo);
    }

    public void consultarSaldo(Persona titular) {
        System.out.println("Sr(a) " + titular.getNombre() + " su saldo total es: $" + this.consultaSaldo);
    }

    public void ingresarCuenta(Persona titular) {

        System.out.println("\nDigite el nombre del titular");
        String nombre = lectura.nextLine();
        titular.setNombre(nombre);
        this.consultaSaldo = 50000;
        System.out.println("\nBienvenid@ a su cuenta Sr(a) " + titular.getNombre());

    }
}
