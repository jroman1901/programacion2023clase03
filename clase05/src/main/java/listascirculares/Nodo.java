package listascirculares;

public class Nodo{
private int valor;
private Nodo siguiente;
    public Nodo()
    {
        this.valor =0;
        this.siguiente=null;

    }

    public int getValor()
    {
        return this.valor;
    }
    public Nodo getNodo()
    {
        return this.siguiente;
    }

    public void setValor(int valor)
    {
        this.valor = valor;

    }
    public void setNodo(Nodo nodo)
    {
        this.siguiente = nodo;
    }


}