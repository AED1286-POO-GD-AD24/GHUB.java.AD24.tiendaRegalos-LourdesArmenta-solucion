package negocio;
public class Libro extends Producto {
    private String autor;
    private int numPaginas;

    public Libro(String nombre, double precio, String autor, int numPaginas) {
        super(nombre, precio);
        this.autor = autor;
        this.numPaginas = numPaginas;
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
}