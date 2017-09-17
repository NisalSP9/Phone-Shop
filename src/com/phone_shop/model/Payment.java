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
public class Payment {
    
    String Order_ID;
    String Customer_ID;
    String Payment_Type;
    String Date;
    double Amount;

    public Payment() {
    }

    public Payment(String Customer_ID) {
        
        this.Customer_ID = Customer_ID;
    }

    public Payment(String Order_ID, String Customer_ID, String Payment_Type, String Date, double Amount) {
        this.Order_ID = Order_ID;
        this.Customer_ID = Customer_ID;
        this.Payment_Type = Payment_Type;
        this.Date = Date;
        this.Amount = Amount;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String Order_ID) {
        this.Order_ID = Order_ID;
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public String getPayment_Type() {
        return Payment_Type;
    }

    public void setPayment_Type(String Payment_Type) {
        this.Payment_Type = Payment_Type;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    @Override
        public String toString(){
		return Order_ID;
	}
    
    
    
    
    
    
    
    
    
}
