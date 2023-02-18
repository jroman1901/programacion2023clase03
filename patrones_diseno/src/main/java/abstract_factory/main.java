/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author apioriente
 */

/*

El patrón de diseño Abstract Factory (también conocido como Fábrica Abstracta en español)
es un patrón de creación que permite crear objetos relacionados entre sí sin especificar sus clases concretas.
En lugar de eso, se define una interfaz (o clase abstracta) que proporciona un conjunto de métodos para crear objetos relacionados.
Luego, se crean clases concretas que implementan esta interfaz y se encargan de crear los objetos reales.



*/


public class main {
    
    public static void main(String args[])
    {
    simple_factory factory = new simple_factory();
    Shape circulo = factory.CrearCirculo();
    Shape rectangulo = factory.CrearRectangulo();
    circulo.Dibujar();
    rectangulo.Dibujar();
    
    
    }
    
    
}
