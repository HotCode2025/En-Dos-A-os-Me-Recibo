package ContextoEstatico.Test;

import ContextoEstatico.Dominio.Persona;

public class PersonaPrueba {
    private int contador; //Atributo de instancia

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        System.out.println("Objeto 1: " + p1);

        Persona p2 = new Persona("Candela");
        System.out.println("Objeto 2: " + p2);
        imprimir(p1);
        imprimir(p2);
        //this.contador = 10; //Error, no se puede hacer referencia a un atributo de instancia desde un contexto estatico
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getcontador());
    }

    public static void imprimir(Persona persona) {
        System.out.println("Persona: " + persona);
    }

    public int getcontador() {
        imprimir(new Persona("Ramiro"));
        return this.contador;
    }
    
}
