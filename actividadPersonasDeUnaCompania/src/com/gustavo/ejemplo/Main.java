package com.gustavo.ejemplo;

import com.gustavo.pooherencia.Gerente;

/* Una compañía maneja empleados y clientes, entre los empleados hay
gerentes que manejan presupuesto para su área (modificable) y a todos
los empleados se les puede aumentar el sueldo, se pide una jerarquía de
 clase de los tipos de persona mencionados, tomando como base la figura
 del diagrama UML de clases.

Para todas las clases de la jerarquía tenga en cuenta los métodos getter,
un constructor y el toString() con sobre-escritura, para Gerente además
el método setter de presupuesto.

También incluir una clase main con algún ejemplo de un Gerente e imprimir
todos sus datos (y heredados) vía toString().

imagen UML
*/


public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Tavo", "Bautista",
                "123456789", "carrera 7 #7-89",
                4.5, 1, 2000);
        imprimir(gerente);
//  //      Otra forma de llamar el toString
//        System.out.println(gerente.toString());

        gerente.aumentarRemuneracion(10);

        System.out.println(" ========== Aumento =====");

        imprimir((gerente));

    }

    public static void imprimir(Gerente persona) {
        System.out.println("======== -- ==========");
        System.out.println(persona);
    }
}
