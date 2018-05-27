/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Files.readFiles;
import java.util.LinkedList;

/**
 *
 * @author Melvin
 */
public class InsertAgent extends javax.swing.JFrame {

    public static LinkedList<Agent> linkedAgent = new LinkedList();
    

    int IDAgent = 0;

    /**
     * Creates new form Insert_Agent
     */
    public InsertAgent() {
        initComponents();
        readFiles read= new readFiles();
        LinkedList<Agent> agentList = read.readAgent();
        if(agentList.isEmpty()){
            lbl_ID2.setText("1");
        
        }else{
            int id = Integer.parseInt(agentList.getLast().getID());
            id++;
            lbl_ID2.setText(id+"");
        }
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

        lbl_Insert_Agent = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_User = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        lbl_Code = new javax.swing.JLabel();
        tft_Name = new javax.swing.JTextField();
        tft_User = new javax.swing.JTextField();
        tft_Email = new javax.swing.JTextField();
        tft_Code = new javax.swing.JTextField();
        btn_Insert_Agemt = new javax.swing.JButton();
        lbl_ID = new javax.swing.JLabel();
        lbl_ID2 = new javax.swing.JLabel();
        lbl_LastName1 = new javax.swing.JLabel();
        lbl_LastName2 = new javax.swing.JLabel();
        tft_LastName1 = new javax.swing.JTextField();
        tft_LastName2 = new javax.swing.JTextField();
        lbl_Phone = new javax.swing.JLabel();
        tft_Phone = new javax.swing.JTextField();
        lbl_Province = new javax.swing.JLabel();
        lbl_Location = new javax.swing.JLabel();
        tft_Province = new javax.swing.JTextField();
        tft_Location = new javax.swing.JTextField();
        JB_Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Insert_Agent.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_Insert_Agent.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Insert_Agent.setText("Insert Agent");
        getContentPane().add(lbl_Insert_Agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 30, 204, 34));

        lbl_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Name.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Name.setText("Name");
        getContentPane().add(lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lbl_User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_User.setForeground(new java.awt.Color(0, 153, 153));
        lbl_User.setText("User");
        getContentPane().add(lbl_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        lbl_Email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Email.setText("E-mail");
        lbl_Email.setMaximumSize(new java.awt.Dimension(51, 24));
        lbl_Email.setMinimumSize(new java.awt.Dimension(51, 24));
        lbl_Email.setPreferredSize(new java.awt.Dimension(51, 24));
        getContentPane().add(lbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, -1));

        lbl_Code.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Code.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Code.setText("Code");
        getContentPane().add(lbl_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));
        getContentPane().add(tft_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 251, 30));
        getContentPane().add(tft_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 539, 251, 30));
        getContentPane().add(tft_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 326, 251, 30));
        getContentPane().add(tft_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 597, 251, 30));

        btn_Insert_Agemt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Insert_Agemt.setForeground(new java.awt.Color(0, 153, 153));
        btn_Insert_Agemt.setText("Insert");
        btn_Insert_Agemt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Insert_AgemtActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Insert_Agemt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 100, 40));

        lbl_ID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(0, 153, 153));
        lbl_ID.setText("ID");
        getContentPane().add(lbl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 95, -1, -1));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_ID2.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 95, 210, 25));

        lbl_LastName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_LastName1.setForeground(new java.awt.Color(0, 153, 153));
        lbl_LastName1.setText("LastName1");
        getContentPane().add(lbl_LastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lbl_LastName2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_LastName2.setForeground(new java.awt.Color(0, 153, 153));
        lbl_LastName2.setText("LastName2");
        lbl_LastName2.setMaximumSize(new java.awt.Dimension(51, 24));
        lbl_LastName2.setMinimumSize(new java.awt.Dimension(51, 24));
        lbl_LastName2.setPreferredSize(new java.awt.Dimension(51, 24));
        getContentPane().add(lbl_LastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, -1));
        getContentPane().add(tft_LastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 215, 251, 30));
        getContentPane().add(tft_LastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 275, 251, 33));

        lbl_Phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Phone.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Phone.setText("Phone");
        getContentPane().add(lbl_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));
        getContentPane().add(tft_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 251, 33));

        lbl_Province.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Province.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Province.setText("Province");
        getContentPane().add(lbl_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        lbl_Location.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Location.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Location.setText("Location");
        getContentPane().add(lbl_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));
        getContentPane().add(tft_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 441, 251, 30));
        getContentPane().add(tft_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 489, 251, 32));

        JB_Cancel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JB_Cancel.setForeground(new java.awt.Color(0, 153, 153));
        JB_Cancel.setText("Cancel");
        JB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/admin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Insert_AgemtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Insert_AgemtActionPerformed

       Agent agent = new Agent(lbl_ID2.getText(), tft_Name.getText(), tft_LastName1.getText(), tft_LastName2.getText(), tft_Email.getText(), tft_Phone.getText(), tft_Province.getText(), tft_Location.getText(), tft_User.getText(), tft_Code.getText());
        this.linkedAgent.add(agent);
        System.out.println("insertado");
        for (Agent a : linkedAgent) {
            System.out.println(a.toString());
        }
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);
    }//GEN-LAST:event_btn_Insert_AgemtActionPerformed

    private void JB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelActionPerformed
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);
    }//GEN-LAST:event_JB_CancelActionPerformed

    public int IDAgent() {
        IDAgent++;
        return IDAgent;
    }

    public LinkedList getAgentList() {
        LinkedList<Agent> list = linkedAgent;
        System.out.println("me ejecute");
        if (linkedAgent.isEmpty()) {
            System.out.println("pero la lista vino vacia");
        }
        for (Agent a : linkedAgent) {
            System.out.println(a.toString());
        }
        return list;
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
            java.util.logging.Logger.getLogger(InsertAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertAgent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancel;
    private javax.swing.JButton btn_Insert_Agemt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Code;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_Insert_Agent;
    private javax.swing.JLabel lbl_LastName1;
    private javax.swing.JLabel lbl_LastName2;
    private javax.swing.JLabel lbl_Location;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Phone;
    private javax.swing.JLabel lbl_Province;
    private javax.swing.JLabel lbl_User;
    private javax.swing.JTextField tft_Code;
    private javax.swing.JTextField tft_Email;
    private javax.swing.JTextField tft_LastName1;
    private javax.swing.JTextField tft_LastName2;
    private javax.swing.JTextField tft_Location;
    private javax.swing.JTextField tft_Name;
    private javax.swing.JTextField tft_Phone;
    private javax.swing.JTextField tft_Province;
    private javax.swing.JTextField tft_User;
    // End of variables declaration//GEN-END:variables
}
