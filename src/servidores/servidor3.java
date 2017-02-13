/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidores;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


/**
 *
 * @author Wesley
 */
public class servidor3 {

    ServerSocket servidor;
    Socket cliente;

    public servidor3(int porta) throws IOException {
        System.out.println("Servidor Iniciado na porta:" + porta);
        servidor = new ServerSocket(porta);

        while (true) {
            cliente = servidor.accept();

            Thread();
        }
    }

    private void Thread() {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("Conectando ao cliente..");
                    DataInputStream in = new DataInputStream(cliente.getInputStream());
                    Double x = (double) in.readInt();
                    DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
                    out.writeInt( (int)Math.sqrt(x));
                    System.out.println((int)Math.sqrt(x)+"");
                    cliente.close();

                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }

            }

        });

        t.start();
    }
    
   

    public static void main(String args[]) throws IOException {
        new servidor3(12345);
    }

}
