package LinkedList;

public class ElementoLinkedList<E>
{
    private ElementoLinkedList<E> siguiente;
    private E elemento;

    public ElementoLinkedList(E elemento)
    {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public E getElemento()
    {
        return elemento;
    }

    public void setElemento(E elemento)
    {
        this.elemento = elemento;
    }

    public ElementoLinkedList<E> getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(ElementoLinkedList<E> siguiente)
    {
        this.siguiente = siguiente;
    }
}
