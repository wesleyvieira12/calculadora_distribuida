/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidores;


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
public class servidor1 {

    ServerSocket servidor;
    Socket cliente;

    public servidor1(int porta) throws IOException {
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
                    ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());
                    ArrayList<String> operandos = (ArrayList<String>) in.readObject();
                    ArrayList<String> valores = (ArrayList<String>) in.readObject();
                    int resultado = 0;
                    for(int i=0;i<operandos.size();i++){
                        if(operandos.get(i).equals("+")){
                            resultado = Integer.parseInt(valores.get(i))+Integer.parseInt(valores.get(i+1));
                            valores.remove(i);
                            valores.remove(i);
                            valores.add(i,""+resultado);
                            operandos.remove(i);
                            i--;
                            
                        }else{
                            resultado = Integer.parseInt(valores.get(i))-Integer.parseInt(valores.get(i+1));
                            valores.remove(i);
                            valores.remove(i);
                            valores.add(i,""+resultado);
                            operandos.remove(i);
                            i--;
                            
                        }
                        
                    }                             
                    
                    
                     DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
                     out.writeInt(Integer.parseInt(valores.get(0)));
                     
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
        new servidor1(12345);
    }

}
