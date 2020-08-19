
package view;

import controller.DBConfig;
import controller.MySQL;
import model.Arquivo;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FrameBanco extends javax.swing.JFrame {

    MainFrame main;

    public FrameBanco(MainFrame main) {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
        this.main = main;

        Arquivo arquivo = new Arquivo();
        File file = new File("login" + ".json");
        if (file.exists()) {
            arquivo.ler(file);
            jTextFieldBanco.setText(DBConfig.getBanco());
            jTextFieldHost.setText(DBConfig.getHost());
            jTextFieldPorta.setText(DBConfig.getPorta());
            jTextFieldUsuario.setText(DBConfig.getUsuario());
            jPasswordFieldSenha.setText(DBConfig.getSenha());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração do banco");
        setResizable(false);

        jPanelSessao.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuração do banco"));

        jLabelHost.setText("Host:");

        jLabelUsuario.setText("Usuário:");

        jLabelSenha.setText("Senha:");

        jLabelPorta.setText("Porta:");

        jTextFieldPorta.setText("3306");

        jLabelBanco.setText("Banco:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        String senha = new String(jPasswordFieldSenha.getPassword());
        MySQL mysql = new MySQL();
        DBConfig.definirValores(jTextFieldBanco.getText(), jTextFieldHost.getText(), jTextFieldPorta.getText(), jTextFieldUsuario.getText(), senha);
        mysql.conectar();
        try {
            if (mysql.getC() != null) {
                if (!mysql.getC().isClosed()) {
                    Arquivo arquivo = new Arquivo();
                    arquivo.gravar();
                    main.getjLabelStatusConexao().setText("Válida");
                    main.getjLabelStatusConexao().setForeground(Color.GREEN);
                    main.desbloquear();
                    mysql.desconectar();
                    this.dispose();
                }
            } else {
                main.getjLabelStatusConexao().setText("Inválida");
                main.getjLabelStatusConexao().setForeground(Color.RED);
                main.bloquear();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JLabel jLabelBanco;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelSessao;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldBanco;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
