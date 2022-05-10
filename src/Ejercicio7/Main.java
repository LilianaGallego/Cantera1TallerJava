
package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Menu m = new Menu();
        Scanner sc = new Scanner(System.in);
        boolean programa= true;
        while(programa){
            System.out.println("Calcule su IMC");
            System.out.println("Digite su peso en kilogramos");
            double peso = sc.nextDouble();
            System.out.println("Digite su estatura en metros");
            double estatura = sc.nextDouble();
            System.out.println("");

            p.calcularImc(peso, estatura);
            
            m.volver();
            int opcion=sc.nextInt();
            if (opcion==2){
                programa=false;
            }else{
                System.out.println("");
                continue;
                
            }
                
        }  
    }
}
