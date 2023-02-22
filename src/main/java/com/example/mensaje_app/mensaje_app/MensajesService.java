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
        MensajeDAO.leerMensaje();
    }

    public static void borrarMensajes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el id del mensaje a borrar");
        int id = sc.nextInt();
        MensajeDAO.borrarMensajeDB(id);
    }

    public static void editarMensajes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el id del mensaje a editar");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Escribe tu nuevo Nombre");
        String autor = sc.nextLine();

        Mensajes mensajes = new Mensajes();
        mensajes.setId_mensaje(id);
        mensajes.setMensaje(mensaje);
        mensajes.setAutor_mensaje(autor);
        MensajeDAO.actualizarMensajeDB(mensajes);
    }
}
