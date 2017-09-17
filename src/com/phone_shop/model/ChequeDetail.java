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
public class ChequeDetail {
    
    String Order_ID;
    String Cheque_Number;
    String Bank;
    String Received_Date;
    String Cheque_Datel;
    String State;
    double Amount;

    public ChequeDetail() {
    }

    public ChequeDetail(String Order_ID, String Cheque_Number, String Bank, String Received_Date, String Cheque_Datel, String State, double Amount) {
        this.Order_ID = Order_ID;
        this.Cheque_Number = Cheque_Number;
        this.Bank = Bank;
        this.Received_Date = Received_Date;
        this.Cheque_Datel = Cheque_Datel;
        this.State = State;
        this.Amount = Amount;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String Order_ID) {
        this.Order_ID = Order_ID;
    }

    public String getCheque_Number() {
        return Cheque_Number;
    }

    public void setCheque_Number(String Cheque_Number) {
        this.Cheque_Number = Cheque_Number;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    public String getReceived_Date() {
        return Received_Date;
    }

    public void setReceived_Date(String Received_Date) {
        this.Received_Date = Received_Date;
    }

    public String getCheque_Datel() {
        return Cheque_Datel;
    }

    public void setCheque_Datel(String Cheque_Datel) {
        this.Cheque_Datel = Cheque_Datel;
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
    @Override
        public String toString(){
		return Order_ID;
	}
    
    
    
}
