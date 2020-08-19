package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrameInserirAlterar extends javax.swing.JFrame {

    FrameControleEstoque estoque;
    private final String tipo;

    public FrameInserirAlterar(FrameControleEstoque estoque, String tipo) {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
        jTextAreaDescricao.setLineWrap(true);
        this.estoque = estoque;
        this.tipo = tipo;
        String caminhoImg = "";

        if (tipo.equals("inserir")) {
            jButtonConfirmar.setText("Adicionar produto");
            this.setTitle("Controle de estoque - Adicionar");
            caminhoImg = "/images/add-32.png";
        } else if (tipo.equals("alterar")) {
            jButtonConfirmar.setText("Editar produto");
            this.setTitle("Controle de estoque - Editar");
            caminhoImg = "/images/edit-32.png";
            jTextCodigoBarra.setText((String) estoque.getjTableMain().getValueAt(estoque.getjTableMain().getSelectedRow(), 1));
            jTextAreaDescricao.setText((String) estoque.getjTableMain().getValueAt(estoque.getjTableMain().getSelectedRow(), 2));
            for (int i = 0; i < jComboTipo.getItemCount(); i++) {
                if (estoque.getjTableMain().getValueAt(estoque.getjTableMain().getSelectedRow(), 3).equals(jComboTipo.getItemAt(i))) {
                    jComboTipo.setSelectedIndex(i);
                    break;
                } else if (jComboTipo.getItemAt(i).equals("Outros")) {
                    jTextOutros.setEnabled(true);
                    jTextOutros.setText((String) estoque.getjTableMain().getValueAt(estoque.getjTableMain().getSelectedRow(), 3));
                    jComboTipo.setSelectedIndex(i);
                    break;
                }
            }
            jTextQuantidade.setText((String) estoque.getjTableMain().getValueAt(estoque.getjTableMain().getSelectedRow(), 4));
            jTextValor.setText((String) estoque.getjTableMain().getValueAt(estoque.getjTableMain().getSelectedRow(), 5));
        }
        try {
            Image img = ImageIO.read(getClass().getResource(caminhoImg));
            jButtonConfirmar.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCodigoBarra = new javax.swing.JPanel();
        jTextCodigoBarra = new javax.swing.JTextField();
        jPanelDescricao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jPanelTipo = new javax.swing.JPanel();
        jComboTipo = new javax.swing.JComboBox<>();
        jLabelOutros = new javax.swing.JLabel();
        jTextOutros = new javax.swing.JTextField();
        jPanelQuantidade = new javax.swing.JPanel();
        jTextQuantidade = new javax.swing.JTextField();
        jPanelValor = new javax.swing.JPanel();
        jTextValor = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de estoque");
        setResizable(false);

        jPanelCodigoBarra.setBorder(javax.swing.BorderFactory.createTitledBorder("Código de barra"));

        javax.swing.GroupLayout jPanelCodigoBarraLayout = new javax.swing.GroupLayout(jPanelCodigoBarra);
        jPanelCodigoBarra.setLayout(jPanelCodigoBarraLayout);
        jPanelCodigoBarraLayout.setHorizontalGroup(
            jPanelCodigoBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCodigoBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextCodigoBarra)
                .addContainerGap())
        );
        jPanelCodigoBarraLayout.setVerticalGroup(
            jPanelCodigoBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCodigoBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout jPanelDescricaoLayout = new javax.swing.GroupLayout(jPanelDescricao);
        jPanelDescricao.setLayout(jPanelDescricaoLayout);
        jPanelDescricaoLayout.setHorizontalGroup(
            jPanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelDescricaoLayout.setVerticalGroup(
            jPanelDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Carnes", "Ferramentas", "Higiene", "Higiene pessoal", "Hortifrutigranjeiro", "Laticínios", "Limpeza", "Não pereríveis", "Perecíveis", "Outros" }));
        jComboTipo.setSelectedIndex(-1);
        jComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoActionPerformed(evt);
            }
        });

        jLabelOutros.setText("Outros:");

        jTextOutros.setEnabled(false);

        javax.swing.GroupLayout jPanelTipoLayout = new javax.swing.GroupLayout(jPanelTipo);
        jPanelTipo.setLayout(jPanelTipoLayout);
        jPanelTipoLayout.setHorizontalGroup(
            jPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTipoLayout.createSequentialGroup()
                        .addComponent(jLabelOutros)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextOutros))
                .addContainerGap())
        );
        jPanelTipoLayout.setVerticalGroup(
            jPanelTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOutros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelQuantidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade"));

        javax.swing.GroupLayout jPanelQuantidadeLayout = new javax.swing.GroupLayout(jPanelQuantidade);
        jPanelQuantidade.setLayout(jPanelQuantidadeLayout);
        jPanelQuantidadeLayout.setHorizontalGroup(
            jPanelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelQuantidadeLayout.setVerticalGroup(
            jPanelQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor unitário"));

        javax.swing.GroupLayout jPanelValorLayout = new javax.swing.GroupLayout(jPanelValor);
        jPanelValor.setLayout(jPanelValorLayout);
        jPanelValorLayout.setHorizontalGroup(
            jPanelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextValor, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelValorLayout.setVerticalGroup(
            jPanelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCodigoBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
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

    private void jComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoActionPerformed
        if ((jComboTipo.getSelectedItem().equals("Outros"))) {
            jTextOutros.setEnabled(true);
        } else {
            jTextOutros.setEnabled(false);
        }
    }//GEN-LAST:event_jComboTipoActionPerformed

    public boolean verificarErros() {
        boolean erro = false;

        if (jTextCodigoBarra.getText().isEmpty() || jTextAreaDescricao.getText().isEmpty() || jComboTipo.getSelectedIndex() == -1
                || jTextQuantidade.getText().isEmpty() || jTextValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "AVISO: Preencha todos os campos corretamente.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
            erro = true;
        } else if (jComboTipo.getSelectedItem().equals("Outros")) {
            if (jTextOutros.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "AVISO: Preencha todos os campos corretamente.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
                erro = true;
            }
        }

        return erro;
    }

    public void inserir() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String tipoProduto;

        if (jComboTipo.getSelectedItem().equals("Outros")) {
            tipoProduto = jTextOutros.getText();
        } else {
            tipoProduto = (String) jComboTipo.getSelectedItem();
        }

        String query = "INSERT INTO estoque (CODIGO_DE_BARRA, DESCRICAO, TIPO, QUANTIDADE, VALOR_UNITARIO, DATA_HORA, STATUS) "
                + "values ('" + jTextCodigoBarra.getText() + "', '" + jTextAreaDescricao.getText() + "', '" + tipoProduto
                + "', '" + jTextQuantidade.getText() + "', '" + jTextValor.getText() + "', '" + dateFormat.format(date) + "', '" + "1" + "')";

        estoque.mysql.conectar();
        int statusQuery = estoque.mysql.executeUpdate(query);

        if (statusQuery == 1) {
            estoque.atualizar();
            estoque.mysql.desconectar();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "AVISO: Os dados não foram inseridos.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
            estoque.mysql.desconectar();
        }
    }

    public void alterar() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String tipoProduto;

        if (jComboTipo.getSelectedItem().equals("Outros")) {
            tipoProduto = jTextOutros.getText();
        } else {
            tipoProduto = (String) jComboTipo.getSelectedItem();
        }

        int id = Integer.parseInt((String) estoque.getjTableMain().getValueAt(estoque.getjTableMain().getSelectedRow(), 0));
        String query = "UPDATE estoque SET CODIGO_DE_BARRA='" + jTextCodigoBarra.getText() + "', " + "DESCRICAO='" + jTextAreaDescricao.getText()
                + "', TIPO='" + tipoProduto + "', QUANTIDADE='" + jTextQuantidade.getText() + "', VALOR_UNITARIO='" + jTextValor.getText()
                + "', DATA_HORA='" + dateFormat.format(date) + "' WHERE ID=" + id;

        estoque.mysql.conectar();
        int statusQuery = estoque.mysql.executeUpdate(query);

        if (statusQuery == 1) {
            estoque.atualizar();
            estoque.mysql.desconectar();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "AVISO: Os dados não foram alterados.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
            estoque.mysql.desconectar();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabelOutros;
    private javax.swing.JPanel jPanelCodigoBarra;
    private javax.swing.JPanel jPanelDescricao;
    private javax.swing.JPanel jPanelQuantidade;
    private javax.swing.JPanel jPanelTipo;
    private javax.swing.JPanel jPanelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextCodigoBarra;
    private javax.swing.JTextField jTextOutros;
    private javax.swing.JTextField jTextQuantidade;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
