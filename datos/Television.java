package datos;

public class Television extends Producto {
    private String tamanio;
    private String resolucion;

    // Ensure Producto class has a matching constructor
    public Television(String nombre, double precio, String tamanio, String resolucion) {
        super(nombre, precio);
        this.tamanio = tamanio;
        this.resolucion = resolucion;
    }
    
    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    // Método que puede ser sobrescrito por las clases derivadas
    public String detallesProducto() {
        return super.detallesProducto() + ", Tamaño: " + this.tamanio + ", Resolución: " + this.resolucion;
       
    }

    // Sobrescribir el método detallesProducto
    @Override
    public String toString() {
        return detallesProducto();
    }

    // Sobrescribir el método aplicarDescuento
    @Override
    public void aplicarDescuento(double porcentaje) {
       if (porcentaje > 0 && porcentaje <= 30) { // Descuento máximo del 50% para libros
           super.aplicarDescuento(porcentaje);
           System.out.println("Descuento del " + porcentaje + "% aplicado al libro: " + getNombre());
       } else {
           System.out.println("Descuento no válido para el libro: " + getNombre() + ". El descuento debe ser entre 0% y 30%.");
       }
    }
}