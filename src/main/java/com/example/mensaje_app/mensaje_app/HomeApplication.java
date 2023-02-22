package com.example.mensaje_app.mensaje_app;

import java.sql.Connection;

public class HomeApplication {

    public static void main(String[] args) {
    Conexion conexion = new Conexion();
        Connection connection = conexion.get_Connection();
    }
}