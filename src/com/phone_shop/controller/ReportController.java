/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NisalSP9
 */
public class ReportController {

    public ResultSet fastMovingItem() throws SQLException, ClassNotFoundException {

        String sql = "SELECT description,sum(qty) as Total_QTY FROM phone_shop.orderdetail where visibility = 'ture' group by description order by Total_QTY desc limit 10";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }

    public ResultSet mostVaulebleItem() throws SQLException, ClassNotFoundException {

        String sql = "SELECT Description,max(Unit_Price)*sum(qty) as Total_Value FROM phone_shop.orderdetail where visibility = 'ture' group by Description order by Total_Value desc  limit 10";

        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }
    
    public ResultSet mostValuableCustomer() throws SQLException, ClassNotFoundException {

        String sql = "SELECT Name,ordertable.cust_ID as Customer_ID, count(orderID) as Number_Of_Orders FROM phone_shop.ordertable,phone_shop.customer where ordertable.cust_ID = customer.cust_ID group by customer.cust_ID order by Number_Of_Orders desc limit 10";

        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    } 
    
 
    
    public ResultSet highestCreditHolder() throws SQLException, ClassNotFoundException {

        String sql = "SELECT ordertable.cust_ID,name,sum(Balance_Payment) as Total_Balance_Payment FROM phone_shop.creditdetail,phone_shop.ordertable,phone_shop.customer where Order_ID = orderID && ordertable.cust_ID = customer.cust_ID group by ordertable.cust_ID order by Total_Balance_Payment desc;";

        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }
    
    public ResultSet mostChequeReceivingBank() throws SQLException, ClassNotFoundException {

        String sql = "SELECT Bank,count(distinct Order_ID) as Total_Cheque FROM phone_shop.chequedetail where visibility = 'ture' group by bank limit 10;";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }
    
    public ResultSet incomeOfTheDayForAllPayments(String date) throws SQLException, ClassNotFoundException {

        String sql = "SELECT paymentType, sum(Amount) as total FROM  phone_shop.paymenttable where date like '"+date+"%' group by paymentType;";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }
    
    public ResultSet incomeOfTheDayForAllPaymentsRC(String date) throws SQLException, ClassNotFoundException {

        String sql = "SELECT paymentType, sum(Amount) as total FROM  phone_shop.paymenttable where date like '"+date+"%' and customer_ID = 0 group by paymentType;";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }

    public ResultSet incomeOfTheDayForAllPaymentsWS(String date) throws SQLException, ClassNotFoundException {
       String sql = "SELECT paymentType, sum(Amount) as total FROM  phone_shop.paymenttable where date like '"+date+"%' and customer_ID != 0 group by paymentType;";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }

}


