package org.gustavo.ejemplo;

import org.gustavo.pooherencia.Alumno;
import org.gustavo.pooherencia.AlumnoInternacional;
import org.gustavo.pooherencia.Persona;
import org.gustavo.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de la clase Alumno ==========");
        Alumno alumno = new Alumno("Andres", "Gusman", 13, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("tavo@gmail.com");
        System.out.println("======== Creando la instancia de la clase Alumno Internacional ==========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(4.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("======== Creando la instancia de la clase Profesor ==========");
        Profesor profesor = new Profesor("Luci ", "Pérez ", "Matemáticas ");
        profesor.setEdad(28);
        profesor.setEmail("Profesor.gustavo@colegio.com");

        System.out.println("======== -- ==========");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println("======== -- ==========");

        System.out.println(persona);

    }
}
