/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;


import cr.ac.ucr.Domain.Order;
import cr.ac.ucr.Logic.LinkedStack;
import cr.ac.ucr.Logic.StackException.PilaException;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JScrollBar;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deltadragon
 */
public class AdministratorA extends javax.swing.JFrame {

    Dimension dimension;
    int alto;
    JScrollBar barra;
    final int filas = 21;

    public AdministratorA() throws PilaException {
        initComponents();
        this.setLocationRelativeTo(null);
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Tittle = new javax.swing.JLabel();
        JL_Name = new javax.swing.JLabel();
        JL_Code = new javax.swing.JLabel();
        JL_Email = new javax.swing.JLabel();
        JL_NameAgent = new javax.swing.JLabel();
        JL_CodeAgent = new javax.swing.JLabel();
        JL_EmailAgent = new javax.swing.JLabel();
        JT_Table = new javax.swing.JScrollPane();
        JT_Reporte = new javax.swing.JTable();
        JB_LogOut = new javax.swing.JButton();
        JB_Charts = new javax.swing.JButton();
        JT_ClientSearch = new javax.swing.JTextField();
        JT_OrderSearch = new javax.swing.JTextField();
        JT_AgentSearch = new javax.swing.JTextField();
        JT_AmountSearch = new javax.swing.JTextField();
        JT_ProvinceSearch = new javax.swing.JTextField();
        JT_DriverSearch = new javax.swing.JTextField();
        JT_DateSearch = new calendario.DateTextField();
        JB_Search = new javax.swing.JButton();
        JB_next = new javax.swing.JButton();
        JB_Previous = new javax.swing.JButton();
        JB_CreateAccount = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JL_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Tittle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        JL_Tittle.setForeground(new java.awt.Color(204, 204, 5));
        JL_Tittle.setText("Administrator");
        getContentPane().add(JL_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 240, 50));

        JL_Name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        JL_Name.setForeground(new java.awt.Color(204, 204, 5));
        JL_Name.setText("Name:");
        getContentPane().add(JL_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 60, 40));

        JL_Code.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        JL_Code.setForeground(new java.awt.Color(204, 204, 5));
        JL_Code.setText("Code:");
        getContentPane().add(JL_Code, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 60, 40));

        JL_Email.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        JL_Email.setForeground(new java.awt.Color(204, 204, 5));
        JL_Email.setText("Email:");
        getContentPane().add(JL_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, 60, 40));
        getContentPane().add(JL_NameAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 250, 30));
        getContentPane().add(JL_CodeAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 180, 30));
        getContentPane().add(JL_EmailAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 220, 30));

        JT_Reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Client", "No.Orden", "Agent", "Date", "Amount", "Province", "Driver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_Reporte.setAutoscrolls(false);
        JT_Table.setViewportView(JT_Reporte);
        if (JT_Reporte.getColumnModel().getColumnCount() > 0) {
            JT_Reporte.getColumnModel().getColumn(0).setResizable(false);
            JT_Reporte.getColumnModel().getColumn(1).setResizable(false);
            JT_Reporte.getColumnModel().getColumn(2).setResizable(false);
            JT_Reporte.getColumnModel().getColumn(3).setResizable(false);
            JT_Reporte.getColumnModel().getColumn(4).setResizable(false);
            JT_Reporte.getColumnModel().getColumn(5).setResizable(false);
            JT_Reporte.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(JT_Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1220, 350));

        JB_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/favicon.png"))); // NOI18N
        JB_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(JB_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 40, 40));

        JB_Charts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/graficos1.png"))); // NOI18N
        getContentPane().add(JB_Charts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 40, 40));

        JT_ClientSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_ClientSearchActionPerformed(evt);
            }
        });
        getContentPane().add(JT_ClientSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 30));
        getContentPane().add(JT_OrderSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, 30));

        JT_AgentSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_AgentSearchActionPerformed(evt);
            }
        });
        getContentPane().add(JT_AgentSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 170, 30));
        getContentPane().add(JT_AmountSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 170, 30));
        getContentPane().add(JT_ProvinceSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 160, 30));

        JT_DriverSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_DriverSearchActionPerformed(evt);
            }
        });
        getContentPane().add(JT_DriverSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, 170, 30));

        JT_DateSearch.setText("dateTextField1");
        getContentPane().add(JT_DateSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 160, 30));

        JB_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/lupa1.png"))); // NOI18N
        getContentPane().add(JB_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 40, 40));

        JB_next.setText("Next");
        JB_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_nextActionPerformed(evt);
            }
        });
        getContentPane().add(JB_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 90, -1));

        JB_Previous.setText("Previous");
        JB_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_PreviousActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 90, -1));

        JB_CreateAccount.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_CreateAccount.setForeground(new java.awt.Color(204, 204, 5));
        JB_CreateAccount.setText("Create account");
        JB_CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(JB_CreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 5));
        jButton1.setText("CRUD's");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 30));

        JL_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/admin.jpg"))); // NOI18N
        getContentPane().add(JL_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LogOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_JB_LogOutActionPerformed

    private void JT_ClientSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_ClientSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_ClientSearchActionPerformed

    private void JT_AgentSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_AgentSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_AgentSearchActionPerformed

    private void JT_DriverSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_DriverSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_DriverSearchActionPerformed

    private void JB_PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_PreviousActionPerformed
        alto = this.JT_Reporte.getRowHeight() * (filas - 1);
        barra = this.JT_Table.getVerticalScrollBar();
        barra.setValue(barra.getValue() - alto);
    }//GEN-LAST:event_JB_PreviousActionPerformed

    private void JB_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_nextActionPerformed
        alto = this.JT_Reporte.getRowHeight() * (filas - 1);
        barra = this.JT_Table.getVerticalScrollBar();
        barra.setValue(barra.getValue() + alto);
    }//GEN-LAST:event_JB_nextActionPerformed

    private void JB_CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CreateAccountActionPerformed
        CreateAccount ca = new CreateAccount();
