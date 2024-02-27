package EstructurasDatos.Modelos;

public interface I_ListaConUltimo<E>
{
    public void append(E elemento);
    public E get(int index);
    public boolean remove(int index);
    public void add(E elemento);
    public E getUltimo() throws InterruptedException;
    public void toStringIterativo();
}