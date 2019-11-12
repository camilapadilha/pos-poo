/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.visao;

import crud.entidades.Estado;
import crud.entidades.ItensPedido;
import crud.entidades.Pedido;
import crud.entidades.Produto;
import crud.modelo.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;

/**
 *
 * @author Willian
 */
public class CadastroPedido extends javax.swing.JFrame {

    private Pedido pedido = new Pedido();

    private ItensPedido itensPedido = new ItensPedido();
    private List<Pedido> listaPedidos = new ArrayList<Pedido>();
    private List<Produto> listaProdutos = new ArrayList<Produto>();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form CadastroEstado
     */
    public CadastroPedido() {
        String data = formatador.format(pedido.getDataPedido());
        initComponents();
        montaTabela();
        montaComboProduto();
        comboProduto.setSelectedItem(null);
        validaTela("inicio");
        campoData.setText(data);
        campoData.setEnabled(false);
        campoTotal.setEnabled(false);
        campoPreco.setEnabled(false);
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

        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelListagemPedido = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListagemPedido = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        campoConsultar = new javax.swing.JTextField();
        botaoConsultar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        panelCadastroPedido = new javax.swing.JPanel();
        campoProd = new javax.swing.JLabel();
        labelProduto = new javax.swing.JLabel();
        comboProduto = new javax.swing.JComboBox<>();
        labelQuantidade = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaItensPedido = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        labelDesc = new javax.swing.JLabel();
        campoDesc = new javax.swing.JTextField();
        labelTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoIncluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();
        labelPreco = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaListagemPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaListagemPedido);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Listagem de Pedido ");

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

        javax.swing.GroupLayout panelListagemPedidoLayout = new javax.swing.GroupLayout(panelListagemPedido);
        panelListagemPedido.setLayout(panelListagemPedidoLayout);
        panelListagemPedidoLayout.setHorizontalGroup(
            panelListagemPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemPedidoLayout.createSequentialGroup()
                .addGroup(panelListagemPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListagemPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(panelListagemPedidoLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelListagemPedidoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(campoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLimpar)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        panelListagemPedidoLayout.setVerticalGroup(
            panelListagemPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemPedidoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addGroup(panelListagemPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConsultar)
                    .addComponent(botaoLimpar))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listagem de Pedido", panelListagemPedido);

        labelProduto.setText("Produto");

        comboProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoItemStateChanged(evt);
            }
        });
        comboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoActionPerformed(evt);
            }
        });

        labelQuantidade.setText("Quantidade:");

        campoQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeActionPerformed(evt);
            }
        });

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        tabelaItensPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaItensPedido);

        jLabel2.setText("Data:");

        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });

        labelDesc.setText("Descrição");

        labelTotal.setText("Total");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Itens de Pedido");

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

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Pedido");

        campoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalActionPerformed(evt);
            }
        });

        labelPreco.setText("Preço");

        javax.swing.GroupLayout panelCadastroPedidoLayout = new javax.swing.GroupLayout(panelCadastroPedido);
        panelCadastroPedido.setLayout(panelCadastroPedidoLayout);
        panelCadastroPedidoLayout.setHorizontalGroup(
            panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(labelDesc)
                            .addComponent(labelTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                                .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(jLabel1))
                                            .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                                                .addComponent(botaoIncluir)
                                                .addGap(18, 18, 18)
                                                .addComponent(botaoAlterar)
                                                .addGap(18, 18, 18)
                                                .addComponent(botaoExcluir)
                                                .addGap(18, 18, 18)
                                                .addComponent(botaoCancelar))))
                                    .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                                        .addComponent(labelProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelQuantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelPreco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoAdicionar)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadastroPedidoLayout.setVerticalGroup(
            panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCadastroPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoIncluir)
                            .addComponent(botaoAlterar)
                            .addComponent(botaoExcluir)
                            .addComponent(botaoCancelar))))
                .addGap(31, 31, 31)
                .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDesc)
                    .addComponent(campoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addGroup(panelCadastroPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduto)
                    .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuantidade)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicionar)
                    .addComponent(labelPreco)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro de Pedido", panelCadastroPedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        if (validaCampos()) {

