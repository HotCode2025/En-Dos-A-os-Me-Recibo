package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1; //Declaracion de la variable e instancia de la clase
        persona1 = new Persona(); //Llamada al constructor de la clase Persona
        persona1.nombre = "Ramiro";
        persona1.apellido = "Muñoz";
        persona1.obtenerInfo();

        Persona persona2 = new Persona(); //Instancia de la clase Persona y creación del objeto persona2
        System.out.println("Persona 2: " + persona2); //Dirección de memoria
        System.out.println("Persona 1: " + persona1); //Dirección de memoria
        persona2.obtenerInfo(); 
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInfo();
    }
}