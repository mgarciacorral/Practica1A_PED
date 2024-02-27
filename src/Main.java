import EstructurasDatos.Lineales.LEG;
import EstructurasDatos.Lineales.LEGConUltimo;

public class Main {
    public static void main(String[] args)
    {
        LEGConUltimo<Integer> lista = new LEGConUltimo<>();

        for(int i = 0; i < 1; i++)
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