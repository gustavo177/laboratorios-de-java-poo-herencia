package org.gustavo.ejemplo;

import org.gustavo.pooherencia.Alumno;
import org.gustavo.pooherencia.Persona;
import org.gustavo.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Persona alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Gusman");

        ((Alumno)alumno).setInstitucion("Instituto Nacional");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + ((Alumno) alumno).getInstitucion());
        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());
    }
}
