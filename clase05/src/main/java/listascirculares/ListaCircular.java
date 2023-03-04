
package listascirculares;
public class ListaCircular
{

public Nodo inicio;
public Nodo ultimo;
public int contador =0;

public void ListaCircular()
{
    inicio = null;
    ultimo = null;
    contador =0;

}

public boolean esVacia()
{
    return inicio==null;
}

public int getContador()
{
    return contador;
}

public void AgregarFinal(int valor)
{
    Nodo nuevo = new Nodo();
    nuevo.setValor(2);
    if(esVacia())
    {
        inicio = nuevo;
        ultimo = nuevo;
        ultimo.setNodo(nuevo);

    }
    else{

        ultimo.setNodo(nuevo);
        nuevo.setNodo(inicio);
        ultimo = nuevo;

    }

    this.contador ++;


}

    public void listar()
    {

        if(!esVacia())
        {
            Nodo temporal = inicio;
            int i=0;
             

             while(temporal.getNodo() !=inicio)
             {
                 System.out.print("-->"+temporal.getValor());
                 temporal = temporal.getNodo();
                 i++;
             }
             System.out.print("->null");

        }
        else
        {
            System.out.println("No hay datos para mostrar ");

        }
        


    }
}
