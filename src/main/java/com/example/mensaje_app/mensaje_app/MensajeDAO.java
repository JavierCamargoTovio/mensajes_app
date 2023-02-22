package com.example.mensaje_app.mensaje_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajeDAO {

    public static void crearMensajeDB(Mensajes mensaje){
     Conexion deb_conect = new Conexion();
     try{
         Connection conexion = deb_conect.get_Connection();
         PreparedStatement ps = null;
         String query = "INSERT INTO mensajes(mensaje, autor_mensaje)values(?,?);";
         ps = conexion.prepareStatement(query);
         ps.setString(1, mensaje.getMensaje());
         ps.setString(2, mensaje.getAutor_mensaje());
         ps.executeUpdate();
         System.out.println("mensaje Creado");
     }catch (SQLException e){
         System.out.println(e);
     }
    }
    public static void leerMensaje(){

    }
    public static void borrarMensajeDB(int id_mensaje){}

    public static void actualizarMensajeDB(Mensajes mensaje){

    }
}
