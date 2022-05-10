package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("¿Cuál es el nombre de tu mascota?");
        String nombreMascota = lectura.nextLine();
        System.out.println("¿Cuál es la edad de tu mascota?");
        String edadMascota = lectura.nextLine();
        System.out.println("¿Que tipo de mascota es?");
        String tipoMascota = lectura.nextLine();
        System.out.println("¿Cuál es tu nombre completo?");
        String propietarioMascota = lectura.nextLine();

        Mascota mascota1 = new Mascota(nombreMascota, edadMascota, tipoMascota, propietarioMascota);

        System.out.println(mascota1.getNombreMascota() + " es un(a) " + mascota1.getTipoMascota() + " el cual tiene " + mascota1.getEdadMascota()
                + " años de edad y " + mascota1.getPropietarioMascota() + " es actualmente su dueño(a)");
    }
}
