package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import view.*;

import view.JDlgDrfFuncionarioNovo;
import view.JDlgDrfProdutoNovo;
import view.JDlgDrfUsuarios;
import view.JDlgDrfFornecedor;
/**
 *
 * @author u10154925179
 */
public class JFrmDrfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmDrfPrincipal() {
        initComponents();
        setTitle("Sistema de Compras");
        setExtendedState(MAXIMIZED_BOTH);
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
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuCadastro = new javax.swing.JMenu();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuFornecedor = new javax.swing.JMenuItem();
        jMnuProduto = new javax.swing.JMenuItem();
        jMnuFuncionario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimento = new javax.swing.JMenu();
        jMnuCompras = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu6");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMnuCadastro.setMnemonic('c');
        jMnuCadastro.setText("Cadastro");

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/users_icon-icons.com_57999.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('u');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuUsuarios);

        jMnuFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedor icone.png"))); // NOI18N
        jMnuFornecedor.setText("Fornecedor");
        jMnuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFornecedorActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuFornecedor);

        jMnuProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Produto.icon.png"))); // NOI18N
        jMnuProduto.setText("Produto");
        jMnuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutoActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuProduto);

        jMnuFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.icon.png"))); // NOI18N
        jMnuFuncionario.setText("Funcionário");
        jMnuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFuncionarioActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuFuncionario);
        jMnuCadastro.add(jSeparator2);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jMnuSair.setText("SAIR");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuSair);

        jMenuBar1.add(jMnuCadastro);

        jMnuMovimento.setText("Movimento");

        jMnuCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMnuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shoppingcart_compras_3767.png"))); // NOI18N
        jMnuCompras.setText("Compras");
        jMnuCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuComprasActionPerformed(evt);
            }
        });
        jMnuMovimento.add(jMnuCompras);

        jMenuBar1.add(jMnuMovimento);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
JDlgDrfUsuarios jDlgUsuarios = new JDlgDrfUsuarios(null, true);
       jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuComprasActionPerformed
     //JDlgDCompra jDlgCompra = new JDlgCompra(null, true);
             //jDlgCompra.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMnuComprasActionPerformed

    private void jMnuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFornecedorActionPerformed
      JDlgDrfFornecedor jDlgFornecedor = new JDlgDrfFornecedor(null,true);
        jDlgFornecedor.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMnuFornecedorActionPerformed

    private void jMnuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFuncionarioActionPerformed
        JDlgDrfFuncionarioNovo jDlgFuncionario = new JDlgDrfFuncionarioNovo(null,true);
        jDlgFuncionario.setVisible(true);
    }//GEN-LAST:event_jMnuFuncionarioActionPerformed

    private void jMnuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutoActionPerformed
JDlgDrfProdutoNovo jDlgProduto = new JDlgDrfProdutoNovo(null, true); 
jDlgProduto.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMnuProdutoActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
 System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jMnuSairActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmDrfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmDrfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmDrfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmDrfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new JFrmDrfPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenu jMnuCadastro;
    private javax.swing.JMenuItem jMnuCompras;
    private javax.swing.JMenuItem jMnuFornecedor;
    private javax.swing.JMenuItem jMnuFuncionario;
    private javax.swing.JMenu jMnuMovimento;
    private javax.swing.JMenuItem jMnuProduto;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
