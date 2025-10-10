class Empleado extends Persona {

    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo) {
        super(nombre, apellido, edad);
        this._sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }
    get idEmpleado() {
        return this._idEmpleado;
    }

    get sueldo() {
        return this._sueldo;
    }

    set sueldo(sueldo) {
        this._sueldo = sueldo;
    }

    tostring() {
        return `
        ${super.tostring()} 
        ${this._idEmpleado} 
        ${this._sueldo}`;
    }

}