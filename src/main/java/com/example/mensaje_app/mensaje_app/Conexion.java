package com.example.mensaje_app.mensaje_app;
import java.sql.*;


public class Conexion {
    public Connection get_Connection(){
      Connection connection = null;
     try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "123456");

     }catch (SQLException e) {
         throw new RuntimeException(e);
     }
     return connection;
    }
}
