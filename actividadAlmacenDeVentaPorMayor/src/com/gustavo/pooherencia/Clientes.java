package com.gustavo.pooherencia;

public class Clientes extends Personas{
    private int id;
    private String nombre;

    public Clientes(int id, String nombre, int id1, String nombre1) {
        super(id, nombre);
        this.id = id1;
        this.nombre = nombre1;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "(Clientes) " +
                "id=" + id +
                ", nombre='" + nombre + '\'';
    }
}
