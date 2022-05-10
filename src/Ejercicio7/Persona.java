
package Ejercicio7;

public class Persona {
    private double estatura;
    private double peso;
    private double imc;

    public Persona() {
    }

    public Persona(double estatura, double peso, double imc) {
        this.estatura = estatura;
        this.peso = peso;
        this.imc = imc;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public void calcularImc(double peso, double estatura){
        imc=peso/(Math.pow(estatura, 2));
        this.setImc(imc);
        
        if (this.imc<18.5){
            System.out.println("Su IMC es: " +getImc()+" por lo tanto su estado es bajo peso");
        }
        else if(18.5<= this.imc &&this.imc<=24.9){
            System.out.println("Su IMC es: " +getImc()+"  por lo tanto su estado es peso normal");
        }
        else if(25<= this.imc &&this.imc<=29.9){
            System.out.println("Su IMC es: " +getImc()+"  por lo tanto su estado es sobrepeso");
        }
        else if (this.imc>30){
            System.out.println("Su IMC es: " +getImc()+" por lo tanto su estado es obesidad");
        }
    }
}