//        dispose();
        ca.setVisible(true);
    }//GEN-LAST:event_JB_CreateAccountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            CRUDs crud = new CRUDs();
//            this.dispose();
            crud.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Metodo en el cual se llena una pila con los objetos order
     *
     * @return LinkedStack
     * @throws PilaException
     */
    private LinkedStack saveOrders() throws PilaException {
        LinkedStack stack = new LinkedStack();
        Order order1 = null;

        for (int i = 0; i < 45; i++) {
            order1 = new Order("Cliente" + i, i, "Agente" + i, "Date" + i, "Province" + i, "Driver" + i, "restautarant" + i, "product" + i,
                    +i, i);
            stack.push(order1);
        }

        return stack;
    }

    /**
     * llena la tabla con las ordenes desde una pila
     *
     * @throws PilaException
     */
    private void fillTable() throws PilaException {
        LinkedStack stack = saveOrders();
        ArrayList<Order> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) this.JT_Reporte.getModel();
        model.setRowCount(0);
        while (!stack.isEmpty()) {
            list.add((Order) stack.pop());
        }
        Object O[] = null;
        for (int i = 0; i < list.size(); i++) {
            model.addRow(O);
            Order getP = (Order) list.get(i);
            model.setValueAt(getP.getCliente(), i, 0);
            model.setValueAt(getP.getNumOrder(), i, 1);
            model.setValueAt(getP.getAgente(), i, 2);
            model.setValueAt(getP.getDate(), i, 3);
            model.setValueAt(getP.getAmount(), i, 4);
            model.setValueAt(getP.getProvincia(), i, 5);
            model.setValueAt(getP.getDriver(), i, 6);
        }
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
            java.util.logging.Logger.getLogger(AdministratorA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdministratorA().setVisible(true);
                } catch (PilaException ex) {
                    System.out.println("algo fallo");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Charts;
    private javax.swing.JButton JB_CreateAccount;
    private javax.swing.JButton JB_LogOut;
    private javax.swing.JButton JB_Previous;
    private javax.swing.JButton JB_Search;
    private javax.swing.JButton JB_next;
    private javax.swing.JLabel JL_Code;
    private javax.swing.JLabel JL_CodeAgent;
    private javax.swing.JLabel JL_Email;
    private javax.swing.JLabel JL_EmailAgent;
    private javax.swing.JLabel JL_Name;
    private javax.swing.JLabel JL_NameAgent;
    private javax.swing.JLabel JL_Tittle;
    private javax.swing.JLabel JL_img;
    private javax.swing.JTextField JT_AgentSearch;
    private javax.swing.JTextField JT_AmountSearch;
    private javax.swing.JTextField JT_ClientSearch;
    private calendario.DateTextField JT_DateSearch;
    private javax.swing.JTextField JT_DriverSearch;
    private javax.swing.JTextField JT_OrderSearch;
    private javax.swing.JTextField JT_ProvinceSearch;
    private javax.swing.JTable JT_Reporte;
    private javax.swing.JScrollPane JT_Table;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}