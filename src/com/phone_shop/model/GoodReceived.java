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
public class GoodReceived {
    
    
    int gRN_ID;
    String date;
    String supplierID;

    public GoodReceived() {
    }

    public GoodReceived(int gRN_ID, String date, String supplierID) {
        this.gRN_ID = gRN_ID;
        this.date = date;
        this.supplierID = supplierID;
    }

    public int getgRN_ID() {
        return gRN_ID;
    }

    public void setgRN_ID(int gRN_ID) {
        this.gRN_ID = gRN_ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String toString(){
    
        return Integer.toString(gRN_ID);
    
    
    }
    
    
    
    
}
