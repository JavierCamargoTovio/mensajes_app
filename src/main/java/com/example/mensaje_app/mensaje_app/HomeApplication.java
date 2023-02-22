package com.example.mensaje_app.mensaje_app;

import java.sql.Connection;
import java.util.Scanner;

public class HomeApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("------------------");
            System.out.println(" Aplicacion de Mensajes ");
            System.out.println("1. Crear mensaje");
            System.out.println("2. listar mensaje");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir");
            //Leemos la opción en pantalla
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3 :
                    MensajesService.borrarMensajes();
                    break;
                case 4:
                    MensajesService.editarMensajes();
                    break;
                default:
                    break;
            }

        }while (opcion != 5);

    }
}