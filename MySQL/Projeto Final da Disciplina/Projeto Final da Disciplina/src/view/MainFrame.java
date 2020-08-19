
package view;

import java.awt.Toolkit;
import javax.swing.JLabel;

public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonValidarConexao = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jLabelStatusConexao = new javax.swing.JLabel();
        jButtonControleEstoque = new javax.swing.JButton();
        jButtonProdutosForaEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        setResizable(false);

        jButtonValidarConexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/server.png"))); // NOI18N
        jButtonValidarConexao.setText("Validar conexão...");
        jButtonValidarConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarConexaoActionPerformed(evt);
            }
        });

        jLabelStatus.setText("Status da conexão:");

        jLabelStatusConexao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStatusConexao.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStatusConexao.setText("Inválida");

        jButtonControleEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventory.png"))); // NOI18N
        jButtonControleEstoque.setText("Controle de estoque");
        jButtonControleEstoque.setEnabled(false);
        jButtonControleEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonControleEstoqueActionPerformed(evt);
            }
        });

        jButtonProdutosForaEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/box.png"))); // NOI18N
        jButtonProdutosForaEstoque.setText("Produtos em falta");
        jButtonProdutosForaEstoque.setEnabled(false);
        jButtonProdutosForaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosForaEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonProdutosForaEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonControleEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelStatusConexao)
                        .addGap(0, 234, Short.MAX_VALUE))
                    .addComponent(jButtonValidarConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProdutosForaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButtonValidarConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(jLabelStatusConexao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarConexaoActionPerformed
        FrameBanco banco = new FrameBanco(this);
        banco.setVisible(true);
    }//GEN-LAST:event_jButtonValidarConexaoActionPerformed

    private void jButtonControleEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonControleEstoqueActionPerformed
        FrameControleEstoque controleEstoque = new FrameControleEstoque(this);
        controleEstoque.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonControleEstoqueActionPerformed

    private void jButtonProdutosForaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosForaEstoqueActionPerformed
        FrameEmFalta emFalta = new FrameEmFalta(this);
        emFalta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonProdutosForaEstoqueActionPerformed

    public void bloquear() {
        jButtonControleEstoque.setEnabled(false);
        jButtonProdutosForaEstoque.setEnabled(false);
    }
    
    public void desbloquear() {
        jButtonControleEstoque.setEnabled(true);
        jButtonProdutosForaEstoque.setEnabled(true);
    }
    
    public JLabel getjLabelStatusConexao() {
        return jLabelStatusConexao;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonControleEstoque;
    private javax.swing.JButton jButtonProdutosForaEstoque;
    private javax.swing.JButton jButtonValidarConexao;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatusConexao;
    // End of variables declaration//GEN-END:variables
}
