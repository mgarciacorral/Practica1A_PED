import EstructurasDatos.Lineales.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu{


    public Menu(){
    }


    public void mostrarMenu(){
        System.out.println("\tMENÚ LEGConUltimo");
        System.out.println("1.-Crear lista de elementos enteros");
        System.out.println("2.-Añadir elementos a la lista");
        System.out.println("3.-Listado directo de elementos(iterativos)");
        System.out.println("4.-Listado inverso de elementos(recursivos)");
        System.out.println("6.-Listado inverso de elementos(iterativos)");
        System.out.println("7.-Listado inverso de elementos(recursivos)");
        System.out.println("0.-Salir");
    }

    public static void crearLista(){

        LEG lista = new LEGConUltimo<Integer>();
        System.out.println("**LEGConUltimo vacía creada**");
        pulsaIntro();


    }

    public static void pulsaIntro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pulse enter para continuar...");
        scanner.nextLine();
        scanner.close();
    }

    /*public static void añadirElementos(E elemento){

        System.out.println("\tAÑADIR ELEMENTOS A LA LISTA");
        System.out.println("Introduzca claves (-1 para terminar):");
        Scanner scanner = new Scanner(System.in);
        int clave = scanner.nextInt();
        while (clave != -1)
        {
            lista.append(clave);
            clave = scanner.nextInt();
        }
    }*/
}
