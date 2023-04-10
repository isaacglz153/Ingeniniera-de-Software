/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ing.soft;

/**
 *
 * @author isaac
 */
public class CamisaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camisa camisabase = new Camisa(190, "Manga Corta", "");
        System.out.println(camisabase);
        
        Camisa CamisaCasual = new Camisa(230, "Manga Larga", "Casual");
        System.out.println(CamisaCasual);
        
        Camisa CamisaFormal = new Camisa(310, "Manga Larga", "Formal");
        System.out.println(CamisaFormal);
        
        
       
    Carrito carrito = new Carrito();

   

    carrito.agregarCamisas(camisabase);
    carrito.agregarCamisas(CamisaCasual);
    carrito.agregarCamisas(CamisaFormal);

    float total = carrito.Cobro();
    System.out.println("El precio total de las camisas en el carrito es: " + total);    
    }
   
}
