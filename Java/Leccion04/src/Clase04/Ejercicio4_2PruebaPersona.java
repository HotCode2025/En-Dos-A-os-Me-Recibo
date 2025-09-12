
package Clase04;

public class Ejercicio4_2PruebaPersona {
   public static void main(String[] args) {
       //creamos un objeto de la clase Ejercicio4_1Persona
       Ejercicio4_1Persona persona1; 
       persona1 = new Ejercicio4_1Persona(); //llamamos al constructor
       persona1.nombre = "Grupo";
       persona1.apellido = "En dos años me recibo";
       //ejecutamos el método de persona
       persona1.obtenerInformacion();
       
       //Creamos un nuevo objeto. 
       Ejercicio4_1Persona persona2 = new Ejercicio4_1Persona(); 
       //Imprimimos los objetos, lo que obtenemos es su dirección en memoria
       System.err.println("Persona1 = " + persona1 );
       System.out.println("Persona2 = " + persona2);
       
       //le pasamos valores a los atributos del objeto persona2
       persona2.nombre = "Marcos";
       persona2.apellido = "Homola";
       persona2.obtenerInformacion();
   } 
}
