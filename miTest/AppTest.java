package miTest;

import miPrincipal.*;
import ui.Menu;
import negocio.Producto;
import negocio.Libro;
import negocio.Television;
import negocio.Celular; 
import negocio.Licuadora;
import negocio.Tostadora;   
import negocio.Calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

class AppTest {

    @Test 
    public void testMenuInitialization() {
        Menu menu = new Menu();
        assertNotNull(menu, "El menú debe inicializarse correctamente");
    }

    @Test
    public void testProducto(){
        // Prueba de getNombre
        Producto producto = new Producto("Producto de Prueba", 19.99);
        assertEquals("Producto de Prueba", producto.getNombre(), "El nombre del producto debe ser 'Producto de Prueba'");

        // Prueba de setNombre
        producto.setNombre("Producto de Prueba 2");
        assertEquals("Producto de Prueba 2", producto.getNombre(), "El nombre del producto debe ser 'Producto de Prueba 2' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(19.99, producto.getPrecio(), "El precio del producto debe ser 19.99");

        // Prueba de setPrecio
        producto.setPrecio(14.99);
        assertEquals(14.99, producto.getPrecio(), "El precio del producto debe ser 14.99 después de usar setPrecio");
    }

    @Test
    public void testLibro() {
        // Verificar que Libro es una subclase de Producto
        Libro libro = new Libro("Cien Años de Soledad", 29.99, "Gabriel Garcia Marquez", 500);

        // Prueba de getNombre
        assertEquals("Cien Años de Soledad", libro.getNombre(), "El nombre del libro debe ser 'Cien Años de Soledad'");

        // Prueba de setNombre
        libro.setNombre("El Amor en los Tiempos del Cólera");
        assertEquals("El Amor en los Tiempos del Cólera", libro.getNombre(), "El nombre del libro debe ser 'El Amor en los Tiempos del Cólera' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(29.99, libro.getPrecio(), "El precio del libro debe ser 29.99");

        // Prueba de setPrecio
        libro.setPrecio(19.99);
        assertEquals(19.99, libro.getPrecio(), "El precio del libro debe ser 19.99 después de usar setPrecio");

        // Prueba de getAutor
        assertEquals("Gabriel Garcia Marquez", libro.getAutor(), "El autor del libro debe ser 'Gabriel Garcia Marquez'");

        // Prueba de setAutor
        libro.setAutor("Mario Vargas Llosa");
        assertEquals("Mario Vargas Llosa", libro.getAutor(), "El autor del libro debe ser 'Mario Vargas Llosa' después de usar setAutor");

        // Prueba de getNumPaginas
        assertEquals(500, libro.getNumPaginas(), "El número de páginas del libro debe ser 500");

        // Prueba de setNumPaginas
        libro.setNumPaginas(600);
        assertEquals(600, libro.getNumPaginas(), "El número de páginas del libro debe ser 600 después de usar setNumPaginas");
    }

    @Test
    public void testHerenciaProductoLibro() {
        // Verificar que Libro es una subclase de Producto
        Libro libro = new Libro("Cien Años de Soledad", 29.99, "Gabriel Garcia Marquez", 500);
        assertTrue(libro instanceof Producto, "Libro debe ser una subclase de Producto");

    }

    @Test
    public void testTelevision(){
        // Prueba de getNombre
        Television television = new Television("Samsung", 499.99, "55 pulg", "4K");
        assertEquals("Samsung", television.getNombre(), "El nombre de la televisión debe ser 'Samsung'");

        // Prueba de setNombre
        television.setNombre("LG");
        assertEquals("LG", television.getNombre(), "El nombre de la televisión debe ser 'LG' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(499.99, television.getPrecio(), "El precio de la televisión debe ser 499.99");

        // Prueba de setPrecio
        television.setPrecio(399.99);
        assertEquals(399.99, television.getPrecio(), "El precio de la televisión debe ser 399.99 después de usar setPrecio");

        // Prueba de getTamaño
        assertEquals("55 pulg", television.getTamanio(), "El tamaño de la televisión debe ser 55");

        // Prueba de setTamaño
        television.setTamanio("65 pulg");
        assertEquals("65 pulg", television.getTamanio(), "El tamaño de la televisión debe ser 65 después de usar setTamaño");

        // Prueba de getResolucion
        assertEquals("4K", television.getResolucion(), "La resolución de la televisión debe ser '4K'");

        // Prueba de setResolucion
        television.setResolucion("8K");
        assertEquals("8K", television.getResolucion(), "La resolución de la televisión debe ser '8K' después de usar setResolucion");
    }

    @Test
    public void testHerenciaProductoTelevision() {
        // Verificar que Television es una subclase de Producto
        Television television = new Television("Samsung", 499.99, "55 pulg", "4K");
        assertTrue(television instanceof Producto, "Television debe ser una subclase de Producto");

    }

    @Test
    public void testCelular() {
        // Prueba de getNombre
        Celular celular = new Celular("iPhone", 999.99, "Apple", "iOS");
        assertEquals("iPhone", celular.getNombre(), "El nombre del celular debe ser 'iPhone'");

        // Prueba de setNombre
        celular.setNombre("Samsung Galaxy");
        assertEquals("Samsung Galaxy", celular.getNombre(), "El nombre del celular debe ser 'Samsung Galaxy' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(999.99, celular.getPrecio(), "El precio del celular debe ser 999.99");

        // Prueba de setPrecio
        celular.setPrecio(899.99);
        assertEquals(899.99, celular.getPrecio(), "El precio del celular debe ser 899.99 después de usar setPrecio");

        // Prueba de getMarca
        celular.setMarca("Samsung");
        assertEquals("Samsung", celular.getMarca(), "La marca del celular debe ser 'Samsung'");

        // Prueba de setMarca
        celular.setMarca("Apple");
        assertEquals("Apple", celular.getMarca(), "La marca del celular debe ser 'Apple' después de usar setMarca");

        // Prueba de getModelo
        celular.setModelo("Android");
        assertEquals("Android", celular.getModelo(), "El modelo del celular debe ser 'Android'");

    }

    @Test
    public void testHerenciaProductoCelular() {
        // Verificar que Celular es una subclase de Producto
        Celular celular = new Celular("iPhone", 999.99, "Apple", "iOS");
        assertTrue(celular instanceof Producto, "Celular debe ser una subclase de Producto");

    }

    @Test
    public void testLicuadora(){
        // Prueba de getNombre
        Licuadora licuadora = new Licuadora("Oster", 2000.00,600,1);
        assertEquals("Oster", licuadora.getNombre(), "El nombre de la licuadora debe ser 'Oster'");

        // Prueba de setNombre
        licuadora.setNombre("Black & Decker");
        assertEquals("Black & Decker", licuadora.getNombre(), "El nombre de la licuadora debe ser 'Black & Decker' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(2000.00, licuadora.getPrecio(), "El precio de la licuadora debe ser 39.99");

        // Prueba de setPrecio
        licuadora.setPrecio(29.99);
        assertEquals(29.99, licuadora.getPrecio(), "El precio de la licuadora debe ser 29.99 después de usar setPrecio");

        // Prueba de getPotencia
        assertEquals(600, licuadora.getPotencia(), "La potencia de la licuadora debe ser 600");

        // Prueba de setPotencia
        licuadora.setPotencia(750);
        assertEquals(750, licuadora.getPotencia(), "La potencia  de la licuadora debe ser 750 después de usar setPotencia");

        // Prueba de getCapacidad
        assertEquals(1, licuadora.getCapacidad(), "La capacidad de la licuadora debe ser 1");

        // Prueba de setCapacidad
        licuadora.setCapacidad(2);
        assertEquals(2, licuadora.getCapacidad(), "La capacidad de la licuadora debe ser 2 después de usar setCapacidad");
    }

    @Test
    public void testHerenciaProductoLicuadora() {
        // Verificar que Licuadora es una subclase de Producto
        Licuadora licuadora = new Licuadora("Oster", 2000.00,600,1);
        assertTrue(licuadora instanceof Producto, "Licuadora debe ser una subclase de Producto");
    }

    @Test
    public void testTostadora() {
        // Prueba de getNombre
        Tostadora tostadora = new Tostadora("Black & Decker", 29.99,2,"plata");
        assertEquals("Black & Decker", tostadora.getNombre(), "El nombre de la tostadora debe ser 'Black & Decker'");

        // Prueba de setNombre
        tostadora.setNombre("Hamilton Beach");
        assertEquals("Hamilton Beach", tostadora.getNombre(), "El nombre de la tostadora debe ser 'Hamilton Beach' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(29.99, tostadora.getPrecio(), "El precio de la tostadora debe ser 29.99");

        // Prueba de setPrecio
        tostadora.setPrecio(19.99);
        assertEquals(19.99, tostadora.getPrecio(), "El precio de la tostadora debe ser 19.99 después de usar setPrecio");

        // Prueba de getNumRanuras
        assertEquals(2, tostadora.getNumRanuras(), "El número de ranuras de la tostadora debe ser 2");

        // Prueba de setNumRanuras
        tostadora.setNumRanuras(4);
        assertEquals(4, tostadora.getNumRanuras(), "El número de ranuras de la tostadora debe ser 4 después de usar setNumRanuras");

        // Prueba de getColor
        assertEquals("plata", tostadora.getColor(), "El color de la tostadora debe ser 'plata'");

        // Prueba de setColor
        tostadora.setColor("metalizado");
        assertEquals("metalizado", tostadora.getColor(), "El color de la tostadora debe ser 'metalizado' después de usar setColor");    
        
    }

    @Test
    public void testHerenciaProductoTostadora() {
        // Verificar que Tostadora es una subclase de Producto
        Tostadora tostadora = new Tostadora("Black & Decker", 29.99,2,"plata");
        assertTrue(tostadora instanceof Producto, "Tostadora debe ser una subclase de Producto");

    }


    @Test
    public void testCalculadora() {
        // Prueba de getNombre
        Calculadora calculadora = new Calculadora("Casio", 19.99, "científica");
        assertEquals("Casio", calculadora.getNombre(), "El nombre de la calculadora debe ser 'Casio'");

        // Prueba de setNombre
        calculadora.setNombre("Texas Instruments");
        assertEquals("Texas Instruments", calculadora.getNombre(), "El nombre de la calculadora debe ser 'Texas Instruments' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(19.99, calculadora.getPrecio(), "El precio de la calculadora debe ser 19.99");

        // Prueba de setPrecio
        calculadora.setPrecio(14.99);
        assertEquals(14.99, calculadora.getPrecio(), "El precio de la calculadora debe ser 14.99 después de usar setPrecio");

        // Prueba de getTipo
        calculadora.setTipo("gráfica");
        assertEquals("gráfica", calculadora.getTipo(), "El tipo de la calculadora debe ser 'gráfica'");

        // Prueba de setTipo
        calculadora.setTipo("científica");
        assertEquals("científica", calculadora.getTipo(), "El tipo de la calculadora debe ser 'científica' después de usar setTipo");

    }

    @Test
    public void testHerenciaProductoCalculadora() {
        // Verificar que Tostadora es una subclase de Producto
        Calculadora calculadora = new Calculadora("Casio", 19.99, "científica");
        assertTrue(calculadora instanceof Producto, "Calculadora debe ser una subclase de Producto");


    }
}