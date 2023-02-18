/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstract_factory;

/**
 *
 * @author apioriente
 */
public class simple_factory implements figuras_factory {

    @Override
    public Shape CrearCirculo() {
      return new Circulo();
    }

    @Override
    public Shape CrearRectangulo() {
       return new Rectangulo();
    }
    
    
}
