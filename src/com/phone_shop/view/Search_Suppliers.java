package com.phone_shop.view;

import com.phone_shop.controller.SupplierController;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Search_Suppliers extends javax.swing.JDialog {

    SupplierController sc = new SupplierController();

    public Search_Suppliers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        autoFillCB();
        trackEnterPressed();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplierCombo = new javax.swing.JComboBox();
        mobileText = new javax.swing.JTextField();
        supID = new javax.swing.JTextField();
        landText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        nicNumber = new javax.swing.JLabel();
        firstName1 = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JLabel();
        landLine = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        mainLabel = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        firstName2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        discriptionText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(100, 10, 0, 0));
        setMinimumSize(new java.awt.Dimension(500, 600));
        getContentPane().setLayout(null);

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
        supplierCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierComboKeyPressed(evt);
            }
        });
        getContentPane().add(supplierCombo);
        supplierCombo.setBounds(160, 70, 310, 30);

        mobileText.setEditable(false);
        getContentPane().add(mobileText);
        mobileText.setBounds(160, 420, 210, 30);

        supID.setEditable(false);
        getContentPane().add(supID);
        supID.setBounds(160, 110, 210, 30);

        landText.setEditable(false);
        getContentPane().add(landText);
        landText.setBounds(160, 380, 210, 30);

        nameText.setEditable(false);
        getContentPane().add(nameText);
        nameText.setBounds(160, 150, 210, 30);

        emailText.setEditable(false);
        getContentPane().add(emailText);
        emailText.setBounds(160, 460, 210, 30);

        nicNumber.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        nicNumber.setText("Supplier ID");
        getContentPane().add(nicNumber);
        nicNumber.setBounds(10, 110, 130, 30);

        firstName1.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        firstName1.setText("Name");
        getContentPane().add(firstName1);
        firstName1.setBounds(10, 150, 130, 30);

        lastName.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        lastName.setText("Discription");
        getContentPane().add(lastName);
        lastName.setBounds(10, 190, 130, 30);

        address.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        address.setText("Address");
        getContentPane().add(address);
        address.setBounds(10, 290, 130, 30);

        mobileNumber.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        mobileNumber.setText("Mobile Number");
        getContentPane().add(mobileNumber);
        mobileNumber.setBounds(10, 420, 130, 30);

        landLine.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        landLine.setText("Land Line");
        getContentPane().add(landLine);
        landLine.setBounds(10, 380, 130, 30);

        email.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        email.setText("Email");
        getContentPane().add(email);
        email.setBounds(10, 460, 130, 30);

        mainLabel.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Search Supplier Details");
        getContentPane().add(mainLabel);
        mainLabel.setBounds(0, 0, 420, 50);

        ResetButton.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton);
        ResetButton.setBounds(340, 500, 130, 40);

        firstName2.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        firstName2.setText("Name");
        getContentPane().add(firstName2);
        firstName2.setBounds(10, 70, 130, 30);

        addressText.setEditable(false);
        addressText.setColumns(20);
        addressText.setRows(5);
        jScrollPane1.setViewportView(addressText);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 290, 320, 80);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 0, 90, 90);

        discriptionText.setEditable(false);
        discriptionText.setColumns(20);
        discriptionText.setRows(5);
        jScrollPane2.setViewportView(discriptionText);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 190, 320, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/Win8BackGround-303030.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, -26, 540, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supplierComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboActionPerformed

        if (evt.getModifiers() != 0) {

            itemInfor();

        }


    }//GEN-LAST:event_supplierComboActionPerformed

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

    private void supplierComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierComboKeyPressed
        // System.out.println("Enter Pressed");
    }//GEN-LAST:event_supplierComboKeyPressed

    private void supplierComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierComboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierComboMouseClicked

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
            java.util.logging.Logger.getLogger(Search_Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Search_Suppliers dialog = new Search_Suppliers(new javax.swing.JFrame(), true);
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

    public void autoFillCB() {

        supplierCombo.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                String Letter = supplierCombo.getEditor().getItem().toString();

                if ( evt.getKeyCode() == 40 || evt.getKeyCode() == 38 || evt.getKeyCode()== KeyEvent.VK_BACK_SPACE ||evt.getKeyCode() >= 65 || evt.getKeyCode() <= 90 && evt.getKeyCode() == KeyEvent.VK_ENTER && Letter != null) {

                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                        char[] k = Letter.toCharArray();
                        try {
                            if (Character.isLetter(k[0])) {

                                nameSender(Letter);

                            }

                        } catch (ArrayIndexOutOfBoundsException e) {

                            
                            JOptionPane.showMessageDialog(Search_Suppliers.this, "Sorry...!");
                            supplierCombo.setFocusable(false);
                            ResetButton.doClick();
                            supplierCombo.setFocusable(true);

                        }

                    }

                }else{
                
                    
                    supplierCombo.setFocusable(false);
                    JOptionPane.showMessageDialog(Search_Suppliers.this, "Wrong Input...!");
                    supplierCombo.removeAllItems();
                    supplierCombo.setFocusable(true);
                
                
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
                JOptionPane.showMessageDialog(Search_Suppliers.this, "Can't Find...!");
                ResetButton.doClick();
                supplierCombo.setFocusable(true);
            }
        } catch (SQLException | ClassNotFoundException | NullPointerException ex) {
            supplierCombo.setFocusable(false);
            JOptionPane.showMessageDialog(Search_Suppliers.this, "Can't Find...!");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel address;
    private javax.swing.JTextArea addressText;
    private javax.swing.JTextArea discriptionText;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel firstName1;
    private javax.swing.JLabel firstName2;
    private javax.swing.JLabel jLabel1;
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
    // End of variables declaration//GEN-END:variables
}
