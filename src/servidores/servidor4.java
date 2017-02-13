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
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class servidor4 {

    ServerSocket servidor;
    Socket cliente;

    public servidor4(int porta) throws IOException {
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
                    ArrayList<String> ips = (ArrayList<String>) in.readObject();
                    int count = operandos.size();
                                                         
                    while (verificandoOperandos(operandos)==2) {
                        for (int i = 0; i<count;i++) {  
                            
                            String x = operandos.get(i);                          
                            
                            ArrayList<String> operandos_aux = new ArrayList();
                            ArrayList<String> valores_aux = new ArrayList();
                            if (x.equals("*") || x.equals("/")) {

                                //Exemplo de operação: 0+1-2*3+4/5
                                operandos_aux.add(x);
                                valores_aux.add(valores.get(operandos.indexOf(x)));
                                valores_aux.add(valores.get(operandos.indexOf(x) + 1));
                                Socket servidor2;
                                //Criação do socket
                                servidor2 = new Socket(ips.get(1), 12345);
                                //Envio de Array contendo operadores e valores a serem calculados
                                ObjectOutputStream out2 = new ObjectOutputStream(servidor2.getOutputStream());
                                out2.writeObject(operandos_aux);
                                out2.writeObject(valores);
                                DataInputStream in2 = new DataInputStream(servidor2.getInputStream());
                                
                                valores.remove(operandos.indexOf(x));
                                valores.remove(operandos.indexOf(x));
                                valores.add(operandos.indexOf(x), ""+in2.readInt());
                                operandos.remove(x);
                                i--;
                                count--;
                                
                              
                                
                                
                            
                            }
                        }
                    }
                    while(verificandoOperandos(operandos)==1) {
                        count = operandos.size();
                        
                        for (int i = 0; i<count;i++) {
                            
                            String x = operandos.get(i);
                            ArrayList<String> operandos_aux = new ArrayList();
                            ArrayList<String> valores_aux = new ArrayList();
                            if (x.equals("+") || x.equals("-")) {

                                //Exemplo de operação: 0+1-2+3
                                operandos_aux.add(x);
                                valores_aux.add(valores.get(operandos.indexOf(x)));
                                valores_aux.add(valores.get(operandos.indexOf(x) + 1));
                                Socket servidor1;
                                 //Criação do socket
                                 servidor1 = new Socket(ips.get(0), 12345);
                                 //Envio de Array contendo operadores e valores a serem calculados
                                 ObjectOutputStream out1 = new ObjectOutputStream(servidor1.getOutputStream());
                                 out1.writeObject(operandos_aux);
                                 out1.writeObject(valores);
                                 DataInputStream in1 = new DataInputStream(servidor1.getInputStream());
                                

                                valores.remove(operandos.indexOf(x));
                                valores.remove(operandos.indexOf(x));
                                //Adicionar resultado nos valores
                                valores.add(operandos.indexOf(x),""+in1.readInt());
                                operandos.remove(x);
                                i--;
                                
                            }
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
    
    //Verifica se existe operandos nos servidores: 
    //retornando 2 se existir operações de mais de 1 servidor
    //retornando 1 se existir operações somente no servidor 1
    //e retornando 0 se não existir mais operações
     private int verificandoOperandos(ArrayList<String> x) {
        int servidor1 = 0, servidor2 = 0;
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).equals("+") || x.get(i).equals("-")) {
                servidor1++;
            } else {
                servidor2++;
            }

        }
        if (servidor1 != 0 && servidor2 != 0) {
            return 2;
        }
        if(servidor1 !=0 && servidor2 ==0){
            return 1;            
        }else{
        return 0;
        }
    }

    public static void main(String args[]) throws IOException {
        new servidor4(12345);
    }

}
