package datos;
import negocio.Producto;


public class ProductoDAO {
    private Producto[] productos;
    private int numProductos;

    public ProductoDAO(int capacidad) {
        this.productos = new Producto[capacidad];
        this.numProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (numProductos < productos.length) {
            productos[numProductos++] = producto;
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("Inventario lleno, no se puede agregar el producto: " + producto.getNombre());
        }
    }

    public void eliminarProducto(String nombreProducto) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equals(nombreProducto)) {
                productos[i] = productos[--numProductos];
                productos[numProductos] = null;
                System.out.println("Producto eliminado: " + nombreProducto);
                return;
            }
        }
        System.out.println("Producto no encontrado: " + nombreProducto);
    }

    public Producto buscarProducto(String nombreProducto) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equals(nombreProducto)) {
                return productos[i];
            }
        }
        return null;
    }

    public Producto[] listarProductos() {
        Producto[] lista = new Producto[numProductos];
        System.arraycopy(productos, 0, lista, 0, numProductos);
        return lista;
    }

    public void actualizarProducto(Producto producto) {
        // En este ejemplo, no se necesita hacer nada porque estamos usando un arreglo en memoria
        // En una implementación real, aquí se actualizaría el producto en la base de datos
    }
}