package org.example.poo;

/*
* Creamos una clase que sirve para ver que podemos instanciar una clase dentro de otra.
* */
public class Casa {
    private String direcction;
    private int number;

    public Casa(String direcction, int number) {
        this.direcction = direcction;
        this.number = number;
    }

    public String getDirecction() {
        return direcction;
    }

    public void setDirecction(String direcction) {
        this.direcction = direcction;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString(){
        return "La casa se encuentra en la dirección: Calle "+ this.direcction + ", Nº " + this.number;
    }
}