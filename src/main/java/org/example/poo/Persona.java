package org.example.poo;

/* Aprendemos a crear una clase que usa un constructor, usa properties static y usa un objeto de otra clase dentro de
si mismo
*/
public class Persona {
    private int id;
    private String name;
    private int age;
    private static int id_= 0;
    public Casa casa;
    public Persona(String name, int age, String direction, int number) {
        this.id = id_;
        this.name = name;
        this.age = age;
        casa = new Casa(direction, number);
        id_++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

