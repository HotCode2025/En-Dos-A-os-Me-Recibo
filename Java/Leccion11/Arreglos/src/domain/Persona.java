
package domain;


public class Persona {
    //ATRIBUTOS
    private String nombre;
    
    //CONSTRUCTOR
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //METODOS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}'+", "+super.toString();
    }
    
}
