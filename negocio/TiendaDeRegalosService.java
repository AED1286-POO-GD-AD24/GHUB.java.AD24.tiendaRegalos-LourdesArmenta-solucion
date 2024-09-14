package negocio;
import datos.ProductoDAO;
import datos.Producto;
import datos.Libro;
import datos.Celular;
import datos.Television;
import datos.Licuadora;
import datos.Tostadora;
import datos.Calculadora;
public class TiendaDeRegalosService {
    private ProductoDAO productoDAO;

    public TiendaDeRegalosService(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    public void presentarse() {
        System.out.println("Bienvenido a la Tienda de Regalos");
    }

    public void agregarProducto(Producto producto) {
        productoDAO.agregarProducto(producto);
    }

    public void eliminarProducto(String nombreProducto) {
        productoDAO.eliminarProducto(nombreProducto);
    }

    public Producto buscarProducto(String nombreProducto) {
        return productoDAO.buscarProducto(nombreProducto);
    }

    public void listarProductos() {
        Producto[] productos = productoDAO.getProductos();
        System.out.println("Productos en inventario:");
        for (Producto producto : productos) {
            if (producto != null) {
                //System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
                System.out.println(producto);
            }
        }
    }

    public void venderProducto(String nombreProducto) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            eliminarProducto(nombreProducto);
            System.out.println("Producto vendido: " + nombreProducto);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

    

    public void actualizarPrecio(String nombreProducto, double nuevoPrecio) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
            productoDAO.actualizarProducto(producto);
            System.out.println("Precio actualizado para " + nombreProducto + ": $" + nuevoPrecio);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }
    public void aplicarDescuento(String nombreProducto, double porcentaje) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            producto.aplicarDescuento(porcentaje);
            productoDAO.actualizarProducto(producto);
            System.out.println("Descuento aplicado a " + nombreProducto + ": " + porcentaje + "%");
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

    public double calcularValorTotalProductos() {
        Producto[] productos = productoDAO.getProductos();
        double total = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }

    public void agregarLibro(String nombre, double precio, String titulo,String autor, int paginas) {
        Libro libro = new Libro(nombre, precio, titulo, autor, paginas);
        productoDAO.agregarProducto(libro);
    }

    public void agregarCelular(String nombre, double precio, String marca, String modelo) {
        Celular celular = new Celular(nombre, precio, marca, modelo);
        productoDAO.agregarProducto(celular);
    }

    public void agregarTelevision(String nombre, double precio, String tamanio, String resolucion) {
        Producto producto = new Television(nombre, precio, tamanio, resolucion);
        productoDAO.agregarProducto(producto);
    }

    public void agregarLicuadora(String nombre, double precio, int potencia, int capacidad) {
        Producto producto = new Licuadora(nombre, precio, potencia, capacidad);
        productoDAO.agregarProducto(producto);
    }

    public void agregarTostadora(String nombre, double precio, int ranuras, String color) {
        Producto producto = new Tostadora(nombre, precio, ranuras, color);
        productoDAO.agregarProducto(producto);
    }

    public void agregarCalculadora(String nombre, double precio, String tipo) {
        Producto producto = new Calculadora(nombre, precio, tipo);
        productoDAO.agregarProducto(producto);
    }

}