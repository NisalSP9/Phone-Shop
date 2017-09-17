/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.serviceDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author aDMIN
 */
public class ServiceDetailController {
    
    public static int addServiceDetails(serviceDetail serviceDetail) throws ClassNotFoundException, SQLException {
        String sql = "Insert into servicedetails values('" + serviceDetail.getServiceID() + "','" + serviceDetail.getIMEI_no() + "','" + serviceDetail.getBrand() + "','"+serviceDetail.getModel()+"','"+serviceDetail.getFault()+"','"+serviceDetail.getPrice()+"','"+serviceDetail.getDiscount()+"','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);
    }
    
    public static ResultSet updateItemInOrderTable(String OrderID) throws ClassNotFoundException, SQLException {

        String sql = "Select * From servicedetails where visibility = 'ture' and serviceID = '" + OrderID + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }
}
