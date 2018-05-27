/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Clase_Prueba;
import cr.ac.ucr.Domain.Image_Panel;
import cr.ac.ucr.Domain.Restaurant;
import cr.ac.ucr.Files.LoanLogo;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Melvin
 */
public class InsertRestaurant extends javax.swing.JFrame {

    Image_Panel imagePanel;
    public static LinkedList<Restaurant> linkedListRestaurant = new LinkedList<>();

    /**
     * Creates new form Insert_Restaurant
     */
    public InsertRestaurant() {
        initComponents();
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

        lbl_InsertRestaurant = new javax.swing.JLabel();
        lbl_InsertLogo = new javax.swing.JLabel();
        btn_Load_Logo = new javax.swing.JButton();
        lbl_Name = new javax.swing.JLabel();
        tfd_Name = new javax.swing.JTextField();
        lbl_Province = new javax.swing.JLabel();
        lbl_Location = new javax.swing.JLabel();
        btn_Insert = new javax.swing.JButton();
        tfd_Province = new javax.swing.JTextField();
        tfd_Location = new javax.swing.JTextField();
        lbl_ID = new javax.swing.JLabel();
        lbl_ID1 = new javax.swing.JLabel();
        lbl_Logo = new javax.swing.JLabel();
        tft_Path = new javax.swing.JTextField();
        JB_Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_InsertRestaurant.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        lbl_InsertRestaurant.setForeground(new java.awt.Color(0, 153, 153));
        lbl_InsertRestaurant.setText("Insert Restaurant");
        getContentPane().add(lbl_InsertRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 290, -1));

        lbl_InsertLogo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_InsertLogo.setForeground(new java.awt.Color(0, 153, 153));
        lbl_InsertLogo.setText("Insert the Logo of the Restaurant");
        getContentPane().add(lbl_InsertLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 429, -1, -1));

        btn_Load_Logo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_Load_Logo.setForeground(new java.awt.Color(0, 153, 153));
        btn_Load_Logo.setText("Load Logo");
        btn_Load_Logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Load_LogoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Load_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 491, 287, -1));

        lbl_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Name.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Name.setText("Name");
        getContentPane().add(lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 120, 30));
        getContentPane().add(tfd_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 162, 287, 31));

        lbl_Province.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Province.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Province.setText("Province");
        getContentPane().add(lbl_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        lbl_Location.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Location.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Location.setText("Location");
        getContentPane().add(lbl_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        btn_Insert.setForeground(new java.awt.Color(0, 153, 153));
        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 700, 90, 30));

        tfd_Province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_ProvinceActionPerformed(evt);
            }
        });
        getContentPane().add(tfd_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 243, 287, 31));
        getContentPane().add(tfd_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 356, 287, 30));

        lbl_ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_ID.setForeground(new java.awt.Color(0, 153, 153));
        lbl_ID.setText("ID");
        getContentPane().add(lbl_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lbl_ID1.setText("jLabel8");
        getContentPane().add(lbl_ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 92, -1, -1));

        lbl_Logo.setForeground(new java.awt.Color(0, 153, 153));
        lbl_Logo.setText("jLabel9");
        getContentPane().add(lbl_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 609, 287, 82));
        getContentPane().add(tft_Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 563, 287, -1));

        JB_Cancel.setForeground(new java.awt.Color(0, 153, 153));
        JB_Cancel.setText("Cancel");
        JB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/admin.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 700, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfd_ProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_ProvinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_ProvinceActionPerformed

    private void btn_Load_LogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Load_LogoActionPerformed
        // TODO add your handling code here:
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

//    ImageIcon icon = new ImageIcon(url);  
//  
//JLabel label = new JLabel("some text");  
//label.setIcon(icon);  
//    ImageIcon fot = new ImageIcon(path_ala_imagen);
//    Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
//    jLabel1.setIcon(icono);
//    this.repaint();
        ImageIcon icon = new ImageIcon(tft_Path.getText());
        Icon icon2 = new ImageIcon(icon.getImage().getScaledInstance(lbl_Logo.getWidth(), lbl_Logo.getHeight(), Image.SCALE_DEFAULT));
        lbl_Logo.setIcon(icon2);
        this.repaint();
    }//GEN-LAST:event_btn_Load_LogoActionPerformed

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed

        Restaurant restaurant = new Restaurant(lbl_ID1.getText(), tft_Path.getText(), tfd_Name.getText(), tfd_Province.getText(), tfd_Location.getText());
        linkedListRestaurant.add(restaurant);
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void JB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelActionPerformed
        CRUDs crud = new CRUDs();
        this.dispose();
        crud.setVisible(true);
    }//GEN-LAST:event_JB_CancelActionPerformed

    public LinkedList getRestaurantList() {

        return linkedListRestaurant;

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
            java.util.logging.Logger.getLogger(InsertRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertRestaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancel;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Load_Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_ID1;
    private javax.swing.JLabel lbl_InsertLogo;
    private javax.swing.JLabel lbl_InsertRestaurant;
    private javax.swing.JLabel lbl_Location;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Province;
    private javax.swing.JTextField tfd_Location;
    private javax.swing.JTextField tfd_Name;
    private javax.swing.JTextField tfd_Province;
    private javax.swing.JTextField tft_Path;
    // End of variables declaration//GEN-END:variables
}
