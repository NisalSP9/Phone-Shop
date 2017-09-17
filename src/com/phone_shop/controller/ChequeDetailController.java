/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.ChequeDetail;
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
public class ChequeDetailController {

    public static int addChequeDetail(ChequeDetail chequeDetail) throws ClassNotFoundException, SQLException {
        String sql = "Insert into chequedetail values('" + chequeDetail.getOrder_ID() + "','" + chequeDetail.getCheque_Number() + "','" + chequeDetail.getBank() + "','" + chequeDetail.getReceived_Date() + "','" + chequeDetail.getCheque_Datel() + "','" + chequeDetail.getState() + "','" + chequeDetail.getAmount() + "','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);
    }

    public ResultSet updateChequePaymentTable(int offset) throws ClassNotFoundException, SQLException {

        String sql = "Select chequedetail.Order_ID,Customer_ID,Name,Cheque_Number,Bank,Received_Date,Cheque_Date,State,chequedetail.Amount From chequedetail,paymenttable,customer where chequedetail.visibility = 'ture' and chequedetail.Order_ID = paymenttable.Order_ID_Pay and paymenttable.Customer_ID = customer.cust_ID order by 1  desc Limit 20 offset "+offset+"";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

//    public ResultSet updateChequePaymentTable4All() throws ClassNotFoundException, SQLException {
//
//        String sql = "Select chequedetail.Order_ID,Customer_ID,Name,Cheque_Number,Bank,Received_Date,Cheque_Date,State,chequedetail.Amount From chequedetail,paymenttable,customer where chequedetail.visibility = 'ture' and chequedetail.Order_ID = paymenttable.Order_ID_Pay and paymenttable.Customer_ID = customer.cust_ID order by 1  ASC";
//        Connection conn = DBConnection.getInstance().getConnection();
//        PreparedStatement pst = conn.prepareStatement(sql);
//        ResultSet rst = pst.executeQuery();
//
//        return rst;
//
//    }

//
    public static int deleteChequeDetail(String orderID) throws ClassNotFoundException, SQLException {
        String sql = "update chequedetail set visibility = 'false' where order_ID = '"+orderID+"'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public static int updateChequeDetail(String ID) throws ClassNotFoundException, SQLException {
        String sql = "Update chequedetail set State = 'Okay' where Order_ID='" + ID + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public ResultSet updateChequePaymentAlertTable() throws ClassNotFoundException, SQLException {

        String sql = "Select chequedetail.Order_ID,Customer_ID,Name,Cheque_Number,Bank,Cheque_Date,State From chequedetail,paymenttable,customer where chequedetail.visibility = 'ture' and chequedetail.Order_ID = paymenttable.Order_ID_Pay and paymenttable.Customer_ID = customer.cust_ID and chequedetail.State='Pending' order by 6 asc";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

    public DefaultComboBoxModel getList(String Letter) throws SQLException, ClassNotFoundException {
        DefaultComboBoxModel modelCB = new DefaultComboBoxModel();

        //Create the query
        String sql = "select Order_ID from chequedetail where visibility = 'ture' and Order_ID like'" + Letter + "%'";
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

        String[] datos = new String[8];
        //String sql = "select orderID,date,cust_ID from ordertable where visibility = 'ture' and orderID='" + ID + "'";
        String sql = "select Cheque_Number,Bank,Received_Date,Cheque_Date,State,Amount,ordertable.cust_ID,name from chequedetail,ordertable,customer where chequedetail.visibility = 'ture' and Order_ID ='" + ID + "' and ordertable.orderID = chequedetail.order_ID and ordertable.orderID = customer.cust_ID";
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
