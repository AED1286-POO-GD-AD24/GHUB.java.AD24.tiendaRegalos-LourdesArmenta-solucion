
package negocio;

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
}