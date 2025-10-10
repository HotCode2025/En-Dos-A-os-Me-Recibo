package Herencia.Dominio;

import java.util.Date; //Importamos la clase Date para manejar fechas

public class Cliente extends Persona {
    //Atributos
    private int idCliente;
    private Date fechaRegistro;
    private static int contadorClientes; //Es para incrementar
    private boolean vip;

    //Constructor 1
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion); //Llamamos al constructor de la clase padre (Persona) para inicializar los atributos
        this.idCliente = ++Cliente.contadorClientes; //Incrementamos el contador de clientes
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    
    }

    //Métodos getters y setters
    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
