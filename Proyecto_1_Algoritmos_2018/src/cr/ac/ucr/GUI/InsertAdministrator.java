/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Administrator;
import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Files.ReadFilesCSV;
import cr.ac.ucr.Files.readFiles;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melvin
 */
public class InsertAdministrator extends javax.swing.JFrame {

    int countIDAdmin = 1;
    
   // ReadFilesCSV readCsv = new ReadFilesCSV();
    
    
    
    public static LinkedList<Administrator> linkedAdministrator;

    /**
     * Creates new form insert_Administrator
     */
    public InsertAdministrator() {
        initComponents();
        
        //LinkedList<Administrator> admList = readCsv.readCSVAdministrator();
        
         
        
        
        
        readFiles read= new readFiles();
        LinkedList<Administrator> adminList = read.readAdministrator();
//        if(admList.isEmpty()){
//            lbl_ID2.setText("1");
//        
//        }else{
//            int id = Integer.parseInt(admList.getLast().getID());
//            id++;
//            lbl_ID2.setText(id+"");
//        }
        
        //lbl_ID2.setText(countIDAdministrator() + "");
        this.setLocationRelativeTo(null);
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
        lbl_ID = new javax.swing.JLabel();
        lbl_ID2 = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        tfd_Name = new javax.swing.JTextField();
        lbl_LastName1 = new javax.swing.JLabel();
        tft_LastName1 = new javax.swing.JTextField();
        lbl_LastName2 = new javax.swing.JLabel();
        tft_LastName2 = new javax.swing.JTextField();
        lbl_Email = new javax.swing.JLabel();
        tft_Email = new javax.swing.JTextField();
        lbl_Phone = new javax.swing.JLabel();
        tft_Phone = new javax.swing.JTextField();
        lbl_Province = new javax.swing.JLabel();
        lbl_Location = new javax.swing.JLabel();
        tft_Province = new javax.swing.JTextField();
        tft_Location = new javax.swing.JTextField();
        btn_Inser_Administrator = new javax.swing.JButton();
        JB_Cancel = new javax.swing.JButton();
        lbl_Message = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Insert Administrator");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 37, 297, 40));

        lbl_ID.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(0, 153, 153));
        lbl_ID.setText("ID");
        getContentPane().add(lbl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 115, 82, 30));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_ID2.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 115, 297, 30));

        lbl_Name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_Name.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Name.setText("Name");
        getContentPane().add(lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        tfd_Name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfd_Name.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tfd_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 300, 32));

        lbl_LastName1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_LastName1.setForeground(new java.awt.Color(0, 153, 153));
        lbl_LastName1.setText("LastName1");
        getContentPane().add(lbl_LastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        tft_LastName1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tft_LastName1.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tft_LastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 297, 30));

        lbl_LastName2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_LastName2.setForeground(new java.awt.Color(0, 153, 153));
        lbl_LastName2.setText("LastName2");
        getContentPane().add(lbl_LastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        tft_LastName2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tft_LastName2.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tft_LastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 297, 30));

        lbl_Email.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Email.setText("Email");
        getContentPane().add(lbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        tft_Email.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tft_Email.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tft_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 297, 30));

        lbl_Phone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_Phone.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Phone.setText("Phone");
        getContentPane().add(lbl_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        tft_Phone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tft_Phone.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tft_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 297, 30));

        lbl_Province.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_Province.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Province.setText("Province");
        getContentPane().add(lbl_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        lbl_Location.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_Location.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Location.setText("Location");
        getContentPane().add(lbl_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        tft_Province.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tft_Province.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tft_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 297, 30));

        tft_Location.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tft_Location.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(tft_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 297, 30));

        btn_Inser_Administrator.setBackground(new java.awt.Color(51, 51, 51));
        btn_Inser_Administrator.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btn_Inser_Administrator.setForeground(new java.awt.Color(0, 153, 153));
        btn_Inser_Administrator.setText("Insert");
        btn_Inser_Administrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Inser_AdministratorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Inser_Administrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 138, 48));

        JB_Cancel.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        JB_Cancel.setForeground(new java.awt.Color(0, 153, 153));
        JB_Cancel.setText("Cancel");
        JB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 140, 50));

        lbl_Message.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_Message.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(lbl_Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 490, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/admin.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Inser_AdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Inser_AdministratorActionPerformed
        Administrator admin = new Administrator(lbl_ID2.getText(), tfd_Name.getText(), tft_LastName1.getText(), tft_LastName2.getText(), tft_Email.getText(), tft_Phone.getText(), tft_Province.getText(), tft_Location.getText());
        linkedAdministrator.add(admin);
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);
    }//GEN-LAST:event_btn_Inser_AdministratorActionPerformed

    private void JB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelActionPerformed
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);
    }//GEN-LAST:event_JB_CancelActionPerformed

    public int countIDAdministrator() {
        return countIDAdmin;

    }

    public LinkedList getAdminList() {

        return linkedAdministrator;
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
            java.util.logging.Logger.getLogger(InsertAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                    new InsertAdministrator().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancel;
    private javax.swing.JButton btn_Inser_Administrator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_LastName1;
    private javax.swing.JLabel lbl_LastName2;
    private javax.swing.JLabel lbl_Location;
    private javax.swing.JLabel lbl_Message;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Phone;
    private javax.swing.JLabel lbl_Province;
    private javax.swing.JTextField tfd_Name;
    private javax.swing.JTextField tft_Email;
    private javax.swing.JTextField tft_LastName1;
    private javax.swing.JTextField tft_LastName2;
    private javax.swing.JTextField tft_Location;
    private javax.swing.JTextField tft_Phone;
    private javax.swing.JTextField tft_Province;
    // End of variables declaration//GEN-END:variables
}
