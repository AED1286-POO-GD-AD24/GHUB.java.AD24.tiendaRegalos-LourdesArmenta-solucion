package miTest;

import miPrincipal.*;
import ui.Menu;
import negocio.Producto;
import negocio.Libro;
import negocio.Celular; 
import negocio.Tostadora;   
import negocio.Calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test 
    public void testMenuInitialization() {
        Menu menu = new Menu();
        assertNotNull(menu, "El menú debe inicializarse correctamente");
    }

    @Test
    public void testProducto() {
        // Prueba de getNombre
        Producto producto = new Producto("Libro", 29.99);
        assertEquals("Libro", producto.getNombre(), "El nombre del producto debe ser 'Libro'");

        // Prueba de setNombre
        producto.setNombre("Revista");
        assertEquals("Revista", producto.getNombre(), "El nombre del producto debe ser 'Revista' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(29.99, producto.getPrecio(), "El precio del producto debe ser 29.99");

        // Prueba de setPrecio
        producto.setPrecio(19.99);
        assertEquals(19.99, producto.getPrecio(), "El precio del producto debe ser 19.99 después de usar setPrecio");
    }

    @Test
    public void testHerenciaProductoLibro() {
        // Verificar que Libro es una subclase de Producto
        Libro libro = new Libro("Cien Años de Soledad", 39.99);
        assertTrue(libro instanceof Producto, "Libro debe ser una subclase de Producto");

    }

    
    

    @Test
    public void testCelular() {
        // Prueba de getNombre
        Celular celular = new Celular("iPhone", 999.99);
        assertEquals("iPhone", celular.getNombre(), "El nombre del celular debe ser 'iPhone'");

        // Prueba de setNombre
        celular.setNombre("Samsung Galaxy");
        assertEquals("Samsung Galaxy", celular.getNombre(), "El nombre del celular debe ser 'Samsung Galaxy' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(999.99, celular.getPrecio(), "El precio del celular debe ser 999.99");

        // Prueba de setPrecio
        celular.setPrecio(899.99);
        assertEquals(899.99, celular.getPrecio(), "El precio del celular debe ser 899.99 después de usar setPrecio");
    }

    @Test
    public void testTostadora() {
        // Prueba de getNombre
        Tostadora tostadora = new Tostadora("Black & Decker", 29.99);
        assertEquals("Black & Decker", tostadora.getNombre(), "El nombre de la tostadora debe ser 'Black & Decker'");

        // Prueba de setNombre
        tostadora.setNombre("Hamilton Beach");
        assertEquals("Hamilton Beach", tostadora.getNombre(), "El nombre de la tostadora debe ser 'Hamilton Beach' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(29.99, tostadora.getPrecio(), "El precio de la tostadora debe ser 29.99");

        // Prueba de setPrecio
        tostadora.setPrecio(19.99);
        assertEquals(19.99, tostadora.getPrecio(), "El precio de la tostadora debe ser 19.99 después de usar setPrecio");
    }

    @Test
    public void testCalculadora() {
        // Prueba de getNombre
        Calculadora calculadora = new Calculadora("Casio", 19.99);
        assertEquals("Casio", calculadora.getNombre(), "El nombre de la calculadora debe ser 'Casio'");

        // Prueba de setNombre
        calculadora.setNombre("Texas Instruments");
        assertEquals("Texas Instruments", calculadora.getNombre(), "El nombre de la calculadora debe ser 'Texas Instruments' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(19.99, calculadora.getPrecio(), "El precio de la calculadora debe ser 19.99");

        // Prueba de setPrecio
        calculadora.setPrecio(14.99);
        assertEquals(14.99, calculadora.getPrecio(), "El precio de la calculadora debe ser 14.99 después de usar setPrecio");
    }
}