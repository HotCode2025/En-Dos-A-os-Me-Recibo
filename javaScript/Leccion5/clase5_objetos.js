//Metodos get y set

// Objeto persona
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28, 
    idioma: 'ES',
    get lang(){
        return this.idioma.toUpperCase(); // Convierte minus a mayus
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function () { // método o función en JavaScript
        return this.nombre + ' ' + this.apellido;
    },
    get nombreEdad(){
        return 'El nombre es: '+ this.nombre+ ' edad: '+this.edad
    }
    
}

console.log("Comenzamos a utilizar el metodo GET");
console.log(persona.nombreEdad);
console.log('Comenzamos con el metodo get y get para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function persona3(nombre,apellido,email){ // Esta funcion es nuestro constructor, la podemos reutilizar y así crear nuevos objetos en base a esa estructura.
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+' '+ this.apellido;
    }

}
let padre = new persona3('Leo','Lopez','lopez@gmail.com');
padre.nombre = 'juan';
padre.telefono = '2622355645'; //prpiedad exclusiva del objeto padre.
console.log(padre);
console.log(padre.nombreCompleto())

let hijo = new persona3('martin','Lopez','lopezM@gmail.com');
console.log(hijo);
console.log(hijo.nombreCompleto());


//DIFERENTES FORMAS DE CREAR OBJETOS
//caso con objetos;
let miObjeto = new Object(); // Esta es una opcion formal
let miObjeto2 = {}; // Esta es breve y recomendada
//caso con string:
let miCadena1 = new String ('hola'); // sintaxis formal
let miCadena2 = 'hola'; //sintatix simple y recomendada
//caso con numeros:
let miNumero1 = new Number(1); // formal no recomendada
let miNumero2 = 1; //sintatix simple y recomendada
//cas0 con boolean:
let miBoolean1 = new Boolean(false);// formal
 let miBoolean2 = false; // sintaxis recomendada
 //caso con arreglos
 let miArreglo1 = new Array(); // formal
 let miArreglo2 =[];// sintaxis recomendada
 //caso funcion:
 let miFuncion1 =  new function(){};//Todo despues de new es considerado objeto
 let miFuncion2 = function(){}; //notacion simplificada y recomendada.

 // USO DE PROTOTIPO:
persona3.prototype.telefono = '2615665565';
console.log(padre);
console.log(hijo.telefono);
hijo.telefono = '542615665565';
console.log(hijo.telefono);

// Uso de call:

let persona4 = {
    nombre: 'juan',
    apellido: 'perez',
    nombreCompleto2 : function(titulo,telefono){
        return titulo +': '+this.nombre+' '+this.apellido+' '+telefono;
       //return this.nombre+' '+this.apellido
    }
}
let persona5 = {
    nombre: 'carlos',
    apellido: 'lara'
    
}
console.log(persona4.nombreCompleto2('Lic.','2622554466'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.','54261445566'));

// METODO APPLY
let arreglo = ['Ing.','2622555555'];
console.log(persona4.nombreCompleto2.apply(persona5,arreglo));


