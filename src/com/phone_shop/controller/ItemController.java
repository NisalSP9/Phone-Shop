/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.Item;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author NisalSP9
 */
//"Delete From Customer where nic_Number='"+NIC_Number+"'"
public class ItemController {

    //add items to database
    public static int addItems(Item item) throws ClassNotFoundException, SQLException {

        String sql = "Insert into item values('" + item.getItemCode() + "','" + item.getName() + "','" + item.getDescription() + "','" + item.getBrand() + "','" + item.getModel() + "','" + item.getPurchase_price_pre_pack() + "','" + item.getPurchase_price_pre_peace() + "','" + item.getSelling_price_pre_pack() + "','" + item.getSelling_price_pre_peace() + "','" + item.getWarranty() + "','" + item.getReorder_Level() + "','" + item.getQty_On_Hand() + "','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    //update item infor
    public static int updateItem(Item item) throws ClassNotFoundException, SQLException {
        String sql = "Update item set name = '" + item.getName() + "',description = '" + item.getDescription() + "',brand = '" + item.getBrand() + "',model = '" + item.getModel() + "',purchase_price_pre_pack = '" + item.getPurchase_price_pre_pack() + "',purchase_price_pre_peace = '" + item.getPurchase_price_pre_peace() + "',selling_price_pre_pack='" + item.getSelling_price_pre_pack() + "',selling_price_pre_peace = '" + item.getSelling_price_pre_peace() + "',warranty = '" + item.getWarranty() + "',reorder_Level = '" + item.getReorder_Level() + "',qty_On_Hand='" + item.getQty_On_Hand() + "' where item_code ='" + item.getItemCode() + "' ";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    //delete item infor
    public static int deleteItem(String item_code) throws ClassNotFoundException, SQLException {
        String sql = "Update item set visibility = 'false' where item_code ='" + item_code + "' ";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        return stm.executeUpdate(sql);

    }

    public DefaultComboBoxModel getList(String Letter) throws SQLException, ClassNotFoundException {
        DefaultComboBoxModel modelCB = new DefaultComboBoxModel();

        //Create the query
        String sql = "select item_Code,name from item where visibility = 'ture' and Name like '" + Letter + "%'";

        //get the connection from DBConnection class
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        //Create statement
        Statement stm = conn.createStatement();

        //Execute the query
        ResultSet rst = stm.executeQuery(sql);

        while (rst.next()) {

            modelCB.addElement(rst.getInt("item_Code") + " " + rst.getString("Name"));

        }

        return modelCB;

    }

    public String[] giveAwayOrderInfro(String ID) throws SQLException, ClassNotFoundException {

        String[] datos = new String[12];
        String sql = "select item_Code,name,description,brand,model,purchase_price_pre_pack,purchase_price_pre_peace,selling_price_pre_pack,selling_price_pre_peace,warranty,reorder_Level,qty_On_Hand from item  where visibility = 'ture' and item_Code ='" + ID + "'";

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

    //fill manage item open table
    public static ResultSet itemListWithOffset(int offset) throws SQLException, ClassNotFoundException {

        String sql = "select item_Code,name,description,brand,model,purchase_price_pre_pack,purchase_price_pre_peace,selling_price_pre_pack,selling_price_pre_peace,warranty,reorder_Level,qty_On_Hand from item where visibility = 'ture' order by 1 desc limit 27 offset " + offset + "";

        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }

    public ResultSet updateItemReorderTable() throws SQLException, ClassNotFoundException {
        String sql = "select item_Code,name,brand,model,reorder_Level,qty_On_Hand from item where visibility = 'ture' and reorder_Level >= qty_On_Hand";
        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;
    }

}
