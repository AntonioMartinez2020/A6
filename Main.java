package com.company;
public class Main {
    public static void main(String[] args) {
        Alumno antonio = new Alumno();
        double[] calificaciones = {45, 100, 70, 69, 94};
        String nombre = "Antonio Martinez";
        System.out.println(nombre);
        antonio.setCalificaciones(calificaciones);
        antonio.imprimirResultados();
    }

}
