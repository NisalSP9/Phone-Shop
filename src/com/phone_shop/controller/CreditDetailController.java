/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.CreditDetailModel;

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
public class CreditDetailController {

    public static int addCreditDetail(CreditDetailModel creditDetailModel) throws ClassNotFoundException, SQLException {
        String sql = "Insert into creditdetail values('" + creditDetailModel.getOrder_ID() + "','" + creditDetailModel.getReceived_Date() + "','" + creditDetailModel.getState() + "','" + creditDetailModel.getAmount() + "','" + creditDetailModel.getBalance() + "','" + creditDetailModel.getReceived_Payment() + "','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);
    }

    public ResultSet updateCreditPaymentTable(int offset) throws ClassNotFoundException, SQLException {

        String sql = "Select creditdetail.Order_ID,Customer_ID,Name,Received_Date,State,creditdetail.Amount,Balance_Payment,Received_Payment From creditdetail,paymenttable,customer where creditdetail.Order_ID = paymenttable.Order_ID_pay and paymenttable.Customer_ID = customer.cust_ID order by 1  desc Limit 20 offset " + offset + "";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

    public static int updateCreditDetail(CreditDetailModel creditDetail) throws ClassNotFoundException, SQLException {
        String sql = "Update creditdetail set State='" + creditDetail.getState() + "',Balance_Payment='" + creditDetail.getBalance() + "',Received_Payment='" + creditDetail.getReceived_Payment() + "' where Order_ID='" + creditDetail.getOrder_ID() + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public static int deleteCreditDetail(String orderID) throws ClassNotFoundException, SQLException {

        String sql = "Update creditdetail set visibility = 'false' where Order_ID = '" + orderID + "'";

        //String sql="Delete From creditdetail where Order_ID='"+orderID+"'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public DefaultComboBoxModel getList(String Letter) throws SQLException, ClassNotFoundException {
        DefaultComboBoxModel modelCB = new DefaultComboBoxModel();

        //Create the query
        String sql = "select Order_ID from creditdetail where visibility = 'ture' and Order_ID like'" + Letter + "%'";
        //get the connection from DBConnection class
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        //Create statement
        Statement stm = conn.createStatement();

        //Execute the query
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {

            modelCB.addElement(rst.getInt("Order_ID"));

        }

        return modelCB;

    }

    public String[] giveAwayOrderInfro(String ID) throws SQLException, ClassNotFoundException {

        String[] datos = new String[7];
        //String sql = "select orderID,date,cust_ID from ordertable where visibility = 'ture' and orderID='" + ID + "'";
        String sql = "select Received_Date,State,Amount,Balance_Payment,Received_Payment,ordertable.cust_ID,name from creditdetail,ordertable,customer where creditdetail.visibility = 'ture' and Order_ID ='" + ID + "' and ordertable.orderID = creditdetail.order_ID and ordertable.orderID = customer.cust_ID";
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
