package org.gustavo.ejemplo;

import org.gustavo.pooherencia.Alumno;
import org.gustavo.pooherencia.AlumnoInternacional;
import org.gustavo.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de la clase Alumno ==========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Gusman");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("======== Creando la instancia de la clase Alumno Internacional ==========");

        AlumnoInternacional alumnoInt=new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(4.5);

        System.out.println("======== Creando la instancia de la clase Profesor ==========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");
        System.out.println("======== -- ==========");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getPais());

        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}
