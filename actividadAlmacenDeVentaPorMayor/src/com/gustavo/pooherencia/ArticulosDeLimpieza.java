package com.gustavo.pooherencia;

public class ArticulosDeLimpieza extends Producto{
    private String compuesto;
    private String manejo;

    public ArticulosDeLimpieza(String nombre, int precio, String compuesto, String manejo) {
        super(nombre, precio);
        this.compuesto = compuesto;
        this.manejo = manejo;
    }

    public String getCompuesto() {
        return compuesto;
    }

    public String getManejo() {
        return manejo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "ArticulosDeLimpieza " +
                "compuesto='" + compuesto + '\'' +
                ", manejo='" + manejo + '\'';
    }
}
