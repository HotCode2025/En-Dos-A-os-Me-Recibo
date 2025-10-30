public class TestVentas {
    public static void main(String[] args) {
        Producto p1 = new Producto("Pantalón", 9500.00);
        Producto p2 = new Producto("Campera", 29900.00);

        Orden o1 = new Orden();
        // Agregamos los productos
        o1.agregarProductos(p1);
        o1.agregarProductos(p2);
        // Mostramos la orden
        o1.mostrarOrden();
        System.out.println();

        //Tarea: Crear más obj de tipo producto y orden
        Orden o2 = new Orden();
        Producto p3 = new Producto("Zapatos", 75000.00);
        Producto p4 = new Producto("Gorra", 20000.00);
        Producto p5 = new Producto("Collar", 35000.00);
        Producto p6 = new Producto("Buzo", 120000.00);
        Producto p7 = new Producto("Botines", 160000.00);
        Producto p8 = new Producto("Ceular", 400000.00);
        Producto p9 = new Producto("Remera", 25000.00);
        Producto p10 = new Producto("Reloj", 200000.00);

        o2.agregarProductos(p3);
        o2.agregarProductos(p4);
        o2.agregarProductos(p5);
        o2.agregarProductos(p6);
        o2.agregarProductos(p7);
        o2.agregarProductos(p8);
        o2.agregarProductos(p9);
        o2.agregarProductos(p10);
        o2.mostrarOrden();
    }
}
