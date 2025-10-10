// let persona3 = new Persona('Carla', 'Pose'); // Error porque el hoisting no se aplica en las clases

// Clases - es una plantilla donde se instancian objetos
class Persona{ //Clase Padre
    constructor(nombre, apellido) {
        this._nombre = nombre; // Atributos escrito con _ porque utilizaremos los metodos get y set
        this._apellido = apellido;
    }
    // Métodos
    get nombre() {
        return this._nombre;
    }
    get apellido() {
        return this._apellido;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }
    set apellido(apellido) {
        this._apellido = apellido;
    }
    nombreCompleto() {
        return this._nombre + ' ' + this._apellido;
    }
    // Sobreescritura del método de la clase padre (Object)
    tostring() {
        // se aplica el metodo polimorfismo que significa multiples formas en tiempo de ejecucion
        //el metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }
}

//Herencia
class Empleado extends Persona { // Clase Hija
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido); // Llamamos al constructor de la clase padre
        this._departamento = departamento;
    }
    //Métodos
    get departamento() {
        return this._departamento;
    }
    set departamento(departamento) {
        this._departamento = departamento;
    }
    // Sobreescritura
    nombreCompleto() {
        return super.nombreCompleto() + ', ' + this._departamento;
    }
}

let persona1 = new Persona('Ramiro', 'Muñoz'); // Instancia de la clase
console.log(persona1); // Persona { nombre: 'Ramiro', apellido: 'Muñoz' }
console.log(persona1.nombre); // Ramiro
persona1.nombre = 'Juan'; // Cambiamos el nombre
console.log(persona1.nombre); // Juan
console.log(persona1.apellido); // Muñoz
persona1.apellido = 'López'; // Cambiamos el apellido
console.log(persona1.apellido); // López
console.log(persona1); // Persona { nombre: 'Juan', apellido: 'López' }
console.log(persona1.nombreCompleto()); // Juan López


let persona2 = new Persona('Carlos', 'Perez'); // Instancia de la clase
console.log(persona2); // Persona { nombre: 'Carlos', apellido: 'Perez' }
console.log(persona2.nombre); // Carlos
persona2.nombre = 'Eze'; // Cambiamos el nombre
console.log(persona2.nombre); // Eze    
console.log(persona2.apellido); // Pérez
persona2.apellido = 'Garcia'; // Cambiamos el apellido
console.log(persona2.apellido); // Garcia
console.log(persona2); // Persona { nombre: 'Eze', apellido: 'Garcia' }


let empleado1 = new Empleado('Enzo', 'Fernandez', 'Sistemas'); // Instancia de la clase
console.log(empleado1); // Empleado { nombre: 'Enzo', apellido: 'Fernandez', departamento: 'Sistemas' }
console.log(empleado1.nombre); // Enzo
empleado1.nombre = 'Juan'; // Cambiamos el nombre
console.log(empleado1.nombre); // Juan
console.log(empleado1); // Empleado { nombre: 'Juan', apellido: 'Fernandez', departamento: 'Sistemas' }
empleado1.departamento = 'RRHH'; // Cambiamos el departamento
console.log(empleado1.departamento); // RRHH
console.log(empleado1); // Empleado { nombre: 'Juan', apellido: 'Fernandez', departamento: 'RRHH' }

// Object.prototype.toString // esta es la manera de acceder a los atributos y metodos de manera dinamica
console.log(empleado1.tostring()); // Juan Fernandez, RRHH
console.log(persona1.tostring()); // Juan López

