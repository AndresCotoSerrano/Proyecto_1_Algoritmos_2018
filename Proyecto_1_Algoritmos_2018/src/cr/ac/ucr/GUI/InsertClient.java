/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Files.ClientFile;
import java.util.LinkedList;

/**
 *
 * @author Melvin
 */
public class InsertClient extends javax.swing.JFrame {
    ClientFile clietfile;
    LinkedList<Client> linkedListClient = new LinkedList<>();
     /**
     * Creates new form Insert_Client
     */
    public InsertClient() {
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

        jLabel1 = new javax.swing.JLabel();
        lbl_InsertClient = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        lbl_Phone = new javax.swing.JLabel();
        lbl_Province = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
        tft_Name = new javax.swing.JTextField();
        tft_ID = new javax.swing.JTextField();
        tft_Email = new javax.swing.JTextField();
        tft_Phone = new javax.swing.JTextField();
        tft_Province = new javax.swing.JTextField();
        btn_Insert = new javax.swing.JButton();
        lbl_LastName1 = new javax.swing.JLabel();
        lbl_LastName2 = new javax.swing.JLabel();
        tft_LastName1 = new javax.swing.JTextField();
        tft_LastName2 = new javax.swing.JTextField();
        lbl_Address = new javax.swing.JLabel();
        tft_Address = new javax.swing.JTextField();
        lbl_Message = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_InsertClient.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertClient.setText("Insert Client");

        lbl_Name.setText("Name");

        lbl_Email.setText("E-mail");

        lbl_Phone.setText("Number phone");

        lbl_Province.setText("Province");

        lbl_ID.setText("ID");

        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });

        lbl_LastName1.setText("LastName1");

        lbl_LastName2.setText("LastName2");

        lbl_Address.setText("Exactly Address");

        lbl_Message.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Address)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_LastName2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_LastName1)
                                    .addGap(43, 43, 43))
                                .addComponent(lbl_ID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_Phone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_Province, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tft_Email)
                                        .addComponent(tft_Phone)
                                        .addComponent(tft_Province)
                                        .addComponent(tft_Address)
                                        .addComponent(btn_Insert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(lbl_InsertClient, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(tft_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tft_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tft_LastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(lbl_Name)
                        .addComponent(tft_LastName2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_InsertClient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name)
                    .addComponent(tft_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_LastName1)
                    .addComponent(tft_LastName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_LastName2)
                    .addComponent(tft_LastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ID)
                    .addComponent(tft_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Email)
                    .addComponent(tft_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Phone)
                    .addComponent(tft_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Province)
                    .addComponent(tft_Province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Address)
                    .addComponent(tft_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_Message)
                .addGap(22, 22, 22)
                .addComponent(btn_Insert)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed

 Client client=new Client(tft_ID.getText(), tft_Name.getText(),tft_LastName1.getText(),tft_LastName2.getText(),tft_Email.getText(), tft_Phone.getText(),tft_Province.getText(),tft_Address.getText());
        linkedListClient.add(client);

    }//GEN-LAST:event_btn_InsertActionPerformed

    public LinkedList getClientList (){
        
        return linkedListClient;
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
            java.util.logging.Logger.getLogger(InsertClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_InsertClient;
    private javax.swing.JLabel lbl_LastName1;
    private javax.swing.JLabel lbl_LastName2;
    private javax.swing.JLabel lbl_Message;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Phone;
    private javax.swing.JLabel lbl_Province;
    private javax.swing.JTextField tft_Address;
    private javax.swing.JTextField tft_Email;
    private javax.swing.JTextField tft_ID;
    private javax.swing.JTextField tft_LastName1;
    private javax.swing.JTextField tft_LastName2;
    private javax.swing.JTextField tft_Name;
    private javax.swing.JTextField tft_Phone;
    private javax.swing.JTextField tft_Province;
    // End of variables declaration//GEN-END:variables
}