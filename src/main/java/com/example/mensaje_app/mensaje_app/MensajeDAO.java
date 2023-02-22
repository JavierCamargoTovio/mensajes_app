package com.example.mensaje_app.mensaje_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajeDAO {
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static void crearMensajeDB(Mensajes mensaje) {
        try {
            Connection conexion = Conexion.get_Connection();
            String query = "INSERT INTO mensajes(mensaje, autor_mensaje)values(?,?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setString(2, mensaje.getAutor_mensaje());
            ps.executeUpdate();
            System.out.println("mensaje Creado");
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            Conexion.close_Connection();
        }
    }

    public static void leerMensaje() {
        try {
            Connection conexion = Conexion.get_Connection();
            String query = "SELECT * FROM mensajes_app.mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("No se pudieron traer los mensajes");
            System.out.println(e);
        } finally {
            Conexion.close_Connection();
        }
    }

    public static void borrarMensajeDB(int id_mensaje) {
        try {
            Connection conexion = Conexion.get_Connection();
            String query = "DELETE FROM mensajes_app.mensajes WHERE mensajes.id_mensaje = ?";
            ps = conexion.prepareStatement(query);
            ps.setInt(1, id_mensaje);
            ps.executeUpdate();
            System.out.println("mensaje Eliminado");
        } catch (
                SQLException e) {
            System.out.println("No se puo borrar el mensaje");
            System.out.println(e);
        } finally {
            Conexion.close_Connection();
        }
    }
    public static void actualizarMensajeDB(Mensajes mensaje) {
        try {
            Connection conexion = Conexion.get_Connection();
            String query = "UPDATE mensajes_app.mensajes SET mensaje = ?, autor_mensaje= ? WHERE id_mensaje = ?";
            ps = conexion.prepareStatement(query);
            ps.setString(1, mensaje.getMensaje());
            ps.setString(2, mensaje.getAutor_mensaje());
            ps.setInt(3, mensaje.getId_mensaje());
            ps.executeUpdate();
            System.out.println("mensaje Actualizado");
        } catch (SQLException e) {
            System.out.println("No se pudo actualizar el mensaje ");
            System.out.println(e);
        } finally {
            Conexion.close_Connection();
        }
    }
}
