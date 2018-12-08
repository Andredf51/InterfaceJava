package Vista1;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        celular = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JFormattedTextField();
        idade = new javax.swing.JFormattedTextField();
        data = new javax.swing.JFormattedTextField();
        servicos = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        cadastrar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        pagamento = new javax.swing.JComboBox<>();
        Valor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("nome");

        jLabel2.setText("celular");

        jLabel3.setText("cpf");

        jLabel4.setText("idade");

        jLabel5.setText("data");

        jLabel6.setText("pagamento");

        jLabel7.setText("serviços");

        jLabel8.setText("valor");

        try {
            celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        idade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        servicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione opção", "clareamento", "aparelho", "raio-x", "cirurgia" }));
        servicos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                servicosItemStateChanged(evt);
            }
        });

        jLabel9.setText("obs");

        obs.setColumns(20);
        obs.setRows(5);
        jScrollPane3.setViewportView(obs);

        cadastrar.setText("cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        remover.setText("remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        atualizar.setText("atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione pagamento", "Boleto", "À vista", "Cartão de crédito", "Cartão de débito", "Convênio"}));
        pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoActionPerformed(evt);
            }
        });

        Valor.setText("0");
        Valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(data, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cpf, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(celular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pagamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(servicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                            .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpf)
                    .addComponent(Valor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(remover)
                    .addComponent(atualizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nome", "celular", "cpf", "idade", "data", "pagamento", "serviços", "valor", "obs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabelaMouseClicked(evt);
            }
        });
        jtTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel dtmCadastro = (DefaultTableModel) jtTabela.getModel();
        Object[] dados = {nome.getText(), celular.getText(), cpf.getText(), idade.getText(), data.getText(), pagamento.getSelectedItem(), servicos.getSelectedItem(), Valor.getText(), obs.getText()};
        dtmCadastro.addRow(dados);
    }//GEN-LAST:event_cadastrarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        // TODO add your handling code here:
        if(jtTabela.getSelectedRow() != -1) {
            DefaultTableModel dtmCadastro = (DefaultTableModel) jtTabela.getModel();
            dtmCadastro.removeRow(jtTabela.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null,"Selecione ao menos um cadastro");
        }
    }//GEN-LAST:event_removerActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        // TODO add your handling code here:
            if (jtTabela.getSelectedRow() != -1){
            jtTabela.setValueAt(nome.getText(),jtTabela.getSelectedRow() , 0);
            jtTabela.setValueAt(celular.getText(),jtTabela.getSelectedRow() , 1);
            jtTabela.setValueAt(cpf.getText(),jtTabela.getSelectedRow() , 2);
            jtTabela.setValueAt(idade.getText(),jtTabela.getSelectedRow() , 3);
            jtTabela.setValueAt(data.getText(),jtTabela.getSelectedRow() , 4);
            jtTabela.setValueAt(pagamento.getSelectedItem(),jtTabela.getSelectedRow() , 5);
            jtTabela.setValueAt(servicos.getSelectedItem(),jtTabela.getSelectedRow() , 6);
            jtTabela.setValueAt(Valor.getText(),jtTabela.getSelectedRow() , 7);
            jtTabela.setValueAt(obs.getText(),jtTabela.getSelectedRow() , 8);
            
        }
    }//GEN-LAST:event_atualizarActionPerformed

    private void jtTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaMouseClicked
        // TODO add your handling code here:
        if (jtTabela.getSelectedRow() != -1){
            nome.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 0).toString());
            celular.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 1).toString());
            cpf.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 2).toString());
            idade.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 3).toString());
            data.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 4).toString());
            pagamento.setSelectedItem(jtTabela.getValueAt(jtTabela.getSelectedRow(), 5).toString());
            servicos.setSelectedItem(jtTabela.getValueAt(jtTabela.getSelectedRow(), 6).toString());
            Valor.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 7).toString());
            obs.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 8).toString());
        }
    }//GEN-LAST:event_jtTabelaMouseClicked

    private void jtTabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTabelaKeyReleased
        // TODO add your handling code here:
        if (jtTabela.getSelectedRow() != -1){
            nome.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 0).toString());
            celular.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 1).toString());
            cpf.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 2).toString());
            idade.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 3).toString());
            data.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 4).toString());
            pagamento.setSelectedItem(jtTabela.getValueAt(jtTabela.getSelectedRow(), 5).toString());
            servicos.setSelectedItem(jtTabela.getValueAt(jtTabela.getSelectedRow(), 6).toString());
            Valor.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 7).toString());
            obs.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(), 8).toString());
        }
    }//GEN-LAST:event_jtTabelaKeyReleased

    private void pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoActionPerformed
        // TODO add your handling code here:
        int valorConsulta = 0;
        calcularTotal();
        String[] options = {"1","2","3"};
        String[] convenio = {"Amil Dental","Unimed","OdontoPrev","Outro"};
        String formaPagamento = ((String) pagamento.getSelectedItem());

        System.out.println(formaPagamento);

        if (formaPagamento.equals("Cartão de crédito")) {
            int parcelas = JOptionPane.showOptionDialog(null, "Parcelas? ", "Cartão Crédito", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
            if (parcelas == JOptionPane.YES_OPTION){
                //valor.setValueAt(formaPagamento);
                JOptionPane.showMessageDialog(null,"Pagamento em 1x");
                valorConsulta = parcelas;
            } else if (parcelas == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"Pagamento em 2x");
                valorConsulta = parcelas;
            }
            else if (parcelas == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null,"Pagamento em 3x");
                valorConsulta = parcelas;
            }
            //            if (jtTabela.getSelectedRow() != -1){
                //                jtTabela.setValueAt(valor.setText(Clareamento),jtTabela.getSelectedRow() , 7);
                //            }
