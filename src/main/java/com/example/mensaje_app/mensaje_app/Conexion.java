package com.example.mensaje_app.mensaje_app;
import java.sql.*;


public class Conexion {
    private static Connection connection;
    private static final  String URL = "jdbc:mysql://localhost:3306/mensajes_app";
    private static final String  USER = "root";
    private static final String  PASSWORD = "123456";
    public static Connection get_Connection(){
     try {
         connection = DriverManager.getConnection(URL, USER, PASSWORD);

     }catch (SQLException e) {
         throw new RuntimeException(e);
     }
     return connection;
    }
    public static void close_Connection(){
        try {
            connection.close();

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
