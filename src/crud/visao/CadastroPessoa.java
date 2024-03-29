/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.visao;

import crud.entidades.Cidade;
import crud.entidades.Pessoa;
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
public class CadastroPessoa extends javax.swing.JFrame {

    private Pessoa pes = new Pessoa();
    private List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    //Lista de cidades para montar a combo.
    private List<Cidade> listaCidades = new ArrayList<Cidade>();

    /**
     * Creates new form CadastroPessoa
     */
    public CadastroPessoa() {
        initComponents();
        montaTabela();
        validaTela("inicio");
        preencherComboCidades();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        labelRg = new javax.swing.JLabel();
        botaoIncluir = new javax.swing.JButton();
        campoRg = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        comboCidades = new javax.swing.JComboBox<>();
        labelFone = new javax.swing.JLabel();
        campoFone = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        campoConsultar = new javax.swing.JTextField();
        botaoConsultar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNome.setText("Nome:");

        labelRg.setText("RG:");

        botaoIncluir.setText("Incluir");
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        campoRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRgActionPerformed(evt);
            }
        });

        labelCpf.setText("CPF:");

        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

        labelCidade.setText("Cidade:");

        comboCidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma cidade" }));
        comboCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCidadesActionPerformed(evt);
            }
        });

        labelFone.setText("Telefone:");

        campoFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFoneActionPerformed(evt);
            }
        });

        labelEndereco.setText("Endereço:");

        labelBairro.setText("Bairro:");

        labelNumero.setText("Numero:");

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
        jScrollPane4.setViewportView(tabela);

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar Consulta");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(labelRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoRg)
                                .addGap(40, 40, 40)
                                .addComponent(labelCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(labelBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoBairro)
                                .addGap(71, 71, 71))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(botaoIncluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoAlterar)
                                        .addGap(12, 12, 12)
                                        .addComponent(botaoExcluir)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoConsultar)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoLimpar)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelRg)
                        .addComponent(campoRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelCpf)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFone)
                    .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelBairro)
                        .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndereco))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCidade)
                    .addComponent(comboCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoIncluir)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoCancelar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultar)
                    .addComponent(botaoLimpar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        if (validaCampos()) {

            pes.setNome(campoNome.getText());
            pes.setCpf(campoCpf.getText());
            pes.setRg(campoRg.getText());
            pes.setEndereco(campoEndereco.getText());
            pes.setBairro(campoBairro.getText());
            pes.setNumero(campoNumero.getText());
            pes.setTelefone(campoFone.getText());

            pes.setCidade(listaCidades.get(comboCidades.getSelectedIndex()));

            Banco.beginTransaction();
            Banco.getSession().merge(pes);
            Banco.commitTransaction();
            Banco.closeSession();

            montaTabela();
            limpaCampos();
            validaTela("inicio");
        }
    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void campoRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRgActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfActionPerformed

    private void comboCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCidadesActionPerformed

    private void campoFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFoneActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        if (validaCampos()) {

            pes.setNome(campoNome.getText());
            pes.setCpf(campoCpf.getText());
            pes.setRg(campoRg.getText());
            pes.setEndereco(campoEndereco.getText());
            pes.setBairro(campoBairro.getText());
            pes.setNumero(campoNumero.getText());
            pes.setTelefone(campoFone.getText());

            pes.setCidade(listaCidades.get(comboCidades.getSelectedIndex()));

            Banco.beginTransaction();
            Banco.getSession().merge(pes);
            Banco.commitTransaction();
            Banco.closeSession();

            montaTabela();
            limpaCampos();
            validaTela("inicio");
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir "
                + "pese registro?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            Banco.beginTransaction();
            Banco.getSession().delete(pes);
            Banco.commitTransaction();
            Banco.closeSession();
            limpaCampos();
            montaTabela();
            validaTela("inicio");
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        String parte = campoConsultar.getText();
        Query q = Banco.getSession().createQuery("FROM Pessoa where nome like '%" + parte + "%'");
        List<Pessoa> results = q.list();
        System.out.println(results);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("RG");
        modelo.addColumn("Endereço");
        modelo.addColumn("Número");
        modelo.addColumn("Bairro");
        modelo.addColumn("Telefone");
        modelo.addColumn("Cidade");
        for (Pessoa c : results) {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getCpf(),
                c.getRg(),
                c.getEndereco(),
                c.getNumero(),
                c.getBairro(),
                c.getTelefone(),
                c.getCidade().getNome()
            });
        }
        tabela.setModel(modelo);
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        pes = listaPessoas.get(tabela.getSelectedRow());
        campoNome.setText(pes.getNome());
        campoCpf.setText(pes.getCpf());
        campoRg.setText(pes.getRg());
        campoEndereco.setText(pes.getEndereco());
        campoBairro.setText(pes.getBairro());
        campoFone.setText(pes.getTelefone());
        campoNumero.setText(pes.getNumero());
        comboCidades.setSelectedItem(pes.getCidade().getNome());
        validaTela("selecionar");
    }//GEN-LAST:event_tabelaMouseClicked

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        montaTabela();
        campoConsultar.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        limpaCampos();
        validaTela("inicio");
    }//GEN-LAST:event_botaoCancelarActionPerformed

    public void montaTabela() {
        listaPessoas = Banco.getSession().
                createCriteria(Pessoa.class).list();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("RG");
        modelo.addColumn("Endereço");
        modelo.addColumn("Número");
        modelo.addColumn("Bairro");
        modelo.addColumn("Telefone");
        modelo.addColumn("Cidade");
        for (Pessoa c : listaPessoas) {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getCpf(),
                c.getRg(),
                c.getEndereco(),
                c.getNumero(),
                c.getBairro(),
                c.getTelefone(),
                c.getCidade().getNome()
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
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoa().setVisible(true);
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
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoConsultar;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoFone;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JTextField campoRg;
    private javax.swing.JComboBox<String> comboCidades;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelFone;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRg;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    ArrayList<Integer> idCidades = new ArrayList<>();

    private void preencherComboCidades() {
        //Busca todos os estados do banco de dados.
        listaCidades = Banco.getSession().createCriteria(Cidade.class).list();
        comboCidades.removeAllItems();
        for (Cidade e : listaCidades) {
            comboCidades.addItem(e.getNome());
        }
    }

    private void limpaCampos() {
        campoNome.setText("");
        campoRg.setText("");
        campoCpf.setText("");
        campoFone.setText("");
        campoBairro.setText("");
        campoEndereco.setText("");
        campoNumero.setText("");
    }

    private Boolean validaCampos() {
        String mensagem = "";
        Boolean retorno = true;
        if (campoNome.getText().equals("")) {
            mensagem = mensagem + "O campo nome é obrigatório!\n";
            retorno = false;
        }
        if (campoCpf.getText().equals("")) {
            mensagem = mensagem + "O campo Cpf é obrigatório!\n";
            retorno = false;
        }
        if (campoFone.getText().equals("")) {
            mensagem = mensagem + "O campo Telefone é obrigatório!\n";
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

    public Pessoa getPes() {
        return pes;
    }

    public void setPes(Pessoa pes) {
        this.pes = pes;
    }

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public List<Cidade> getListaCidades() {
        return listaCidades;
    }

    public void setListaCidades(List<Cidade> listaCidades) {
        this.listaCidades = listaCidades;
    }

}
