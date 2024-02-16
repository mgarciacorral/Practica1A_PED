package EstructurasDatos.Lineales.LinkedList;

public class LinkedList<E>
{
    private ElementoLinkedList<E> head;
    private int size;

    public LinkedList()
    {
        this.head = new ElementoLinkedList<E>(null);
        this.size = 0;
    }

    public void add(E elemento)
    {
        ElementoLinkedList<E> nuevo = new ElementoLinkedList<E>(elemento);
        ElementoLinkedList<E> actual = head;
        while (actual.getSiguiente() != null)
        {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nuevo);
        size++;
    }

    public int getSize()
    {
        return size;
    }

    public E get(int index)
    {
        if (index <= 0)
        {
            return null;
        }
        ElementoLinkedList<E> actual = head.getSiguiente();
        for (int i = 1; i < index; i++)
        {
            if (actual.getSiguiente() == null)
            {
                return null;
            }
            actual = actual.getSiguiente();
        }
        return actual.getElemento();
    }

    public boolean remove(int index)
    {
        if (index < 1 || index > size)
        {
            return false;
        }
        ElementoLinkedList<E> actual = head;
        for (int i = 1; i < index; i++)
        {
            if (actual.getSiguiente() == null)
            {
                return false;
            }
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(actual.getSiguiente().getSiguiente());
        size--;
        return true;
    }

    public void printList()
    {
        ElementoLinkedList<E> actual = head.getSiguiente();
        while (actual != null)
        {
            System.out.println(actual.getElemento() + " ");
            actual = actual.getSiguiente();
        }
    }

    public boolean contains(E elemento)
    {
        ElementoLinkedList<E> actual = head.getSiguiente();
        while (actual != null)
        {
            if (actual.getElemento().equals(elemento))
            {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
}
