package sistemaventas;

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

    private void agregarProducto() {
        System.out.println("Método para añadir un nuevo producto");
    }

    private void realizarVenta() {
        System.out.println("Método para realizar una nuevo venta");
    }
    
    private void listarProductos(){
        System.out.println("Método para listar productos");
    }
}
