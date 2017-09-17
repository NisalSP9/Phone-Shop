/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.model;

import java.util.List;

/**
 *
 * @author NisalSP9
 */
public class Order {
    
    private String orderID;
    private String date;
    private String cus_NIC;
   

    public Order() {
    }

    public Order(String orderID, String cus_NIC,String date) {
        this.orderID = orderID;
        this.date = date;
        this.cus_NIC = cus_NIC;
    }

    

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCus_NIC() {
        return cus_NIC;
    }

    public void setCus_NIC(String cus_NIC) {
        this.cus_NIC = cus_NIC;
    }
    
     public String toString(){
		return orderID;
	}
    

    
    
    
    
    
}
