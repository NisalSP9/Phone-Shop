/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.model;

/**
 *
 * @author NisalSP9
 */
public class User {
    
    private String userName;
    private int privilage;
    private String password;

    public User() {
    }
    
    

    public User(String userName, int privilage, String password) {
        this.userName = userName;
        this.privilage = privilage;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPrivilage() {
        return privilage;
    }

    public void setPrivilage(int privilage) {
        this.privilage = privilage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
