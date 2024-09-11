package negocio;
import java.util.List;
public class TiendaDeRegalos{
    private String nombre;
    private String direccion;
    private Inventario inventario;

    public TiendaDeRegalos(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new Inventario();
    }

    public void presentarse() {
        System.out.println("Bienvenido a " + nombre + " ubicada en " + direccion);
    }

    public void cumplirAños() {
        System.out.println(nombre + " está celebrando su aniversario!");
    }

    public void agregarProducto(Producto producto) {
        inventario.agregarProducto(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void eliminarProducto(String nombreProducto) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            inventario.eliminarProducto(producto);
            System.out.println("Producto eliminado: " + nombreProducto);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

    public Producto buscarProducto(String nombreProducto) {
        List<Producto> productos = inventario.getProductos();
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return producto;
            }
        }
        return null;
    }

    public void listarProductos() {
        List<Producto> productos = inventario.getProductos();
        System.out.println("Productos en inventario:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
        }
    }

    public void venderProducto(String nombreProducto) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            inventario.eliminarProducto(producto);
            System.out.println("Producto vendido: " + nombreProducto);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }

    public void actualizarPrecio(String nombreProducto, double nuevoPrecio) {
        Producto producto = buscarProducto(nombreProducto);
        if (producto != null) {
            producto.setPrecio(nuevoPrecio);
            System.out.println("Precio actualizado para " + nombreProducto + ": $" + nuevoPrecio);
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }
}