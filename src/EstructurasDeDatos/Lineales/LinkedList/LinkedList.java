package EstructurasDeDatos.Lineales.LinkedList;

import EstructurasDeDatos.Lineales.LinkedList.ElementoLinkedList;

public class LinkedList<E>
{
    protected ElementoLinkedList<E> head;
    protected int size;

    public LinkedList()
    {
        this.head = new ElementoLinkedList<E>(null);
        this.size = 0;
    }

    public void add(E elemento)
    {
        ElementoLinkedList<E> nuevo = new ElementoLinkedList<E>(elemento);
        nuevo.setSiguiente(head.getSiguiente());
        head.setSiguiente(nuevo);
        size++;
    }

    public void append(E elemento)
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
        if (index <= 0 || index >= size)
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

    public void toStringIterativo()
    {
        ElementoLinkedList<E> actual = head.getSiguiente();
        while (actual != null)
        {
            System.out.print(actual.getElemento() + " ");
            actual = actual.getSiguiente();
        }
    }

    public void toStringRecursivo()
    {
        head.toStringRecursivo();
    }

    public void toStringInversoIterativo()
    {
        String resultado = "";
        ElementoLinkedList<E> actual = head.getSiguiente();
        while (actual != null)
        {
            resultado = actual.getElemento() + " " + resultado;
            actual = actual.getSiguiente();
        }
        System.out.println(resultado);
    }

    public void toStringInversoRecursivo()
    {
        System.out.println(head.toStringInversoRecursivo(""));
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
