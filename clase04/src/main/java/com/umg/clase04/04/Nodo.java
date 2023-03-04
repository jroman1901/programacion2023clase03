
public class Nodo {

    public String dato;
    public Nodo izquierda;
    public Nodo derecha;

    public Nodo() {
        this.dato = "";
        izquierda = null;
        derecha = null;

    }

    public Nodo(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return this.dato;

    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setIzquierda(Nodo nodo) {
        this.izquierda = nodo;
    }

    public void setDerecha(Nodo nodo) {
        this.derecha = nodo;
    }

    public void PostOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.println("dato:  " + raiz.getDato());
            PostOrden(raiz.getIzquierda());
            PostOrden(raiz.getDerecha());

        }

    }

}