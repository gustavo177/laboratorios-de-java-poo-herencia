package com.gustavo.pooherencia;

public class NoParecible extends Producto{
    private int contenido;
    private int calorias;

    public NoParecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+"NoParecible " +
                "contenido=" + contenido +
                ", calorias=" + calorias;
    }
}
