package com.gustavo.pooherencia;

import java.util.Date;

public class Perecederos extends Alimentos{
    private String color;
    private Date fechaVencimiento;
    private boolean requiereRefrigeracion;

    public Perecederos(String nombre, int precio, int id, String nombre1, String color, Date fechaVencimiento, boolean requiereRefrigeracion) {
        super(nombre, precio, id, nombre1);
        this.color = color;
        this.fechaVencimiento = fechaVencimiento;
        this.requiereRefrigeracion = requiereRefrigeracion;
    }

    public String getColor() {
        return color;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean isRequiereRefrigeracion() {
        return requiereRefrigeracion;
    }

    @Override
    public String toString() {
        return super.toString() + "(Perecederos) " +
                "color='" + color + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", requiereRefrigeracion=" + requiereRefrigeracion;
    }
}
