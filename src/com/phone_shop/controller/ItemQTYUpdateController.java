/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import com.phone_shop.model.ItemQTYUpdate;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NisalSP9
 */
public class ItemQTYUpdateController {
    
    public static int updateQTY(ItemQTYUpdate itemQTYUpdate)throws ClassNotFoundException,SQLException{
		String sql="update item set qty_On_Hand='"+itemQTYUpdate.getQtyOnHand()+"' where item_Code='"+itemQTYUpdate.getItemCode()+"'";
		Connection conn=DBConnection.getInstance().getConnection();
		Statement stm=conn.createStatement();
		return stm.executeUpdate(sql);

	}
    
    
    
}
