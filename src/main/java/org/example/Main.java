package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        System.out.println("Vamos a intentar conectarnos a la bbdd");
        // Create connection to BBDD.
        ConnectionMySQL connection = new ConnectionMySQL();
        int exit = 0;
        System.out.println("Bienvenido a nuestra app.");

        do{
            System.out.println("1. Introducir un user.\n2. Consultar users.\n3. Salida.");
            exit = scanner.nextInt();
            switch (exit){
                case 1:
                    System.out.print("Introduce nombre: ");
                    String name = scanner.next();
                    System.out.print("Introduce edad: ");
                    int age = scanner.nextInt();
                    connection.insertData(name, age);
                    System.out.println("Usuario creado correctamente.");
                    break;
                case 2:
                    ResultSet resultados = connection.showData();
                    System.out.println("********************************");
                    while(resultados.next()){
                        System.out.println(resultados.getString("id")
                                + " | " + resultados.getString("name")
                                + " | " + resultados.getString("age"));
                    }
                    System.out.println("********************************");
                    break;
                case 3:
                    System.out.println("Ha elegido salir del programa");
                    connection.closeConnection();
                    break;
                default:
                    System.out.println("Número incorrecto, elige otro.");
            }
        } while(exit != 3);
    }
}