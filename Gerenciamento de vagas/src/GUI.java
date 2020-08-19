
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    int vagas = 100;

    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
        int i;
        for (i = 1; i <= vagas; i++) {
            jTableVagas.setValueAt(i, i - 1, 0);
            jTableVagas.setValueAt("", i - 1, 1);
            jTableVagas.setValueAt(false, i - 1, 4);
        }
        Arquivo arquivo = new Arquivo();
        for (i = 1; i <= vagas; i++) {
            File file = new File("Vagas", "Vaga" + i + ".json");
            if (file.exists()) {
                Veiculo veiculo = arquivo.ler(file, Integer.toString(i));
                jTableVagas.setValueAt(veiculo.getPlaca(), i - 1, 1);
                jTableVagas.setValueAt(veiculo.getTipo(), i - 1, 2);
                jTableVagas.setValueAt(veiculo.getData(), i - 1, 3);
                jTableVagas.setValueAt(true, i - 1, 4);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMensagem = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        jButtonAdicionarVeiculo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVagas = new javax.swing.JTable();
        jLabelEscolhaVaga = new javax.swing.JLabel();
        jButtonRemoverVeiculo = new javax.swing.JButton();
        jTextFieldPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de vagas");
        setResizable(false);

        jLabelMensagem.setText("Preencha os campos abaixo para adicionar um novo veículo ao banco de dados:");

        jLabelPlaca.setText("Placa do veículo:");

        jLabelTipo.setText("Tipo do veículo:");

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caminhão", "Carro", "Moto", "Ônibus" }));
        jComboTipo.setSelectedIndex(-1);

        jButtonAdicionarVeiculo.setText("Adicionar veículo");
        jButtonAdicionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarVeiculoActionPerformed(evt);
            }
        });

        jTableVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vaga", "Placa", "Tipo", "Data/Hora", "Ocupado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableVagas);

        jLabelEscolhaVaga.setText("Escolha a vaga:");

        jButtonRemoverVeiculo.setText("Remover veículo");
        jButtonRemoverVeiculo.setPreferredSize(new java.awt.Dimension(113, 23));
        jButtonRemoverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverVeiculoActionPerformed(evt);
            }
        });

        jTextFieldPlaca.setToolTipText("Ex.: ABC1234");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAdicionarVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelMensagem)
                                .addComponent(jLabelTipo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelEscolhaVaga)
                            .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMensagem)
                .addGap(18, 18, 18)
                .addComponent(jLabelPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEscolhaVaga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionarVeiculo)
                    .addComponent(jButtonRemoverVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarVeiculoActionPerformed
        String auxPlaca = jTextFieldPlaca.getText().replaceAll("[^A-Za-z0-9]+", "");
        if (verificarCampos(auxPlaca) == false) {
            Veiculo veiculo = new Veiculo();

            veiculo.setPlaca(auxPlaca.toUpperCase());
            veiculo.setTipo(jComboTipo.getSelectedItem().toString());

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            veiculo.setData(dateFormat.format(date));

            jTableVagas.setValueAt(veiculo.getPlaca(), jTableVagas.getSelectedRow(), 1);
            jTableVagas.setValueAt(veiculo.getTipo(), jTableVagas.getSelectedRow(), 2);
            jTableVagas.setValueAt(veiculo.getData(), jTableVagas.getSelectedRow(), 3);
            jTableVagas.setValueAt(true, jTableVagas.getSelectedRow(), 4);

            Arquivo arquivo = new Arquivo();
            arquivo.gravar(veiculo, jTableVagas.getValueAt(jTableVagas.getSelectedRow(), 0).toString());
            limparCampos();
        }
    }//GEN-LAST:event_jButtonAdicionarVeiculoActionPerformed

    private void jButtonRemoverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverVeiculoActionPerformed
        int linha = jTableVagas.getSelectedRow() + 1;
        File file = new File("Vagas", "Vaga" + linha + ".json");
        if (file.exists()) {
            int escolha = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o veículo selecionado?", "Mensagem de confirmação", JOptionPane.YES_NO_OPTION);

            if ((escolha == JOptionPane.YES_OPTION)) {
                file.delete();
                jTableVagas.setValueAt("", jTableVagas.getSelectedRow(), 1);
                jTableVagas.setValueAt(null, jTableVagas.getSelectedRow(), 2);
                jTableVagas.setValueAt(null, jTableVagas.getSelectedRow(), 3);
                jTableVagas.setValueAt(false, jTableVagas.getSelectedRow(), 4);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há nada para ser removido.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoverVeiculoActionPerformed

    public void limparCampos() {
        jTextFieldPlaca.setText("");
        jComboTipo.setSelectedIndex(-1);
    }

    public boolean verificarCampos(String auxPlaca) {
        boolean erro = false;
        int i;

        if ((jTextFieldPlaca.getText().isEmpty()) || (auxPlaca.length() != 7) || (jComboTipo.getSelectedIndex() == -1) || (jTableVagas.getSelectionModel().isSelectionEmpty())) {
            JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos corretamente.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            erro = true;
        } else if ((boolean) jTableVagas.getValueAt(jTableVagas.getSelectedRow(), 4)) {
            JOptionPane.showMessageDialog(this, "A vaga já está ocupada.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            erro = true;
        } else {
            for (i = 1; i <= vagas; i++) {
                if (jTableVagas.getValueAt(i - 1, 1).equals(jTextFieldPlaca.getText().toUpperCase())) {
                    JOptionPane.showMessageDialog(this, "O veículo já foi adicionado.", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                    erro = true;
                }
            }
        }
        return erro;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarVeiculo;
    private javax.swing.JButton jButtonRemoverVeiculo;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabelEscolhaVaga;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableVagas;
    private javax.swing.JTextField jTextFieldPlaca;
    // End of variables declaration//GEN-END:variables
}
