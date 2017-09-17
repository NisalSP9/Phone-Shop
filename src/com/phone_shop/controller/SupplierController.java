/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.Supplier;
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
public class SupplierController {

    public static int addSupplier(Supplier supplier) throws ClassNotFoundException, SQLException {
        String sql = "Insert into supplier values('" + supplier.getSupID() + "','" + supplier.getName() + "','" + supplier.getDiscription() + "','" + supplier.getAddress() + "','" + supplier.getMobileNumber() + "','" + supplier.getLandLineNumber() + "','" + supplier.getEmail() + "','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);

    }

    public DefaultComboBoxModel getList(String Letter) throws SQLException, ClassNotFoundException {
        DefaultComboBoxModel modelCB = new DefaultComboBoxModel();
        
            //Create the query
            String sql = "select Supplier_ID,Name from supplier where visibility = 'ture' and Name like '" + Letter + "%'";

            //get the connection from DBConnection class
            Connection conn;
            conn = DBConnection.getInstance().getConnection();
            //Create statement
            Statement stm = conn.createStatement();

            //Execute the query
            ResultSet rst = stm.executeQuery(sql);

            while (rst.next()) {

                modelCB.addElement(rst.getInt("Supplier_ID")+" "+rst.getString("Name"));

            }

        

        return modelCB;

    }

    public String[] giveAwayOrderInfro(String ID) throws SQLException, ClassNotFoundException {

        String[] datos = new String[7];
        String sql = "select Supplier_ID,Name,Discription,Address,Mobile_Number,Land_Line_Number,email from supplier where visibility = 'ture' and Supplier_ID ='" + ID + "'";

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

    public static List<Supplier> getAllSuppliers() throws SQLException, ClassNotFoundException {
        //Create the query
        String sql = "select Supplier_ID,Name,Discription,Address,Mobile_Number,Land_Line_Number,email from supplier where visibility = 'ture'";
        //get the connection from DBConnection class
        Connection conn = DBConnection.getInstance().getConnection();

        //Create statement
        Statement stm = conn.createStatement();

        //Execute the query
        ResultSet rst = stm.executeQuery(sql);

        List<Supplier> SupplierList = new ArrayList<Supplier>();
        //Read all customers from result set
        while (rst.next()) {
            Supplier supplier = new Supplier(rst.getInt("Supplier_ID"), rst.getString("Name"), rst.getString("Discription"), rst.getString("Address"), rst.getString("Mobile_Number"), rst.getString("Land_Line_Number"), rst.getString("email"));
            SupplierList.add(supplier);
        }

        return SupplierList;
    }

    public static Supplier searchSupplier(String supID) throws ClassNotFoundException, SQLException {
        String sql = "Select Supplier_ID,Name,Discription,Address,Mobile_Number,Land_Line_Number,email From supplier where visibility = 'ture' and Supplier_ID='" + supID + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Supplier supplier = null;
        if (rst.next()) {
            supplier = new Supplier(rst.getInt("Supplier_ID"), rst.getString("Name"), rst.getString("discription"), rst.getString("Address"), rst.getString("Mobile_Number"), rst.getString("Land_Line_Number"), rst.getString("email"));
        }
        return supplier;
    }

    public static int updateSupplier(Supplier supplier) throws ClassNotFoundException, SQLException {
        String sql = "Update supplier set Name='" + supplier.getName() + "',discription='" + supplier.getDiscription() + "',Address='" + supplier.getAddress() + "',Mobile_Number='" + supplier.getMobileNumber() + "',Land_Line_Number='" + supplier.getLandLineNumber() + "',email='" + supplier.getEmail() + "' where Supplier_ID='" + supplier.getSupID() + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public static int deleteSupplier(String Supplier_ID) throws ClassNotFoundException, SQLException {
        String sql = "Update supplier set visibility = 'false' where Supplier_ID='" +Supplier_ID+ "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);
    }

    public ResultSet viewAllTable(int offset) throws ClassNotFoundException, SQLException {

        String sql = "Select Supplier_ID,Name,Discription,Address,Mobile_Number,Land_Line_Number,email From supplier where visibility = 'ture' limit 27 offset " + offset + "";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();

        return rst;

    }

}
