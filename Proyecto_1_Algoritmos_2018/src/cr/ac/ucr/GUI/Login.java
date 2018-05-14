/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author deltadragon
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("cr/ac/ucr/Img/icono.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_Enter = new javax.swing.JButton();
        JL_Login = new javax.swing.JLabel();
        JB_Cancel = new javax.swing.JToggleButton();
        JT_User = new javax.swing.JTextField();
        JT_Password = new javax.swing.JPasswordField();
        JL_User = new javax.swing.JLabel();
        JL_Password = new javax.swing.JLabel();
        JL_Img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_Enter.setBackground(new java.awt.Color(255, 0, 0));
        JB_Enter.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        JB_Enter.setForeground(new java.awt.Color(204, 204, 0));
        JB_Enter.setText("ENTER");
        JB_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EnterActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 140, 40));

        JL_Login.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        JL_Login.setForeground(new java.awt.Color(204, 204, 0));
        JL_Login.setText("LOGIN");
        getContentPane().add(JL_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 110, 50));

        JB_Cancel.setBackground(new java.awt.Color(255, 0, 0));
        JB_Cancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        JB_Cancel.setForeground(new java.awt.Color(204, 204, 0));
        JB_Cancel.setText("CANCEL");
        JB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 140, 40));

        JT_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_UserActionPerformed(evt);
            }
        });
        getContentPane().add(JT_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 220, 40));

        JT_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(JT_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 220, 40));

        JL_User.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        JL_User.setForeground(new java.awt.Color(204, 204, 0));
        JL_User.setText("USER");
        getContentPane().add(JL_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        JL_Password.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        JL_Password.setForeground(new java.awt.Color(204, 204, 0));
        JL_Password.setText("PASSWORD");
        getContentPane().add(JL_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        JL_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/login1.jpg"))); // NOI18N
        getContentPane().add(JL_Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_EnterActionPerformed

    private void JB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JB_CancelActionPerformed

    private void JT_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_UserActionPerformed

    private void JT_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_PasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JB_Cancel;
    private javax.swing.JButton JB_Enter;
    private javax.swing.JLabel JL_Img;
    private javax.swing.JLabel JL_Login;
    private javax.swing.JLabel JL_Password;
    private javax.swing.JLabel JL_User;
    private javax.swing.JPasswordField JT_Password;
    private javax.swing.JTextField JT_User;
    // End of variables declaration//GEN-END:variables
}
