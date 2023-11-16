package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import query.JDlgConsultaFornecedor;
import query.JDlgConsultaFuncionario;
import query.JDlgConsultaProdutos;
import query.JDlgConsultaUsuarios;
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
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnFuncionariosT = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jBtnFornecedorT = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jBtnComprasT = new javax.swing.JButton();
        jBtnProdutosT = new javax.swing.JButton();
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
        Consultas = new javax.swing.JMenu();
        jMnuConsultasUs = new javax.swing.JMenuItem();
        jMnuConsultaForn = new javax.swing.JMenuItem();
        jMnuConsultasFunci = new javax.swing.JMenuItem();
        jMnuConsultaProd = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu6");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        jBtnFuncionariosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.icon.png"))); // NOI18N
        jBtnFuncionariosT.setFocusable(false);
        jBtnFuncionariosT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnFuncionariosT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnFuncionariosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFuncionariosTActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnFuncionariosT);
        jToolBar1.add(jSeparator3);

        jBtnFornecedorT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedor icone.png"))); // NOI18N
        jBtnFornecedorT.setFocusable(false);
        jBtnFornecedorT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnFornecedorT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnFornecedorT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFornecedorTActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnFornecedorT);
        jToolBar1.add(jSeparator4);

        jBtnComprasT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shoppingcart_compras_3767.png"))); // NOI18N
        jBtnComprasT.setFocusable(false);
        jBtnComprasT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnComprasT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnComprasT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComprasTActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnComprasT);

        jBtnProdutosT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Produto.icon.png"))); // NOI18N
        jBtnProdutosT.setFocusable(false);
        jBtnProdutosT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnProdutosT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnProdutosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdutosTActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnProdutosT);

        getContentPane().add(jToolBar1);

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

        jMnuFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
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

        Consultas.setText("Consultas");

        jMnuConsultasUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuConsultasUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/users_icon-icons.com_57999.png"))); // NOI18N
        jMnuConsultasUs.setText("Usuarios");
        jMnuConsultasUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultasUsActionPerformed(evt);
            }
        });
        Consultas.add(jMnuConsultasUs);

        jMnuConsultaForn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuConsultaForn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendedor icone.png"))); // NOI18N
        jMnuConsultaForn.setText("Fornecedor");
        jMnuConsultaForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultaFornActionPerformed(evt);
            }
        });
        Consultas.add(jMnuConsultaForn);

        jMnuConsultasFunci.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuConsultasFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.icon.png"))); // NOI18N
        jMnuConsultasFunci.setText("Funcionário");
        jMnuConsultasFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultasFunciActionPerformed(evt);
            }
        });
        Consultas.add(jMnuConsultasFunci);

        jMnuConsultaProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuConsultaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Produto.icon.png"))); // NOI18N
        jMnuConsultaProd.setText("Produto");
        jMnuConsultaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuConsultaProdActionPerformed(evt);
            }
        });
        Consultas.add(jMnuConsultaProd);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shoppingcart_compras_3767.png"))); // NOI18N
        jMenuItem1.setText("Compras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Consultas.add(jMenuItem1);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
JDlgDrfUsuarios jDlgUsuarios = new JDlgDrfUsuarios(null, true);
       jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMnuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuComprasActionPerformed
     JDlgDrfCompras jDlgDrfCompras = new JDlgDrfCompras(null, true);
             jDlgDrfCompras.setVisible(true);// TODO add your handling code here:
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

    private void jMnuConsultasUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultasUsActionPerformed
        JDlgConsultaUsuarios jDlgConsultaUsuarios = new JDlgConsultaUsuarios(null, true); 
jDlgConsultaUsuarios.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMnuConsultasUsActionPerformed

    private void jMnuConsultaFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultaFornActionPerformed
          JDlgConsultaFornecedor jDlgConsultaFornecedor = new JDlgConsultaFornecedor(null, true); 
jDlgConsultaFornecedor.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMnuConsultaFornActionPerformed

    private void jMnuConsultasFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultasFunciActionPerformed
       JDlgConsultaFuncionario jDlgConsultaFuncionario = new JDlgConsultaFuncionario(null, true); 
jDlgConsultaFuncionario.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuConsultasFunciActionPerformed

    private void jMnuConsultaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuConsultaProdActionPerformed
        JDlgConsultaProdutos jDlgConsultaProdutos = new JDlgConsultaProdutos(null, true); 
jDlgConsultaProdutos.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuConsultaProdActionPerformed

    private void jBtnFuncionariosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFuncionariosTActionPerformed
JDlgDrfFuncionarioNovo jDlgFuncionarioNovo = new JDlgDrfFuncionarioNovo(null, true);
       jDlgFuncionarioNovo.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnFuncionariosTActionPerformed

    private void jBtnFornecedorTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFornecedorTActionPerformed
        JDlgDrfFornecedor jDlgFornecedor = new JDlgDrfFornecedor(null,true);
        jDlgFornecedor.setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnFornecedorTActionPerformed

    private void jBtnComprasTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComprasTActionPerformed
       JDlgDrfCompras jDlgCompras = new JDlgDrfCompras(null,true);
        jDlgCompras.setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnComprasTActionPerformed

    private void jBtnProdutosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutosTActionPerformed
 JDlgDrfProdutoNovo jDlgProdutoNovo = new JDlgDrfProdutoNovo(null,true);
        jDlgProdutoNovo.setVisible(true);     
// TODO add your handling code here:
    }//GEN-LAST:event_jBtnProdutosTActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenu Consultas;
    private javax.swing.JButton jBtnComprasT;
    private javax.swing.JButton jBtnFornecedorT;
    private javax.swing.JButton jBtnFuncionariosT;
    private javax.swing.JButton jBtnProdutosT;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMnuCadastro;
    private javax.swing.JMenuItem jMnuCompras;
    private javax.swing.JMenuItem jMnuConsultaForn;
    private javax.swing.JMenuItem jMnuConsultaProd;
    private javax.swing.JMenuItem jMnuConsultasFunci;
    private javax.swing.JMenuItem jMnuConsultasUs;
    private javax.swing.JMenuItem jMnuFornecedor;
    private javax.swing.JMenuItem jMnuFuncionario;
    private javax.swing.JMenu jMnuMovimento;
    private javax.swing.JMenuItem jMnuProduto;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}