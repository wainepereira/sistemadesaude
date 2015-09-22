
package Tlogin;

import controle.FabricadeConexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    
    public login() {
        initComponents();
    }
    
    //abrindo a conexao com o banco de dados e listando o usuario.
public void conexao(){
    try{
            FabricadeConexao fab = new FabricadeConexao();
            
            fab.abrirConexao();
            fab.stmt = fab.con.createStatement();
            
            String sql = "select * from usuario";
            fab.rs = fab.stmt.executeQuery(sql);
            fab.rs.first();
            
            if(txtNome.getText().equals(fab.rs.getString("nome")) && ptxtSenha.getText().equals(fab.rs.getString("senha")) ){
                JOptionPane.showMessageDialog(null,"acesso permitido");
            }else{
                JOptionPane.showMessageDialog(null,"acesso Negado");
            }
             
          }catch (SQLException e){ 
            
          }
}

  

//fim do codigo de banco de dados.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jsair = new javax.swing.JButton();
        jlogar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        ptxtSenha = new javax.swing.JPasswordField();
        fundo_tela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Sistema de  Saúde");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 120, 60, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 80, 60, 20);

        jsair.setText("Sair");
        jsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsairActionPerformed(evt);
            }
        });
        getContentPane().add(jsair);
        jsair.setBounds(270, 160, 70, 23);

        jlogar.setText("Logar");
        jlogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogarActionPerformed(evt);
            }
        });
        getContentPane().add(jlogar);
        jlogar.setBounds(190, 160, 70, 23);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(200, 80, 120, 20);

        ptxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptxtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(ptxtSenha);
        ptxtSenha.setBounds(200, 120, 120, 20);

        fundo_tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/copertina.png"))); // NOI18N
        getContentPane().add(fundo_tela);
        fundo_tela.setBounds(10, 0, 500, 230);

        setSize(new java.awt.Dimension(526, 275));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsairActionPerformed
        //metado de sair
        System.exit(0);
    }//GEN-LAST:event_jsairActionPerformed

    private void jlogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogarActionPerformed
        //entrar no sistema
     conexao();
    }//GEN-LAST:event_jlogarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void ptxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptxtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo_tela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jlogar;
    private javax.swing.JButton jsair;
    private javax.swing.JPasswordField ptxtSenha;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}