//            for (Pedido listaPedido : listaPedidos) {
//                
//            }
            pedido.setDescricao(campoDesc.getText());
            pedido.setDataPedido(new Date());

            Banco.beginTransaction();
            Banco.getSession().merge(pedido);
            Banco.commitTransaction();
            Banco.closeSession();

            montaTabela();
            limpaCampos();
            validaTela("inicio");
        }

    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        if (validaCampos()) {
            pedido.setDescricao(campoDesc.getText());
            System.out.println("crud.visao.CadastroPedido.botaoAlterarActionPerformed()");
            pedido.setDataPedido(new Date());
            pedido.setTotal(Double.parseDouble(campoTotal.getText()));

            Banco.beginTransaction();
            Banco.getSession().merge(pedido);
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
                + "cide registro?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            Banco.beginTransaction();
            Banco.getSession().delete(pedido);
            Banco.commitTransaction();
            Banco.closeSession();
            limpaCampos();
            montaTabela();
            validaTela("inicio");
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        String parte = campoConsultar.getText();
        Query q = Banco.getSession().createQuery("FROM Pedido where nome like '%" + parte + "%'");
        List<Pedido> results = q.list();
        System.out.println(results);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Data");
        modelo.addColumn("Descrição");
        modelo.addColumn("Total");
        for (Pedido p : results) {
            modelo.addRow(new Object[]{p.getDataPedido(),
                p.getDescricao(),
                p.getTotalPedido()});
        }
        tabelaListagemPedido.setModel(modelo);
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        montaTabela();
        campoConsultar.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        limpaCampos();
        validaTela("inicio");
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void comboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProdutoActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
//Recupera um produto da lista de produtos pela index da cambo selecionada, seta o produto no abtributo produto do objeto itensVenda.
        System.out.println("test" + comboProduto.getSelectedIndex());
        itensPedido.setProduto(listaProdutos.get(comboProduto.getSelectedIndex()));
//seta no atributo quantidade do objeto itensVenda a quantidade digitada na tela, convertendo de String para double.
        itensPedido.setQuantidade(Integer.parseInt(campoQuantidade.getText()));
        //seta no atributo valor do objeto itensVenda o valor do produto selecionado na cambo.
        itensPedido.setPreco(itensPedido.getProduto().getPreco());
        //seta o objeto venda no itensVenda;
        itensPedido.setPedido(pedido);
        //Adicionar o objeto itensVenda na lista de itensvendas que existe dentro do objeto venda.
        pedido.getItensPedido().add(itensPedido);
        montaTabelaItensPedido();
        campoTotal.setText("Total: R$ " + pedido.getTotalPedido());
        itensPedido = new ItensPedido();
        limpaCamposItens();
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void campoQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoQuantidadeActionPerformed

    private void campoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalActionPerformed

    private void comboProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoItemStateChanged
//        Produto p = listaProdutos.get(comboProduto.getSelectedIndex());
      System.out.println("teste preco" + evt.getStateChange());
      System.out.println("teste preco 1" + evt.getItemSelectable());
      System.out.println("teste preco 2" + evt.getClass());
    }//GEN-LAST:event_comboProdutoItemStateChanged

    private void limpaCamposItens() {
        campoQuantidade.setText("");
        comboProduto.setSelectedItem(null);
        campoPreco.setText("");
    }
    //Monta tabela dos itens da venda

    private void montaTabelaItensPedido() {
        //Instancia uma tabela em memrória
        DefaultTableModel modelo = new DefaultTableModel();
        //Adicionar uma coluna na tabela.
        modelo.addColumn("Produto");
        modelo.addColumn("Preço");
        modelo.addColumn("Quantidade");
        //Percorre a lista de intensVenda existente dentro do objeto venda.
        for (ItensPedido ip : pedido.getItensPedido()) {
            //Para cada itensVenda da Venda é adicinada uma linha com as informações do itensVenda.
            modelo.addRow(new Object[]{
                ip.getProduto().getNome(),
                ip.getPreco(),
                ip.getQuantidade(),});
        }
        //Seta na tabela da interface a tabela criada em memória.
        tabelaItensPedido.setModel(modelo);
    }

    public void montaTabela() {
        listaPedidos = Banco.getSession().
                createCriteria(Pedido.class).list();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Data");
        modelo.addColumn("Descrição");
        modelo.addColumn("Total");
        for (Pedido p : listaPedidos) {
            modelo.addRow(new Object[]{formatador.format(p.getDataPedido()),
                p.getDescricao(),
                p.getTotal()});
        }
        tabelaListagemPedido.setModel(modelo);
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
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField campoConsultar;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoDesc;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JLabel campoProd;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JComboBox<String> comboProduto;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelDesc;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JPanel panelCadastroPedido;
    private javax.swing.JPanel panelListagemPedido;
    private javax.swing.JTable tabelaItensPedido;
    private javax.swing.JTable tabelaListagemPedido;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        campoDesc.setText("");
    }

    private Boolean validaCampos() {
        String mensagem = "";
        Boolean retorno = true;
        if (campoDesc.getText().equals("")) {
            mensagem = mensagem + "O campo é obrigatório!\n";
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

    public void montaComboProduto() {
        //Busca todos os produtos do banco de dados e atribui a lista de produtos
        listaProdutos = Banco.getSession().createCriteria(Produto.class).list();
        //remove todas os produtos da combo para adicionar novamente
        comboProduto.removeAllItems();
        //percorre a lista de produtos e para cada produto da lista é adicionado um novo item na combo.
        for (Produto p : listaProdutos) {
            //adicionar um produto na combo.
            comboProduto.addItem(p.getNome());
        }
    }
}
