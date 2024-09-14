
package datos;

public class Celular extends Producto {
    private String marca;
    private String modelo;

    public Celular(String nombre, double precio, String marca, String modelo) {
        super(nombre, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método que puede ser sobrescrito por las clases derivadas
    public String detallesProducto() {
        return super.detallesProducto() + ", Marca: " + this.marca + ", Modelo: " + this.modelo;
       
    }

    // Sobrescribir el método detallesProducto
    @Override
    public String toString() {
        return detallesProducto();
    }

    // Sobrescribir el método aplicarDescuento
    @Override
    public void aplicarDescuento(double porcentaje) {
       if (porcentaje > 0 && porcentaje <= 20) { // Descuento máximo del 50% para libros
           super.aplicarDescuento(porcentaje);
           System.out.println("Descuento del " + porcentaje + "% aplicado al libro: " + getNombre());
       } else {
           System.out.println("Descuento no válido para el libro: " + getNombre() + ". El descuento debe ser entre 0% y 20%.");
       }
    }
}