//package Videoteca;

import java.util.Scanner;

public class Videoteca {
    final int PELICULAS = 20;
    int iUltimaPelicula = -1;
    Pelicula[] peliculas = new Pelicula[PELICULAS];

    Scanner sc = new Scanner(System.in);            //Definimos el Scanner global para que sea accesible siempre

    public Videoteca(){

    }


    //Menu de opciones
    protected void menuOpciones(){
        int opcion = -1;
        do{
            System.out.println("11: Añadir un director");           
            System.out.println("12: Borrar un director");
            System.out.println("13: Mostrar todos los directores\n");

            System.out.println("21: Añadir un actor");
            System.out.println("22: Borrar un actor");
            System.out.println("23: Mostrar todos los actores\n");

            System.out.println("31: Añadir una pelicula");
            System.out.println("32: Borrar una pelicula");
            System.out.println("33: Mostrar todas las peliculas\n");
            System.out.println("0: Para salir");


            System.out.println("Elige una opcion: ");
        
            opcion = sc.nextInt();

            //Hacer el menu


        } while(opcion != 0);


        

    }

}
