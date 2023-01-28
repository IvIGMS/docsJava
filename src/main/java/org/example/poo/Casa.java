package org.example.poo;

public class Casa {
    private String direcction;
    private int number;

    public Casa(String direcction, int number) {
        this.direcction = direcction;
        this.number = number;
    }

    public String toString(){
        return "La casa se encuentra en la dirección: Calle "+ this.direcction + ", Nº " + this.number;
    }
}
