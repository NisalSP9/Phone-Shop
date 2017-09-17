/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.view;

import com.phone_shop.controller.CustomerController;
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
public final class SearchCustomerView extends javax.swing.JDialog {

    CustomerController customerController = new CustomerController();

    /**
     * Creates new form SearchCustomerView
     *
     * @param parent
     * @param modal
     */
    public SearchCustomerView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        autoFillCB();
        trackEnterPressed();

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
        mainLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        address = new javax.swing.JLabel();
        mobileNumber = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        landLineText = new javax.swing.JTextField();
        landLine = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        ResetCustomerButton = new javax.swing.JButton();
        custCB = new javax.swing.JComboBox();
        mobileNumber1 = new javax.swing.JLabel();
        cusIDText = new javax.swing.JTextField();
        mobileNumber2 = new javax.swing.JLabel();
        mobileNumberText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Customer View");
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        setIconImage(null);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(595, 550));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 0, 90, 90);

        mainLabel.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainLabel.setText("Search Customer Details");
        getContentPane().add(mainLabel);
        mainLabel.setBounds(10, 0, 580, 80);

        addressTextArea.setEditable(false);
        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 230, 420, 80);

        address.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        address.setText("Address");
        getContentPane().add(address);
        address.setBounds(10, 230, 130, 30);

        mobileNumber.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        mobileNumber.setText("Name");
        getContentPane().add(mobileNumber);
        mobileNumber.setBounds(10, 130, 140, 40);

        nameText.setEditable(false);
        nameText.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        getContentPane().add(nameText);
        nameText.setBounds(160, 130, 290, 40);

        landLineText.setEditable(false);
        landLineText.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        getContentPane().add(landLineText);
        landLineText.setBounds(160, 370, 180, 40);

        landLine.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        landLine.setText("Land Line");
        getContentPane().add(landLine);
        landLine.setBounds(10, 370, 130, 30);

        email.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        email.setText("Email");
        getContentPane().add(email);
        email.setBounds(10, 420, 130, 30);

        emailText.setEditable(false);
        emailText.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        getContentPane().add(emailText);
        emailText.setBounds(160, 420, 420, 40);

        ResetCustomerButton.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        ResetCustomerButton.setText("RESET");
        ResetCustomerButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ResetCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetCustomerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetCustomerButton);
        ResetCustomerButton.setBounds(450, 460, 130, 40);

        custCB.setEditable(true);
        custCB.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        custCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custCBActionPerformed(evt);
            }
        });
        getContentPane().add(custCB);
        custCB.setBounds(10, 70, 570, 40);

        mobileNumber1.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        mobileNumber1.setText("Customer ID");
        getContentPane().add(mobileNumber1);
        mobileNumber1.setBounds(10, 180, 140, 30);

        cusIDText.setEditable(false);
        cusIDText.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        getContentPane().add(cusIDText);
        cusIDText.setBounds(160, 180, 180, 40);

        mobileNumber2.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        mobileNumber2.setText("Mobile Number");
        getContentPane().add(mobileNumber2);
        mobileNumber2.setBounds(10, 320, 140, 30);

        mobileNumberText.setEditable(false);
        mobileNumberText.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        getContentPane().add(mobileNumberText);
        mobileNumberText.setBounds(160, 320, 180, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/Win8BackGround-303030.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 770, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetCustomerButtonActionPerformed

        custCB.removeAllItems();
        cusIDText.setText("");
        addressTextArea.setText("");
        nameText.setText("");
        landLineText.setText("");
        emailText.setText("");
        mobileNumberText.setText("");
        custCB.removeAllItems();


    }//GEN-LAST:event_ResetCustomerButtonActionPerformed

    private void custCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custCBActionPerformed

        itemInfor();


    }//GEN-LAST:event_custCBActionPerformed

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
            java.util.logging.Logger.getLogger(SearchCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SearchCustomerView dialog = new SearchCustomerView(new javax.swing.JFrame(), true);
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

//    public void nameSender(String custName) {
//
//        CustomerController custController = new CustomerController();
//
//        try {
//            custCB.setModel(custController.getCustNameList(custName));
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(SearchCustomerView.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        if (custCB.getItemCount() > 0) {
//
//            custCB.showPopup();
//            itemInfor();
//
//        }
//
//    }
//    public void itemInfor() {
//
//        try {
//            CustomerController custController = new CustomerController();
//
//            String infro[] = custController.giveAwayItemInfro((String) custCB.getSelectedItem());
//
//            cusIDText.setText(infro[0]);
//            nameText.setText(infro[1]);
//            addressTextArea.setText(infro[2]);
//            mobileNumberText.setText(infro[3]);
//            landLineText.setText(infro[4]);
//            emailText.setText(infro[5]);
//           
//
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(Search_Item_View.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    public void autoFillCB() {

        custCB.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                String Letter = custCB.getEditor().getItem().toString();

                if (evt.getKeyCode() == 40 || evt.getKeyCode() == 38 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() >= 65 || evt.getKeyCode() <= 90 || evt.getKeyCode() == KeyEvent.VK_ENTER && Letter != null) {

                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                        char[] k = Letter.toCharArray();
                        try {
                            if (Character.isLetter(k[0])) {

                                nameSender(Letter);

                            }

                        } catch (ArrayIndexOutOfBoundsException e) {

                            custCB.setFocusable(false);
                            JOptionPane.showMessageDialog(SearchCustomerView.this, "Sorry...!");
                            ResetCustomerButton.doClick();
                            custCB.setFocusable(true);

                        }

                    }

                } else {

                    JOptionPane.showMessageDialog(SearchCustomerView.this, "Wrong Input...!");
                    custCB.removeAllItems();

                }

            }

        });

    }

    public void nameSender(String Letter) {

        CustomerController customer = new CustomerController();

        try {

            if (customer.getList(Letter) != null) {

                custCB.setModel(customer.getList(Letter));

            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Search_Item_View.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (custCB.getItemCount() > 0) {

            custCB.showPopup();
            itemInfor();

        }

    }

    public void itemInfor() {

        try {
            CustomerController customer = new CustomerController();

            String[] ID = custCB.getSelectedItem().toString().split("\\ ");

            String infro[] = customer.giveAwayOrderInfro(ID[0]);
            try {
                cusIDText.setText(infro[0]);
                nameText.setText(infro[1]);
                addressTextArea.setText(infro[2]);
                mobileNumberText.setText(infro[3]);
                landLineText.setText(infro[4]);
                emailText.setText(infro[5]);
            } catch (NullPointerException ex) {
                custCB.setFocusable(false);
                JOptionPane.showMessageDialog(SearchCustomerView.this, "Can't Find...!");
                ResetCustomerButton.doClick();
                custCB.setFocusable(true);
            }
        } catch (SQLException | ClassNotFoundException | NullPointerException ex) {
            custCB.setFocusable(false);
            //JOptionPane.showMessageDialog(SearchCustomerView.this, "Can'tFind...!");
            ResetCustomerButton.doClick();
            custCB.setFocusable(true);
        }

    }

    public void trackEnterPressed() {

        custCB.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                    itemInfor();

                }

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetCustomerButton;
    private javax.swing.JLabel address;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField cusIDText;
    private javax.swing.JComboBox custCB;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel landLine;
    private javax.swing.JTextField landLineText;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel mobileNumber;
    private javax.swing.JLabel mobileNumber1;
    private javax.swing.JLabel mobileNumber2;
    private javax.swing.JTextField mobileNumberText;
    private javax.swing.JTextField nameText;
    // End of variables declaration//GEN-END:variables
}
