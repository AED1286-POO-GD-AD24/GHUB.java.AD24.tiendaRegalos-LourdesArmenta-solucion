package negocio;

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
}