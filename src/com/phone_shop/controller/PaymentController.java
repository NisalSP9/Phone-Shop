package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.Payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author NisalSP9
 */
public class PaymentController {

    public static int addPayment(Payment payment) throws ClassNotFoundException, SQLException {
        String sql = "Insert into paymenttable values('" + payment.getOrder_ID() + "','" + payment.getCustomer_ID() + "','" + payment.getPayment_Type() + "','" + payment.getDate() + "','" + payment.getAmount() + "','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);
    }

    public ResultSet updateCashPaymentTable(int offset) throws ClassNotFoundException, SQLException {

        String sql = "Select Order_ID_Pay as Order_ID,customer_ID,Name,paymentType as Payment_Type,date,amount From paymenttable,customer where paymenttable.visibility = 'ture' and paymenttable.Customer_ID = customer.cust_ID and  PaymentType = 'cash' order by 1  desc  limit 20 offset " + offset + "";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

    public ResultSet updateCashPaymentTable4AllPayment(int offset) throws ClassNotFoundException, SQLException {

        String sql = "Select Order_ID_Pay,customer_ID,Name,paymentType,date,amount From paymenttable,customer where paymenttable.visibility = 'ture' and paymenttable.Customer_ID = customer.cust_ID  order by 1  desc limit 27 offset " + offset + "";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

    public ResultSet updateCashPaymentTableAll() throws ClassNotFoundException, SQLException {

        String sql = "Select Order_ID_Pay,customer_ID,Name,paymentType,date,amount From paymenttable,customer where paymenttable.visibility = 'ture' and paymenttable.Customer_ID = customer.cust_ID and PaymentType = 'cash' order by 1 desc";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

    public static int deletePayment(String orderID) throws ClassNotFoundException, SQLException {
        String sql = "update paymenttable set visibility = 'false' where Order_ID_Pay = '"+orderID+"'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public static Payment searchCustomer(String Order_ID) throws ClassNotFoundException, SQLException {
        String sql = "Select Customer_ID From paymenttable where  visibility = 'ture' and Order_ID_Pay='" + Order_ID + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Payment payment = null;
        if (rst.next()) {
            payment = new Payment(rst.getString("Customer_ID"));
        }
        return payment;
    }

    public DefaultComboBoxModel getList(String Letter) throws SQLException, ClassNotFoundException {
        DefaultComboBoxModel modelCB = new DefaultComboBoxModel();

        //Create the query
        String sql = "select Order_ID_Pay from paymenttable where visibility = 'ture' and paymentType = 'Cash'and Order_ID_Pay like'" + Letter + "%'";
        //get the connection from DBConnection class
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        //Create statement
        Statement stm = conn.createStatement();

        //Execute the query
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {

            modelCB.addElement(rst.getInt("Order_ID_Pay"));

        }

        return modelCB;

    }

    public String[] giveAwayOrderInfro(String ID) throws SQLException, ClassNotFoundException {

        String[] datos = new String[5];
        //String sql = "select orderID,date,cust_ID from ordertable where visibility = 'ture' and orderID='" + ID + "'";
        String sql = "select customer_ID,paymentType,date,amount,name from paymenttable,customer where paymenttable.visibility = 'ture' and paymentType = 'Cash' and Order_ID_Pay='" + ID + "' and paymenttable.customer_ID = customer.cust_ID";
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {

            for (int i = 0; i < datos.length; i++) {

                datos[i] = rst.getString(i + 1);

            }

        }

        return datos;
    }

}
