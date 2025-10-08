class Cliente extends Persona {

    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharegistro) {
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this.fecharegistro = fecharegistro;    
    } 

    get idCliente() {
        return this._idCliente;
    }

    get fecharegistro() {
        return this._fecharegistro;
    }

    set fecharegistro(fecharegistro) {
        this._fecharegistro = fecharegistro;
    }

    tostring() {
        return `
        ${super.tostring()} 
        ${this._idCliente} 
        ${this._fecharegistro}`;
    }
}