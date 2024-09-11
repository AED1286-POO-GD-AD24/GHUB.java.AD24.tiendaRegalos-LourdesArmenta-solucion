package negocio;

public class Television extends Producto {
    private String tamaño;
    private String resolución;

    // Ensure Producto class has a matching constructor
    public Television(String nombre, double precio, String tamaño, String resolución) {
        super(nombre, precio);
        this.tamaño = tamaño;
        this.resolución = resolución;
    }
    

    

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getResolución() {
        return resolución;
    }

    public void setResolución(String resolución) {
        this.resolución = resolución;
    }
}