// Variable primitiva
let x = 10;
console.log(x.length); // undefined, porque un número no tiene propiedad length

// Objeto persona
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30, 
    nombreCompleto: function () { // método o función en JavaScript
        return this.nombre + ' ' + this.apellido;
    }
};
console.log(persona.nombre);      // Carlos
console.log(persona.apellido);    // Gil
console.log(persona.email);       // cgil@gmail.com
console.log(persona.edad);        // 30
console.log(persona);             // muestra el objeto completo
console.log(persona.nombreCompleto()); // Carlos Gil
// Crear un nuevo objeto con new Object()
let persona2 = new Object();
persona2.nombre = 'Juan';
persona2.direccion = 'salida 14'; 
persona2.telefono = '54926182882821';
console.log(persona2.telefono); // 54926182882821
// Acceder como si fuera un arreglo
console.log(persona['apellido']); // Gil
// for in: recorrer propiedades del objeto
for (let propiedad in persona) {
    console.log(propiedad, persona[propiedad]);
}
// Cambiar dinámicamente un valor
persona.apellido += ' Betancud'; 
console.log(persona.apellido); // Gil Betancud
// Eliminar una propiedad
delete persona.apellido;
console.log(persona); 
// Distintas formas de imprimir un objeto
// Número 1: la más sencilla, concatenar cada valor de cada propiedad
console.log('Distinta formas de imprimir un objeto: forma 1');
console.log(persona.nombre + ', ' + persona.apellido); // Carlos, Gil
// Número 2: A través del ciclo for in
console.log('Distinta formas de imprimir un objeto: forma 2');
for (let nombrePropiedad in persona) {
    console.log(persona[nombrePropiedad]);
}
// Carlos, Gil, cgil@gmail.com, 30, [Function: nombreCompleto]
// Número 3: La función Object.values()
console.log('Distinta formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);
// ['Carlos', 'Gil', 'cgil@gmail.com', 30, [Function: nombreCompleto]]
// Número 4: Utilizaremos el método JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);
// {"nombre":"Carlos","apellido":"Gil","email":"cgil@gmail.com","edad":30}
