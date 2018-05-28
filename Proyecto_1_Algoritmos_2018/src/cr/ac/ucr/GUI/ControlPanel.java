/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.GUI;

import cr.ac.ucr.Domain.Product;
import cr.ac.ucr.Files.readFiles;
import cr.ac.ucr.Logic.CircularLinkedList;
import cr.ac.ucr.Logic.ListException.ListException;
import java.awt.Image;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Melvin
 */
public class ControlPanel extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;

    CircularLinkedList circularListProductDrink = new CircularLinkedList();
    CircularLinkedList circularListProductFood = new CircularLinkedList();
    CircularLinkedList circularListProductDessert = new CircularLinkedList();
    CircularLinkedList circularListProductVarious = new CircularLinkedList();
    readFiles read = new readFiles();
    int moveDrink;
    int moveFood;
    int moveDressert;
    int moveVarious;

    /**
     * Creates new form ControlPanel
     */
    public ControlPanel() throws ListException {
        initComponents();
        this.setLocationRelativeTo(null);

        moveDrink = 0;
        moveFood = 0;
        moveDressert = 0;
        moveVarious = 0;

        circularListProductFood.insert(new Product("Cantones", "1500", "Food", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Cantones.jpg"));
        circularListProductFood.insert(new Product("Hamburguesa", "1200", "Food", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Hamburguesa.jpg"));
        circularListProductFood.insert(new Product("Pizza", "2000", "Food", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Pizza.png"));
        circularListProductFood.insert(new Product("Pollo", "1000", "Food", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Pollo.jpg"));
        circularListProductFood.insert(new Product("Sandiwche", "900", "Food", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Sandwice.jpg"));
        circularListProductFood.insert(new Product("Sushi", "1800", "Food", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Sushi.jpg"));
        circularListProductFood.insert(new Product("Taco", "700", "Food", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Taco.png"));
        //circularListProductFood.insert(new Product("Cantones", "1500", "Food", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Cantones.jpg"));

        circularListProductDrink.insert(new Product("Imperial", "500", "Drink", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Imperial.png"));
        circularListProductDrink.insert(new Product("Cafe", "800", "Drink", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Cafe.jpg"));
        circularListProductDrink.insert(new Product("Canada Dry", "1100", "Drink", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\CanadaDry.jpg"));
        circularListProductDrink.insert(new Product("Coca Cola", "1000", "Drink", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\CocaCola.png"));
        circularListProductDrink.insert(new Product("Fanta", "900", "Drink", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Fanta.jpg"));

        circularListProductDessert.insert(new Product("Arroz con leche", "750", "Dessert", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\ArrozLeche.jpg"));
        circularListProductDessert.insert(new Product("Brownie", "1000", "Dessert", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Brownie.jpg"));
        circularListProductDessert.insert(new Product("CupCake", "500", "Dessert", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\CupCake.jpg"));
        circularListProductDessert.insert(new Product("Helado", "500", "Dessert", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Helado.jpg"));
        circularListProductDessert.insert(new Product("Queque", "800", "Dessert", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Queque.jpg"));
        circularListProductDessert.insert(new Product("Torta Chilena", "700", "Dessert", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\TortaChilena.jpg"));

        circularListProductVarious.insert(new Product("Batido", "1000", "Various", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Batido.jpg"));
        circularListProductVarious.insert(new Product("Ensalada", "400", "Various", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Ensalada.JPG"));
        circularListProductVarious.insert(new Product("Maiz", "300", "Various", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Maiz.jpg"));
        circularListProductVarious.insert(new Product("Papas", "1100", "Various", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Papas.jpg"));
        circularListProductVarious.insert(new Product("Manzana", "500", "Various", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\Manzana.jpg"));
        circularListProductVarious.insert(new Product("Ensalada Frutas", "1200", "Various", "C:\\Users\\Melvin\\Desktop\\aREPOSITORIOFINALALGORITMOS\\Proyecto_1_Algoritmos_2018\\src\\cr\\ac\\ucr\\Img\\EnsaladaFrutas.jpg"));

        Product drink1 = (Product) circularListProductDrink.getNode(moveDrink);
        ImageIcon iconDrink = new ImageIcon(drink1.getPathImage());
        Icon iconDrink2 = new ImageIcon(iconDrink.getImage().getScaledInstance(lbl_DrinkImage.getWidth(), lbl_DrinkImage.getHeight(), Image.SCALE_DEFAULT));
        lbl_DrinkImage.setIcon(iconDrink2);
        this.repaint();
        lbl_DrinkName.setText(drink1.getName());
        lbl_DrinkPrice.setText(drink1.getCost());

        Product food1 = (Product) circularListProductFood.getNode(moveFood);
        ImageIcon iconFood = new ImageIcon(food1.getPathImage());
        Icon iconFood2 = new ImageIcon(iconFood.getImage().getScaledInstance(lbl_FoodImage.getWidth(), lbl_FoodImage.getHeight(), Image.SCALE_DEFAULT));
        lbl_FoodImage.setIcon(iconFood2);
        this.repaint();
        lbl_FoodName.setText(food1.getName());
        lbl_FoodPrice.setText(food1.getCost());

        Product dessert1 = (Product) circularListProductDessert.getNode(moveDressert);
        ImageIcon iconDessert = new ImageIcon(dessert1.getPathImage());
        Icon iconDessert2 = new ImageIcon(iconDessert.getImage().getScaledInstance(lbl_DessertImage.getWidth(), lbl_DessertImage.getHeight(), Image.SCALE_DEFAULT));
        lbl_DessertImage.setIcon(iconDessert2);
        this.repaint();
        lbl_DessertName.setText(dessert1.getName());
        lbl_DessertPrice.setText(dessert1.getCost());

        Product various1 = (Product) circularListProductVarious.getNode(moveVarious);
        ImageIcon iconVarious = new ImageIcon(various1.getPathImage());
        Icon Various2 = new ImageIcon(iconVarious.getImage().getScaledInstance(lbl_VariousImage.getWidth(), lbl_VariousImage.getHeight(), Image.SCALE_DEFAULT));
        lbl_VariousImage.setIcon(Various2);
        this.repaint();
        lbl_VariousName.setText(various1.getName());
        lbl_VariousPrice.setText(various1.getCost());

        h1 = new Thread(this);
        h1.start();
        setLocationRelativeTo(null); //Para centrar la ventana
        setVisible(true);

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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btn_IncreaseQuantuty = new javax.swing.JButton();
        btn_DecreaseQuantuty = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbl_ProductChoice = new javax.swing.JLabel();
        lbl_QuantutyProduct = new javax.swing.JLabel();
        lbl_AmountProduct = new javax.swing.JLabel();
        lbl_SubTotal = new javax.swing.JLabel();
        lbl_Total = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbl_FoodImage = new javax.swing.JLabel();
        lbl_FoodName = new javax.swing.JLabel();
        lbl_FoodPrice = new javax.swing.JLabel();
        lbl_DrinkImage = new javax.swing.JLabel();
        lbl_DrinkName = new javax.swing.JLabel();
        lbl_DrinkPrice = new javax.swing.JLabel();
        lbl_DessertName = new javax.swing.JLabel();
        lbl_DessertPrice = new javax.swing.JLabel();
        lbl_DessertImage = new javax.swing.JLabel();
        lbl_VariousImage = new javax.swing.JLabel();
        lbl_VariousName = new javax.swing.JLabel();
        lbl_VariousPrice = new javax.swing.JLabel();
        btn_PreviousDrink = new javax.swing.JButton();
        btn_nextDrink = new javax.swing.JButton();
        btn_previousFood = new javax.swing.JButton();
        btn_nextFood = new javax.swing.JButton();
        btn_previousDessert = new javax.swing.JButton();
        btn_nextDessert = new javax.swing.JButton();
        btn_previousVarious = new javax.swing.JButton();
        btn_NextVarious = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        lbHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Control Panel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 200, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Client");

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Name");

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("E-mail");

        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Phone");

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Province");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, 370));

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Restaurant");

        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Name");

        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Province");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 220, 320));

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Orden Pane");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("#0");

        jLabel21.setText("Products");

        jLabel22.setText("Quantity");

        jLabel23.setText("Amount");

        btn_IncreaseQuantuty.setText("Increase");
        btn_IncreaseQuantuty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IncreaseQuantutyActionPerformed(evt);
            }
        });

        btn_DecreaseQuantuty.setText("Decrease");
        btn_DecreaseQuantuty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DecreaseQuantutyActionPerformed(evt);
            }
        });

        jLabel24.setText("Subtotal");

        jLabel25.setText("Total");

        lbl_ProductChoice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_ProductChoice.setForeground(new java.awt.Color(0, 102, 102));

        lbl_QuantutyProduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_QuantutyProduct.setForeground(new java.awt.Color(0, 102, 102));

        lbl_AmountProduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_AmountProduct.setForeground(new java.awt.Color(0, 102, 102));
        lbl_AmountProduct.setText("jLabel18");

        lbl_SubTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_SubTotal.setForeground(new java.awt.Color(0, 102, 102));
        lbl_SubTotal.setText("jLabel26");

        lbl_Total.setText("jLabel27");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btn_DecreaseQuantuty)
                                .addGap(52, 52, 52)
                                .addComponent(btn_IncreaseQuantuty))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_ProductChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_QuantutyProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lbl_AmountProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(lbl_Total))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lbl_SubTotal)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ProductChoice))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_QuantutyProduct))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_IncreaseQuantuty)
                            .addComponent(btn_DecreaseQuantuty))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_AmountProduct))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_SubTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lbl_Total))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 440, 330));

        lbl_FoodImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_FoodImageMouseClicked(evt);
            }
        });

        lbl_FoodName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_FoodName.setForeground(new java.awt.Color(0, 153, 153));

        lbl_FoodPrice.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_FoodPrice.setForeground(new java.awt.Color(0, 153, 153));

        lbl_DrinkImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_DrinkImageMouseClicked(evt);
            }
        });

        lbl_DrinkName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_DrinkName.setForeground(new java.awt.Color(0, 153, 153));

        lbl_DrinkPrice.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_DrinkPrice.setForeground(new java.awt.Color(0, 153, 153));

        lbl_DessertName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_DessertName.setForeground(new java.awt.Color(0, 153, 153));

        lbl_DessertPrice.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_DessertPrice.setForeground(new java.awt.Color(0, 153, 153));

        lbl_DessertImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_DessertImageMouseClicked(evt);
            }
        });

        lbl_VariousImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_VariousImageMouseClicked(evt);
            }
        });

        lbl_VariousName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_VariousName.setForeground(new java.awt.Color(0, 153, 153));

        lbl_VariousPrice.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_VariousPrice.setForeground(new java.awt.Color(0, 153, 153));

        btn_PreviousDrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/Previous.png"))); // NOI18N
        btn_PreviousDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PreviousDrinkActionPerformed(evt);
            }
        });

        btn_nextDrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/Next.png"))); // NOI18N
        btn_nextDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextDrinkActionPerformed(evt);
            }
        });

        btn_previousFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/Previous.png"))); // NOI18N
        btn_previousFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousFoodActionPerformed(evt);
            }
        });

        btn_nextFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/Next.png"))); // NOI18N
        btn_nextFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextFoodActionPerformed(evt);
            }
        });

        btn_previousDessert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/Previous.png"))); // NOI18N
        btn_previousDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousDessertActionPerformed(evt);
            }
        });

        btn_nextDessert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/Next.png"))); // NOI18N
        btn_nextDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextDessertActionPerformed(evt);
            }
        });

        btn_previousVarious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/Previous.png"))); // NOI18N
        btn_previousVarious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousVariousActionPerformed(evt);
            }
        });

        btn_NextVarious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/Img/Next.png"))); // NOI18N
        btn_NextVarious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextVariousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btn_PreviousDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_DrinkImage, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_nextDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbl_DrinkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(btn_previousFood))
                            .addComponent(lbl_DrinkName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_previousDessert)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_FoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_FoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_FoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_DessertImage, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nextDessert)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_VariousImage, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_NextVarious)
                                .addContainerGap())
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lbl_VariousPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btn_nextFood, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_DessertPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(btn_previousVarious, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(lbl_DessertName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 216, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_VariousName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_nextDessert))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_PreviousDrink)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_DessertImage, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_previousDessert)))
                            .addComponent(lbl_DrinkImage, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nextDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(btn_nextFood))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lbl_DrinkName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_DrinkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(btn_previousFood))))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lbl_DessertName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lbl_DessertPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_VariousImage, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl_FoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(btn_previousVarious))))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_NextVarious)
                                .addGap(57, 57, 57)))
                        .addComponent(lbl_FoodName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lbl_VariousName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_VariousPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_FoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 1000, 390));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Agent");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 68, -1));

        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Code");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 28, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Create Order");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 190, 70));

        lbHora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbHora.setForeground(new java.awt.Color(0, 102, 102));
        lbHora.setText("jLabel9");
        getContentPane().add(lbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 440, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextDessertActionPerformed
        // TODO add your handling code here:
        
        if (moveDressert == 5) {
            moveDressert = 0;
        } else {
            moveDressert++;
        }
        Product dessert1;
        try {
            dessert1 = (Product) circularListProductDessert.getNode(moveDressert);
            ImageIcon iconDessert = new ImageIcon(dessert1.getPathImage());
        Icon iconDessert2 = new ImageIcon(iconDessert.getImage().getScaledInstance(lbl_DessertImage.getWidth(), lbl_DessertImage.getHeight(), Image.SCALE_DEFAULT));
        lbl_DessertImage.setIcon(iconDessert2);
        this.repaint();
        lbl_DessertName.setText(dessert1.getName());
        lbl_DessertPrice.setText(dessert1.getCost());
            
        } catch (ListException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_nextDessertActionPerformed

    private void btn_nextDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextDrinkActionPerformed
        // TODO add your handling code here:
        if (moveDrink == 4) {
            moveDrink = 0;
        } else {
            moveDrink++;
        }
        Product drink1;
        try {
            drink1 = (Product) circularListProductDrink.getNode(moveDrink);
            ImageIcon iconDrink = new ImageIcon(drink1.getPathImage());
            Icon iconDrink2 = new ImageIcon(iconDrink.getImage().getScaledInstance(lbl_DrinkImage.getWidth(), lbl_DrinkImage.getHeight(), Image.SCALE_DEFAULT));
            lbl_DrinkImage.setIcon(iconDrink2);
            this.repaint();
            lbl_DrinkName.setText(drink1.getName());
            lbl_DrinkPrice.setText(drink1.getCost());

        } catch (ListException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_nextDrinkActionPerformed

    private void btn_previousDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousDessertActionPerformed
        // TODO add your handling code here:
        if (moveDressert == 0) {
            moveDressert = 5;
        } else {
            moveDressert--;
        }
        Product dessert1;
        try {
            dessert1 = (Product) circularListProductDessert.getNode(moveDressert);
            ImageIcon iconDessert = new ImageIcon(dessert1.getPathImage());
        Icon iconDessert2 = new ImageIcon(iconDessert.getImage().getScaledInstance(lbl_DessertImage.getWidth(), lbl_DessertImage.getHeight(), Image.SCALE_DEFAULT));
        lbl_DessertImage.setIcon(iconDessert2);
        this.repaint();
        lbl_DessertName.setText(dessert1.getName());
        lbl_DessertPrice.setText(dessert1.getCost());
            
        } catch (ListException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_previousDessertActionPerformed

    private void btn_PreviousDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PreviousDrinkActionPerformed
        // TODO add your handling code here:

        if (moveDrink == 0) {
            moveDrink = 4;
        } else {
            moveDrink--;
        }
        Product drink1;
        try {
            drink1 = (Product) circularListProductDrink.getNode(moveDrink);
            ImageIcon iconDrink = new ImageIcon(drink1.getPathImage());
            Icon iconDrink2 = new ImageIcon(iconDrink.getImage().getScaledInstance(lbl_DrinkImage.getWidth(), lbl_DrinkImage.getHeight(), Image.SCALE_DEFAULT));
            lbl_DrinkImage.setIcon(iconDrink2);
            this.repaint();
            lbl_DrinkName.setText(drink1.getName());
            lbl_DrinkPrice.setText(drink1.getCost());

        } catch (ListException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_PreviousDrinkActionPerformed

    private void btn_nextFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextFoodActionPerformed
        // TODO add your handling code here:

        if (moveFood == 6) {
            moveFood = 0;
        } else {
            moveFood++;
        }

        Product food1;
        try {
            food1 = (Product) circularListProductFood.getNode(moveFood);
            ImageIcon iconFood = new ImageIcon(food1.getPathImage());
            Icon iconFood2 = new ImageIcon(iconFood.getImage().getScaledInstance(lbl_FoodImage.getWidth(), lbl_FoodImage.getHeight(), Image.SCALE_DEFAULT));
            lbl_FoodImage.setIcon(iconFood2);
            this.repaint();
            lbl_FoodName.setText(food1.getName());
            lbl_FoodPrice.setText(food1.getCost());

        } catch (ListException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    {
    }//GEN-LAST:event_btn_nextFoodActionPerformed

    private void btn_previousFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousFoodActionPerformed
        if (moveFood == 0) {
            moveFood = 6;
        } else {
            moveFood--;
        }

        Product food1;
        try {
            food1 = (Product) circularListProductFood.getNode(moveFood);
            ImageIcon iconFood = new ImageIcon(food1.getPathImage());
            Icon iconFood2 = new ImageIcon(iconFood.getImage().getScaledInstance(lbl_FoodImage.getWidth(), lbl_FoodImage.getHeight(), Image.SCALE_DEFAULT));
            lbl_FoodImage.setIcon(iconFood2);
            this.repaint();
            lbl_FoodName.setText(food1.getName());
            lbl_FoodPrice.setText(food1.getCost());

        } catch (ListException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_previousFoodActionPerformed

    private void btn_previousVariousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousVariousActionPerformed
        
        if (moveVarious == 0) {
            moveVarious = 5;
        } else {
            moveVarious--;
        }
        
        Product various1;
        try {
            various1 = (Product) circularListProductVarious.getNode(moveVarious);
            ImageIcon iconVarious = new ImageIcon(various1.getPathImage());
        Icon Various2 = new ImageIcon(iconVarious.getImage().getScaledInstance(lbl_VariousImage.getWidth(), lbl_VariousImage.getHeight(), Image.SCALE_DEFAULT));
        lbl_VariousImage.setIcon(Various2);
        this.repaint();
        lbl_VariousName.setText(various1.getName());
        lbl_VariousPrice.setText(various1.getCost());
            
        } catch (ListException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_btn_previousVariousActionPerformed

    private void btn_NextVariousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextVariousActionPerformed
        // TODO add your handling code here:
        
        if (moveVarious == 5) {
            moveVarious = 0;
        } else {
            moveVarious++;
        }
        
        Product various1;
        try {
            various1 = (Product) circularListProductVarious.getNode(moveVarious);
            ImageIcon iconVarious = new ImageIcon(various1.getPathImage());
        Icon Various2 = new ImageIcon(iconVarious.getImage().getScaledInstance(lbl_VariousImage.getWidth(), lbl_VariousImage.getHeight(), Image.SCALE_DEFAULT));
        lbl_VariousImage.setIcon(Various2);
        this.repaint();
        lbl_VariousName.setText(various1.getName());
        lbl_VariousPrice.setText(various1.getCost());
            
        } catch (ListException ex) {
            Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_NextVariousActionPerformed

    private void lbl_DrinkImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DrinkImageMouseClicked
        
        if(lbl_ProductChoice.getText().equals(lbl_DrinkName.getText())){
            int q = Integer.parseInt(lbl_QuantutyProduct.getText());
            q++;
            lbl_QuantutyProduct.setText(q+"");
            lbl_SubTotal.setText(subTotal());
        }else{
            lbl_ProductChoice.setText(lbl_DrinkName.getText());
            lbl_QuantutyProduct.setText("1");
            lbl_AmountProduct.setText(lbl_DrinkPrice.getText());
            lbl_SubTotal.setText(subTotal());
        }
        
        
    }//GEN-LAST:event_lbl_DrinkImageMouseClicked

    private void lbl_FoodImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FoodImageMouseClicked
      
        if(lbl_ProductChoice.getText().equals(lbl_FoodName.getText())){
            int q = Integer.parseInt(lbl_QuantutyProduct.getText());
            q++;
            lbl_QuantutyProduct.setText(q+"");
            lbl_SubTotal.setText(subTotal());
        }else{
            lbl_ProductChoice.setText(lbl_FoodName.getText());
            lbl_QuantutyProduct.setText("1");
            lbl_AmountProduct.setText(lbl_FoodPrice.getText());
            lbl_SubTotal.setText(subTotal());
        }
        
    }//GEN-LAST:event_lbl_FoodImageMouseClicked

    private void lbl_DessertImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_DessertImageMouseClicked
        
         if(lbl_ProductChoice.getText().equals(lbl_DessertName.getText())){
            int q = Integer.parseInt(lbl_QuantutyProduct.getText());
            q++;
            lbl_QuantutyProduct.setText(q+"");
            lbl_SubTotal.setText(subTotal());
        }else{
            lbl_ProductChoice.setText(lbl_DessertName.getText());
            lbl_QuantutyProduct.setText("1");
             lbl_AmountProduct.setText(lbl_DessertPrice.getText());
             lbl_SubTotal.setText(subTotal());
        }
        
    }//GEN-LAST:event_lbl_DessertImageMouseClicked

    private void lbl_VariousImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_VariousImageMouseClicked
      
        if(lbl_ProductChoice.getText().equals(lbl_VariousName.getText())){
            int q = Integer.parseInt(lbl_QuantutyProduct.getText());
            q++;
            lbl_QuantutyProduct.setText(q+"");
            lbl_SubTotal.setText(subTotal());
        }else{
            lbl_ProductChoice.setText(lbl_VariousName.getText());
            lbl_QuantutyProduct.setText("1");
            lbl_AmountProduct.setText(lbl_VariousPrice.getText());
            lbl_SubTotal.setText(subTotal());
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_lbl_VariousImageMouseClicked

    private void btn_IncreaseQuantutyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IncreaseQuantutyActionPerformed
        try{
        int q = Integer.parseInt(lbl_QuantutyProduct.getText());
            q++;
            lbl_QuantutyProduct.setText(q+"");
            lbl_SubTotal.setText(subTotal());
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "El campo de texto esta vacio, seleccione un producto");
        }
    }//GEN-LAST:event_btn_IncreaseQuantutyActionPerformed

    private void btn_DecreaseQuantutyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DecreaseQuantutyActionPerformed
        
        try{
        if(Integer.parseInt(lbl_QuantutyProduct.getText()) == 1){
            JOptionPane.showMessageDialog(null, "No puede tener menos de 1 producto");
        }else{
          try{
        int q = Integer.parseInt(lbl_QuantutyProduct.getText());
            q--;
            lbl_QuantutyProduct.setText(q+"");
            lbl_SubTotal.setText(subTotal());
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "El campo de texto esta vacio, seleccione un producto");
        }  
        }  
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, "El campo de texto esta vacio, seleccione un producto");
        }  
        
        
        
    }//GEN-LAST:event_btn_DecreaseQuantutyActionPerformed

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
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ControlPanel().setVisible(true);
                } catch (ListException ex) {
                    Logger.getLogger(ControlPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DecreaseQuantuty;
    private javax.swing.JButton btn_IncreaseQuantuty;
    private javax.swing.JButton btn_NextVarious;
    private javax.swing.JButton btn_PreviousDrink;
    private javax.swing.JButton btn_nextDessert;
    private javax.swing.JButton btn_nextDrink;
    private javax.swing.JButton btn_nextFood;
    private javax.swing.JButton btn_previousDessert;
    private javax.swing.JButton btn_previousFood;
    private javax.swing.JButton btn_previousVarious;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbl_AmountProduct;
    private javax.swing.JLabel lbl_DessertImage;
    private javax.swing.JLabel lbl_DessertName;
    private javax.swing.JLabel lbl_DessertPrice;
    private javax.swing.JLabel lbl_DrinkImage;
    private javax.swing.JLabel lbl_DrinkName;
    private javax.swing.JLabel lbl_DrinkPrice;
    private javax.swing.JLabel lbl_FoodImage;
    private javax.swing.JLabel lbl_FoodName;
    private javax.swing.JLabel lbl_FoodPrice;
    private javax.swing.JLabel lbl_ProductChoice;
    private javax.swing.JLabel lbl_QuantutyProduct;
    private javax.swing.JLabel lbl_SubTotal;
    private javax.swing.JLabel lbl_Total;
    private javax.swing.JLabel lbl_VariousImage;
    private javax.swing.JLabel lbl_VariousName;
    private javax.swing.JLabel lbl_VariousPrice;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            lbHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }

    public void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public String subTotal(){
        
        try{
            
            int a = Integer.parseInt(lbl_QuantutyProduct.getText());
            int b = Integer.parseInt(lbl_AmountProduct.getText());
            int subtotal = a*b;
            
            return subtotal+"";
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Inserte un producto");
        }
        
        return"";
    }
    
}
