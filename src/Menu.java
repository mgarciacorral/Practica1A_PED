import EstructurasDatos.Lineales.*;
import java.util.Scanner;

public class Menu
{
    LEGConUltimo<Integer> lista;
    public Menu()
    {
        this.lista = new LEGConUltimo<Integer>();
        ejecutar();
    }

    public void ejecutar()
    {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0)
        {
            System.out.println("\t\tMENU\n");
            System.out.println("1. Crear nueva lista de elementos enteros(se borrara la anterior)");
            System.out.println("2. Añadir elementos a la lista");
            System.out.println("3. Listado de elementos directo iterativo");
            System.out.println("4. Listado de elementos directo recursivo");
            System.out.println("5. Listado de elementos inverso iterativo");
            System.out.println("6. Listado de elementos inverso recursivo");
            System.out.println("0. Salir");
            System.out.print("\nIntroduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                    crearLista();
                    break;
                case 2:
                    anadirElementos();
                    break;
                case 3:
                    directoIterativo();
                    break;
                case 4:
                    directoRecursivo();
                    break;
                case 5:
                    inversoIterativo();
                    break;
                case 6:
                    inversoRecursivo();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    private void pulseIntro()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulse intro para continuar");
        sc.nextLine();
    }

    private void crearLista()
    {
        System.out.println("\t\tCREAR LISTA\n");
        lista = new LEGConUltimo<Integer>();
        System.out.println("**Lista creada**\n");
        pulseIntro();
    }

    private void anadirElementos()
    {
        System.out.println("\t\tAÑADIR ELEMENTOS\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce elementos a añadir y -1 para terminar: ");
        int elemento = sc.nextInt();
        while (elemento != -1)
        {
            lista.append(elemento);
            elemento = sc.nextInt();
        }

        System.out.println("Actualmente la lista es: ");
        lista.toStringIterativo();
        System.out.println();
        pulseIntro();
    }

    private void directoIterativo()
    {
        System.out.println("\t\tLISTADO DE ELEMENTOS DIRECTO ITERATIVO\n");
        System.out.print("La lista es: ");
        lista.toStringIterativo();
        System.out.println();
        pulseIntro();
    }

    private void directoRecursivo()
    {
        System.out.println("\t\tLISTADO DE ELEMENTOS DIRECTO RECURSIVO\n");
        System.out.print("La lista es: ");
        lista.toStringRecursivo();
        System.out.println();
        pulseIntro();
    }

    private void inversoIterativo()
    {
        System.out.println("\t\tLISTADO DE ELEMENTOS INVERSO ITERATIVO\n");
        System.out.print("La lista es: ");
        lista.toStringInversoIterativo();
        System.out.println();
        pulseIntro();
    }

    private void inversoRecursivo()
    {
        System.out.println("\t\tLISTADO DE ELEMENTOS INVERSO RECURSIVO\n");
        System.out.print("La lista es: ");
        lista.toStringInversoRecursivo();
        System.out.println();
        pulseIntro();
    }
}
