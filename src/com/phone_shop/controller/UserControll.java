/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.controller;

import com.phone_shop.connection.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.phone_shop.model.User;
import java.sql.ResultSet;

/**
 *
 * @author NisalSP9
 */
public class UserControll {

    public int addUser(User user) throws SQLException, ClassNotFoundException {

        String sql = "Insert into user values('" + user.getUserName() + "','" + user.getPrivilage() + "','" + user.getPassword() + "','ture')";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);

    }

    public ResultSet showUsers() throws SQLException, ClassNotFoundException {

        String sql = "select user_name,privilage,password from user where visibility = 'ture'";

        Connection conn;
        conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        return rst;

    }

    public int deleteUser(String username) throws SQLException, ClassNotFoundException {

        String sql = "update user set visibility = 'false' where user_name = '" + username + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();

        return stm.executeUpdate(sql);

    }

    public User authUser(String userName, String password) throws ClassNotFoundException, SQLException {

        String sql = "select * from user where user_Name = '" + userName + "' and password = '" + password + "'";
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        User user = null;
        if (rst.next()) {
            user = new User(rst.getString("user_Name"), rst.getInt("privilage"), rst.getString("password"));
        }
        return user;

    }

}
