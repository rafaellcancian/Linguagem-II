
package view;

import javax.swing.JOptionPane;

public class CrudFrame extends javax.swing.JFrame {

    MainFrame mFrame;
    private final String tipo;

    public CrudFrame(MainFrame mFrame, String tipo) {
        initComponents();
        setLocationRelativeTo(null);
        jRadioAtivo.setSelected(true);
        this.mFrame = mFrame;
        this.tipo = tipo;

        if (tipo.equals("inserir")) {
            jButtonConfirmar.setText("Inserir");
        } else if (tipo.equals("alterar")) {
            jButtonConfirmar.setText("Alterar");
            jTextDescricao.setText((String) mFrame.getjTableCampos().getValueAt(mFrame.getjTableCampos().getSelectedRow(), 1));
            jTextValor.setText((String) mFrame.getjTableCampos().getValueAt(mFrame.getjTableCampos().getSelectedRow(), 2));
            if (Integer.parseInt((String) mFrame.getjTableCampos().getValueAt(mFrame.getjTableCampos().getSelectedRow(), 3)) == 1) {
                jRadioAtivo.setSelected(true);
            } else {
                jRadioInativo.setSelected(true);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelCampo1 = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelCampo2 = new javax.swing.JLabel();
        jTextValor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelCampo3 = new javax.swing.JLabel();
        jRadioAtivo = new javax.swing.JRadioButton();
        jRadioInativo = new javax.swing.JRadioButton();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Projeto - Inserir/Alterar");
        setResizable(false);

        jLabelCampo1.setText("Descrição:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCampo1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextDescricao))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCampo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelCampo2.setText("Valor:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCampo2)
                        .addGap(0, 284, Short.MAX_VALUE))
                    .addComponent(jTextValor))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCampo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelCampo3.setText("Status:");

        buttonGroupStatus.add(jRadioAtivo);
        jRadioAtivo.setText("Ativo");

        buttonGroupStatus.add(jRadioInativo);
        jRadioInativo.setText("Inativo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioInativo)
                    .addComponent(jLabelCampo3)
                    .addComponent(jRadioAtivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCampo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioInativo)
                .addContainerGap())
        );

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        if (verificarErros() == false) {
            if (tipo.equals("inserir")) {
                inserir();
            } else if (tipo.equals("alterar")) {
                alterar();
            }
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    public boolean verificarErros() {
        boolean erro = false;

        if (jTextDescricao.getText().isEmpty() || jTextValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "AVISO: Preencha todos os campos corretamente.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
            erro = true;
        }

        return erro;
    }

    public void inserir() {
        String status;
        if (jRadioAtivo.isSelected()) {
            status = "1";
        } else {
            status = "0";
        }

        String query = "INSERT INTO servico (descricao, valor_servico, status) " + "values ('" + jTextDescricao.getText() + "', '" + jTextValor.getText() + "', '" + status + "')";
        mFrame.controlador.conectar();
        int statusQuery = mFrame.controlador.executeUpdate(query);

        if (statusQuery == 1) {
            mFrame.atualizar();
            mFrame.controlador.desconectar();
            limparCampos();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "ERRO: Os dados não foram inseridos.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void alterar() {
        String status;
        if (jRadioAtivo.isSelected()) {
            status = "1";
        } else {
            status = "0";
        }

        int id = Integer.parseInt((String) mFrame.getjTableCampos().getValueAt(mFrame.getjTableCampos().getSelectedRow(), 0));
        String query = "UPDATE servico SET descricao='" + jTextDescricao.getText() + "', " + "valor_servico='" + jTextValor.getText() + "', status='" + status + "' WHERE id_servico=" + id;
        mFrame.controlador.conectar();
        int statusQuery = mFrame.controlador.executeUpdate(query);

        if (statusQuery == 1) {
            mFrame.atualizar();
            mFrame.controlador.desconectar();
            limparCampos();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "ERRO: Os dados não foram alterados.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limparCampos() {
        jTextDescricao.setText("");
        jTextValor.setText("");
        jRadioAtivo.setSelected(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabelCampo1;
    private javax.swing.JLabel jLabelCampo2;
    private javax.swing.JLabel jLabelCampo3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioAtivo;
    private javax.swing.JRadioButton jRadioInativo;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
