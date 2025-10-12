package sistemaventas;

import java.util.ArrayList;

/**
 *
 * @author 54382
 */
public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio) {
        productos.add(new Producto(nombre, precio));
        System.out.println("Producto agregado correctamente.");
    }
}
