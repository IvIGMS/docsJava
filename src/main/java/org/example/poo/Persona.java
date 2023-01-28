package org.example.poo;

public class Persona {
    private int id;
    private String name;
    private int age;
    private static int id_= 0;
    private Casa casa;
    public Persona(String name, int age) {
        this.id = id_;
        this.name = name;
        this.age = age;
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

