package org.example;

import java.sql.*;
public class ConnectionMySQL {
    private String user;
    private String pw;
    private String sURL;
    private Connection connection = null;
    private PreparedStatement std = null;
    public ConnectionMySQL() throws SQLException {
        this.user = "ivan@frias";
        this.pw = "navigation1234";
        this.sURL = "jdbc:mysql://localhost:3306/javaAplication";
        try {
            connection = DriverManager.getConnection(sURL, user, pw);
            System.out.println("Conexión con éxito!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void closeConnection() throws SQLException{
        try{
            connection.close();
            System.out.println("La conexión se ha cerrado correctamente.");
        } catch (SQLException e){
            System.out.println("No ha sido posible cerrar la conexión con la base de datos.");
        }
    }

    /**
     * Esta funcion inserta un registro en la tabla users de la BBDD a la que nos conectamos.
     * @param name Nombre del User
     * @param age Edad del User
     * @throws SQLException
     */
    public void insertData(String name, int age) throws SQLException{
        String SQL = "insert into user (name, age) VALUES ('" + name + "', " + age + ");";
        try{
            std = connection.prepareStatement(SQL);
            std.executeUpdate();
            System.out.println("Los datos son válidos");
        } catch (SQLException e){
            System.out.println("No has introducido un nombre y edad válidos.");
        }
    }

    /**
     * Esta funcion nos da los resultados de la tabla User
     * @return Retorna un ResultSet que tenedemos que explorar en el metodo main.
     * @throws SQLException
     */
    public ResultSet showData() throws SQLException{
        String SQL = "select * from user;";
        ResultSet resultado = null;
        try{
            std = connection.prepareCall(SQL);
            resultado = std.executeQuery();
        } catch (SQLException e){
            System.out.println("No hemos podido traer los resultados. Cosa que me extraña.");
        } finally {
            return resultado;
        }
    }
}
