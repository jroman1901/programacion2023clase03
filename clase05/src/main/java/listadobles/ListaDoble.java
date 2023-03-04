package listadobles;

public class ListaDoble {

    class Nodo {
        int dato;
        Nodo ant;
        Nodo sig;
    }

    private Nodo raiz;

    public ListaDoble() {
        raiz = null;
    }

    public void Insertar(int dato) {
        Nodo nuevo = new Nodo();
        if (raiz == null) {
            nuevo.dato = dato;
            raiz = nuevo;
        } else {
            Nodo rcopia = raiz;
            Nodo p = raiz.sig;
            while (p != null) {
                rcopia = p;
                p = rcopia.sig;
            }
            if (p == null) {
                nuevo.dato = dato;
                nuevo.ant = rcopia;
                nuevo.sig = null;
                rcopia.sig = nuevo;
            }
        }
    }

    public void mostrarLista() {
        if (raiz == null) {
            System.out.println("No hay elementos en la lista");
        } else {
            Nodo p = raiz;
            while (p != null) {
                System.out.println(p.dato);
                p = p.sig;
            }

        }
    }

    public boolean buscarElemento(int dato) {
        Nodo temp = raiz;
        while (temp != null) {
            if (temp.dato == dato) {
                return true;

            }
            temp = temp.sig;

        }
        return false;
    }

}
