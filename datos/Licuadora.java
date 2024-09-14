package datos;

public class Licuadora extends Producto {
    private int potencia;
    private int capacidad;

    public Licuadora(String nombre, double precio, int potencia, int capacidad) {
        super(nombre, precio);
        this.potencia = potencia;
        this.capacidad = capacidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    // Método que puede ser sobrescrito por las clases derivadas
    public String detallesProducto() {
        return super.detallesProducto() + ", Potencia: " + this.potencia + "W, Capacidad: " + this.capacidad + "L";
       
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