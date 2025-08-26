function miFuncion (a, b) {
    // console.log("Sumamos " + (a + b));
    return a + b;
}

let resultado = miFuncion(5, 10);
console.log("Resultado: " + resultado);

//Declaramos una función de tipo expresión o anónima
let x = function(a, b) {return a + b};
let resultado2 = x(12, 5);
console.log("Resultado de la función de tipo expresión: " + resultado2);

//Funciones del tipo self e invoking
(function miFuncion (a, b) { //Función autoejecutable, se llama a si misma, y no se puede reutilizar
    console.log("Ejecutando función self e invoking: " + (a + b));
})(10, 20);

//Una función es un tipo de dato, y tambien pueden ser descritas como objetos
console.log(typeof miFuncion); //function
console.log(typeof x); //function
console.log(typeof (function(a, b) {return a + b})); //function

function miFuncion2 (a, b) {
    console.log(arguments.length);
}

miFuncion2(10, 20, 5, 7, 9);

//toString()
let miFuncionTexto = miFuncion2.toString();
console.log(miFuncionTexto); //Muestra el código fuente de la función

//Funciones flecha 
const miFuncionFlecha = (a, b) => {return a + b};
resultado3 = miFuncionFlecha(5, 10);
console.log("Resultado de la función flecha: " + resultado3);

let sumar = function(a = 4, b = 8) {
    console.log(arguments[0]);
    console.log(arguments[1]);
    return a + b + arguments[2];
}

let suma = sumar(3, 6, 4);
console.log("Resultado de la función sumar: " + suma);

//Hoisting, llamamos a la función antes de ser creada
let respuesta = sumarTodo(4, 5, 6, 8, 12);
console.log("Resultado de la función sumarTodo: " + respuesta);
function sumarTodo() {
    let suma = 0;
    for(i = 0; i < arguments.length; i++) {
        suma += arguments[i];
    }
    return suma;
}

//Tipos primitivos
let k = 10;
function cambiarValor(a) { //Paso por valor
    a = 20;
}
console.log("Valor de k: " + k);
cambiarValor(k);

//Paso por referencia, el objeto cambia para siempre
const persona = {
    nombre: "Ramiro",
    apellido: "Muñoz"
}
console.log("Antes: ", persona);

const cambiarValorObjeto = (p1) => {
    p1.nombre = "Juan";
    p1.apellido = "Pérez";
}

cambiarValorObjeto(persona);
console.log("Después: ", persona);
