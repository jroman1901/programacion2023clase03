/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.clase05;

/**
 *
 * @author DELL
 */
public class Lista {

    public Nodo inicio;
    public int size;

    public void Lista() {
        inicio = null;
        size = 0;

    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getSize() {
        return size;
    }

    public void AgregarInicio(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (this.esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        }
        size++;
    }

    public void InsertarFinal(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (this.esVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        this.size++;
    }

    public void listar() {
        if (!this.esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            while (aux != null) {
                System.out.print(i + "[" + aux.getValor() + "]" + "->");
                aux = aux.getSiguiente();
                i++;
            }
            System.out.println("null");
        } else {
            System.out.println("La lista esta vacia");
        }

    }

}
