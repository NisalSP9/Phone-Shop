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
public class CreditDetailModel {
    
    String Order_ID;
    String Received_Date;
    String State;
    double Amount;
    double Balance;
    double Received_Payment;

    public CreditDetailModel() {
    }

    public CreditDetailModel(String Order_ID,String State, double Balance, double Received_Payment) {
        this.Order_ID = Order_ID;
        this.State = State;
        this.Balance = Balance;
        this.Received_Payment = Received_Payment;
    }

    
    public CreditDetailModel(String Order_ID, String Received_Date, String State, double Amount, double Balance, double Received_Payment) {
        this.Order_ID = Order_ID;
        this.Received_Date = Received_Date;
        this.State = State;
        this.Amount = Amount;
        this.Balance = Balance;
        this.Received_Payment = Received_Payment;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String Order_ID) {
        this.Order_ID = Order_ID;
    }

    public String getReceived_Date() {
        return Received_Date;
    }

    public void setReceived_Date(String Received_Date) {
        this.Received_Date = Received_Date;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public double getReceived_Payment() {
        return Received_Payment;
    }

    public void setReceived_Payment(double Received_Payment) {
        this.Received_Payment = Received_Payment;
    }

   @Override
        public String toString(){
		return Order_ID;
	}
    
    
    
    
    
}
