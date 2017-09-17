package com.phone_shop.view;

import com.phone_shop.controller.ChequeDetailController;
import com.phone_shop.model.ChequeDetail;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author NisalSP9
 */
public class ChequeDetailView extends javax.swing.JDialog {

    //public String[] Check;

    /**
     * Creates new form CheckDetail
     * @param parent
     * @param modal
     * @param amount
     * @param date
     * @param ID
     */
    public ChequeDetailView(java.awt.Frame parent, boolean modal,String amount,String date,String ID) {
        super(parent, modal);
        initComponents();
        Infor.setVisible(false);
        orderIDText.setText(ID);
        currentDateText.setText(date);
        checkDateText.setText(date);
        amountText.setText(amount);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Infor = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderIDText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        checkNumberText = new javax.swing.JTextField();
        bankText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        currentDateText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkDateText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        resetBut = new javax.swing.JButton();
        saveBut = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(30, 30, 30, 30));
        setMinimumSize(new java.awt.Dimension(500, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        Infor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Infor.setForeground(new java.awt.Color(255, 0, 0));
        Infor.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Make sure you will save the ORDER after you have saved Cheque Details !");
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Infor.add(jLabel10);
        jLabel10.setBounds(0, 0, 450, 30);

        getContentPane().add(Infor);
        Infor.setBounds(20, 410, 450, 30);

        jLabel3.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel3.setText("Cheque Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 150, 140, 40);

        orderIDText.setEditable(false);
        orderIDText.setBackground(new java.awt.Color(204, 204, 204));
        orderIDText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        getContentPane().add(orderIDText);
        orderIDText.setBounds(160, 100, 100, 40);

        jLabel4.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel4.setText("Order ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 100, 90, 40);

        checkNumberText.setBackground(new java.awt.Color(102, 255, 51));
        checkNumberText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        checkNumberText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkNumberTextKeyTyped(evt);
            }
        });
        getContentPane().add(checkNumberText);
        checkNumberText.setBounds(160, 150, 240, 40);

        bankText.setBackground(new java.awt.Color(102, 255, 51));
        bankText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        bankText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bankTextKeyTyped(evt);
            }
        });
        getContentPane().add(bankText);
        bankText.setBounds(160, 200, 200, 40);

        jLabel5.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel5.setText("Bank Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 200, 120, 40);

        currentDateText.setEditable(false);
        currentDateText.setBackground(new java.awt.Color(204, 204, 204));
        currentDateText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        currentDateText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(currentDateText);
        currentDateText.setBounds(160, 250, 110, 40);

        jLabel6.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel6.setText("Current Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 250, 120, 40);

        jLabel7.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel7.setText("Cheque Date");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 300, 120, 40);

        checkDateText.setBackground(new java.awt.Color(102, 255, 51));
        checkDateText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        checkDateText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        checkDateText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkDateTextMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkDateTextMouseExited(evt);
            }
        });
        checkDateText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkDateTextKeyTyped(evt);
            }
        });
        getContentPane().add(checkDateText);
        checkDateText.setBounds(160, 300, 110, 40);

        jLabel8.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel8.setText("State");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 350, 120, 40);

        stateText.setEditable(false);
        stateText.setBackground(new java.awt.Color(204, 204, 204));
        stateText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        stateText.setText("Pending");
        getContentPane().add(stateText);
        stateText.setBounds(160, 350, 100, 40);

        jLabel9.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel9.setText("Amount");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 400, 120, 40);

        amountText.setBackground(new java.awt.Color(102, 255, 51));
        amountText.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        amountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountTextKeyTyped(evt);
            }
        });
        getContentPane().add(amountText);
        amountText.setBounds(160, 400, 190, 40);

        jLabel1.setFont(new java.awt.Font("Utsaah", 1, 36)); // NOI18N
        jLabel1.setText("Cheque Detail");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 280, 80);

        resetBut.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        resetBut.setText("RESET");
        resetBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButActionPerformed(evt);
            }
        });
        getContentPane().add(resetBut);
        resetBut.setBounds(360, 450, 130, 40);

        saveBut.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        saveBut.setText("SAVE");
        saveBut.setToolTipText("");
        saveBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButMouseExited(evt);
            }
        });
        saveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButActionPerformed(evt);
            }
        });
        getContentPane().add(saveBut);
        saveBut.setBounds(230, 450, 130, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/Win8BackGround-303030.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 550, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButActionPerformed

        if (checkNumberText.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(ChequeDetailView.this, "Enter The Cheque Number !");

        } else if (bankText.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(ChequeDetailView.this, "Enter The Bank Name !");

        } else if (checkDateText.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(ChequeDetailView.this, "Enter The Cheque Date !");

        } else if (amountText.getText().trim().equals("")) {

            JOptionPane.showMessageDialog(ChequeDetailView.this, "Enter The Amount !");

        } else {

            int res = 0;

            String orderID = orderIDText.getText();
            String checkNumber = checkNumberText.getText();
            String bank = bankText.getText();
            String currentDate = currentDateText.getText();
            String chequeDate = checkDateText.getText();
            String state = stateText.getText();
            double amount = Double.parseDouble(amountText.getText());

            ChequeDetail chequeDetail = new ChequeDetail(orderID, checkNumber, bank, currentDate, chequeDate, state, amount);

            try {
                res = ChequeDetailController.addChequeDetail(chequeDetail);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(ChequeDetailView.this, ex);
            }

            if (res > 0) {

                JOptionPane.showMessageDialog(ChequeDetailView.this, "Saved !");

            } else {

                JOptionPane.showMessageDialog(ChequeDetailView.this, "Saving Fail !");

            }

        }

        this.setVisible(false);
    }//GEN-LAST:event_saveButActionPerformed

    private void checkNumberTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkNumberTextKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_ENTER)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_checkNumberTextKeyTyped

    private void bankTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bankTextKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_ENTER)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_bankTextKeyTyped

    private void checkDateTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkDateTextKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_MINUS || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_ENTER)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_checkDateTextKeyTyped

    private void amountTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_ENTER)) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_amountTextKeyTyped

    private void resetButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButActionPerformed

        if (!(checkNumberText.getText().trim().equals("") && bankText.getText().trim().equals("") && checkDateText.getText().trim().equals("") && amountText.getText().trim().equals(""))) {

            checkNumberText.setText("");
            bankText.setText("");
            checkDateText.setText("YY-MM-DD");
            amountText.setText("");

        } else {

            JOptionPane.showMessageDialog(ChequeDetailView.this, "Nothing To Reset !");

        }

    }//GEN-LAST:event_resetButActionPerformed

    private void checkDateTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkDateTextMouseClicked
        checkDateText.setText("");
    }//GEN-LAST:event_checkDateTextMouseClicked

    private void checkDateTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkDateTextMouseExited
        if (checkDateText.getText().trim().equals("")) {
            checkDateText.setText("YY-MM-DD");
        }
    }//GEN-LAST:event_checkDateTextMouseExited

    private void saveButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButMouseEntered
        Infor.setVisible(true);
    }//GEN-LAST:event_saveButMouseEntered

    private void saveButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButMouseExited
        Infor.setVisible(false);
    }//GEN-LAST:event_saveButMouseExited

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
            java.util.logging.Logger.getLogger(ChequeDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChequeDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChequeDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChequeDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChequeDetailView dialog = new ChequeDetailView(new javax.swing.JFrame(), true,null,null,null);
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
    private javax.swing.JPanel Infor;
    private javax.swing.JTextField amountText;
    private javax.swing.JTextField bankText;
    private javax.swing.JTextField checkDateText;
    private javax.swing.JTextField checkNumberText;
    private javax.swing.JTextField currentDateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField orderIDText;
    private javax.swing.JButton resetBut;
    private javax.swing.JButton saveBut;
    private javax.swing.JTextField stateText;
    // End of variables declaration//GEN-END:variables
}
