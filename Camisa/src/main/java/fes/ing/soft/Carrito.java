/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ing.soft;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class Carrito {
    private ArrayList<Camisa> camisas;

    public Carrito() {
       camisas = new ArrayList<Camisa>();
    }

    public Carrito(ArrayList<Camisa> camisas) {
        this.camisas = camisas;
    }
    
    public void agregarCamisas(Camisa camisa){
        camisas.add(camisa);
    }
    
    public float Cobro(){
    float total = 0.0f;
    int cantidad = camisas.size();
    if (cantidad <= 2) {
         System.out.println("Descuento no aplicable");
         for (Camisa camisa : camisas) {
              total += camisa.getPrecio();
        }
    }     
    if (cantidad >= 3 && cantidad <= 5) {
        float descuento = 0.05f;
        for (Camisa camisa : camisas) {
            total += camisa.getPrecio();
        }
        total -= total * descuento;
    }    
    if (cantidad > 5) {
        float descuento = 0.08f;
        for (Camisa camisa : camisas) {
            total += camisa.getPrecio();
        }
        total -= total * descuento;
    }
    return total;
}    
     
            
}
