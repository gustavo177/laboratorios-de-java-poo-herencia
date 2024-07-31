package com.gustavo.pooherencia;

public class NoPerecederos extends Alimentos{
    private boolean empaqueSellado;

    public NoPerecederos(String nombre, int precio, int id, String nombre1, boolean empaqueSellado) {
        super(nombre, precio, id, nombre1);
        this.empaqueSellado = empaqueSellado;
    }

    public boolean isEmpaqueSellado() {
        return empaqueSellado;
    }

    @Override
    public String toString() {
        return super.toString() + "(NoPerecederos) " +
                "empaqueSellado=" + empaqueSellado;
    }
}
