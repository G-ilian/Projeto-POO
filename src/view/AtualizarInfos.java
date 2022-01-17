/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BancoDeDados;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class AtualizarInfos extends javax.swing.JInternalFrame {

    /**
     * Creates new form AtualizarInfos
     */
    public AtualizarInfos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdnBtnProdutor = new javax.swing.JRadioButton();
        rdnBtnAnimais = new javax.swing.JRadioButton();
        rdnBtnVendas = new javax.swing.JRadioButton();
        rdnBtnEndereco = new javax.swing.JRadioButton();
        btnAtualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfIdentificador = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        jLabel1.setText("Atualizar Informações");

        buttonGroup1.add(rdnBtnProdutor);
        rdnBtnProdutor.setText("Produtor");

        buttonGroup1.add(rdnBtnAnimais);
        rdnBtnAnimais.setText("Animais");

        buttonGroup1.add(rdnBtnVendas);
        rdnBtnVendas.setText("Vendas");

        buttonGroup1.add(rdnBtnEndereco);
        rdnBtnEndereco.setText("Endereco");

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jButton2.setText("Retornar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdnBtnProdutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdnBtnVendas)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdnBtnAnimais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdnBtnEndereco)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdnBtnProdutor)
                    .addComponent(rdnBtnVendas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdnBtnAnimais)
                    .addComponent(rdnBtnEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(jButton2))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Banco de Dados utilizado para fazer a atualização dos dados necessários
    BancoDeDados Bd = new BancoDeDados();
    //Variavel chamada opcao
    //Controla qual valor o usuário quer atualizar
    String opcao;
    //Novo dado
    String novoDado;
    //Dado selecionado para ser atualido
    String dadoSelecionado;
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        //Lógica utilizada para fazer as atualizações
        if (rdnBtnAnimais.isSelected()) {
            //Opção que o usuário deseja atualizar
            opcao = JOptionPane.showInputDialog("Qual dado deseja atualizar ?");
            //Passando para Lower case para facilitar o tratamento da informação
            opcao.toLowerCase();
            //Lógica para saber qual opção o usuário digitou
            if (opcao.equalsIgnoreCase("vacinação")) {
                //Capturando o valor informado pelo usuário
                novoDado = JOptionPane.showInputDialog("Atualizar informação da vacinação para ?");
                //Armazenamento interno
                //Responsável por informar ao BD o dado para que ele possa atualizar
                dadoSelecionado = "vacinação";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosAnimais(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equalsIgnoreCase("nome") || opcao.contains("nome animal")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação do nome do Animal para ?");
                dadoSelecionado = "nome";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosAnimais(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equalsIgnoreCase("idade") || opcao.startsWith("id")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação da idade do Animal para ?");
                dadoSelecionado = "idade";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosAnimais(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equalsIgnoreCase("litros") || opcao.startsWith("num") || opcao.contains("leite")) {
                dadoSelecionado = "nLitros";
                novoDado = JOptionPane.showInputDialog("Atualizar informação do número de leite do Animal para ?");
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosAnimais(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else {
                JOptionPane.showMessageDialog(null, "Ensira alguma informação válida\n"
                        + "Opções: Número de litros, idade,nome,vacinação");
            }

        }

        if (rdnBtnEndereco.isSelected()) {
            //Capturando a opcao que o usuário deseja atualizar
            opcao = JOptionPane.showInputDialog("Qual dado deseja atualizar ?");
            //Passando para lower case para tratar todos igualmente
            opcao.toLowerCase();
            if (opcao.equals("país") || opcao.equals("pais")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação do País para ?");
                dadoSelecionado = "pais";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosEndereco(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equals("rua")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação da rua para ?");
                dadoSelecionado = "rua";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosEndereco(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equals("cidade")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação da cidade para ?");
                dadoSelecionado = "cidade";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosEndereco(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equals("complemento")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação do complemento para ?");
                dadoSelecionado = "complemento";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosEndereco(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equals("numero") || opcao.equals("número")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação do número para ?");
                dadoSelecionado = "numero";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosEndereco(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else {
                JOptionPane.showMessageDialog(null, "Ensira alguma informação válida\n"
                        + "Opções: País, rua,cidade,complemento,número");
            }
        }
        if (rdnBtnVendas.isSelected()) {
            //Capturando a opcao que o usuário deseja atualizar
            opcao = JOptionPane.showInputDialog("Qual dado deseja atualizar ?");
            //Passando para lower case para tratar todos igualmente
            opcao.toLowerCase();
            //Tratando a opção
            if (opcao.equals("cpf") || opcao.equals("cpf comprador")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação do cpf do comprador para ?");
                dadoSelecionado = "cpf";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosVendas(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equals("nome") || opcao.equals("nome comprador")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação do nome do comprador para ?");
                dadoSelecionado = "nome";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosVendas(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equals("valor") || opcao.equals("valor compra")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação do valor para ?");
                dadoSelecionado = "valor";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosVendas(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equals("quantidade") || opcao.equals("número de peças") || opcao.startsWith("numero")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação da quantidade vendida para ?");
                dadoSelecionado = "quantidade";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosVendas(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else if (opcao.equals("data compra") || opcao.equals("data")) {
                novoDado = JOptionPane.showInputDialog("Atualizar informação da data da venda para ?");
                dadoSelecionado = "data";
                //Conexão com o BD, onde peço para atualizar o valor
                Bd.atualizarDadosVendas(tfIdentificador.getText(), novoDado, dadoSelecionado);
            } else {
                JOptionPane.showMessageDialog(null, "Ensira alguma informação válida\n"
                        + "Opções: Quantidade,data,valor,cpf comprador,nome comprador");
            }
        }
        if (rdnBtnProdutor.isSelected()) {
            //Limpando o id, pois ele não será utilizado
            tfIdentificador.setText(" ");
            //Informar cpf do produtor que deseja atualizar
            String cpf = JOptionPane.showInputDialog("CPF do produtor que deseja atualizar ?");
            if (cpf.equals("")) {
                JOptionPane.showMessageDialog(null, "Favor informar o CPF");
            } else {
                //Capturando a opcao que o usuário deseja atualizar
                opcao = JOptionPane.showInputDialog("Qual dado deseja atualizar ?");
                //Passando para lower case para tratar todos igualmente
                opcao.toLowerCase();

                if (opcao.equals("cpf") || opcao.equals("cpf produtor")) {
                    novoDado = JOptionPane.showInputDialog("Atualizar informação do cpf do produtior para ?");
                    dadoSelecionado = "cpf";
                    Bd.atualizarDadosProdutor(cpf, novoDado, dadoSelecionado);
                } else if (opcao.equals("nome") || opcao.equals("nome produtor")) {
                    novoDado = JOptionPane.showInputDialog("Atualizar informação do nome do produtior para ?");
                    dadoSelecionado = "nome";
                    Bd.atualizarDadosProdutor(cpf, novoDado, dadoSelecionado);
                } else if (opcao.equals("idade") || opcao.equals("idade produtor")) {
                    novoDado = JOptionPane.showInputDialog("Atualizar informação da idade do produtior para ?");
                    dadoSelecionado = "idade";
                    Bd.atualizarDadosProdutor(cpf, novoDado, dadoSelecionado);
                } else {
                    JOptionPane.showMessageDialog(null, "Ensira alguma informação válida\n"
                            + "Opções: Nome,CPF,idade");
                }
            }

        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdnBtnAnimais;
    private javax.swing.JRadioButton rdnBtnEndereco;
    private javax.swing.JRadioButton rdnBtnProdutor;
    private javax.swing.JRadioButton rdnBtnVendas;
    private javax.swing.JTextField tfIdentificador;
    // End of variables declaration//GEN-END:variables
}
