// let persona3 = new Persona('Carla', 'Pose'); // Error porque el hoisting no se aplica en las clases

// Clases - es una plantilla donde se instancian objetos
class Persona{ //Clase Padre

    static contadorPersonas = 0;
    //static contadorObjPersona = 0; // Atributo estático
    // email = 'Valor default email'; //Atributo no estático
    static get MAX_OBJ() { //Éste método simula una constante
        return 5;
    }

    constructor(nombre, apellido) {
        this._nombre = nombre; // Atributos escrito con _ porque utilizaremos los metodos get y set
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ) {
            this.idPersona = ++Persona.contadorPersonas;
        } else {
            console.log('Se ha llegado al límite de instancias');
        }
        //console.log('Se incrementa el contador: ' + Persona.contadorObjPersona);
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
        return this.idPersona + ': ' + this._nombre + ' ' + this._apellido;
    }
    // Sobreescritura del método de la clase padre (Object)
    tostring() {
        // se aplica el metodo polimorfismo que significa multiples formas en tiempo de ejecucion
        //el metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }
    static saludar() { // Metodo estatico
        console.log('Hola desde el método static');
    }
    static saludar2(persona) {
        console.log(persona.nombre+' '+persona.apellido);
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

// persona1.saludar(); no se utiliza desde el objeto
Persona.saludar(); //Desde la clase se utiliza
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

// console.log(persona1.contadorObjPersona);
console.log(Persona.contadorObjPersona);
console.log(Empleado.contadorObjPersona);

console.log(persona1.email); //Desde el objeto se utiliza
console.log(empleado1.email); //Desde el hijo se utiliza
//console.log(Persona.email); //Desde la clase no se utiliza

console.log(persona1.tostring()); 
console.log(persona2.tostring());
console.log(empleado1.tostring());
console.log(Persona.contadorPersonas);

let persona3 = new Persona('Carla', 'Lara');
console.log(persona3.tostring());

console.log(Persona.MAX_OBJ);
// Persona.MAX_OBJ = 10; No se puede modificar
// console.log(Persona.MAX_OBJ);

let persona4 = new Persona('Franco', 'Diaz');
console.log(persona4.tostring());
let persona5 = new Persona('Emi', 'Perez');
console.log(persona5.tostring());