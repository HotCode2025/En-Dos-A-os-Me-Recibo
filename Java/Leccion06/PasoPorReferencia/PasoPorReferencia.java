package PasoPorReferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ramiro";
        System.out.println("persona1 nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombre);
        persona1 = cambiaElValor(persona1);
        Persona persona2 = new Persona();
        //Persona persona2 = null;
        persona2 = cambiaElValor(persona2);
        System.out.println("El nuevo valor del objeto es: " + persona2.nombre);
    }
    public static void cambiarValor(Persona persona) { //Paso por referencia, el parámetro es una referencia a un objeto, la clase Persona y el objeto persona 
        persona.nombre = "Osvaldo";
    }
    public static Persona cambiaElValor(Persona persona) { //Método de tipo Object, con paso por referencia, que retorna un valor
        //Forma de colocar mas de un return en un metodo/función
        if(persona == null) {
            System.out.println("El valor de persona es inválido: Null");
            return null;
        } else {
            persona.nombre = "Marcos";
            return persona;
        }
    }
}
