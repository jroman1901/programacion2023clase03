

public class inicio
{
public static void main(String[] args) {

 ListaDoble lista = new ListaDoble();
 lista.Insertar(1);
 lista.Insertar(2);
 lista.Insertar(3);
 lista.Insertar(4); 
 lista.mostrarLista();   
    if(lista.buscarElemento(3))
    {
         System.out.println("encontrado");
     }
    else
    {
       System.out.println("no encontrado");
    }   
    }
}
