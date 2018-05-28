/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.FileChooser;
import cr.ac.ucr.Domain.Product;
import cr.ac.ucr.Files.ReadFilesCSV;
import cr.ac.ucr.Logic.CircularLinkedList;
import cr.ac.ucr.Logic.ListException.ListException;
import cr.ac.ucr.Logic.Node;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Melvin
 */
public class InsertProduct extends javax.swing.JFrame {

    FileChooser filechooser = new FileChooser();

//ReadFilesCSV readCsv = new ReadFilesCSV();
    public static CircularLinkedList circularListProduct;

    /**
     * Creates new form Insert_Product
     */
    public InsertProduct() {
         initComponents();
         
        // LinkedList<Product> productList = readCsv.readCSVProduct();
        

        tft_Path.setEditable(false);
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
        cb_Product = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tft_Name = new javax.swing.JTextField();
        tfd_Cost = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tft_Path = new javax.swing.JTextField();
        lbl_Image = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JB_Cancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Insert Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 35, 228, 34));

        cb_Product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_Product.setForeground(new java.awt.Color(0, 153, 153));
        cb_Product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drink", "Food", "Dessert", "Various" }));
        cb_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ProductActionPerformed(evt);
            }
        });
        getContentPane().add(cb_Product, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 148, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Select the Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 105, 122, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Cost");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Add Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 372, -1, -1));

        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Insert Product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 513, 162, 45));
        getContentPane().add(tft_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 219, 228, -1));
        getContentPane().add(tfd_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 292, 228, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Path Image");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));
        getContentPane().add(tft_Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 466, 228, -1));
        getContentPane().add(lbl_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 633, 240, 176));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 576, 328, 39));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 827, 561, 24));

        JB_Cancel.setForeground(new java.awt.Color(0, 153, 153));
        JB_Cancel.setText("Cancel");
        JB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 524, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/admin.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ProductActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JFileChooser fileChooser = new JFileChooser("C:\\Users\\Melvin\\Desktop\\CallCenterAlgoritmos\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png");
        fileChooser.setFileFilter(imgFilter);

        int result = fileChooser.showOpenDialog(this);

        if (result != JFileChooser.CANCEL_OPTION) {

            File fileName = fileChooser.getSelectedFile();

            if ((fileName == null) || (fileName.getName().equals(""))) {
                tft_Path.setText("...");
            } else {
                tft_Path.setText(fileName.getAbsolutePath());
            }
        }

        ImageIcon icon = new ImageIcon(tft_Path.getText());
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_Image.getWidth(), lbl_Image.getHeight(), Image.SCALE_DEFAULT));
        lbl_Image.setIcon(icon2);
        this.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        CircularLinkedList circularDrink = new CircularLinkedList();
        CircularLinkedList circularFood = new CircularLinkedList();
        CircularLinkedList circularDessert = new CircularLinkedList();
        CircularLinkedList circularVarious = new CircularLinkedList();

        String type = "";

        if (cb_Product.getSelectedItem().toString().equals("Drink")) {
            type = "Drink";
        } else if (cb_Product.getSelectedItem().toString().equals("Food")) {
            type = "Food";
        } else if (cb_Product.getSelectedItem().toString().equals("Dessert")) {
            type = "Dessert";
        } else {
            type = "Various";
        }
        Product product = new Product(tft_Name.getText(), tfd_Cost.getText(), type, tft_Path.getText());

        try {

            circularListProduct.insert(product);
            
          
        } catch (ListException ex) {
            Logger.getLogger(InsertProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void JB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelActionPerformed
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);
    }//GEN-LAST:event_JB_CancelActionPerformed


    
    public CircularLinkedList getProductCircularList(){
        
        
        
        return circularListProduct;
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
            java.util.logging.Logger.getLogger(InsertProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
               
                    new InsertProduct().setVisible(true);
               
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancel;
    private javax.swing.JComboBox<String> cb_Product;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_Image;
    private javax.swing.JTextField tfd_Cost;
    private javax.swing.JTextField tft_Name;
    private javax.swing.JTextField tft_Path;
    // End of variables declaration//GEN-END:variables
}
