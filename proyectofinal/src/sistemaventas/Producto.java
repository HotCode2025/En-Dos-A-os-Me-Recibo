package sistemaventas;

/**
 *
 * @author
 */
public class Producto {

    //atributos de la clase
    private String descripcion;
    private double precio;
    private int cantidadVendida;

    //al crear un nuevo producto, en el costructor inicializamos los atributos
    public Producto(String descripcion, double precio, int cantidadVendida) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadVendida = cantidadVendida;
    }

    //métodos getters 
    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    //métodos setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String nombre) {
        this.descripcion = descripcion;
    }
    
    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
}
