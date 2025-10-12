
package sistemaventas;

/**
 *
 * @author
 */
public class Producto {
    //atributos de la clase
    private String nombre;
    private double precio;
    
    //al crear un nuevo producto, en el costructor inicializamos los atributos
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //métodos getters 
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    //métodos setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
}
