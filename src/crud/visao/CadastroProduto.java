/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.visao;

import crud.entidades.Cidade;
import crud.entidades.Estado;
import crud.entidades.Produto;
import crud.modelo.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;

/**
 *
 * @author Willian
 */
public class CadastroProduto extends javax.swing.JFrame {

    private Produto prod = new Produto();
    private List<Produto> listaProdutos = new ArrayList<Produto>();

    /**
     * Creates new form CadastroCidade
     */
    public CadastroProduto() {
        initComponents();
        montaTabela();
        validaTela("inicio");
        limpaCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        botaoIncluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        campoConsultar = new javax.swing.JTextField();
        botaoCancelar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        labelPreco = new javax.swing.JLabel();
        labelEstoque = new javax.swing.JLabel();
        labelDesc = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        campoEstoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDesc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        botaoIncluir.setText("Incluir");
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar Consulta");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        labelPreco.setText("Preço");

        labelEstoque.setText("Estoque");

        labelDesc.setText("Descrição");

        campoDesc.setColumns(20);
        campoDesc.setRows(5);
        jScrollPane1.setViewportView(campoDesc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPreco)
                                .addGap(18, 18, 18)
                                .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEstoque)
                                .addGap(18, 18, 18)
                                .addComponent(campoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDesc)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoIncluir)
                                .addGap(18, 18, 18)
                                .addComponent(botaoAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoExcluir)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCancelar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLimpar))))
                    .addComponent(jScrollPane2))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstoque)
                    .addComponent(campoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoIncluir)
                    .addComponent(botaoCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConsultar)
                    .addComponent(campoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        if (validaCampos()) {

            prod.setNome(campoNome.getText());
            prod.setPreco(Double.parseDouble(campoPreco.getText()));
            prod.setEstoque(Integer.parseInt(campoEstoque.getText()));
            prod.setDescricao(campoDesc.getText());

            Banco.beginTransaction();
            Banco.getSession().merge(prod);
            Banco.commitTransaction();
            Banco.closeSession();

            montaTabela();
            limpaCampos();
            validaTela("inicio");
        }
    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed

        if (validaCampos()) {

            prod.setNome(campoNome.getText());
            prod.setPreco(Double.parseDouble(campoPreco.getText()));
            prod.setEstoque(Integer.parseInt(campoEstoque.getText()));
            prod.setDescricao(campoDesc.getText());

            Banco.beginTransaction();
            Banco.getSession().merge(prod);
            Banco.commitTransaction();
            Banco.closeSession();

            montaTabela();
            limpaCampos();
            validaTela("inicio");
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        String parte = campoConsultar.getText();
        Query q = Banco.getSession().createQuery("FROM Produto where nome like '%" + parte + "%'");
        List<Produto> results = q.list();
        System.out.println(results);

        DefaultTableModel modelo = new DefaultTableModel();
         modelo.addColumn("Nome");
        modelo.addColumn("Preço");
        modelo.addColumn("Estoque");
        modelo.addColumn("Descrição");
        for (Produto p : results) {
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getPreco(),
                p.getEstoque(),
                p.getDescricao()
            });
        }
        tabela.setModel(modelo);
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir "
                + "este registro?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            Banco.beginTransaction();
            Banco.getSession().delete(prod);
            Banco.commitTransaction();
            Banco.closeSession();
            limpaCampos();
            montaTabela();
            validaTela("inicio");
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        prod = listaProdutos.get(tabela.getSelectedRow());
        
        campoNome.setText(prod.getNome());
        campoPreco.setText(prod.getPreco().toString());
        campoEstoque.setText(prod.getEstoque().toString());
        campoDesc.setText(prod.getDescricao());
        validaTela("selecionar");
    }//GEN-LAST:event_tabelaMouseClicked

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        limpaCampos();
        validaTela("inicio");
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        montaTabela();
        campoConsultar.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    public void montaTabela() {
        listaProdutos = Banco.getSession().
                createCriteria(Produto.class).list();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Preço");
        modelo.addColumn("Estoque");
        modelo.addColumn("Descrição");
        for (Produto p : listaProdutos) {
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getPreco(),
                p.getEstoque(),
                p.getDescricao()
            });
        }
        tabela.setModel(modelo);
    }

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField campoConsultar;
    private javax.swing.JTextArea campoDesc;
    private javax.swing.JTextField campoEstoque;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelEstoque;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        campoNome.setText("");
        campoPreco.setText("");
        campoEstoque.setText("");
        campoDesc.setText("");
    }

    private Boolean validaCampos() {
        String mensagem = "";
        Boolean retorno = true;
        if (campoNome.getText().equals("")) {
            mensagem = mensagem + "O campo nome é obrigatório!\n";
            retorno = false;
        }

        if (retorno == false) {
            JOptionPane.showMessageDialog(null, mensagem);
        }
        return retorno;
    }

    private void validaTela(String acao) {
        if (acao.equals("inicio")) {
            botaoAlterar.setEnabled(false);
            botaoExcluir.setEnabled(false);
            botaoCancelar.setEnabled(false);
            botaoIncluir.setEnabled(true);
        } else if (acao.equals("selecionar")) {
            botaoAlterar.setEnabled(true);
            botaoExcluir.setEnabled(true);
            botaoCancelar.setEnabled(true);
            botaoIncluir.setEnabled(false);
        }
    }
}