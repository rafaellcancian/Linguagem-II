
package view;

import controller.MySQL;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameEmFalta extends javax.swing.JFrame {

    MainFrame main;
    DefaultTableModel model;
    MySQL mysql;
    
    public FrameEmFalta(MainFrame main) {
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

        jButtonAtualizar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jTextPesquisa = new javax.swing.JTextField();
        jComboTipoPesquisa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMain = new javax.swing.JTable();
        jButtonMarcarEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos em falta");

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-arrow.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

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

        jButtonMarcarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flag-white.png"))); // NOI18N
        jButtonMarcarEstoque.setText("Em estoque");
        jButtonMarcarEstoque.setToolTipText("Marcar como em estoque");
        jButtonMarcarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarEstoqueActionPerformed(evt);
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
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboTipoPesquisa, 0, 163, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMarcarEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jButtonMarcarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jTextPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPesquisaKeyReleased
        String tipoPesquisa = "";

        switch (jComboTipoPesquisa.getSelectedIndex()) {
            case 0: tipoPesquisa = "CODIGO_DE_BARRA"; break;
            case 1: tipoPesquisa = "DESCRICAO"; break;
            case 2: tipoPesquisa = "TIPO"; break;
            case 3: tipoPesquisa = "QUANTIDADE"; break;
            case 4: tipoPesquisa = "VALOR_UNITARIO"; break;
        }

        mysql.conectar();
        pesquisar(tipoPesquisa);
        mysql.desconectar();
    }//GEN-LAST:event_jTextPesquisaKeyReleased

    private void jButtonMarcarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarEstoqueActionPerformed
        if (verificarErros() == false) {
            mysql.conectar();
            marcarEstoque();
            mysql.desconectar();
        }        
    }//GEN-LAST:event_jButtonMarcarEstoqueActionPerformed

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
            ResultSet rs = mysql.consultar("SELECT ID, CODIGO_DE_BARRA, DESCRICAO, TIPO, QUANTIDADE, VALOR_UNITARIO, DATA_HORA FROM estoque WHERE status=0");
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
            String query = "SELECT ID, CODIGO_DE_BARRA, DESCRICAO, TIPO, QUANTIDADE, VALOR_UNITARIO, DATA_HORA FROM estoque WHERE " + 
                    tipoPesquisa + " like '%" + jTextPesquisa.getText() + "%' AND status=0";
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
    
    public void marcarEstoque() {
        int id = Integer.parseInt((String) jTableMain.getValueAt(jTableMain.getSelectedRow(), 0));
        String query = "UPDATE estoque SET STATUS='" + "1" + "'WHERE ID=" + id;
        int statusQuery = mysql.executeUpdate(query);
        if (statusQuery == 1) {
            atualizar();
        } else {
            JOptionPane.showMessageDialog(this, "AVISO: Os produtos não foram marcados como em estoque.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonMarcarEstoque;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboTipoPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMain;
    private javax.swing.JTextField jTextPesquisa;
    // End of variables declaration//GEN-END:variables
}
