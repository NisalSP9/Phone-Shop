/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author NisalSP9
 */
public class OrderController {

    public static int addOrder(Order order) throws ClassNotFoundException, SQLException {
        String sql = "Insert into orderTable values('" + order.getOrderID() + "','" + order.getDate() + "','" + order.getCus_NIC() + "','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);
    }

    public static List<Order> getAllOrders() throws SQLException, ClassNotFoundException {
        //Create the query
        String sql = "select orderID,date,cust_ID from ordertable where visibility = 'true'";
        //get the connection from DBConnection class
        Connection conn = DBConnection.getInstance().getConnection();

        //Create statement
        Statement stm = conn.createStatement();

        //Execute the query
        ResultSet rst = stm.executeQuery(sql);

        List<Order> customerList = new ArrayList<>();
        //Read all customers from result set
        while (rst.next()) {
            Order order = new Order(rst.getString("orderID"), rst.getString("cust_ID"), rst.getString("date"));
            customerList.add(order);
        }

        return customerList;
    }


    public static int deleteOrder(String orderID) throws ClassNotFoundException, SQLException {
        //  String sql = "Update Customer set address='" + customer.getAddress() + "',mobile_Number='" + customer.getMobile_Number() + "',land_Line='" + customer.getLand_Line() + "',email='" + customer.getEmail() + "' where cust_ID='" + customer.getCust_ID() + "'";

        String sql = "update ordertable set visibility = 'false' where orderID = '" + orderID + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public ResultSet updateOrderTableALL(int offset) throws ClassNotFoundException, SQLException {

        String sql = "select orderID,date,customer.cust_ID,Name from ordertable,customer where ordertable.visibility = 'ture' and ordertable.cust_ID = customer.cust_ID order by 1  desc limit 29 offset " + offset + "";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

    public DefaultComboBoxModel getList(String Letter) throws SQLException, ClassNotFoundException {
        DefaultComboBoxModel modelCB = new DefaultComboBoxModel();

        //Create the query
        String sql = "select orderID from ordertable where visibility = 'ture' and orderID like '" + Letter + "%'";
        //get the connection from DBConnection class
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        //Create statement
        Statement stm = conn.createStatement();

        //Execute the query
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {

            modelCB.addElement(rst.getInt("orderID"));

        }

        return modelCB;

    }

    public String[] giveAwayOrderInfro(String ID) throws SQLException, ClassNotFoundException {

        String[] datos = new String[3];
        String sql = "select orderID,date,cust_ID from ordertable where visibility = 'ture' and orderID='" + ID + "'";
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
