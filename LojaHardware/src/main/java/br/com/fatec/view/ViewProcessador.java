/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.view;

import br.com.fatec.DAO.ProcessadorDAO;
import br.com.fatec.bean.PlacaMae;
//import br.com.fatec.bean.PlacaMae;
import br.com.fatec.bean.Processador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ViewProcessador extends javax.swing.JFrame {
    
    private DefaultComboBoxModel<Processador> model;
    private ProcessadorDAO dao = new ProcessadorDAO();
    
    private Processador processador = new Processador();
    
    
    public ViewProcessador() {
        initComponents();
        
       
    }
    private void moveDadosTelaParaObjeto(){
            processador = new Processador();
            processador.setCodProcessador(Integer.parseInt(txt_cod.getText()));
            processador.setModeloProcessador(txt_nome.getText());
            processador.setValorProcessador(Double.parseDouble(txt_preco.getText()));
            processador.setDescricaoProcessador(txt_desc.getText());
        }
        
        private void moveDadosObjetoParaTela(){
            txt_cod.setText(String.valueOf(processador.getCodProcessador()));
            txt_nome.setText(processador.getModeloProcessador());
            txt_preco.setText(String.valueOf(processador.getValorProcessador()));
            txt_desc.setText(processador.getDescricaoProcessador());
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_inserir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_preco = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_desc = new javax.swing.JTextArea();
        btn_remover = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE PROCESSADORES");

        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código do Processador:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Descrição:");

        txt_desc.setColumns(20);
        txt_desc.setRows(5);
        jScrollPane2.setViewportView(txt_desc);

        btn_remover.setText("Deletar");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_inserir)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_remover)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inserir)
                    .addComponent(btn_alterar)
                    .addComponent(btn_buscar)
                    .addComponent(btn_remover))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        //VALIDACAO DE DADOS
       if(txt_cod.getText() == null || txt_preco.getText() == null || txt_desc.getText() == null || txt_nome.getText() == null){
            JOptionPane.showMessageDialog(rootPane, "PREENCHA TODOS OS CAMPOS","MSG ao user", JOptionPane.ERROR_MESSAGE);
            
        }else{
            moveDadosTelaParaObjeto();
            try{
                if(dao.insere(processador)){
                JOptionPane.showConfirmDialog(rootPane, "DADOS GRAVADOS COM SUCESSO");
            
                }else{
                 JOptionPane.showConfirmDialog(rootPane, "ERRO NA GRAVACAO");
                }
            
        }catch(SQLException ex){
            JOptionPane.showConfirmDialog(rootPane, "ERRO NA GRAVACAO" + ex.getMessage());
        }
        }
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        processador = new Processador();
        processador.setCodProcessador(Integer.parseInt(txt_cod.getText()));
        try{
            processador = dao.buscaID(processador);
            if(processador!=null){
                moveDadosObjetoParaTela();
            }
            else{
                JOptionPane.showConfirmDialog(rootPane, "PROCESSADOR N ENCONTRADO");
            }
        }catch(SQLException ex){
            JOptionPane.showConfirmDialog(rootPane, "ERRO NA BUSCA" + ex.getMessage());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        //VALIDACAO DE DADOS
       if(txt_cod.getText() == null || txt_preco.getText() == null || txt_desc.getText() == null || txt_nome.getText() == null){
            JOptionPane.showMessageDialog(rootPane, "PREENCHA TODOS OS CAMPOS","MSG ao user", JOptionPane.ERROR_MESSAGE);
            
        }else{
            moveDadosTelaParaObjeto();
            try{
                if(dao.altera(processador)){
                    JOptionPane.showConfirmDialog(rootPane, "DADOS ALTERADOS COM SUCESSO");
                
                }
                else{
                    JOptionPane.showConfirmDialog(rootPane, "OCORREU ALGUM ERRO NA ALTERACAO");
                }
            }catch(SQLException ex){
                JOptionPane.showConfirmDialog(rootPane, "ERRO NA ALTERACAO " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
    try {
            
            dao.remove(processador);
             JOptionPane.showConfirmDialog(rootPane, "DADOS DELETADOS COM SUCESSO");
        } catch (SQLException ex) {
            Logger.getLogger(ViewPlacaMae.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_btn_removerActionPerformed
    
    private void erro(String erro) {
        JOptionPane.showMessageDialog(rootPane, 
                                      erro,
                                      "Informação ao Usuário",
                                      JOptionPane.ERROR_MESSAGE);
        
    }
     
    
    
    /**
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
            java.util.logging.Logger.getLogger(ViewProcessador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProcessador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProcessador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProcessador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProcessador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextArea txt_desc;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_preco;
    // End of variables declaration//GEN-END:variables
}
