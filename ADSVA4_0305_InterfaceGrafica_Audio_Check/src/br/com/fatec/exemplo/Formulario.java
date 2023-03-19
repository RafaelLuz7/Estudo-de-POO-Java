/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.exemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
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

        btgEstadoCivil = new javax.swing.ButtonGroup();
        rbSolteiro = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        rbNamorando = new javax.swing.JRadioButton();
        chkManha = new javax.swing.JCheckBox();
        chkTarde = new javax.swing.JCheckBox();
        chkNoite = new javax.swing.JCheckBox();
        btnExibirRadio = new javax.swing.JButton();
        btnExibirCheckBox = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btgEstadoCivil.add(rbSolteiro);
        rbSolteiro.setText("Solteiro");

        btgEstadoCivil.add(rbCasado);
        rbCasado.setText("Casado");

        btgEstadoCivil.add(rbNamorando);
        rbNamorando.setText("Namorando");

        chkManha.setText("Manhã");

        chkTarde.setText("Tarde");

        chkNoite.setText("Noite");

        btnExibirRadio.setText("Exibir Radio");
        btnExibirRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirRadioActionPerformed(evt);
            }
        });

        btnExibirCheckBox.setText("Exibir CheckBox");
        btnExibirCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirCheckBoxActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar Opções");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExibirRadio)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCasado)
                            .addComponent(rbSolteiro)
                            .addComponent(rbNamorando))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExibirCheckBox)
                    .addComponent(chkTarde)
                    .addComponent(chkManha)
                    .addComponent(chkNoite))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkManha)
                    .addComponent(rbSolteiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCasado)
                    .addComponent(chkTarde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNamorando)
                    .addComponent(chkNoite))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExibirRadio)
                    .addComponent(btnExibirCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExibirRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirRadioActionPerformed
      String escolha="";
      if(rbCasado.isSelected()){
          escolha="Casado";
      }
      else if(rbNamorando.isSelected()){
          escolha= "Namorando";
      }
       else if(rbSolteiro.isSelected()){
          escolha= "Solteiro";
      }
      JOptionPane.showMessageDialog(rootPane,
                                    "Você está "+ escolha,
                                    "Mensagem ao Usuário",
                                    JOptionPane.INFORMATION_MESSAGE);
           
    }//GEN-LAST:event_btnExibirRadioActionPerformed

    private void btnExibirCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirCheckBoxActionPerformed
        String escolha="";
        if(chkManha.isSelected()){
            escolha = "Manhã";
        }
          if(chkTarde.isSelected()){
            escolha += "Tarde";
        }
            if(chkNoite.isSelected()){
            escolha += "Noite";
        }
            JOptionPane.showMessageDialog(rootPane,
                                    "Periodo é de "+ escolha,
                                    "Mensagem ao Usuário",
                                    JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnExibirCheckBoxActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
      //desmarca todas as opções RB que estão em buttonGroup
        btgEstadoCivil.clearSelection();
       
       chkManha.setSelected(false);
       chkTarde.setSelected(false);
       chkNoite.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgEstadoCivil;
    private javax.swing.JButton btnExibirCheckBox;
    private javax.swing.JButton btnExibirRadio;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox chkManha;
    private javax.swing.JCheckBox chkNoite;
    private javax.swing.JCheckBox chkTarde;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbNamorando;
    private javax.swing.JRadioButton rbSolteiro;
    // End of variables declaration//GEN-END:variables
}
