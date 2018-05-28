/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Agent;
import cr.ac.ucr.Logic.ListException.ListException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deltadragon
 */
public class CRUDs extends javax.swing.JFrame {

    public CRUDs() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.ScrollAdministrator.setVisible(false);
        this.ScrollAgent.setVisible(false);
        this.ScrollClient.setVisible(false);
        this.ScrollDriver.setVisible(false);
        this.ScrollProduct.setVisible(false);
        this.ScrollRestaurant.setVisible(false);
        this.JB_DeleteAdministrator.setVisible(false);
        this.JB_DeleteAgent.setVisible(false);
        this.JB_DeleteClient.setVisible(false);
        this.JB_DeleteProduct.setVisible(false);
        this.JB_DeleteRestaurant.setVisible(false);
        this.JB_DeleteDriver.setVisible(false);
        this.JB_UpdateAdministrator.setVisible(false);
        this.JB_UpdateAgent.setVisible(false);
        this.JB_UpdateClient.setVisible(false);
        this.JB_UpdateDriver.setVisible(false);
        this.JB_UpdateProduct.setVisible(false);
        this.JB_UpdateRestaurant.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_Cancel = new javax.swing.JButton();
        ScrollDriver = new javax.swing.JScrollPane();
        JT_Driver = new javax.swing.JTable();
        ScrollRestaurant = new javax.swing.JScrollPane();
        JT_Restaurant = new javax.swing.JTable();
        ScrollAgent = new javax.swing.JScrollPane();
        JT_Agent = new javax.swing.JTable();
        ScrollProduct = new javax.swing.JScrollPane();
        JT_Product = new javax.swing.JTable();
        ScrollAdministrator = new javax.swing.JScrollPane();
        JTAdministrator = new javax.swing.JTable();
        ScrollClient = new javax.swing.JScrollPane();
        JT_client = new javax.swing.JTable();
        JB_DeleteDriver = new javax.swing.JButton();
        JB_UpdateDriver = new javax.swing.JButton();
        JB_UpdateRestaurant = new javax.swing.JButton();
        JB_UpdateAgent = new javax.swing.JButton();
        JB_UpdateProduct = new javax.swing.JButton();
        JB_UpdateAdministrator = new javax.swing.JButton();
        JB_DeleteRestaurant = new javax.swing.JButton();
        JB_DeleteAgent = new javax.swing.JButton();
        JB_DeleteProduct = new javax.swing.JButton();
        JB_DeleteAdministrator = new javax.swing.JButton();
        JB_UpdateClient = new javax.swing.JButton();
        JB_DeleteClient = new javax.swing.JButton();
        JL_fondo = new javax.swing.JLabel();
        JM_Cruds = new javax.swing.JMenuBar();
        JM_Driver = new javax.swing.JMenu();
        JMI_InsertDriver = new javax.swing.JMenuItem();
        JM_VerDriver = new javax.swing.JMenuItem();
        JM_Restaurant = new javax.swing.JMenu();
        JMI_InsertRestaurant = new javax.swing.JMenuItem();
        JM_VerRestaurant = new javax.swing.JMenuItem();
        JM_Agent = new javax.swing.JMenu();
        JMI_InsertAgent = new javax.swing.JMenuItem();
        JM_VerAgent = new javax.swing.JMenuItem();
        JM_Product = new javax.swing.JMenu();
        JMI_InsertProduct = new javax.swing.JMenuItem();
        JM_VerProduct = new javax.swing.JMenuItem();
        JM_Administrator = new javax.swing.JMenu();
        JMI_InsertAdministrator = new javax.swing.JMenuItem();
        JM_VerAdministrator = new javax.swing.JMenuItem();
        JM_Client = new javax.swing.JMenu();
        JM_VerCliente = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_Cancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_Cancel.setForeground(new java.awt.Color(204, 204, 5));
        JB_Cancel.setText("Cancel");
        JB_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        JT_Driver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "First Last Name", "Second Last Name", "Name", "Phone", "Province", "Address", "Type of vehicule", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollDriver.setViewportView(JT_Driver);
        if (JT_Driver.getColumnModel().getColumnCount() > 0) {
            JT_Driver.getColumnModel().getColumn(0).setResizable(false);
            JT_Driver.getColumnModel().getColumn(1).setResizable(false);
            JT_Driver.getColumnModel().getColumn(2).setResizable(false);
            JT_Driver.getColumnModel().getColumn(3).setResizable(false);
            JT_Driver.getColumnModel().getColumn(4).setResizable(false);
            JT_Driver.getColumnModel().getColumn(5).setResizable(false);
            JT_Driver.getColumnModel().getColumn(6).setResizable(false);
            JT_Driver.getColumnModel().getColumn(7).setResizable(false);
            JT_Driver.getColumnModel().getColumn(8).setResizable(false);
            JT_Driver.getColumnModel().getColumn(9).setResizable(false);
        }

