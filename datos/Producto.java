package datos;
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método que puede ser sobrescrito por las clases derivadas
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precio -= this.precio * (porcentaje / 100);
        }
    }

    //@Override
    //public String toString() {
    //    return nombre + ": $" + precio;
    //}

    // Método que puede ser sobrescrito por las clases derivadas
    public String detallesProducto() {
        return "Producto: " + nombre + ", Precio: $" + precio;
    }

    // Sobrescribir el método detallesProducto
    @Override
    public String toString() {
        return detallesProducto();
    }

}