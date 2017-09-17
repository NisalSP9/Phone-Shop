/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.view;

import com.phone_shop.controller.PaymentController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author NisalSP9
 */
public final class ManagePayment extends javax.swing.JDialog {

    /**
     * Creates new form ManagePayment
     */
    private int offset = 0;
    
    public ManagePayment(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        updateTableCashPayment4AllPayment(offset);
        
        
        //get Current date
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date curDate = new Date();
        dateText.setText(dateFormat.format(curDate));

        //Clock
        final DateFormat instanceTime = DateFormat.getTimeInstance(SimpleDateFormat.MEDIUM);
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                String format = instanceTime.format(d);
                clockLable.setText(instanceTime.format(d));

            }
        });
        timer.start();
        
        
        
        
        
        
        
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
        jLabel3 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        clockLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewAllPaymentTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 10, 50, 10));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel1.setText("Manage Payment ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 290, 70);

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Powered By CIS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(990, 640, 100, 40);

        dateText.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        dateText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateText.setText("7878");
        getContentPane().add(dateText);
        dateText.setBounds(970, 30, 210, 32);

        jButton6.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jButton6.setText("X");
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1140, 0, 50, 30);

        clockLable.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        clockLable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        clockLable.setText("7878");
        getContentPane().add(clockLable);
        clockLable.setBounds(970, 70, 210, 30);

        ViewAllPaymentTable.setBackground(new java.awt.Color(1, 139, 186));
        ViewAllPaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ViewAllPaymentTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 1180, 402);

        jButton1.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/next.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1140, 640, 49, 40);

        jButton5.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/Extras-Backward-icon.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1090, 640, 50, 40);

        jButton2.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jButton2.setText("Cash");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 140, 150, 50);

        jButton3.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jButton3.setText("Credit");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(670, 140, 150, 50);

        jButton4.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jButton4.setText("Cheque");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(520, 140, 150, 50);

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Recent Payment");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 200, 1190, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone_shop/view/pics/Win8BackGround-303030.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-30, 0, 1340, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ManageCashPayment(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        offset += 27;
        
        jButton5.setEnabled(true);
        
        if (ViewAllPaymentTable.getModel().getRowCount() > 0) {
            
            updateTableCashPayment4AllPayment(offset);
            
        } else {
            
            jButton1.setEnabled(false);
            
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new ManageChequeView(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ManageCreditView(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        offset -= 27;
        
        jButton1.setEnabled(true);
        
        if (offset < 0) {
            
            jButton5.setEnabled(false);
            
        } else {
            
            updateTableCashPayment4AllPayment(offset);
            
        }
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int rst = JOptionPane.showConfirmDialog(ManagePayment.this, "Do you want exit ?", "Exit", 0);

        if (rst == 0) {

            dispose();

        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ManagePayment dialog = new ManagePayment(new javax.swing.JFrame(), true);
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
    
    public void updateTableCashPayment4AllPayment(int offset) {
        PaymentController cashPayment = new PaymentController();
        try {
            ResultSet rst = cashPayment.updateCashPaymentTable4AllPayment(offset);
            ViewAllPaymentTable.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewAllPaymentTable;
    private javax.swing.JLabel clockLable;
    private javax.swing.JLabel dateText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