        getContentPane().add(ScrollDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 330));

        JT_Restaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Province", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollRestaurant.setViewportView(JT_Restaurant);
        if (JT_Restaurant.getColumnModel().getColumnCount() > 0) {
            JT_Restaurant.getColumnModel().getColumn(0).setResizable(false);
            JT_Restaurant.getColumnModel().getColumn(1).setResizable(false);
            JT_Restaurant.getColumnModel().getColumn(2).setResizable(false);
            JT_Restaurant.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(ScrollRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 330));

        JT_Agent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "First Last Name", "Second Last Name", "Email", "Phone", "Province", "Address", "User", "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollAgent.setViewportView(JT_Agent);
        if (JT_Agent.getColumnModel().getColumnCount() > 0) {
            JT_Agent.getColumnModel().getColumn(0).setResizable(false);
            JT_Agent.getColumnModel().getColumn(1).setResizable(false);
            JT_Agent.getColumnModel().getColumn(2).setResizable(false);
            JT_Agent.getColumnModel().getColumn(3).setResizable(false);
            JT_Agent.getColumnModel().getColumn(4).setResizable(false);
            JT_Agent.getColumnModel().getColumn(5).setResizable(false);
            JT_Agent.getColumnModel().getColumn(6).setResizable(false);
            JT_Agent.getColumnModel().getColumn(7).setResizable(false);
            JT_Agent.getColumnModel().getColumn(8).setResizable(false);
            JT_Agent.getColumnModel().getColumn(9).setResizable(false);
        }

        getContentPane().add(ScrollAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 330));

        JT_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Cost", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollProduct.setViewportView(JT_Product);
        if (JT_Product.getColumnModel().getColumnCount() > 0) {
            JT_Product.getColumnModel().getColumn(0).setResizable(false);
            JT_Product.getColumnModel().getColumn(1).setResizable(false);
            JT_Product.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(ScrollProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 30, 680, 330));

        JTAdministrator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "First Last Name", "Second Last Name", "Email", "Phone", "Province", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollAdministrator.setViewportView(JTAdministrator);
        if (JTAdministrator.getColumnModel().getColumnCount() > 0) {
            JTAdministrator.getColumnModel().getColumn(0).setResizable(false);
            JTAdministrator.getColumnModel().getColumn(1).setResizable(false);
            JTAdministrator.getColumnModel().getColumn(2).setResizable(false);
            JTAdministrator.getColumnModel().getColumn(3).setResizable(false);
            JTAdministrator.getColumnModel().getColumn(5).setResizable(false);
            JTAdministrator.getColumnModel().getColumn(6).setResizable(false);
            JTAdministrator.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(ScrollAdministrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 30, 680, 330));

        JT_client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScrollClient.setViewportView(JT_client);

        getContentPane().add(ScrollClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 330));

        JB_DeleteDriver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_DeleteDriver.setForeground(new java.awt.Color(204, 204, 5));
        JB_DeleteDriver.setText("Delete");
        getContentPane().add(JB_DeleteDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 30));

        JB_UpdateDriver.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_UpdateDriver.setForeground(new java.awt.Color(204, 204, 5));
        JB_UpdateDriver.setText("Editar");
        getContentPane().add(JB_UpdateDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, 30));

        JB_UpdateRestaurant.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_UpdateRestaurant.setForeground(new java.awt.Color(204, 204, 5));
        JB_UpdateRestaurant.setText("Editar");
        getContentPane().add(JB_UpdateRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, 30));

        JB_UpdateAgent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_UpdateAgent.setForeground(new java.awt.Color(204, 204, 5));
        JB_UpdateAgent.setText("Editar");
        getContentPane().add(JB_UpdateAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, 30));

        JB_UpdateProduct.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_UpdateProduct.setForeground(new java.awt.Color(204, 204, 5));
        JB_UpdateProduct.setText("Editar");
        getContentPane().add(JB_UpdateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, 30));

        JB_UpdateAdministrator.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_UpdateAdministrator.setForeground(new java.awt.Color(204, 204, 5));
        JB_UpdateAdministrator.setText("Editar");
        JB_UpdateAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_UpdateAdministratorActionPerformed(evt);
            }
        });
        getContentPane().add(JB_UpdateAdministrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, 30));

        JB_DeleteRestaurant.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_DeleteRestaurant.setForeground(new java.awt.Color(204, 204, 5));
        JB_DeleteRestaurant.setText("Delete");
        getContentPane().add(JB_DeleteRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 30));

        JB_DeleteAgent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_DeleteAgent.setForeground(new java.awt.Color(204, 204, 5));
        JB_DeleteAgent.setText("Delete");
        getContentPane().add(JB_DeleteAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 30));

        JB_DeleteProduct.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_DeleteProduct.setForeground(new java.awt.Color(204, 204, 5));
        JB_DeleteProduct.setText("Delete");
        getContentPane().add(JB_DeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 30));

        JB_DeleteAdministrator.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_DeleteAdministrator.setForeground(new java.awt.Color(204, 204, 5));
        JB_DeleteAdministrator.setText("Delete");
        getContentPane().add(JB_DeleteAdministrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 30));

        JB_UpdateClient.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_UpdateClient.setForeground(new java.awt.Color(204, 204, 5));
        JB_UpdateClient.setText("Editar");
        getContentPane().add(JB_UpdateClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, 30));

        JB_DeleteClient.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        JB_DeleteClient.setForeground(new java.awt.Color(204, 204, 5));
        JB_DeleteClient.setText("Borrar");
        getContentPane().add(JB_DeleteClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 30));

        JL_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/admin.jpg"))); // NOI18N
        getContentPane().add(JL_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        JM_Driver.setText("Driver");
        JM_Driver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_DriverActionPerformed(evt);
            }
        });

        JMI_InsertDriver.setText("Insert");
        JMI_InsertDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_InsertDriverActionPerformed(evt);
            }
        });
        JM_Driver.add(JMI_InsertDriver);

        JM_VerDriver.setText("Reporte");
        JM_VerDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_VerDriverActionPerformed(evt);
            }
        });
        JM_Driver.add(JM_VerDriver);

        JM_Cruds.add(JM_Driver);

        JM_Restaurant.setText("Restaurant");
        JM_Restaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_RestaurantActionPerformed(evt);
            }
        });

        JMI_InsertRestaurant.setText("Insert");
        JMI_InsertRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_InsertRestaurantActionPerformed(evt);
            }
        });
        JM_Restaurant.add(JMI_InsertRestaurant);

        JM_VerRestaurant.setText("Reporte");
        JM_VerRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_VerRestaurantActionPerformed(evt);
            }
        });
        JM_Restaurant.add(JM_VerRestaurant);

        JM_Cruds.add(JM_Restaurant);

        JM_Agent.setText("Agent");
        JM_Agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_AgentActionPerformed(evt);
            }
        });

        JMI_InsertAgent.setText("Insert");
        JMI_InsertAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_InsertAgentActionPerformed(evt);
            }
        });
        JM_Agent.add(JMI_InsertAgent);

        JM_VerAgent.setText("Reporte");
        JM_VerAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_VerAgentActionPerformed(evt);
            }
        });
        JM_Agent.add(JM_VerAgent);

        JM_Cruds.add(JM_Agent);

        JM_Product.setText("Product");
        JM_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_ProductActionPerformed(evt);
            }
        });

        JMI_InsertProduct.setText("Insert");
        JMI_InsertProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_InsertProductActionPerformed(evt);
            }
        });
        JM_Product.add(JMI_InsertProduct);

        JM_VerProduct.setText("Reporte");
        JM_VerProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_VerProductActionPerformed(evt);
            }
        });
        JM_Product.add(JM_VerProduct);

        JM_Cruds.add(JM_Product);

        JM_Administrator.setText("Administrator");
        JM_Administrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_AdministratorActionPerformed(evt);
            }
        });

        JMI_InsertAdministrator.setText("Insert");
        JMI_InsertAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_InsertAdministratorActionPerformed(evt);
            }
        });
        JM_Administrator.add(JMI_InsertAdministrator);

        JM_VerAdministrator.setText("Reporte");
        JM_VerAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_VerAdministratorActionPerformed(evt);
            }
        });
        JM_Administrator.add(JM_VerAdministrator);

        JM_Cruds.add(JM_Administrator);

        JM_Client.setText("Clients");
        JM_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_ClientActionPerformed(evt);
            }
        });

        JM_VerCliente.setText("Update/Delete Client");
        JM_VerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_VerClienteActionPerformed(evt);
            }
        });
        JM_Client.add(JM_VerCliente);

        JM_Cruds.add(JM_Client);

        setJMenuBar(JM_Cruds);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_InsertDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_InsertDriverActionPerformed
        InsertDriver id;

        try {
            id = new InsertDriver();
            id.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CRUDs.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_JMI_InsertDriverActionPerformed

    private void JM_RestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_RestaurantActionPerformed

    }//GEN-LAST:event_JM_RestaurantActionPerformed

    private void JM_AgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_AgentActionPerformed

    }//GEN-LAST:event_JM_AgentActionPerformed

    private void JM_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_ProductActionPerformed

    }//GEN-LAST:event_JM_ProductActionPerformed

    private void JM_AdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_AdministratorActionPerformed

    }//GEN-LAST:event_JM_AdministratorActionPerformed

    private void JMI_InsertRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_InsertRestaurantActionPerformed
        InsertRestaurant ir;
        try {
            ir = new InsertRestaurant();
            ir.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CRUDs.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_JMI_InsertRestaurantActionPerformed

    private void JMI_InsertAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_InsertAgentActionPerformed
        InsertAgent as;
        try {
            as = new InsertAgent();
            as.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CRUDs.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_JMI_InsertAgentActionPerformed

    private void JMI_InsertProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_InsertProductActionPerformed
        InsertProduct ip;
        try {
            ip = new InsertProduct();
            ip.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CRUDs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ListException ex) {
            Logger.getLogger(CRUDs.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_JMI_InsertProductActionPerformed

    private void JMI_InsertAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_InsertAdministratorActionPerformed
        InsertAdministrator ia;
        try {
            ia = new InsertAdministrator();
            ia.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CRUDs.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

    }//GEN-LAST:event_JMI_InsertAdministratorActionPerformed

    private void JB_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_JB_CancelActionPerformed

    private void JM_VerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_VerClienteActionPerformed
        this.ScrollAdministrator.setVisible(false);
        this.ScrollAgent.setVisible(false);
        this.ScrollClient.setVisible(true);
        this.ScrollDriver.setVisible(false);
        this.ScrollProduct.setVisible(false);
        this.ScrollRestaurant.setVisible(false);
        this.JB_DeleteAdministrator.setVisible(false);
        this.JB_DeleteAgent.setVisible(false);
        this.JB_DeleteClient.setVisible(true);
        this.JB_DeleteProduct.setVisible(false);
        this.JB_DeleteRestaurant.setVisible(false);
        this.JB_DeleteDriver.setVisible(false);
        this.JB_UpdateAdministrator.setVisible(false);
        this.JB_UpdateAgent.setVisible(false);
        this.JB_UpdateClient.setVisible(true);
        this.JB_UpdateDriver.setVisible(false);
        this.JB_UpdateProduct.setVisible(false);
        this.JB_UpdateRestaurant.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_JM_VerClienteActionPerformed

    private void JB_UpdateAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_UpdateAdministratorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_UpdateAdministratorActionPerformed

    private void JM_DriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_DriverActionPerformed

    }//GEN-LAST:event_JM_DriverActionPerformed

    private void JM_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_ClientActionPerformed


    }//GEN-LAST:event_JM_ClientActionPerformed

    private void JM_VerDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_VerDriverActionPerformed
        this.ScrollAdministrator.setVisible(false);
        this.ScrollAgent.setVisible(false);
        this.ScrollClient.setVisible(false);
        this.ScrollDriver.setVisible(true);
        this.ScrollProduct.setVisible(false);
        this.ScrollRestaurant.setVisible(false);
        this.JB_DeleteAdministrator.setVisible(false);
        this.JB_DeleteAgent.setVisible(false);
        this.JB_DeleteClient.setVisible(false);
        this.JB_DeleteProduct.setVisible(false);
        this.JB_DeleteRestaurant.setVisible(false);
        this.JB_DeleteDriver.setVisible(true);
        this.JB_UpdateAdministrator.setVisible(false);
        this.JB_UpdateAgent.setVisible(false);
        this.JB_UpdateClient.setVisible(false);
        this.JB_UpdateDriver.setVisible(true);
        this.JB_UpdateProduct.setVisible(false);
        this.JB_UpdateRestaurant.setVisible(false);
    }//GEN-LAST:event_JM_VerDriverActionPerformed

    private void JM_VerRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_VerRestaurantActionPerformed
        this.ScrollAdministrator.setVisible(false);
        this.ScrollAgent.setVisible(false);
        this.ScrollClient.setVisible(false);
        this.ScrollDriver.setVisible(false);
        this.ScrollProduct.setVisible(false);
        this.ScrollRestaurant.setVisible(true);
        this.JB_DeleteAdministrator.setVisible(false);
        this.JB_DeleteAgent.setVisible(false);
        this.JB_DeleteClient.setVisible(false);
        this.JB_DeleteProduct.setVisible(false);
        this.JB_DeleteRestaurant.setVisible(true);
        this.JB_DeleteDriver.setVisible(false);
        this.JB_UpdateAdministrator.setVisible(false);
        this.JB_UpdateAgent.setVisible(false);
        this.JB_UpdateClient.setVisible(false);
        this.JB_UpdateDriver.setVisible(false);
        this.JB_UpdateProduct.setVisible(false);
        this.JB_UpdateRestaurant.setVisible(true);
    }//GEN-LAST:event_JM_VerRestaurantActionPerformed

    private void JM_VerAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_VerAgentActionPerformed
        this.ScrollAdministrator.setVisible(false);
        this.ScrollAgent.setVisible(true);
        this.ScrollClient.setVisible(false);
        this.ScrollDriver.setVisible(false);
        this.ScrollProduct.setVisible(false);
        this.ScrollRestaurant.setVisible(false);
        this.JB_DeleteAdministrator.setVisible(false);
        this.JB_DeleteAgent.setVisible(true);
        this.JB_DeleteClient.setVisible(false);
        this.JB_DeleteProduct.setVisible(false);
        this.JB_DeleteRestaurant.setVisible(false);
        this.JB_DeleteDriver.setVisible(false);
        this.JB_UpdateAdministrator.setVisible(false);
        this.JB_UpdateAgent.setVisible(true);
        this.JB_UpdateClient.setVisible(false);
        this.JB_UpdateDriver.setVisible(false);
        this.JB_UpdateProduct.setVisible(false);
        this.JB_UpdateRestaurant.setVisible(false);
    }//GEN-LAST:event_JM_VerAgentActionPerformed

    private void JM_VerProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_VerProductActionPerformed
        this.ScrollAdministrator.setVisible(false);
        this.ScrollAgent.setVisible(false);
        this.ScrollClient.setVisible(false);
        this.ScrollDriver.setVisible(false);
        this.ScrollProduct.setVisible(true);
        this.ScrollRestaurant.setVisible(false);
        this.JB_DeleteAdministrator.setVisible(false);
        this.JB_DeleteAgent.setVisible(false);
        this.JB_DeleteClient.setVisible(false);
        this.JB_DeleteProduct.setVisible(true);
        this.JB_DeleteRestaurant.setVisible(false);
        this.JB_DeleteDriver.setVisible(false);
        this.JB_UpdateAdministrator.setVisible(false);
        this.JB_UpdateAgent.setVisible(false);
        this.JB_UpdateClient.setVisible(false);
        this.JB_UpdateDriver.setVisible(false);
        this.JB_UpdateProduct.setVisible(true);
        this.JB_UpdateRestaurant.setVisible(false);
    }//GEN-LAST:event_JM_VerProductActionPerformed

    private void JM_VerAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_VerAdministratorActionPerformed
        this.ScrollAdministrator.setVisible(true);
        this.ScrollAgent.setVisible(false);
        this.ScrollClient.setVisible(false);
        this.ScrollDriver.setVisible(false);
        this.ScrollProduct.setVisible(false);
        this.ScrollRestaurant.setVisible(false);
        this.JB_DeleteAdministrator.setVisible(true);
        this.JB_DeleteAgent.setVisible(false);
        this.JB_DeleteClient.setVisible(false);
        this.JB_DeleteProduct.setVisible(false);
        this.JB_DeleteRestaurant.setVisible(false);
        this.JB_DeleteDriver.setVisible(false);
        this.JB_UpdateAdministrator.setVisible(true);
        this.JB_UpdateAgent.setVisible(false);
        this.JB_UpdateClient.setVisible(false);
        this.JB_UpdateDriver.setVisible(false);
        this.JB_UpdateProduct.setVisible(false);
        this.JB_UpdateRestaurant.setVisible(false);
    }//GEN-LAST:event_JM_VerAdministratorActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Cancel;
    private javax.swing.JButton JB_DeleteAdministrator;
    private javax.swing.JButton JB_DeleteAgent;
    private javax.swing.JButton JB_DeleteClient;
    private javax.swing.JButton JB_DeleteDriver;
    private javax.swing.JButton JB_DeleteProduct;
    private javax.swing.JButton JB_DeleteRestaurant;
    private javax.swing.JButton JB_UpdateAdministrator;
    private javax.swing.JButton JB_UpdateAgent;
    private javax.swing.JButton JB_UpdateClient;
    private javax.swing.JButton JB_UpdateDriver;
    private javax.swing.JButton JB_UpdateProduct;
    private javax.swing.JButton JB_UpdateRestaurant;
    private javax.swing.JLabel JL_fondo;
    private javax.swing.JMenuItem JMI_InsertAdministrator;
    private javax.swing.JMenuItem JMI_InsertAgent;
    private javax.swing.JMenuItem JMI_InsertDriver;
    private javax.swing.JMenuItem JMI_InsertProduct;
    private javax.swing.JMenuItem JMI_InsertRestaurant;
    private javax.swing.JMenu JM_Administrator;
    private javax.swing.JMenu JM_Agent;
    private javax.swing.JMenu JM_Client;
    private javax.swing.JMenuBar JM_Cruds;
    private javax.swing.JMenu JM_Driver;
    private javax.swing.JMenu JM_Product;
    private javax.swing.JMenu JM_Restaurant;
    private javax.swing.JMenuItem JM_VerAdministrator;
    private javax.swing.JMenuItem JM_VerAgent;
    private javax.swing.JMenuItem JM_VerCliente;
    private javax.swing.JMenuItem JM_VerDriver;
    private javax.swing.JMenuItem JM_VerProduct;
    private javax.swing.JMenuItem JM_VerRestaurant;
    private javax.swing.JTable JTAdministrator;
    private javax.swing.JTable JT_Agent;
    private javax.swing.JTable JT_Driver;
    private javax.swing.JTable JT_Product;
    private javax.swing.JTable JT_Restaurant;
    private javax.swing.JTable JT_client;
    private javax.swing.JScrollPane ScrollAdministrator;
    private javax.swing.JScrollPane ScrollAgent;
    private javax.swing.JScrollPane ScrollClient;
    private javax.swing.JScrollPane ScrollDriver;
    private javax.swing.JScrollPane ScrollProduct;
    private javax.swing.JScrollPane ScrollRestaurant;
    // End of variables declaration//GEN-END:variables
}
