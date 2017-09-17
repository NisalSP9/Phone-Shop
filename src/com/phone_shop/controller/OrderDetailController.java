/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NisalSP9
 */
public class OrderDetailController {

    public static int addOrderDetail(OrderDetail orderDetail) throws ClassNotFoundException, SQLException {
        String sql = "Insert into orderDetail values('" + orderDetail.getOrderID() + "','" + orderDetail.getItemCode() + "','" + orderDetail.getName() + "','" + orderDetail.getQty() + "','" + orderDetail.getUnitPrice() + "','" + orderDetail.getDiscountPerSell() + "','" + orderDetail.getDiscountPerItem() + "','" + orderDetail.getSellingPrice() + "','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);
    }

    public ResultSet updateItemInOrderTable(String OrderID) throws ClassNotFoundException, SQLException {

        String sql = "Select Item_Code,Description,Unit_Price,qty,Discount_Per_Sell,Discount_Per_Item,Selling_Price From orderdetail where visibility = 'ture' and orderID = '" + OrderID + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

    public static int deleteOrderDetail(String orderID) throws ClassNotFoundException, SQLException {
        String sql = "update orderDetail set visibility = 'false' where orderID ='" + orderID + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

}
