package ui;

import negocio.TiendaDeRegalosService;
import datos.ProductoDAO;
import negocio.Producto;
import negocio.Libro;
import negocio.Celular;
import negocio.Television;
import negocio.Licuadora;
import negocio.Tostadora;
import negocio.Calculadora;

import java.util.Scanner;

public class Menu {
    private TiendaDeRegalosService tiendaService;

    public Menu() {
        ProductoDAO productoDAO = new ProductoDAO(100); // Capacidad del inventario
        this.tiendaService = new TiendaDeRegalosService(productoDAO);
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    tiendaService.presentarse();
                    break;
                case 2:
                    agregarProducto(scanner);
                    break;
                case 3:
                    eliminarProducto(scanner);
                    break;
                case 4:
                    listarProductos();
                    break;
                case 5:
                    venderProducto(scanner);
                    break;
                case 6:
                    actualizarPrecio(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menú de Tienda de Regalos ---");
        System.out.println("1. Presentarse");
        System.out.println("2. Agregar Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Listar Productos");
        System.out.println("5. Vender Producto");
        System.out.println("6. Actualizar Precio");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void agregarProducto(Scanner scanner) {
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Libro");
        System.out.println("2. Celular");
        System.out.println("3. Televisor");
        System.out.println("4. Licuadora");
        System.out.println("5. Tostadora");
        System.out.println("6. Calculadora");
        System.out.print("Ingrese el número correspondiente al tipo de producto: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        Producto producto = null;

        switch (tipoProducto) {
            case 1:
                System.out.print("Ingrese el autor del libro: ");
                String autor = scanner.nextLine();
                System.out.print("Ingrese el número de páginas del libro: ");
                int paginas = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                producto = new Libro(nombre, precio, autor, paginas);
                break;
            case 2:
                System.out.print("Ingrese la marca del celular: ");
                String marca = scanner.nextLine();
                System.out.print("Ingrese el modelo del celular: ");
                String modelo = scanner.nextLine();
                producto = new Celular(nombre, precio, marca, modelo);
                break;
            case 3:
                System.out.print("Ingrese el tamaño del televisor (en pulgadas): ");
                String tamanio = scanner.nextLine();
                //scanner.nextLine(); // Consumir la nueva línea
                System.out.print("Ingrese la resolución del televisor: ");
                String resolucion = scanner.nextLine();

                producto = new Television(nombre, precio, tamanio, resolucion);
                break;
            case 4:
                System.out.print("Ingrese la potencia de la licuadora (en vatios): ");
                int potencia = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.print("Ingrese la capacidad de la licuadora (en litros): ");
                int capacidad = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                producto = new Licuadora(nombre, precio, potencia, capacidad);
                break;
            case 5:
                System.out.print("Ingrese el número de ranuras de la tostadora: ");
                int ranuras = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                String material = scanner.nextLine();
                producto = new Tostadora(nombre, precio, ranuras, material);
                break;
            case 6:
                System.out.print("Ingrese el tipo de calculadora (científica, básica, etc.): ");
                String tipo = scanner.nextLine();
                producto = new Calculadora(nombre, precio, tipo);
                break;
            default:
                System.out.println("Tipo de producto no válido.");
                return;
    }

    tiendaService.agregarProducto(producto);
    System.out.println("Producto agregado: " + producto.getNombre());
    }

    private void eliminarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();
        tiendaService.eliminarProducto(nombre);
    }

    private void listarProductos() {
        tiendaService.listarProductos();
    }

    private void venderProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a vender: ");
        String nombre = scanner.nextLine();
        tiendaService.venderProducto(nombre);
    }

    private void actualizarPrecio(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo precio del producto: ");
        double nuevoPrecio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        tiendaService.actualizarPrecio(nombre, nuevoPrecio);
    }
}