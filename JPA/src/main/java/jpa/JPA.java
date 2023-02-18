/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package jpa;

/**
 *
 * @author apioriente
 */
public class JPA {

    public static void main(String[] args) {
      
        ProductJpaController jpa = new ProductJpaController();
        Product producto = new Product();
        producto.setDescription("hoa");
        producto.setName("nombre");
        producto.setPrice(190L);
        jpa.create(producto);
        
         
        

    }
}
