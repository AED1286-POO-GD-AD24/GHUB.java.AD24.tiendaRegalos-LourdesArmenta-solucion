package negocio;

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
    
}