package com.gustavo.pooherencia;

public class Vendedores extends Personas{
    private int id;
    private String nombre;

    public Vendedores(int id, String nombre, int id1, String nombre1) {
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
        return super.toString() + "(Vendedores) " +
                "id=" + id +
                ", nombre='" + nombre + '\'';
    }
}
