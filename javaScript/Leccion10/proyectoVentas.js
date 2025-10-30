class Producto {
    //Atributos de la clase:
    static contadorProductos = 0;

    constructor (nombre,precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }
    //Metodos o acciones que realiza la clase Producto:
    get idProducto(){
        return this._idProducto;
    } 
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get precio(){
        return this._precio;
    }
    set precio(precio){
        this._precio = precio;
    }
    toString (){
        return ` ${this._idProducto} ${this._nombre} ${this._precio}`;
    }

}

class Orden{
   static contadorOrdenes =  0;

   static get MAX_PRODUCTOS(){ // este es el metodo que simula una constante
    return 5;
   }

   constructor(){ // Constructor de la clase Orden

    if (Orden.contadorOrdenes < 2){ // Con el if condicionamos el numero de crecion de productos
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = []; 
    }
    else{
        console.log("Se supero el máximo de ordebes permitidas")
    }
   }
   
   //Metodos de la clase Orden
   agregarProducto(producto){
    if (this._productos.length < Orden.MAX_PRODUCTOS){ 
        this._productos.push(producto);
    }
    else{
        console.log("No se pueden agregar mas productos");
    }

   }

    calcularTotal(){ // Este es el metodo que calcula el total de la orden
    let totalVenta = 0;
    for (let producto of this._productos){
        totalVenta += producto.precio;
    }
    return totalVenta;
   }
    mostrarOrden(){
    let productosOrden = "";
    for (let producto of this._productos){
        productosOrden += "\n{ " + producto.toString() + " }";
    }
    console.log(`${this._idOrden} Total: $${this.calcularTotal()}, Productos: ${productosOrden}`);
    }

}

//Ventas Test:
let producto1 = new Producto("Pantalon", 250);
let producto2 = new Producto("Camisa", 150);
let producto3 = new Producto("Cinturon", 50);
let producto4 = new Producto("Zapatos", 300);
let producto5 = new Producto("Medias", 80);
// let producto6 = new Producto("Gorra", 100); // Este no debería agregarse PORQUE supera el límite

//Mostramos los productos
console.log(producto1.toString());
console.log(producto2.toString());
console.log(producto3.toString());
console.log(producto4.toString());
console.log(producto5.toString());
//console.log(producto6.toString());

//Creacion de la ordenes
let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.mostrarOrden();

let orden2 = new Orden();
orden2.agregarProducto(producto3);
orden2.agregarProducto(producto4);
orden2.agregarProducto(producto5);
// orden2.agregarProducto(producto6); // Este no debería agregarse PORQUE supera el límite
orden2.mostrarOrden();
// let orden3 = new Orden(); // Esta no debería crearse PORQUE supera el límite
