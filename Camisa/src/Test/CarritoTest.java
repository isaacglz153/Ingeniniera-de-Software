/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author isaac
 */
public class CarritoTest {
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author isaac
 */
public class CarritoTest{
      @Test
    public void testCobroSinDescuento() {
        // Crea el carrito de compras y agrega dos camisas
        Carrito carrito = new Carrito();
        carrito.agregarCamisas(new Camisa(100, "corta", "algodón"));
        carrito.agregarCamisas(new Camisa(80, "larga", "lino"));

        // Verifica que el cobro total sea igual a la suma de los precios
        assertEquals(180.0f, carrito.Cobro(), 0.0f);
    }

    @Test
    public void testCobroConDescuento() {
        // Crea el carrito de compras y agrega cinco camisas
        Carrito carrito = new Carrito();
        carrito.agregarCamisas(new Camisa(100, "corta", "algodón"));
        carrito.agregarCamisas(new Camisa(80, "larga", "lino"));
        carrito.agregarCamisas(new Camisa(120, "corta", "seda"));
        carrito.agregarCamisas(new Camisa(90, "larga", "algodón"));
        carrito.agregarCamisas(new Camisa(100, "corta", "lino"));

        // Verifica que el cobro total tenga el descuento del 5%
        assertEquals(465.5f, carrito.Cobro(), 0.0f);
    }

    @Test
    public void testCobroConMayorDescuento() {
        // Crea el carrito de compras y agrega ocho camisas
        Carrito carrito = new Carrito();
        carrito.agregarCamisas(new Camisa(100, "corta", "algodón"));
        carrito.agregarCamisas(new Camisa(80, "larga", "lino"));
        carrito.agregarCamisas(new Camisa(120, "corta", "seda"));
        carrito.agregarCamisas(new Camisa(90, "larga", "algodón"));
        carrito.agregarCamisas(new Camisa(100, "corta", "lino"));
        carrito.agregarCamisas(new Camisa(110, "corta", "algodón"));
        carrito.agregarCamisas(new Camisa(95, "larga", "lino"));
        carrito.agregarCamisas(new Camisa(130, "corta", "seda"));

        // Verifica que el cobro total tenga el descuento del 8%
        assertEquals(759.0f, carrito.Cobro(), 0.0f);
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

}
