package com.gustavo.ejemplo;

import com.gustavo.pooherencia.*;

/*
 * Para la tarea se pide desarrollar un diseño orientado a objetos
 * para un almacén y verdulería, como requerimiento vamos a tener 4
 * clases de productos Fruta, Limpieza, Lacteo y NoPerecible, todas
 *  tiene en común dos atributos el nombre (string) y precio (double)
 *  que deben heredar de la clase padre Producto, pero ademas cada una
 *  van a tener dos atributos propios adicionales, sus métodos getter y
 *  constructor para inicializar los 4 atributos (los 2 del padre y los 2 propios).
 *  Los atributos adicionales de cada clase se detalla en el siguiente
 * diagrame de clase:
 *
 * Imagen UML
 *
 * Para el ejemplo de la clase main se pide crear dos objetos por cada tipo
 * de producto que deben ser almacenados en un arreglo del tipo Producto, se
 * debe mostrar iterando el arreglo, por cada uno el detalle completo, el
 * precio, nombre y los atributos adicionales.

 * */
public class Main {
    public static void main(String[] args) {
        int i = 0;

        Producto[] productos = new Producto[8];

        productos[0] = new Lacteo("Leche",2500,1,30);
        productos[1] = new Lacteo("Yogur", 3500, 1, 10);
        productos[2] = new Fruta("Manzana", 2500, 1, "Verde");
        productos[3] = new Fruta("Naranja", 5000, 1, "Amarillo");
        productos[4] = new Limpieza("Cloro", 2500, "Cl", 1);
        productos[5] = new Limpieza("Jabon protex", 5500, "Barra: Sodium Palmitate y/o Sodium Oleate ...", 1);
        productos[6] = new NoParecible("Arroz", 5000, 1, 400);
        productos[7] = new NoParecible("Frijoles", 5300, 1, 375);

        for(Producto producto : productos){
            System.out.println("**************************");
            System.out.println("Producto numero "+i++);
            System.out.println("**************************");
            System.out.println(producto.toString());
        }
    }
}