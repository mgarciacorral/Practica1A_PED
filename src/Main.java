import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args)
    {
        LinkedList<Vehiculo> lista = new LinkedList<Vehiculo>();

        for(int i = 0; i < 10; i++)
        {
            lista.add(new Vehiculo("Volskwagen", 2000 + i));
        }

        lista.printList();
        lista.remove(5);
        lista.printList();
        System.out.println("Elemento en la posicion 5: " + lista.get(5));
    }
}