/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Domain.Client;
import cr.ac.ucr.Domain.Driver;
import cr.ac.ucr.Files.ClientFile;
import cr.ac.ucr.Files.DriverFile;
import cr.ac.ucr.Files.ReadFilesCSV;
import cr.ac.ucr.Files.readFiles;
import cr.ac.ucr.Logic.CircularLinkedList;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melvin
 */
public class InsertDriver extends javax.swing.JFrame {
    
    
//ReadFilesCSV readCsv = new ReadFilesCSV();
    DriverFile driverFile = new DriverFile();
    //LinkedList<Client> linkedListClient = new LinkedList<>();
    public static Queue<Driver> driversQueue;
    String typeVehicule;

    /**
     * Creates new form Insert_Client
     */
    public InsertDriver() {
        initComponents();
        
      //  LinkedList<Driver> driverList = readCsv.readCSVDriver();
        
         
        
        //readFiles read= new readFiles();
        //LinkedList<Driver> DriverList = read.readDriver();
//        if(driversQueue.isEmpty()){
//            lbl_ID2.setText("1");
//        
//        }else{
//            int id = Integer.parseInt(ReadFilesCSV.readCSVDriver().getLast().getID());
//            id++;
//            lbl_ID2.setText(id+"");
//        }
        
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
        lbl_InsertClient = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        lbl_Phone = new javax.swing.JLabel();
        lbl_Province = new javax.swing.JLabel();
        lbl_ID = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfd_Age = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        JB_Cancel = new javax.swing.JButton();
        lbl_ID2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_InsertClient.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertClient.setForeground(new java.awt.Color(0, 153, 153));
        lbl_InsertClient.setText("Insert Driver");
        getContentPane().add(lbl_InsertClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 11, 214, -1));

        lbl_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Name.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Name.setText("Name");
        getContentPane().add(lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lbl_Email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Email.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Email.setText("E-mail");
        getContentPane().add(lbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        lbl_Phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Phone.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Phone.setText("Number phone");
        getContentPane().add(lbl_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        lbl_Province.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Province.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Province.setText("Province");
        getContentPane().add(lbl_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        lbl_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(0, 153, 153));
        lbl_ID.setText("ID");
        getContentPane().add(lbl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        getContentPane().add(tft_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 214, -1));
        getContentPane().add(tft_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 214, -1));
        getContentPane().add(tft_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 214, -1));

        btn_Insert.setForeground(new java.awt.Color(0, 153, 153));
        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 214, -1));

        lbl_LastName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_LastName1.setForeground(new java.awt.Color(0, 153, 153));
        lbl_LastName1.setText("LastName1");
        getContentPane().add(lbl_LastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        lbl_LastName2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_LastName2.setForeground(new java.awt.Color(0, 153, 153));
        lbl_LastName2.setText("LastName2");
        getContentPane().add(lbl_LastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));
        getContentPane().add(tft_LastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 214, -1));
        getContentPane().add(tft_LastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 214, -1));

        lbl_Address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Address.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Address.setText("Exactly Address");
        getContentPane().add(lbl_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));
        getContentPane().add(tft_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 214, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Age");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Type Vehicle");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        tfd_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_AgeActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 214, -1));

        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 214, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motocicleta", "Carro", "Bicicleta" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        JB_Cancel.setForeground(new java.awt.Color(0, 153, 153));
        JB_Cancel.setText("Cancel");
        JB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, -1, -1));

        lbl_ID2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_ID2.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(lbl_ID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 210, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/admin.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 620, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed

       // Driver driver = new Driver(typeVehicule, textfieldAge.getText(), tft_ID.getText(), tf_name.getText(), tft_LastName1.getText(), tft_LastName2.getText(), tft_Email.getText(), tft_Phone.getText(), tft_Province.getText(), tft_Address.getText());
       Driver driver = new Driver(lbl_ID2.getText(), tf_name.getText(), tft_LastName1.getText(), tft_LastName2.getText(), tft_Email.getText(), tft_Phone.getText(), tft_Province.getText(), tft_Address.getText(), typeVehicule,tfd_Age.getText() );
        driversQueue.add(driver);
        
       // driverFile.writeDrivers(driver, true);

        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void tfd_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_AgeActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        typeVehicule = jComboBox2.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void JB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelActionPerformed
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);
    }//GEN-LAST:event_JB_CancelActionPerformed

    
    public Queue getDriverQueue(){
        return driversQueue;
        
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
            java.util.logging.Logger.getLogger(InsertDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                    new InsertDriver().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancel;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_ID2;
    private javax.swing.JLabel lbl_InsertClient;
    private javax.swing.JLabel lbl_LastName1;
    private javax.swing.JLabel lbl_LastName2;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Phone;
    private javax.swing.JLabel lbl_Province;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tfd_Age;
    private javax.swing.JTextField tft_Address;
    private javax.swing.JTextField tft_Email;
    private javax.swing.JTextField tft_LastName1;
    private javax.swing.JTextField tft_LastName2;
    private javax.swing.JTextField tft_Phone;
    private javax.swing.JTextField tft_Province;
    // End of variables declaration//GEN-END:variables
}
