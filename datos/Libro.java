package datos;
public class Libro extends Producto {
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro (String nombre, double precio, String titulo, String autor, int numPaginas) {
        super(nombre, precio);
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String detallesProducto() {
        return super.detallesProducto() + ", Autor: " + autor + ", Páginas: " + numPaginas;
    }
    @Override
    public String toString() {
        return detallesProducto();
    }

     // Sobrescribir el método aplicarDescuento
     @Override
     public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 50) { // Descuento máximo del 50% para libros
            super.aplicarDescuento(porcentaje);
            System.out.println("Descuento del " + porcentaje + "% aplicado al libro: " + getNombre());
        } else {
            System.out.println("Descuento no válido para el libro: " + getNombre() + ". El descuento debe ser entre 0% y 50%.");
        }
     }


   
}