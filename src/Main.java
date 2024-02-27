import EstructurasDatos.Lineales.LEG;

public class Main {
    public static void main(String[] args)
    {
        LEG<Integer> lista = new LEG<Integer>();

        for(int i = 0; i < 10; i++)
        {
            lista.append(i);
        }

        lista.toStringIterativo();
        lista.remove(0);
        lista.toStringInversoIterativo();
        lista.toStringRecursivo();
        lista.toStringInversoRecursivo();
        System.out.println("Elemento en la posicion 5: " + lista.get(5));
    }
}