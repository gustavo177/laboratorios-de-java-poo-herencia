package com.gustavo.pooherencia;

public class Personas {
    private int id;
    private String nombre;

    public Personas(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "(Personas) " +
                "id=" + id +
                ", nombre='" + nombre + '\'';
    }
}
