package EstructurasDatos.Lineales.LinkedList;

import EstructurasDatos.Modelos.LEGConUltimo;

public class LinkedListConUltimo<E> extends LinkedList<E> implements LEGConUltimo<E>
{
    private ElementoLinkedList<E> ultimo;

    public LinkedListConUltimo()
    {
        super();
        this.ultimo = new ElementoLinkedList<E>(null);
    }

    public void append(E elemento)
    {
        ElementoLinkedList<E> nuevo = new ElementoLinkedList<E>(elemento);
        this.ultimo.setSiguiente(nuevo);
        this.ultimo = nuevo;
        size++;
    }

    public E getUltimo()
    {
        return this.ultimo.getElemento();
    }
}
