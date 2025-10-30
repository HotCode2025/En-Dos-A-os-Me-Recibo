

public class Orden {
    private int idOrden; 
    private Producto productos[]; //Declaramos el array
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10; // Constante para el máximo de productos en la orden

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // Inicializamos el array con el máximo de productos permitidos
    }

    public void agregarProductos(Producto producto) {
        // Si el contador de productos es menor que el máximo permitidos, agregamos el producto
        if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos a la orden: "+ Orden.MAX_PRODUCTOS + " productos permitidos.");
        }
    }

    // Método para calcular el total de la orden
    public double calculartotal() {
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("ID Orden: " + idOrden);
        double totalOrden = this.calculartotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Productos de la orden: ");
        for(int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
