
package view;

import controller.DBConfig;

public class BancoFrame extends javax.swing.JFrame {

    //Configuração padrao do banco de dados
    private final String defaultAddress = "192.168.0.10";
    private final String defaultPort = "3306";
    private final String defaultDatabase = "teste";
    private final String defaultUser = "admin";
    private final String defaultPass = "admin";

    public BancoFrame() {
        initComponents();
        setLocationRelativeTo(null);
        jTextFieldAddress.setText(DBConfig.getAddress());
        jTextFieldPort.setText(DBConfig.getPort());
        jTextFieldDatabase.setText(DBConfig.getDatabase());
        jTextFieldUser.setText(DBConfig.getUser());
        jPasswordFieldPass.setText(DBConfig.getPass());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAddress = new javax.swing.JLabel();
        jLabelPort = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPort = new javax.swing.JTextField();
        jLabelDatabase = new javax.swing.JLabel();
        jTextFieldDatabase = new javax.swing.JTextField();
        jLabelUser = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabelPass = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jPasswordFieldPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Projeto - Banco");
        setResizable(false);

        labelAddress.setText("Endereço:");

        jLabelPort.setText("Porta:");

        jLabelDatabase.setText("Nome do Banco:");

        jLabelUser.setText("Usuário:");

        jTextFieldUser.setToolTipText("");

        jLabelPass.setText("Senha:");

        btnReset.setText("Resetar");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetMouseReleased(evt);
            }
        });

        btnConfirm.setText("Confirmar");
        btnConfirm.setToolTipText("");
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnConfirmMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldPass)
                    .addComponent(jTextFieldAddress)
                    .addComponent(jTextFieldPort)
                    .addComponent(jTextFieldDatabase)
                    .addComponent(jTextFieldUser)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(btnConfirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAddress)
                            .addComponent(jLabelPort)
                            .addComponent(jLabelDatabase)
                            .addComponent(jLabelUser)
                            .addComponent(jLabelPass))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabelPort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDatabase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnConfirm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseReleased
        jTextFieldAddress.setText(defaultAddress);
        jTextFieldPort.setText(defaultPort);
        jTextFieldDatabase.setText(defaultDatabase);
        jTextFieldUser.setText(defaultUser);
        jPasswordFieldPass.setText(defaultPass);
    }//GEN-LAST:event_btnResetMouseReleased

    private void btnConfirmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseReleased
        DBConfig.setAddress(jTextFieldAddress.getText());
        DBConfig.setPort(jTextFieldPort.getText());
        DBConfig.setDatabase(jTextFieldDatabase.getText());
        DBConfig.setUser(jTextFieldUser.getText());
        DBConfig.setPass(String.valueOf(jPasswordFieldPass.getPassword()));
        this.dispose();
    }//GEN-LAST:event_btnConfirmMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabelDatabase;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldDatabase;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JLabel labelAddress;
    // End of variables declaration//GEN-END:variables
}
