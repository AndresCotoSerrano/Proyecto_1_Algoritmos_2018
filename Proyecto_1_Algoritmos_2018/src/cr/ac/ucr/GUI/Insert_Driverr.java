/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Files.ClientFile;
import cr.ac.ucr.Logic.CircularLinkedList;
import java.util.LinkedList;

/**
 *
 * @author Melvin
 */
public class Insert_Driverr extends javax.swing.JFrame {
    ClientFile clietfile;
    LinkedList<Client> linkedListClient = new LinkedList<>();
    
     /**
     * Creates new form Insert_Client
     */
    public Insert_Driverr() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_InsertClient.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertClient.setText("Insert Driver");

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

        jLabel2.setText("Age");

        jLabel3.setText("Type Vehicle");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motocicleta", "Bicicleta", "Carro", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(100, 100, 100)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(lbl_Address)
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
                                .addGap(50, 50, 50)
                                .addComponent(lbl_InsertClient, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tft_Province, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tft_Address, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_Insert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                        .addComponent(tft_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tft_Phone))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tft_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(tft_LastName1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(tft_LastName2)
                                    .addComponent(tft_ID)))))
                    .addComponent(lbl_Name))
                .addContainerGap(84, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(jLabel2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(lbl_Message)
                .addGap(18, 18, 18)
                .addComponent(btn_Insert)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed

 Client client=new Client(tft_ID.getText(), tft_Name.getText(),tft_LastName1.getText(),tft_LastName2.getText(),tft_Email.getText(), tft_Phone.getText(),tft_Province.getText(),tft_Address.getText());
        linkedListClient.add(client);
       

   // Client client=new Client(tft_ID.getText(), tft_Name.getText(),tft_LastName1.getText(),tft_LastName2.getText(),tft_Email.getText(), tft_Phone.getText(),tft_Province.getText(),tft_Address.getText());
//   clietfile =new ClientFile();
//   lbl_Message.setText(clietfile.writeClients(client,true));




        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InsertActionPerformed
 private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
   String valor=jComboBox1.getSelectedItem().toString();
     

    }                                          
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public LinkedList clientList (){
        
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
            java.util.logging.Logger.getLogger(Insert_Driverr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Driverr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Driverr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Driverr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Driverr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Insert;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
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
