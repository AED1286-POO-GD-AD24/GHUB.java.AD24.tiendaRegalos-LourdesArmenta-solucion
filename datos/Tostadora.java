package datos;

public class Tostadora extends Producto {
    private int numRanuras;
    private String color;

    public Tostadora(String nombre, double precio, int numRanuras, String color) {
        super(nombre, precio);
        this.numRanuras = numRanuras;
        this.color = color;
    }

    public int getNumRanuras() {
        return numRanuras;
    }

    public void setNumRanuras(int numRanuras) {
        this.numRanuras = numRanuras;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método que puede ser sobrescrito por las clases derivadas
    public String detallesProducto() {
        return super.detallesProducto() + ", Ranuras: " + this.numRanuras + ", Color: " + this.color;
       
    }

    // Sobrescribir el método detallesProducto
    @Override
    public String toString() {
        return detallesProducto();
    }
    // Sobrescribir el método aplicarDescuento
    @Override
    public void aplicarDescuento(double porcentaje) {
       if (porcentaje > 0 && porcentaje <= 90) { // Descuento máximo del 50% para libros
           super.aplicarDescuento(porcentaje);
           System.out.println("Descuento del " + porcentaje + "% aplicado al libro: " + getNombre());
       } else {
           System.out.println("Descuento no válido para el libro: " + getNombre() + ". El descuento debe ser entre 0% y 90%.");
       }
    }
    
}