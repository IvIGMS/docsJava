package org.example;

import java.lang.reflect.Array;

public class Pruebas {
    public static void main(String[] args) {
        // En este momento queremos hacer un array. Siempre tenemos que asignarles un espacio de memoria.
        String[] daysWeek = new String[7];

        daysWeek[0] = "lunes";
        daysWeek[1] = "martes";
        daysWeek[2] = "miercoles";
        daysWeek[3] = "jueves";
        daysWeek[4] = "viernes";
        daysWeek[5] = "sabado";
        daysWeek[6] = "domingo";

        for (String day:daysWeek) {
            System.out.println(". Dia de la semana: " + day);
        }
    }
}