//            Valor.setText(String.setValueOf(Clareamento));
//            Valor.setText("");
        }
        if (formaPagamento.equals("Cartão de Débito")) {
//            JOptionPane.showMessageDialog(null,"Pagamento será realizado");
        }
        if (formaPagamento.equals("À vista")) {
 //            JOptionPane.showMessageDialog(null,"Pagamento será efetuado");
        }
        if (formaPagamento.equals("Convênio")) {
            int parcelas = JOptionPane.showOptionDialog(null, "Qual o convênio? ", "Convênio", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, convenio, null);
            if (parcelas == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"Convênio Aceito");
            } else if (parcelas == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null,"Convênio Aceito");
            }
            else if (parcelas == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null,"Convênio Aceito");
            } else if (parcelas == JOptionPane.CANCEL_OPTION+1){
                JOptionPane.showMessageDialog(null,"Selecione outra forma de Pagamento");
            }
        }

    }//GEN-LAST:event_pagamentoActionPerformed

    private void ValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorKeyTyped
     // TODO add your handling code here:
        if(evt.getKeyChar() == '\n') {
            calcularTotal();
        }
    }//GEN-LAST:event_ValorKeyTyped

    private void servicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_servicosItemStateChanged
        // TODO add your handling code here:
        calcularTotal();
    }//GEN-LAST:event_servicosItemStateChanged

    public void calcularTotal() { //caso de um item selecionado
        double valor = 0;
        String servico = (String)servicos.getSelectedItem();
        switch(servico) {
            case "Consulta":
                valor+= 100;
                break;
            case "Limpeza":
                valor+= 130;
                break;
            case "Clareamento":
                valor+= 450;
                break;
            case "Aparelho":
                valor+= 100;
                break;
            case "Raio-x":
                valor+= 80;
                break;
            case "Cirurgia":
                valor+= 70;//dúvida no uso
                break;
        }
        if(!Valor.getText().equals("")) {
            valor += Double.parseDouble(Valor.getText());
        } 
        DecimalFormat df = new DecimalFormat("R$ #,###.00"); //mascara para formatação do resultado da soma
        Valor.setText(df.format(valor));
    }
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Valor;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JFormattedTextField celular;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtTabela;
    private javax.swing.JTextField nome;
    private javax.swing.JTextArea obs;
    private javax.swing.JComboBox<String> pagamento;
    private javax.swing.JButton remover;
    private javax.swing.JComboBox<String> servicos;
    // End of variables declaration//GEN-END:variables
}
