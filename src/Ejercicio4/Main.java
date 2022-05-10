package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        Menu menu1 = new Menu();

        List peliculas = new ArrayList();
        peliculas.add("El señor de los anillos");
        peliculas.add("Anabelle");
        peliculas.add("El aro");
        peliculas.add("Encanto");

        List peliAlquiladas = new ArrayList();

        for (int i = 0; i < peliculas.size(); i++) {
            peliAlquiladas.add(peliculas.get(i));
        }

        Scanner lectura = new Scanner(System.in);
        boolean menu = true;

        while (menu) {
            menu1.bienvenida();
            int opcion = lectura.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    pelicula.listarPeliculas(peliAlquiladas);
                    int alquilar = lectura.nextInt();
                    if (1 <= alquilar && alquilar <= 4) {
                        pelicula.alquilarPelicula(peliculas, peliAlquiladas, alquilar - 1);
                        pelicula.peliculaAlquilada(peliAlquiladas, alquilar - 1);

                        menu = menu1.volver();
                    } else {
                        System.out.println("Elija un numero del 1 al 4");
                    }
                    break;

                case 2:
                    pelicula.listarPeliculas(peliAlquiladas);

                    menu = menu1.volver();

                    break;
                case 3:

                    pelicula.listarPeliculas(peliAlquiladas);
                    int devolver = lectura.nextInt();

                    if (1 <= devolver && devolver <= 4) {
                        pelicula.devolverPelicula(peliculas, peliAlquiladas, devolver - 1);

                        menu = menu1.volver();
                    }
                    break;
            }
        }
    }
}
