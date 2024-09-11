package negocio;

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
}