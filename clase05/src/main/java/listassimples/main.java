/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listassimples;

/**
 *
 * @author DELL
 */
public class main {
    
    public static void main(String args[])
    {
        System.out.println("iniciando");
        Lista l  = new Lista();
        l.AgregarInicio(10);
       l.AgregarInicio(20);
       l.AgregarInicio(30);
       l.AgregarInicio(40);
       l.InsertarFinal(100);
       
        l.listar();
        
        
        
    }    
}
