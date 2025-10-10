
package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Martín");
        System.out.println("persona1 = " +persona1);
        Persona persona2 = new Persona("Augusto");
        System.out.println("persona2 = "+persona2);
        //8.7
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; //No se puede referenciar desde un contexto estático
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador ());
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = "+ persona);
       
    }
    //creamos un nuevo metodo para usar el atributo contador
    public int getContador(){
        imprimir(new Persona("Enzo"));
        return this.contador;
    }
}
