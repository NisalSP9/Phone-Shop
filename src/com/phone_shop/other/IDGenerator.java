/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phone_shop.other;

import com.phone_shop.connection.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NisalSP9
 */
public class IDGenerator {
    public static String getNextId(String tableName, String columnName) throws ClassNotFoundException, SQLException {
           
        String sql = "select " + columnName + " from " + tableName + " order by 1  ASC  limit 1 ";
        
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery(sql);

        if (rst.next()){
        String lastId = rst.getString(1);

        String nextId = "";

        int num = Integer.parseInt(lastId);
            
            num--;
           nextId = num+"";
        
        
            return nextId;
        
        
        }else{
            
           return 999999 + "";
            
            
        }
     
}
}