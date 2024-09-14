package datos;

public class Calculadora extends Producto {
    private String tipo;

    public Calculadora(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método que puede ser sobrescrito por las clases derivadas
    public String detallesProducto() {
        return super.detallesProducto() + ", Tipo: " + this.tipo;
       
    }

    // Sobrescribir el método detallesProducto
    @Override
    public String toString() {
        return detallesProducto();
    }

    // Sobrescribir el método aplicarDescuento
    @Override
    public void aplicarDescuento(double porcentaje) {
       if (porcentaje > 0 && porcentaje <= 80) { // Descuento máximo del 50% para libros
           super.aplicarDescuento(porcentaje);
           System.out.println("Descuento del " + porcentaje + "% aplicado al libro: " + getNombre());
       } else {
           System.out.println("Descuento no válido para el libro: " + getNombre() + ". El descuento debe ser entre 0% y 80%.");
       }
    }
}