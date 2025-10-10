
package test;
    
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Orlando", 57000.00, false);
            System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //Modificar a través de los métodos
        persona1.setNombre("Ariel Ortega");
        //persona1.nombre="Ariel Ortega";//Ya no se puede utilizar
        //System.out.println("Nombre es:"+persona1.nombre);//Error
        System.out.println("persona1 con su nombre modificado: "+ persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //y imprimir, luego modificar sus valores y volver a imrpimir
        
        
        // Creamos persona2
        Persona persona2 = new Persona("Augusto", 75000.50, false);
        
        System.out.println("--- Datos Iniciales de persona2 ---");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("Eliminado: " + persona2.isEliminado());
        
        // modificación de valores
        persona2.setNombre("Martín Moreno");
        persona2.setSueldo(88000);
        persona2.setEliminado(true);
        
        System.out.println("--- Impresión de datos modificados de persona2 ---");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Sueldo: " + persona2.getSueldo());
        System.out.println("Eliminado: " + persona2.isEliminado());
        
        //Fin de tarea
        
        //8.3
        System.out.println("persona1 = " + persona1);
    }

}
