/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.view;

import com.phone_shop.controller.CustomerController;
import com.phone_shop.controller.OrderController;
import com.phone_shop.controller.OrderDetailController;
import com.phone_shop.controller.ServiceDetailController;
import com.phone_shop.model.Customer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author NisalSP9
 */
public final class SearchOrderView extends javax.swing.JDialog {

   private String OrderID4ItemSearch;

    public SearchOrderView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        autoFillCB();
        trackEnterPressed();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        OrderCB = new javax.swing.JComboBox();
        cusNIC = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cusNameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemINOrderTable = new javax.swing.JTable();
        titelLab = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        viewButton1 = new javax.swing.JButton();
        resetBut = new javax.swing.JButton();
        resetBut1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(-10, 200, 1340, 20);

        OrderCB.setBackground(new java.awt.Color(102, 255, 51));
        OrderCB.setEditable(true);
        OrderCB.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        OrderCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderCBActionPerformed(evt);
            }
        });
        getContentPane().add(OrderCB);
        OrderCB.setBounds(10, 90, 220, 40);

        cusNIC.setEditable(false);
        cusNIC.setBackground(new java.awt.Color(204, 204, 204));
        cusNIC.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        getContentPane().add(cusNIC);
        cusNIC.setBounds(390, 90, 170, 40);

        dateText.setEditable(false);
        dateText.setBackground(new java.awt.Color(204, 204, 204));
        dateText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        getContentPane().add(dateText);
        dateText.setBounds(680, 90, 160, 40);

        jLabel1.setFont(new java.awt.Font("Vani", 1, 36)); // NOI18N
        jLabel1.setText("Search Orders");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(4, 0, 1180, 80);

        jLabel3.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel3.setText("Order Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 90, 91, 40);

        cusNameText.setEditable(false);
        cusNameText.setBackground(new java.awt.Color(204, 204, 204));
        cusNameText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        getContentPane().add(cusNameText);
        cusNameText.setBounds(1030, 210, 250, 40);

        jLabel5.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel5.setText("Customer Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(890, 210, 140, 40);

        itemINOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item_Code", "Description", "Unit_Price", "qty", "Discount_Per_Sell", "Discount_Per_Item", "Selling_Price"
            }
        ));
        jScrollPane1.setViewportView(itemINOrderTable);
        if (itemINOrderTable.getColumnModel().getColumnCount() > 0) {
            itemINOrderTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 260, 1090, 410);

        titelLab.setFont(new java.awt.Font("Utsaah", 1, 36)); // NOI18N
        titelLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titelLab.setText("Items In Order");
        titelLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(titelLab);
        titelLab.setBounds(10, 210, 1060, 40);

        jLabel7.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel7.setText("Customer ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 90, 110, 40);

        viewButton.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        viewButton.setText("VIEW DETAILS");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewButton);
        viewButton.setBounds(1110, 260, 170, 40);

        viewButton1.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        viewButton1.setText("DELETE ORDER");
        viewButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(viewButton1);
        viewButton1.setBounds(1110, 630, 170, 40);

        resetBut.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        resetBut.setText("RESET");
        resetBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButActionPerformed(evt);
            }
        });
        getContentPane().add(resetBut);
        resetBut.setBounds(1110, 360, 170, 40);

        resetBut1.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        resetBut1.setText("RESET");
        resetBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBut1ActionPerformed(evt);
            }
        });
        getContentPane().add(resetBut1);
        resetBut1.setBounds(10, 140, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/Win8BackGround-303030.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-16, -16, 1350, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderCBActionPerformed

        itemInfor();


    }//GEN-LAST:event_OrderCBActionPerformed


    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed

        try {

            Customer customer = CustomerController.searchCustomer(cusNIC.getText());
            if (null == customer) {

                JOptionPane.showMessageDialog(SearchOrderView.this, "Can't find the customer for this order...!");
                resetBut1.doClick();
            } else {

                cusNameText.setText(customer.getName());

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchOrderView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!(OrderCB.getSelectedItem() == null)) {
            updateTableOrder();
        } else {
            JOptionPane.showMessageDialog(SearchOrderView.this, "Select Order ID");
        }


    }//GEN-LAST:event_viewButtonActionPerformed

    private void viewButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButton1ActionPerformed

        int okayORnot = JOptionPane.showConfirmDialog(null, "Do you really want to delete this ?", "Delete", JOptionPane.YES_NO_OPTION);

        if (okayORnot == 0) {
            try {
                int deleteOK = OrderDetailController.deleteOrderDetail(OrderID4ItemSearch);
                int deleteOK4Order = OrderController.deleteOrder(OrderID4ItemSearch);

                if (deleteOK > 0 && deleteOK4Order > 0) {

                    JOptionPane.showMessageDialog(SearchOrderView.this, "Deleted !");
                    resetBut.doClick();
                    resetBut1.doClick();

                } else {

                    JOptionPane.showMessageDialog(SearchOrderView.this, "Delete Fail !");
                }

            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(SearchOrderView.this, ex);
            }

        }


    }//GEN-LAST:event_viewButton1ActionPerformed

    private void resetButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButActionPerformed
        DefaultTableModel model = (DefaultTableModel) itemINOrderTable.getModel();

        if (itemINOrderTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(SearchOrderView.this, "Table is EMPTY");

        } else {

            while (model.getRowCount() > 0) {

                for (int i = 0; i < model.getRowCount(); i++) {

                    model.removeRow(i);

                }
            }
            resetBut1.doClick();
        }
    }//GEN-LAST:event_resetButActionPerformed

    private void resetBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBut1ActionPerformed
        OrderCB.removeAllItems();
        OrderID4ItemSearch = null;
        cusNIC.setText("");
        cusNameText.setText("");
        dateText.setText("");

    }//GEN-LAST:event_resetBut1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchOrderView dialog = new SearchOrderView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void updateTableOrder() {
        OrderDetailController orderDetailController = new OrderDetailController();
        try {
            titelLab.setText("Order Details");
            ResultSet rst = orderDetailController.updateItemInOrderTable(OrderID4ItemSearch);
            
            
            //updateItemInOrderTable
            
             itemINOrderTable.setModel(DbUtils.resultSetToTableModel(rst));

            
            
            if(0 == itemINOrderTable.getRowCount()){
            
                ResultSet rst2 = ServiceDetailController.updateItemInOrderTable(OrderID4ItemSearch);
                itemINOrderTable.setModel(DbUtils.resultSetToTableModel(rst2));
                titelLab.setText("Service Order Details");
            
            }

            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "lllllll"+e.getMessage());
        }

    }

    public void autoFillCB() {

        OrderCB.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                String Letter = OrderCB.getEditor().getItem().toString();

                if (evt.getKeyCode() >= 48 || evt.getKeyCode() <= 57 || evt.getKeyCode() == 40 || evt.getKeyCode() == 38 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_ENTER && Letter != null) {

                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        nameSender(Letter);

                    }

                } else {

                    JOptionPane.showMessageDialog(SearchOrderView.this, "Wrong Input...!");
                    OrderCB.removeAllItems();
                    resetBut1.doClick();

                }

            }

        });

    }

    public void nameSender(String Letter) {

        OrderController orderController = new OrderController();

        try {

            if (orderController.getList(Letter) != null) {

                OrderCB.setModel(orderController.getList(Letter));

            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Search_Item_View.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (OrderCB.getItemCount() > 0) {

            OrderCB.showPopup();
            itemInfor();

        }

    }

    public void itemInfor() {

        try {
            OrderController orderController = new OrderController();

            String ID = OrderCB.getSelectedItem().toString();

            String order[] = orderController.giveAwayOrderInfro(ID);

            if (order[0] == null) {

                JOptionPane.showMessageDialog(SearchOrderView.this, "Can't Find...!");

                cusNameText.setText("");
                OrderCB.removeAllItems();
                resetBut1.doClick();

            } else {

                cusNIC.setText(order[2]);
                dateText.setText(order[1]);
                OrderID4ItemSearch = order[0];

            }

        } catch (SQLException | ClassNotFoundException | NullPointerException ex) {
            OrderCB.setFocusable(false);
            JOptionPane.showMessageDialog(SearchOrderView.this, "Can'tFind...!");
            OrderCB.removeAllItems();
            //resetBut.doClick();
            OrderCB.setFocusable(true);
            resetBut1.doClick();
        }

    }

    public void trackEnterPressed() {

        OrderCB.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                    itemInfor();

                }

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox OrderCB;
    private javax.swing.JTextField cusNIC;
    private javax.swing.JTextField cusNameText;
    private javax.swing.JTextField dateText;
    private javax.swing.JTable itemINOrderTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton resetBut;
    private javax.swing.JButton resetBut1;
    private javax.swing.JLabel titelLab;
    private javax.swing.JButton viewButton;
    private javax.swing.JButton viewButton1;
    // End of variables declaration//GEN-END:variables
}
