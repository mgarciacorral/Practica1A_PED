package EstructurasDatos.Lineales;

public class NodoLEG<E>
{
    private NodoLEG<E> siguiente;
    private E elemento;

    public NodoLEG(E elemento)
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

    public NodoLEG<E> getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(NodoLEG<E> siguiente)
    {
        this.siguiente = siguiente;
    }

    public String toStringRecursivo()
    {
        String res = "";
        res = this.elemento.toString() + " ";
        if (this.siguiente != null)
        {
            this.siguiente.toStringRecursivo();
        }

        return res;
    }

    public String toStringInversoRecursivo(String in)
    {
        String res = this.toString()+ " " + in;
        if (this.siguiente != null)
        {
            res = this.siguiente.toStringInversoRecursivo(res);
        }

        return res;
    }
}
