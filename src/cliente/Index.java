/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley
 */
public class Index extends javax.swing.JFrame {

    //Guarda valores da operação em ordem
    ArrayList<String> valores = new ArrayList();
    //Guarda os tipos de operações ( +, - , * , /) em ordem
    ArrayList<String> operandos = new ArrayList();
    //Ips dos servidores
    //Servidor 1 : ips.get(0)
    //Servidor 2 : ips.get(1)
    //Servidor 3 : ips.get(2)
    //Servidor 4 : ips.get(3)
    ArrayList<String> ips = new ArrayList();

    public Index(ArrayList<String> ips) {
        this.ips = ips;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operacao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton_multiplicacao = new javax.swing.JButton();
        jButton_raiz = new javax.swing.JButton();
        jButton_menos = new javax.swing.JButton();
        jButton_mais = new javax.swing.JButton();
        jButton_divisao = new javax.swing.JButton();
        jButton_iqual = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_servidor = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        operacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacaoActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton_multiplicacao.setText("*");
        jButton_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_multiplicacaoActionPerformed(evt);
            }
        });

        jButton_raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raiz.png"))); // NOI18N
        jButton_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_raizActionPerformed(evt);
            }
        });

        jButton_menos.setText("-");
        jButton_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_menosActionPerformed(evt);
            }
        });

        jButton_mais.setText("+");
        jButton_mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_maisActionPerformed(evt);
            }
        });

        jButton_divisao.setText("/");
        jButton_divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_divisaoActionPerformed(evt);
            }
        });

        jButton_iqual.setText("=");
        jButton_iqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iqualActionPerformed(evt);
            }
        });

        jMenuBar1.setPreferredSize(new java.awt.Dimension(174, 30));

        menu_servidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/servidor.png"))); // NOI18N
        menu_servidor.setText("Servidores");
        menu_servidor.setMargin(new java.awt.Insets(0, 0, 0, 20));
        menu_servidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_servidorMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_servidor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_iqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(operacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(operacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_iqual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Pega a string do campo TextArea (operação) e armanzena os valores e operandos nos ArrayLists
    private void separandoValoresDeOperandos(String x) {

        int y = 0;

        for (int j = 0; j < x.length(); j++) {
            if (x.charAt(j) == '+' || x.charAt(j) == '-' || x.charAt(j) == '*' || x.charAt(j) == '/') {
                operandos.add(y, "" + x.charAt(j));
                y++;
            } else {
                valores.add(y, "" + x.charAt(j));
            }
        }

    }

    //Verifica se a operação precisa de mais de um servidor para obter o resultado
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
        return 1;
    }

    private boolean verificaIps() {
        if (ips != null) {
            return true;
        } else {

            JOptionPane.showMessageDialog(null, "Cadastre os Ips dos servidores!");
            return false;
        }

    }
    private void jButton_iqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_iqualActionPerformed
        // TODO add your handling code here:
        String ip_aux = "";
        separandoValoresDeOperandos(operacao.getText());
        //Verifica se tem ip cadastrado
        if (verificaIps()) {
            //Caso tenha mais de duas operações em servidores diferentes
            if (permitirOperando(operacao.getText().charAt(operacao.getText().length() - 1))) {
                if (verificandoOperandos(operandos) == 2) {
                    ip_aux = ips.get(3);

                } else {
                    //Verifica se as operações são do servidor 1
                    if (operandos.get(0).equals("+") || operandos.get(0).equals("-")) {

                        ip_aux = ips.get(0);

                    } else {
                        ip_aux = ips.get(1);
                    }

                }

                Socket servidor;
                try {
                    //Criação do socket
                    servidor = new Socket(ip_aux, 12345);
                    //Envio de Array contendo operadores e valores a serem calculados
                    ObjectOutputStream out = new ObjectOutputStream(servidor.getOutputStream());
                    out.writeObject(operandos);
                    out.writeObject(valores);
                    out.writeObject(ips);
                    //Recebendo o resultado do servidor
                    DataInputStream in = new DataInputStream(servidor.getInputStream());
                    operacao.setText("" + in.readInt());

                } catch (IOException ex) {
                    Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            //Limpando operandos e valores
            operandos.removeAll(operandos);
            valores.removeAll(valores);
            System.out.println("Limpado operadores e valores");

        }


    }//GEN-LAST:event_jButton_iqualActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        //Não deixa digitar o zero primeiro
        if (!operacao.getText().equals("")) {
            operacao.setText(operacao.getText() + "0");
        }

    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "7");


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "8");


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        operacao.setText(operacao.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    //Verificar qual o ultimo caractere da operação e analizar se é um operando
    private boolean permitirOperando(char ultimo_caractere) {

        if (ultimo_caractere == '+' || ultimo_caractere == '-' || ultimo_caractere == '*' || ultimo_caractere == '/') {
            return false;
        }
        return true;
    }

    private void jButton_maisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_maisActionPerformed
        // TODO add your handling code here:
        //Evita digitar um operando primeiro
        if (!operacao.getText().equals("")) {
            if (permitirOperando(operacao.getText().charAt(operacao.getText().length() - 1))) {
                operacao.setText(operacao.getText() + "+");
            }
        }

    }//GEN-LAST:event_jButton_maisActionPerformed

    private void jButton_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_menosActionPerformed
        // TODO add your handling code here:
        if (!operacao.getText().equals("")) {
            if (permitirOperando(operacao.getText().charAt(operacao.getText().length() - 1))) {
                operacao.setText(operacao.getText() + "-");

            }
        }
    }//GEN-LAST:event_jButton_menosActionPerformed

    private void jButton_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_divisaoActionPerformed
        // TODO add your handling code here:
        if (!operacao.getText().equals("")) {
            if (permitirOperando(operacao.getText().charAt(operacao.getText().length() - 1))) {
                operacao.setText(operacao.getText() + "/");

            }
        }
    }//GEN-LAST:event_jButton_divisaoActionPerformed

    private void jButton_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_multiplicacaoActionPerformed
        // TODO add your handling code here:
        if (!operacao.getText().equals("")) {
            if (permitirOperando(operacao.getText().charAt(operacao.getText().length() - 1))) {
                operacao.setText(operacao.getText() + "*");

            }
        }
    }//GEN-LAST:event_jButton_multiplicacaoActionPerformed

    private void jButton_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_raizActionPerformed
        // TODO add your handling code here:
        int resultado = 0;
        String ip_aux = "";
        if (verificaIps()) {
            if (!operacao.getText().equals("")) {
                if (permitirOperando(operacao.getText().charAt(operacao.getText().length() - 1))) {
                    separandoValoresDeOperandos(operacao.getText());

                    if (verificandoOperandos(operandos) == 2) {
                        ip_aux = ips.get(3);

                    } else {
                        if (!operandos.isEmpty()) {

                            //Verifica se as operações são do servidor 1                        
                            if (operandos.get(0).equals("+") || operandos.get(0).equals("-")) {

                                ip_aux = ips.get(0);

                            } else {
                                ip_aux = ips.get(1);
                            }
                        }
                    }
                    
                    if (!operandos.isEmpty()) {
                    Socket servidor;
                    try {
                        //Criação do socket
                        servidor = new Socket(ip_aux, 12345);
                        //Envio de Array contendo operadores e valores a serem calculados
                        ObjectOutputStream out = new ObjectOutputStream(servidor.getOutputStream());
                        out.writeObject(operandos);
                        out.writeObject(valores);
                        out.writeObject(ips);
                        //Recebendo o resultado do servidor
                        DataInputStream in = new DataInputStream(servidor.getInputStream());
                        resultado = in.readInt();

                    } catch (IOException ex) {
                        Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }else{
                        resultado = Integer.parseInt(operacao.getText());
                    }
                    Socket servidor3;
                    try {
                        //Criação do socket
                        servidor3 = new Socket(ips.get(2), 12345);
                        //Envio de Array contendo operadores e valores a serem calculados
                        DataOutputStream out = new DataOutputStream(servidor3.getOutputStream());
                        out.writeInt(resultado);

                        //Recebendo o resultado do servidor 3
                        DataInputStream in = new DataInputStream(servidor3.getInputStream());
                        operacao.setText("" + in.readInt());

                    } catch (IOException ex) {
                        Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //Função da raiz quadrada
                    //Math.sqrt(4));
                }
                //Limpando operandos e valores
                operandos.removeAll(operandos);
                valores.removeAll(valores);
                System.out.println("Limpado operadores e valores");
            }
        }
    }//GEN-LAST:event_jButton_raizActionPerformed

    private void menu_servidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_servidorMouseClicked
        // TODO add your handling code here:

        if (ips != null) {
            Servidores s = new Servidores(ips);
            s.setVisible(true);
            this.setVisible(false);
        } else {
            Servidores s = new Servidores();
            s.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_menu_servidorMouseClicked

    private void operacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operacaoActionPerformed

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_divisao;
    private javax.swing.JButton jButton_iqual;
    private javax.swing.JButton jButton_mais;
    private javax.swing.JButton jButton_menos;
    private javax.swing.JButton jButton_multiplicacao;
    private javax.swing.JButton jButton_raiz;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_servidor;
    private javax.swing.JTextField operacao;
    // End of variables declaration//GEN-END:variables
}
