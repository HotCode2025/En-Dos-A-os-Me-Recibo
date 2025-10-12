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

    public Producto buscarProducto(String descripcion) {
        for (Producto producto : productos) {
            if (producto.getDescripcion().equalsIgnoreCase(descripcion)) {
                return producto;
            }
        }
        return null;
    }

    public void agregarProducto(String descripcion, double precio) {
        productos.add(new Producto(descripcion, precio, 0));
        System.out.println("Producto agregado correctamente.");
    }

}
