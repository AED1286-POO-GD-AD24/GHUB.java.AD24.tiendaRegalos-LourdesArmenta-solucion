package negocio;
import datos.ProductoDAO;
import negocio.Producto;
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
                System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
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
}