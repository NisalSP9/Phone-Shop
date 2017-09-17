package com.phone_shop.view;

import com.phone_shop.controller.ItemController;
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
public final class Delete_Item_View extends javax.swing.JDialog {

    public Delete_Item_View(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        autoFillCB();
        trackEnterPressed();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemCodeText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        qtyOnHandText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mainLable = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        warrantytext = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        brandtext = new javax.swing.JTextField();
        selling_price_pre_peace_text = new javax.swing.JTextField();
        reorderLevelText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        purchase_price_pre_peace_text = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        purchase_price_pre_pack_text = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        selling_price_pre_pack_text = new javax.swing.JTextField();
        modelText = new javax.swing.JTextField();
        itemCB = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete Item");
        setBounds(new java.awt.Rectangle(100, 10, 0, 0));
        setMinimumSize(new java.awt.Dimension(538, 685));
        setResizable(false);
        getContentPane().setLayout(null);

        itemCodeText.setEditable(false);
        getContentPane().add(itemCodeText);
        itemCodeText.setBounds(120, 150, 140, 30);

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 190, 380, 50);

        qtyOnHandText.setEditable(false);
        getContentPane().add(qtyOnHandText);
        qtyOnHandText.setBounds(120, 570, 190, 30);

        jLabel10.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel10.setText("QTY On Hand");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 570, 110, 30);

        jLabel9.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel9.setText("Reorder Level");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 530, 110, 30);

        jLabel7.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel7.setText("Description");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 190, 110, 30);

        jLabel11.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel11.setText("Item Code");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 150, 100, 30);

        mainLable.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        mainLable.setText("Delete Item");
        getContentPane().add(mainLable);
        mainLable.setBounds(10, 0, 530, 50);

        resetButton.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton);
        resetButton.setBounds(370, 610, 150, 40);

        warrantytext.setEditable(false);
        getContentPane().add(warrantytext);
        warrantytext.setBounds(120, 490, 280, 30);

        jLabel12.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel12.setText("Selling Price Pre Peace");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 450, 200, 30);

        jLabel13.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel13.setText("Model");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 290, 110, 30);

        jLabel14.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel14.setText("Brand");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 250, 110, 30);

        brandtext.setEditable(false);
        getContentPane().add(brandtext);
        brandtext.setBounds(120, 250, 380, 30);

        selling_price_pre_peace_text.setEditable(false);
        selling_price_pre_peace_text.setText("N/A");
        getContentPane().add(selling_price_pre_peace_text);
        selling_price_pre_peace_text.setBounds(210, 450, 280, 30);

        reorderLevelText.setEditable(false);
        getContentPane().add(reorderLevelText);
        reorderLevelText.setBounds(120, 530, 190, 30);

        jLabel16.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel16.setText("Warranty");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 490, 110, 30);

        purchase_price_pre_peace_text.setEditable(false);
        purchase_price_pre_peace_text.setText("N/A");
        getContentPane().add(purchase_price_pre_peace_text);
        purchase_price_pre_peace_text.setBounds(210, 330, 280, 30);

        jLabel17.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel17.setText("Purchase Price Pre Pack");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 330, 200, 30);

        purchase_price_pre_pack_text.setEditable(false);
        purchase_price_pre_pack_text.setText("N/A");
        getContentPane().add(purchase_price_pre_pack_text);
        purchase_price_pre_pack_text.setBounds(210, 370, 280, 30);

        jLabel18.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel18.setText("Purchase Price Pre Peace");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 370, 200, 30);

        jLabel19.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel19.setText("Selling price pre pack");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 410, 200, 30);

        selling_price_pre_pack_text.setEditable(false);
        selling_price_pre_pack_text.setText("N/A");
        getContentPane().add(selling_price_pre_pack_text);
        selling_price_pre_pack_text.setBounds(210, 410, 280, 30);

        modelText.setEditable(false);
        getContentPane().add(modelText);
        modelText.setBounds(120, 290, 280, 30);

        itemCB.setEditable(true);
        itemCB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        itemCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCBActionPerformed(evt);
            }
        });
        getContentPane().add(itemCB);
        itemCB.setBounds(10, 50, 490, 40);

        jLabel15.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel15.setText("Name");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 110, 100, 30);

        nameText.setEditable(false);
        getContentPane().add(nameText);
        nameText.setBounds(120, 110, 140, 30);

        deleteButton.setFont(new java.awt.Font("Vani", 0, 24)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(220, 610, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/Win8BackGround-303030.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -20, 580, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        itemCodeText.setText("");
        nameText.setText("");
        descriptionTextArea.setText("");
        brandtext.setText("");
        modelText.setText("");
        purchase_price_pre_pack_text.setText("");
        purchase_price_pre_peace_text.setText("");
        selling_price_pre_pack_text.setText("");
        selling_price_pre_peace_text.setText("");
        warrantytext.setText("");
        reorderLevelText.setText("");
        qtyOnHandText.setText("");
        itemCB.removeAllItems();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void itemCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCBActionPerformed

         if (evt.getModifiers() != 0) {

            itemInfor();

        }



    }//GEN-LAST:event_itemCBActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        int okayORnot = JOptionPane.showConfirmDialog(Delete_Item_View.this, "Do you really want to Delete this ?", "ADD", JOptionPane.YES_NO_OPTION);
            if (okayORnot == 0) {

        
        try {
            int rst = ItemController.deleteItem(itemCodeText.getText());

            if (rst > 0) {

                JOptionPane.showMessageDialog(Delete_Item_View.this, "Deleted...!");
                resetButton.doClick();

            } else {

                JOptionPane.showMessageDialog(Delete_Item_View.this, "Some thing went wrong...!");

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Delete_Item_View.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Item_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Item_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Item_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Item_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Delete_Item_View dialog = new Delete_Item_View(new javax.swing.JFrame(), true);
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

        itemCB.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                String Letter = itemCB.getEditor().getItem().toString();

                if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() == KeyEvent.VK_ENTER && Letter != null) {

                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                        char[] k = Letter.toCharArray();
                        try {
                            if (Character.isLetter(k[0])) {

                                nameSender(Letter);

                            }

                        } catch (ArrayIndexOutOfBoundsException e) {

                            itemCB.setFocusable(false);
                            JOptionPane.showMessageDialog(Delete_Item_View.this, "Sorry...!");
                            resetButton.doClick();
                            itemCB.setFocusable(true);

                        }

                    }

                }

            }

        });

    }

    public void nameSender(String Letter) {

        ItemController item = new ItemController();

        try {

            if (item.getList(Letter) != null) {

                itemCB.setModel(item.getList(Letter));

            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Search_Item_View.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (itemCB.getItemCount() > 0) {

            itemCB.showPopup();
            itemInfor();

        }

    }

    public void itemInfor() {

        try {
            ItemController item = new ItemController();

            String[] ID = itemCB.getSelectedItem().toString().split("\\ ");

            String infro[] = item.giveAwayOrderInfro(ID[0]);
            try {
                itemCodeText.setText(infro[0]);
                nameText.setText(infro[1]);
                descriptionTextArea.setText(infro[2]);
                brandtext.setText(infro[3]);
                modelText.setText(infro[4]);
                purchase_price_pre_pack_text.setText(infro[5]);
                purchase_price_pre_peace_text.setText(infro[6]);
                selling_price_pre_pack_text.setText(infro[7]);
                selling_price_pre_peace_text.setText(infro[8]);
                warrantytext.setText(infro[9]);
                reorderLevelText.setText(infro[10]);
                qtyOnHandText.setText(infro[11]);
            } catch (NullPointerException ex) {
                itemCB.setFocusable(false);
                JOptionPane.showMessageDialog(Delete_Item_View.this, "Can't Find...!");
                resetButton.doClick();
                itemCB.setFocusable(true);
            }
        } catch (SQLException | ClassNotFoundException | NullPointerException ex) {
            itemCB.setFocusable(false);
            //JOptionPane.showMessageDialog(SearchCustomerView.this, "Can'tFind...!");
            resetButton.doClick();
            itemCB.setFocusable(true);
        }

    }

    public void trackEnterPressed() {

        itemCB.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent evt) {

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                    itemInfor();

                }

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brandtext;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JComboBox<String> itemCB;
    private javax.swing.JTextField itemCodeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainLable;
    private javax.swing.JTextField modelText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField purchase_price_pre_pack_text;
    private javax.swing.JTextField purchase_price_pre_peace_text;
    private javax.swing.JTextField qtyOnHandText;
    private javax.swing.JTextField reorderLevelText;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField selling_price_pre_pack_text;
    private javax.swing.JTextField selling_price_pre_peace_text;
    private javax.swing.JTextField warrantytext;
    // End of variables declaration//GEN-END:variables
}
