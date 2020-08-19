
package view;

import controller.MySQL;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FrameControleEstoque extends javax.swing.JFrame {

    MainFrame main;
    DefaultTableModel model;
    MySQL mysql;

    public FrameControleEstoque(MainFrame main) {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
        this.main = main;
        mysql = new MySQL();
        model = (DefaultTableModel) jTableMain.getModel();
        mysql.conectar();
        atualizar();
        mysql.desconectar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextPesquisa = new javax.swing.JTextField();
        jComboTipoPesquisa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMain = new javax.swing.JTable();
        jButtonInserir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonMarcarFalta = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de estoque");

        jTextPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPesquisaKeyReleased(evt);
            }
        });

        jComboTipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código de barra", "Descrição", "Tipo", "Quantidade", "Valor unitário" }));

        jTableMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código de barra", "Descrição", "Tipo", "Quantidade", "Valor unitário", "Data/Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMain);

        jButtonInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButtonInserir.setText("Adicionar");
        jButtonInserir.setToolTipText("Adicionar produto");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jButtonAlterar.setText("Editar");
        jButtonAlterar.setToolTipText("Editar produto");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonMarcarFalta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flag.png"))); // NOI18N
        jButtonMarcarFalta.setText("Em falta");
        jButtonMarcarFalta.setToolTipText("Marcar como em falta");
        jButtonMarcarFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarFaltaActionPerformed(evt);
            }
        });

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setToolTipText("Atualizar estoque");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-arrow.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setToolTipText("Voltar para o menu principal");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rubbish-bin.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setToolTipText("Excluir permanentemente");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextPesquisa)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMarcarFalta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboTipoPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboTipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMarcarFalta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPesquisaKeyReleased
        String tipoPesquisa = "";

        switch (jComboTipoPesquisa.getSelectedIndex()) {
            case 0:
                tipoPesquisa = "CODIGO_DE_BARRA";
                break;
            case 1:
                tipoPesquisa = "DESCRICAO";
                break;
            case 2:
                tipoPesquisa = "TIPO";
                break;
            case 3:
                tipoPesquisa = "QUANTIDADE";
                break;
            case 4:
                tipoPesquisa = "VALOR_UNITARIO";
                break;
        }

        mysql.conectar();
        pesquisar(tipoPesquisa);
        mysql.desconectar();
    }//GEN-LAST:event_jTextPesquisaKeyReleased

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        FrameInserirAlterar inserirAlterar = new FrameInserirAlterar(this, "inserir");
        inserirAlterar.setVisible(true);
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if (verificarErros() == false) {
            FrameInserirAlterar inserirAlterar = new FrameInserirAlterar(this, "alterar");
            inserirAlterar.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonMarcarFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarFaltaActionPerformed
        if (verificarErros() == false) {
            mysql.conectar();
            marcarFalta();
            mysql.desconectar();
        }
    }//GEN-LAST:event_jButtonMarcarFaltaActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        mysql.conectar();
        atualizar();
        mysql.desconectar();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        MainFrame mFrame = main;
        mFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (verificarErros() == false) {
            int escolha = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o produto selecionado? (será removido permanentemente do banco de dados)", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION);
            if (escolha == JOptionPane.YES_OPTION) {
                mysql.conectar();
                excluir();
                mysql.desconectar();
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    public boolean verificarErros() {
        boolean erro = false;

        if (!jTableMain.isRowSelected(jTableMain.getSelectedRow())) {
            JOptionPane.showMessageDialog(this, "AVISO: Selecione um campo na tabela.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
            erro = true;
        }

        return erro;
    }

    public final void atualizar() {
        model.setRowCount(0);
        try {
            ResultSet rs = mysql.consultar("SELECT ID, CODIGO_DE_BARRA, DESCRICAO, TIPO, QUANTIDADE, VALOR_UNITARIO, DATA_HORA FROM estoque WHERE status=1");
            if (rs != null) {
                while (rs.next()) {
                    model.addRow(new String[]{rs.getString("ID"), rs.getString("CODIGO_DE_BARRA"), rs.getString("DESCRICAO"), rs.getString("TIPO"),
                        rs.getString("QUANTIDADE"), rs.getString("VALOR_UNITARIO"), rs.getString("DATA_HORA")}
                    );
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void pesquisar(String tipoPesquisa) {
        try {
            String query = "SELECT ID, CODIGO_DE_BARRA, DESCRICAO, TIPO, QUANTIDADE, VALOR_UNITARIO, DATA_HORA FROM estoque WHERE "
                    + tipoPesquisa + " like '%" + jTextPesquisa.getText() + "%' AND status=1";
            ResultSet rs = mysql.consultar(query);
            model.setRowCount(0);
            if (rs != null) {
                while (rs.next()) {
                    model.addRow(new String[]{rs.getString("ID"), rs.getString("CODIGO_DE_BARRA"), rs.getString("DESCRICAO"), rs.getString("TIPO"),
                        rs.getString("QUANTIDADE"), rs.getString("VALOR_UNITARIO"), rs.getString("DATA_HORA")}
                    );
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void marcarFalta() {
        int id = Integer.parseInt((String) jTableMain.getValueAt(jTableMain.getSelectedRow(), 0));
        String query = "UPDATE estoque SET STATUS='" + "0" + "'WHERE ID=" + id;
        int statusQuery = mysql.executeUpdate(query);
        if (statusQuery == 1) {
            atualizar();
        } else {
            JOptionPane.showMessageDialog(this, "AVISO: Os produtos não foram marcados como em falta.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void excluir() {
        int id = Integer.parseInt((String) jTableMain.getValueAt(jTableMain.getSelectedRow(), 0));
        String query = "DELETE FROM estoque WHERE ID=" + id;
        int statusQuery = mysql.executeUpdate(query);
        if (statusQuery == 1) {
            atualizar();
        } else {
            JOptionPane.showMessageDialog(this, "AVISO: Os produtos não foram excluídos.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    public JTable getjTableMain() {
        return jTableMain;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonMarcarFalta;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboTipoPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMain;
    private javax.swing.JTextField jTextPesquisa;
    // End of variables declaration//GEN-END:variables
}
