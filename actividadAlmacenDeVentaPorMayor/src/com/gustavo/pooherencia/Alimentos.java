package com.gustavo.pooherencia;

public class Alimentos extends Producto{
    private int id;
    private String nombre;

    public Alimentos(String nombre, int precio, int id, String nombre1) {
        super(nombre, precio);
        this.id = id;
        this.nombre = nombre1;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "(Alimentos) " +
                "id=" + id +
                ", nombre='" + nombre + '\'';
    }
}
