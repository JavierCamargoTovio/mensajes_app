package com.example.mensaje_app.mensaje_app;

import java.util.Scanner;

public class MensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Escribe tu Nombre");
        String autor = sc.nextLine();
        Mensajes mensajes = new Mensajes();
        mensajes.setMensaje(mensaje);
        mensajes.setAutor_mensaje(autor);
        MensajeDAO.crearMensajeDB(mensajes);
    }
    public static void listarMensajes(){
    }

    public static void borrarMensajes(){
    }

    public static void editarMensajes(){
    }
}
