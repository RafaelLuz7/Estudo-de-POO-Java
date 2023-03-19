/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.view;

import br.com.fatec.DAO.ProprietarioDAO;
import br.com.fatec.DAO.VeiculoDAO;
import br.com.fatec.bean.Proprietario;
import br.com.fatec.bean.Veiculo;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class VeiculoView extends javax.swing.JFrame {

    //variaveis auxiliares
    private DefaultComboBoxModel<Proprietario> model;
    private VeiculoDAO dao = new VeiculoDAO();
    
    //para dados
    private Veiculo veiculo;
    
    /**
     * Creates new form VeiculoView
     */
    public VeiculoView() {
        initComponents();
        
        //chama rotina para preencher a combo
        preencheCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        cbProprietario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodProprietario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículos");

        jButton1.setText("Incluir");

        jButton2.setText("Alterar");

        jButton3.setText("Excluir");

        jButton4.setText("Cancelar");

        btnPesquisar.setText("Pesquisar");

        cbProprietario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProprietarioItemStateChanged(evt);
            }
        });

        jLabel1.setText("Placa");

        jLabel2.setText("Proprietário");

        txtCodProprietario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodProprietarioFocusLost(evt);
            }
        });

        jLabel3.setText("Modelo");

        jLabel4.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Busca o código do proprietario e mostra no textBox 
     * quando a combo muda de proprietario
     * @param evt 
     */
    private void cbProprietarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProprietarioItemStateChanged
       //selecionaou
        if(evt.getStateChange() == ItemEvent.SELECTED)  {
           int codigo;
           codigo = ((Proprietario)cbProprietario.getSelectedItem()).getCodProprietario();
           
           //mostrar na tela
           txtCodProprietario.setText(Integer.toString(codigo));
       }
    }//GEN-LAST:event_cbProprietarioItemStateChanged

    /**
     * Programado para que ao sair do campo, fazer uma pesquisa automatica
     * na comboBox e exibir o nome do proprietário, ou deixar vazio caso não exista
     * @param evt 
     */
    private void txtCodProprietarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodProprietarioFocusLost
        Proprietario p = new  Proprietario();
        //obtem o codigo do proprietario da tela
        p.setCodProprietario(Integer.parseInt(txtCodProprietario.getText()));
        
        //deixa a combo sem selecionar ninguem
        cbProprietario.setSelectedIndex(-1);
        
        //faz a procura no modelo da combo ou na própria combo
        cbProprietario.setSelectedItem(p);
        
        //se depois de procurar, não encontrar ninguem, apagar o textBox
        if(cbProprietario.getSelectedIndex() == -1)
            txtCodProprietario.setText("");
    }//GEN-LAST:event_txtCodProprietarioFocusLost

     /**
     * Mostra uma mensagem de informação na tela
     * @param texto 
     */
    private void mensagem(String texto) {
        JOptionPane.showMessageDialog(rootPane, 
                                      texto,
                                      "Informação ao Usuário",
                                      JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Mostra uma mensagem de erro na tela
     * @param erro 
     */
    private void erro(String erro) {
        JOptionPane.showMessageDialog(rootPane, 
                                      erro,
                                      "Informação ao Usuário",
                                      JOptionPane.ERROR_MESSAGE);
    }
    
    private void preencheCombo() {
        ProprietarioDAO propDAO = new ProprietarioDAO();
        
        Proprietario prop[];
        try {
            //chama o metodo lista do DAO que retorna uma coleção, 
            //de posse desta coleção é chamado um método da coleção que transforma
            //um ArrayLista em um vetor [].
            prop = propDAO.lista("").toArray(new Proprietario[0]);
            
            //instanciar meu model
            model = new DefaultComboBoxModel<>(prop);
            
            //colocar o model dentro da combo
            cbProprietario.setModel(model);
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
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VeiculoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<Proprietario> cbProprietario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCodProprietario;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
