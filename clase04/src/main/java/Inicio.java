
import java.util.LinkedList;
import java.util.Queue;

public class Inicio {

  /**
   *
   * @author ING. JOSE VINICIO PEÑA
   */

  public static void main(String[] args) {
    // NODO RAIZ
    Nodo raiz = new Nodo("A");
    // System.out.print(raiz.getDato() + " - ");
    // NODO PADRE
    Nodo B = new Nodo("B");
    Nodo C = new Nodo("C");

    // NODOS HIJOS
    Nodo D = new Nodo("D");
    Nodo E = new Nodo("E");
    Nodo F = new Nodo("F");
    Nodo G = new Nodo("G");

    raiz.setIzquierda(B);
    raiz.setDerecha(C);

    B.setIzquierda(D);
    B.setDerecha(E);

    C.setDerecha(G);
    C.setIzquierda(F);

    System.out.println("recorrido preorden");
    PreOrden(raiz);
    System.out.println("recorrido preorden");
    PostOrden(raiz);

    boolean r = BusquedaAmplitud(raiz, "F");
    if (r == true) {
      System.out.println("Dato encontrado en el arbol");
    } else {
      System.out.println("Lo sentimos no encontramos el resultado");

    }

  }

  private static void PreOrden(Nodo raiz) {

    if (raiz != null) {
      System.out.print(raiz.getDato() + " - ");
      PreOrden(raiz.getIzquierda());
      PreOrden(raiz.getDerecha());

    }

  }

  private static void PostOrden(Nodo raiz) {

    if (raiz == null)
      return;

    PostOrden(raiz.getIzquierda());
    PostOrden(raiz.getDerecha());
    System.out.print(raiz.getDato() + " - ");

  }

  public static boolean BusquedaAmplitud(Nodo raiz, String dato) {
    Queue<Nodo> cola = new LinkedList<Nodo>();
    cola.add(raiz);
    while (cola.size() != 0) {
      Nodo temp = cola.poll();
      System.out.println(temp.getDato());
      if (temp.getDato() == dato) {
        return true;
      } else {
        cola.add(temp.getIzquierda());
        cola.add(temp.getDerecha());
      }

    }
    return false;
  }

}
