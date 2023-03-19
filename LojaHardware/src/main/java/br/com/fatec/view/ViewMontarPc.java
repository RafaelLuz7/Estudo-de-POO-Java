/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.view;

import br.com.fatec.DAO.MontarPcDAO;
import br.com.fatec.DAO.PlacaMaeDAO;
import br.com.fatec.DAO.ProcessadorDAO;
import br.com.fatec.bean.MontarPc;
import br.com.fatec.bean.PlacaMae;
import br.com.fatec.bean.Processador;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ViewMontarPc extends javax.swing.JFrame {

    /**
     * Creates new form MontarPc
     */
    
       private DefaultComboBoxModel<PlacaMae> model;
       private DefaultComboBoxModel<Processador> modelo;

    private MontarPcDAO dao = new MontarPcDAO();
    
    //para dados
    private MontarPc montarpc;
    
   
    
    public ViewMontarPc() {
        initComponents();
         preencheCombo();
         preencherCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb_processador = new javax.swing.JComboBox<>();
        cb_placa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        descont_txt = new javax.swing.JTextField();
        total_txt = new javax.swing.JTextField();
        btn_inserir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_processador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_processadorActionPerformed(evt);
            }
        });

        jLabel1.setText("SELECIONE OS ITENS QUE DESEJA: ");

        jLabel2.setText("Placa Mãe:");

        jLabel3.setText("Processador:");

        jLabel4.setText("Desconto:");

        jLabel5.setText("Valor Total:");

        descont_txt.setEditable(false);
        descont_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descont_txtActionPerformed(evt);
            }
        });

        total_txt.setEditable(false);

        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });

        btn_alterar.setText("Alterar");

        btn_excluir.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cb_processador, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descont_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btn_inserir)
                .addGap(28, 28, 28)
                .addComponent(btn_alterar)
                .addGap(26, 26, 26)
                .addComponent(btn_excluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_processador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descont_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(total_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inserir)
                    .addComponent(btn_alterar)
                    .addComponent(btn_excluir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descont_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descont_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descont_txtActionPerformed

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void cb_processadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_processadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_processadorActionPerformed

     private void erro(String erro) {
        JOptionPane.showMessageDialog(rootPane, 
                                      erro,
                                      "Informação ao Usuário",
                                      JOptionPane.ERROR_MESSAGE);
    }
    
    
    private void preencheCombo() {
        PlacaMaeDAO placaDAO = new PlacaMaeDAO();
    
        
        PlacaMae placa[];
     
        try {
            //chama o metodo lista do DAO que retorna uma coleção, 
            //de posse desta coleção é chamado um método da coleção que transforma
            //um ArrayLista em um vetor [].
            placa = placaDAO.lista("").toArray(new PlacaMae[0]);
           
            
            //instanciar meu model
            model = new DefaultComboBoxModel<>(placa);
            
            //colocar o model dentro da combo
            cb_placa.setModel(model);
            
        } catch (SQLException ex) {
            erro("Carregamento da Combo com problema...");
            return;
        }
        
        
    }
        private void preencherCombo() {
        ProcessadorDAO processDAO = new ProcessadorDAO();
    
        
        Processador process[];
     
        try {
            //chama o metodo lista do DAO que retorna uma coleção, 
            //de posse desta coleção é chamado um método da coleção que transforma
            //um ArrayLista em um vetor [].
            process = processDAO.lista("").toArray(new Processador[0]);
           
            
            //instanciar meu model
            modelo = new DefaultComboBoxModel<>(process);
            
            //colocar o model dentro da combo
            cb_processador.setModel(modelo);
            
        } catch (SQLException ex) {
            erro("Carregamento da Combo com problema...");
            return;
        }
        
        
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
            java.util.logging.Logger.getLogger(ViewMontarPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMontarPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMontarPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMontarPc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMontarPc().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JComboBox<PlacaMae> cb_placa;
    private javax.swing.JComboBox<Processador> cb_processador;
    private javax.swing.JTextField descont_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField total_txt;
    // End of variables declaration//GEN-END:variables
}
