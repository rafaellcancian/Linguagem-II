
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {
    
    Connection c;
    MySQL mysql;
    
    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
        mysql = new MySQL();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameConexao = new javax.swing.JFrame();
        jPanelSessao = new javax.swing.JPanel();
        jTextFieldHost = new javax.swing.JTextField();
        jLabelHost = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelPorta = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jLabelBanco = new javax.swing.JLabel();
        jTextFieldBanco = new javax.swing.JTextField();
        jButtonConectar = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jLabelStatusConexao = new javax.swing.JLabel();
        jButtonAbrirConectar = new javax.swing.JButton();
        jButtonDesconectar = new javax.swing.JButton();
        jComboNomes = new javax.swing.JComboBox<>();
        jLabelStatusNomes = new javax.swing.JLabel();

        jFrameConexao.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrameConexao.setTitle("Prova 2 - Conectar");
        jFrameConexao.setResizable(false);

        jPanelSessao.setBorder(javax.swing.BorderFactory.createTitledBorder("Sessão"));

        jTextFieldHost.setText("172.25.1.17");

        jLabelHost.setText("Host:");

        jLabelUsuario.setText("Usuário:");

        jTextFieldUsuario.setText("scada");

        jLabelSenha.setText("Senha:");

        jPasswordFieldSenha.setText("12345");

        jLabelPorta.setText("Porta:");

        jTextFieldPorta.setText("3306");

        jLabelBanco.setText("Banco:");

        jTextFieldBanco.setText("supervisorio");

        javax.swing.GroupLayout jPanelSessaoLayout = new javax.swing.GroupLayout(jPanelSessao);
        jPanelSessao.setLayout(jPanelSessaoLayout);
        jPanelSessaoLayout.setHorizontalGroup(
            jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSessaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldBanco)
                    .addGroup(jPanelSessaoLayout.createSequentialGroup()
                        .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHost)
                            .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPorta)
                            .addComponent(jTextFieldPorta)))
                    .addGroup(jPanelSessaoLayout.createSequentialGroup()
                        .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSessaoLayout.createSequentialGroup()
                                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSessaoLayout.createSequentialGroup()
                                .addComponent(jLabelUsuario)
                                .addGap(116, 116, 116)))
                        .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelSessaoLayout.createSequentialGroup()
                                .addComponent(jLabelSenha)
                                .addGap(116, 116, 116))
                            .addComponent(jPasswordFieldSenha)))
                    .addComponent(jLabelBanco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSessaoLayout.setVerticalGroup(
            jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSessaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHost)
                    .addComponent(jLabelPorta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameConexaoLayout = new javax.swing.GroupLayout(jFrameConexao.getContentPane());
        jFrameConexao.getContentPane().setLayout(jFrameConexaoLayout);
        jFrameConexaoLayout.setHorizontalGroup(
            jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jFrameConexaoLayout.setVerticalGroup(
            jFrameConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prova 2");
        setResizable(false);

        jLabelStatus.setText("Status da conexão:");

        jLabelStatusConexao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStatusConexao.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStatusConexao.setText("Offline");

        jButtonAbrirConectar.setText("Conectar");
        jButtonAbrirConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirConectarActionPerformed(evt);
            }
        });

        jButtonDesconectar.setText("Desconectar");
        jButtonDesconectar.setEnabled(false);
        jButtonDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesconectarActionPerformed(evt);
            }
        });

        jComboNomes.setEnabled(false);
        jComboNomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboNomesActionPerformed(evt);
            }
        });

        jLabelStatusNomes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelStatusNomes.setText("Status: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboNomes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStatusConexao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAbrirConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDesconectar))
                            .addComponent(jLabelStatusNomes))
                        .addGap(0, 158, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboNomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelStatusNomes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus)
                    .addComponent(jLabelStatusConexao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAbrirConectar)
                    .addComponent(jButtonDesconectar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirConectarActionPerformed
        jFrameConexao.setVisible(true);
        jFrameConexao.setSize(363, 266);
        jFrameConexao.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonAbrirConectarActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        String senha = new String(jPasswordFieldSenha.getPassword());
        Sessao sessao = new Sessao(jTextFieldBanco.getText(), jTextFieldHost.getText(), jTextFieldPorta.getText(), jTextFieldUsuario.getText(), senha);
        c = mysql.conectar(sessao);
        try {
            if (c.isValid(0)) {
                jLabelStatusConexao.setText("Online");
                jLabelStatusConexao.setForeground(Color.GREEN);
                jFrameConexao.dispose();
                atualizar();
                desbloquear();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButtonDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesconectarActionPerformed
        try {
            c.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
        jLabelStatusConexao.setText("Offline");
        jLabelStatusConexao.setForeground(Color.RED);
        jComboNomes.removeAllItems();
        jLabelStatusNomes.setText("Status:");
        bloquear();
    }//GEN-LAST:event_jButtonDesconectarActionPerformed

    private void jComboNomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboNomesActionPerformed
        if (jComboNomes.getItemCount() > 0) {
            try {
                ResultSet rs = mysql.consultar("SELECT status FROM dispositivo where nome='" + jComboNomes.getSelectedItem().toString() + "'");
                if (rs != null) {
                    while (rs.next()) {
                        jLabelStatusNomes.setText("Status: " + rs.getString("status"));
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jComboNomesActionPerformed
    
    public void atualizar() {
        try {
            ResultSet rs = mysql.consultar("SELECT nome FROM dispositivo");
            if (rs != null) {
                while (rs.next()) {
                    jComboNomes.addItem(rs.getString("nome"));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void bloquear() {
        jComboNomes.setEnabled(false);
        jButtonAbrirConectar.setEnabled(true);
        jButtonDesconectar.setEnabled(false);
    }
    
    public void desbloquear() {
        jComboNomes.setEnabled(true);
        jButtonAbrirConectar.setEnabled(false);
        jButtonDesconectar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirConectar;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonDesconectar;
    private javax.swing.JComboBox<String> jComboNomes;
    private javax.swing.JFrame jFrameConexao;
    private javax.swing.JLabel jLabelBanco;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatusConexao;
    private javax.swing.JLabel jLabelStatusNomes;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelSessao;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldBanco;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
