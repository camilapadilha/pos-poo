/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.visao;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Willian
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        itemMenuEstado = new javax.swing.JMenuItem();
        itemMenuCidade = new javax.swing.JMenuItem();
        itemMenuPessoa = new javax.swing.JMenuItem();
        itemMenuProduto = new javax.swing.JMenuItem();
        itemMenuPedido = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemMenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastros");

        menuCadastros.setText("Cadastros");

        itemMenuEstado.setText("Estado");
        itemMenuEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuEstadoActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuEstado);

        itemMenuCidade.setText("Cidade");
        itemMenuCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCidadeActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuCidade);

        itemMenuPessoa.setText("Pessoa");
        itemMenuPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuPessoaActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuPessoa);

        itemMenuProduto.setText("Produto");
        itemMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuProdutoActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuProduto);

        itemMenuPedido.setText("Pedido");
        itemMenuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuPedidoActionPerformed(evt);
            }
        });
        menuCadastros.add(itemMenuPedido);

        jMenuBar1.add(menuCadastros);

        menuAjuda.setText("Ajuda");

        itemMenuSobre.setText("Sobre");
        itemMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemMenuSobre);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuEstadoActionPerformed
        CadastroEstado cadastroEstado = new CadastroEstado();
        cadastroEstado.setLocationRelativeTo(null);
        cadastroEstado.setVisible(true);
        cadastroEstado.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_itemMenuEstadoActionPerformed

    private void itemMenuCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCidadeActionPerformed
        CadastroCidade cadastroCidade = new CadastroCidade();
        cadastroCidade.setLocationRelativeTo(null);
        cadastroCidade.setVisible(true);
        cadastroCidade.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_itemMenuCidadeActionPerformed

    private void itemMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSobreActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Desenvolvimento de Software Orientado a Objetos \nSistema desenvolvido por: \nAlunos do IFPR Campus Paranavaí");
    }//GEN-LAST:event_itemMenuSobreActionPerformed

    private void itemMenuPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPessoaActionPerformed
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        cadastroPessoa.setLocationRelativeTo(null);
        cadastroPessoa.setVisible(true);
        cadastroPessoa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_itemMenuPessoaActionPerformed

    private void itemMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuProdutoActionPerformed
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.setLocationRelativeTo(null);
        cadastroProduto.setVisible(true);
        cadastroProduto.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_itemMenuProdutoActionPerformed

    private void itemMenuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPedidoActionPerformed
        CadastroPedido cadastroPedido = new CadastroPedido();
        cadastroPedido.setLocationRelativeTo(null);
        cadastroPedido.setVisible(true);
        cadastroPedido.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }//GEN-LAST:event_itemMenuPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                final MenuPrincipal menuPrincipal = new MenuPrincipal();
                menuPrincipal.setLocationRelativeTo(null);
                menuPrincipal.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMenuCidade;
    private javax.swing.JMenuItem itemMenuEstado;
    private javax.swing.JMenuItem itemMenuPedido;
    private javax.swing.JMenuItem itemMenuPessoa;
    private javax.swing.JMenuItem itemMenuProduto;
    private javax.swing.JMenuItem itemMenuSobre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastros;
    // End of variables declaration//GEN-END:variables
}
