/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.view;

import com.phone_shop.controller.SupplierController;
import com.phone_shop.model.Supplier;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NisalSP9
 */
public final class Update_Supplier_View extends javax.swing.JDialog {

    SupplierController sc = new SupplierController();

    /**
     * Creates new form Update_Supplier_View
     */
    public Update_Supplier_View(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        trackEnterPressed();
        autoFillCB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        supplierCombo = new javax.swing.JComboBox();
        firstName2 = new javax.swing.JLabel();
        nicNumber = new javax.swing.JLabel();
        supID = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        firstName1 = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressText = new javax.swing.JTextArea();
        address = new javax.swing.JLabel();
        landLine = new javax.swing.JLabel();
        landText = new javax.swing.JTextField();
        mobileText = new javax.swing.JTextField();
        mobileNumber = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        discriptionText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 10, 0, 0));
        setMinimumSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(null);

        mainLabel.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Update Supplier Details");
        getContentPane().add(mainLabel);
        mainLabel.setBounds(0, 0, 520, 50);

        supplierCombo.setEditable(true);
        supplierCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierComboMouseClicked(evt);
            }
        });
        supplierCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboActionPerformed(evt);
            }
        });
        getContentPane().add(supplierCombo);
        supplierCombo.setBounds(160, 100, 310, 30);

        firstName2.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        firstName2.setText("Name / ID");
        getContentPane().add(firstName2);
        firstName2.setBounds(10, 100, 130, 30);

        nicNumber.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        nicNumber.setText("Supplier ID");
        getContentPane().add(nicNumber);
        nicNumber.setBounds(10, 140, 130, 30);

        supID.setEditable(false);
        getContentPane().add(supID);
        supID.setBounds(160, 140, 210, 30);

        nameText.setEditable(false);
        getContentPane().add(nameText);
        nameText.setBounds(160, 180, 210, 30);

        firstName1.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        firstName1.setText("Name");
        getContentPane().add(firstName1);
        firstName1.setBounds(10, 180, 130, 30);

        lastName.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        lastName.setText("Discription");
        getContentPane().add(lastName);
        lastName.setBounds(10, 220, 130, 30);

        addressText.setColumns(20);
        addressText.setRows(5);
        jScrollPane1.setViewportView(addressText);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 290, 320, 70);

        address.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        address.setText("Address");
        getContentPane().add(address);
        address.setBounds(10, 290, 130, 30);

        landLine.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        landLine.setText("Land Line");
        getContentPane().add(landLine);
        landLine.setBounds(10, 370, 130, 30);
        getContentPane().add(landText);
        landText.setBounds(160, 370, 210, 30);
        getContentPane().add(mobileText);
        mobileText.setBounds(160, 410, 210, 30);

        mobileNumber.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        mobileNumber.setText("Mobile Number");
        getContentPane().add(mobileNumber);
        mobileNumber.setBounds(10, 410, 130, 30);

        email.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        email.setText("Email");
        getContentPane().add(email);
        email.setBounds(10, 450, 130, 30);
        getContentPane().add(emailText);
        emailText.setBounds(160, 450, 210, 30);

        updateButton.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        updateButton.setText("Update");
        updateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(210, 500, 130, 40);

        ResetButton.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton);
        ResetButton.setBounds(350, 500, 130, 40);

        discriptionText.setColumns(20);
        discriptionText.setRows(5);
        jScrollPane2.setViewportView(discriptionText);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 220, 320, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/Win8BackGround-303030.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -26, 580, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supplierComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboActionPerformed
        if (evt.getModifiers() != 0) {

            itemInfor();

        }
    }//GEN-LAST:event_supplierComboActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        if (!supID.getText().trim().equals("")) {

            if (!addressText.getText().trim().equals("")) {

                int okayORnot = JOptionPane.showConfirmDialog(null, "Do you really want to ADD this ?", "ADD", JOptionPane.YES_NO_OPTION);
                if (okayORnot == 0) {
                    Supplier supplier = new Supplier(Integer.parseInt(supID.getText()), nameText.getText(), discriptionText.getText(), addressText.getText(), mobileText.getText(), landText.getText(), emailText.getText());
                    try {
                        int res = SupplierController.updateSupplier(supplier);
                        if (res > 0) {
                            JOptionPane.showMessageDialog(Update_Supplier_View.this, "Update Success");
                            ResetButton.doClick();
                        } else {
                            JOptionPane.showMessageDialog(Update_Supplier_View.this, "Update Fail");
                        }
                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(Update_Supplier_View.this, e.getMessage());
                    }

                    supID.setText("");
                    nameText.setText("");
                    addressText.setText("");
                    discriptionText.setText("");
                    emailText.setText("");
                    mobileText.setText("");
                    landText.setText("");

                }
            } else {
                
                JOptionPane.showMessageDialog(Update_Supplier_View.this, "Address Can't Be Empty...!");
            }

        } else {

            JOptionPane.showMessageDialog(Update_Supplier_View.this, "Nothing to Update !");

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        supID.setText("");
        nameText.setText("");
        addressText.setText("");
        discriptionText.setText("");
        emailText.setText("");
        mobileText.setText("");
        landText.setText("");
        supplierCombo.removeAllItems();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void supplierComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierComboMouseClicked

    }//GEN-LAST:event_supplierComboMouseClicked

    public void autoFillCB() {

        supplierCombo.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                String Letter = supplierCombo.getEditor().getItem().toString();

                if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() == KeyEvent.VK_ENTER && Letter != null) {

                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                        char[] k = Letter.toCharArray();
                        try {
                            if (Character.isLetter(k[0])) {

                                nameSender(Letter);

                            }

                        } catch (ArrayIndexOutOfBoundsException e) {

                            supplierCombo.setFocusable(false);
                            JOptionPane.showMessageDialog(Update_Supplier_View.this, "Sorry...!");
                            ResetButton.doClick();
                            supplierCombo.setFocusable(true);

                        }

                    }

                }

            }

        });

    }

    public void nameSender(String Letter) {

        SupplierController supplierController = new SupplierController();

        try {

            if (supplierController.getList(Letter) != null) {

                supplierCombo.setModel(supplierController.getList(Letter));

            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Search_Item_View.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (supplierCombo.getItemCount() > 0) {

            supplierCombo.showPopup();
            itemInfor();

        }

    }

    public void itemInfor() {

        try {
            SupplierController supplierController = new SupplierController();

            String[] ID = supplierCombo.getSelectedItem().toString().split("\\ ");

            String infro[] = supplierController.giveAwayOrderInfro(ID[0]);
            try {
                supID.setText(infro[0]);
                nameText.setText(infro[1]);
                addressText.setText(infro[3]);
                discriptionText.setText(infro[2]);
                mobileText.setText(infro[4]);
                landText.setText(infro[5]);
                emailText.setText(infro[6]);
            } catch (NullPointerException ex) {
                supplierCombo.setFocusable(false);
                JOptionPane.showMessageDialog(Update_Supplier_View.this, "Can't Find...!");
                ResetButton.doClick();
                supplierCombo.setFocusable(true);
            }
        } catch (SQLException | ClassNotFoundException | NullPointerException ex) {
            supplierCombo.setFocusable(false);
            JOptionPane.showMessageDialog(Update_Supplier_View.this, "Can't Find...!");
            ResetButton.doClick();
            supplierCombo.setFocusable(true);
        }

    }

    public void trackEnterPressed() {

        supplierCombo.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                    itemInfor();

                }

            }
        });

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
            java.util.logging.Logger.getLogger(Update_Supplier_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Supplier_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Supplier_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Supplier_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Update_Supplier_View dialog = new Update_Supplier_View(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel address;
    private javax.swing.JTextArea addressText;
    private javax.swing.JTextArea discriptionText;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel firstName1;
    private javax.swing.JLabel firstName2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel landLine;
    private javax.swing.JTextField landText;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel mobileNumber;
    private javax.swing.JTextField mobileText;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel nicNumber;
    private javax.swing.JTextField supID;
    private javax.swing.JComboBox supplierCombo;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}