import EstructurasDeDatos.Lineales.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        LinkedList<Vehiculo> lista = new LinkedList<Vehiculo>();

        for(int i = 0; i < 10; i++)
        {
            lista.append(new Vehiculo("Volskwagen", 2000 + i));
        }

        lista.toString();
        lista.remove(5);
        lista.toString();
        System.out.println("Elemento en la posicion 5: " + lista.get(5));
    }
}