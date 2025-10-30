

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos; // Atributo de clase


    private Producto() { // Constructor vacío
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) { // Constructor
        this(); // Llamada al constructor vacío
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override // Sobreescribimos el método toString
    public String toString() {
        return "Producto {idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "}";
    }
}
    
    

