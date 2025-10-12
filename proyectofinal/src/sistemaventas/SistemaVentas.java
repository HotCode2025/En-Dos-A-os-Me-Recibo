package sistemaventas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 54382
 */
public class SistemaVentas {

    private Inventario inventario;
    private Scanner scanner;

    public SistemaVentas() {
        inventario = new Inventario();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            System.out.println("\n===== MENU SISTEMA DE VENTAS =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Realizar Venta");
            System.out.println("3. Listar Productos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    realizarVenta();
                    break;
                case 3:
                    listarProductos();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);
    }

    //Método para añadir un nuevo producto
    private void agregarProducto() {
        String continuar = "S";
        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Ingrese descripcion del producto: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            inventario.agregarProducto(descripcion, precio);
            System.out.print("¿Desea agregar otro producto? (S/N): ");
            continuar = scanner.nextLine();
        }
    }

    private void realizarVenta() {
        double totalVenta = 0;
        String continuar = "S";
        ArrayList<Producto> productos = new ArrayList<>();
        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Ingrese descripcion del producto a vender: ");
            String descripcionProducto = scanner.nextLine();
            Producto producto = inventario.buscarProducto(descripcionProducto);
            if (producto != null) {
                System.out.print("Ingrese cantidad vendida: ");
                int cantidad = scanner.nextInt();
                producto.setCantidadVendida(cantidad + producto.getCantidadVendida());
                scanner.nextLine();
                productos.add(producto);
            } else {
                System.out.println("El producto no esta disponible.");
            }

            System.out.print("¿Desea vender otro producto? (S/N): ");
            continuar = scanner.nextLine();
        }

        System.out.printf("%-15s %10s %10s %12s%n", "DETALLE", "CANTIDAD", "PRECIO", "SUBTOTAL");
        for (Producto producto : productos) {
            int cantidadVendida = producto.getCantidadVendida(); 
            double subtotal = producto.getPrecio() * cantidadVendida;
            System.out.printf("%-15s %10d %10.2f %12.2f%n",
                    producto.getDescripcion(), cantidadVendida, producto.getPrecio(), subtotal);
            totalVenta = totalVenta + subtotal; 
        }

        System.out.println("=====================================");
        System.out.println("TOTAL DE LA VENTA: $" + totalVenta);
    }

    private void listarProductos() {
        System.out.println("Método para listar productos");
    }
}
