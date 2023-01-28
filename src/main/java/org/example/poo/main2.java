package org.example.poo;

import java.util.Scanner;
import static org.example.poo.UIMenu.*;

public class main2 {
    public static Scanner in = new Scanner(System.in);
    // Creamos una constante con la palabra reservada final.
    public static final double FARADAY = 96_485.332_12;
    public static void main(String[] args) {

        Persona p1 = new Persona("Ivan", 25, "Positillo", 15);
        Persona p2 = new Persona("Marta", 21, "Pozo Viejo", 23);
        Persona p3 = new Persona("SomeOne", 32, "Falsa", 123);
        Persona p4 = new Persona("Misco", 32, "Someplace", 0);

        showMenu(); // Estamos usando un método estatico de la clase UIMenu sin tener que poner el nombre de la clase
        // delante. to es gracias a la importacion que hemos hecho.
        // TODO : esto sirve para dejas un tarea con forma de comentario para mi yo del futuro!

        System.out.println("Para " + p1.getName() + " tenemos el id: " + p1.getId() + ". La direccion es: "
                + p1.casa.getDirecction() + ", Nº " + p1.casa.getNumber());
        System.out.println("Para " + p2.getName() + " tenemos el id: " + p2.getId() + ". La direccion es: "
                + p2.casa.getDirecction() + ", Nº " + p2.casa.getNumber());
        System.out.println("Para " + p3.getName() + " tenemos el id: " + p3.getId() + ". La direccion es: "
                + p3.casa.getDirecction() + ", Nº " + p3.casa.getNumber());
        System.out.println("Para " + p4.getName() + " tenemos el id: " + p4.getId() + ". La direccion es: "
                + p4.casa.getDirecction() + ", Nº " + p4.casa.getNumber());

        System.out.println("Imprimimos la Constante de Faraday: " + FARADAY);
    }
}