package ContextoEstatico.Dominio;

public class Persona {

    //Atributos
    private int idPersona;
    private static int contadorPersonas;
    private String nombre;

    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementar el contador para cada objeto nuevo
        Persona.contadorPersonas++; //Acceso a variable estatica - Sintaxis correcta
        // Vamos asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas; 
    }

    //Metodos getters y setters
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override //Metodo toString para imprimir los valores de los atributos, @Override significa sobreescribir, es decir, desde la herencia desde la clase Object se hereda éste método toString() y lo estamos sobreescribiendo, que recibimos desde la clase Object
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
