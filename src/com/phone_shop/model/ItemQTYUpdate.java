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
public class ItemQTYUpdate {
    private String itemCode;
    private double qtyOnHand;

    public ItemQTYUpdate() {
    }

    public ItemQTYUpdate(String itemCode, double qtyOnHand) {
        this.itemCode = itemCode;
        this.qtyOnHand = qtyOnHand;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public double getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(double qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
    
    
    
}
