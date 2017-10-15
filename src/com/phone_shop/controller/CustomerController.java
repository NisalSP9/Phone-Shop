package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author NisalSP9
 */
public class CustomerController {

    //add customers to database
    public static int addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        String sql = "Insert into customer values('" + customer.getCust_ID() + "','" + customer.getName() + "','" + customer.getAddress() + "','" + customer.getMobile_Number() + "','" + customer.getLand_Line() + "','" + customer.getEmail() + "','true')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);
    }

    //search customers by id
    public static Customer searchCustomer(String cust_ID) throws ClassNotFoundException, SQLException {

        String sql = "Select cust_ID,Name,Address,mobile_Number,land_Line,email From customer where visibility = 'true' and cust_ID ='" + cust_ID + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Customer customer = null;
        if (rst.next()) {
            customer = new Customer(rst.getInt("cust_ID"), rst.getString("Name"), rst.getString("Address"), rst.getString("mobile_Number"), rst.getString("land_Line"), rst.getString("email"));
        }

        return customer;
    }

    public static int updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        String sql = "Update customer set address='" + customer.getAddress() + "',mobile_Number='" + customer.getMobile_Number() + "',land_Line='" + customer.getLand_Line() + "',email='" + customer.getEmail() + "' where cust_ID='" + customer.getCust_ID() + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public static int deleteCustomer(String NIC_Number) throws ClassNotFoundException, SQLException {
        String sql = "Update customer set visibility='false' where cust_ID='" + NIC_Number + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);
    }

    //fill manage customer open table
    public ResultSet customerListWithOffset(int offset) throws SQLException, ClassNotFoundException {

        String sql = "select cust_ID,Name,Address,mobile_Number,land_Line,email from customer where visibility = 'true' order by 1 desc limit 26 offset " + offset + "";

        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }

    public DefaultComboBoxModel getList(String Letter) throws SQLException, ClassNotFoundException {
        DefaultComboBoxModel modelCB = new DefaultComboBoxModel();

        //Create the query
        String sql = "select cust_ID,Name from customer where visibility = 'true' and Name like '" + Letter + "%'";

        //get the connection from DBConnection class
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        //Create statement
        Statement stm = conn.createStatement();

        //Execute the query
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {

            modelCB.addElement(rst.getInt("cust_ID") + " " + rst.getString("Name"));

        }

        return modelCB;

    }

    public String[] giveAwayOrderInfro(String ID) throws SQLException, ClassNotFoundException {

        String[] datos = new String[6];
        String sql = "select cust_ID,Name,Address,mobile_Number,land_Line,email from customer where visibility = 'true' and cust_ID ='" + ID + "'";

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
