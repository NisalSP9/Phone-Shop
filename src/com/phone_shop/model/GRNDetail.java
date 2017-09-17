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
public class GRNDetail {
    
    int gRN_ID;
    String description;
    double unit_Price;
    double qty;
    double discount_Per_Stock;
    double discount_Per_Item;
    double price;
    private List<GRNDetail> gRNDetailList;
    
    
    public GRNDetail() {
    }

    public GRNDetail(int gRN_ID, String description, double unit_Price, double qty, double discount_Per_Stock, double discount_Per_Item, double price) {
        this.gRN_ID = gRN_ID;
        this.description = description;
        this.unit_Price = unit_Price;
        this.qty = qty;
        this.discount_Per_Stock = discount_Per_Stock;
        this.discount_Per_Item = discount_Per_Item;
        this.price = price;
    }

    public GRNDetail(int gRN_ID, String description, double unit_Price, double qty, double discount_Per_Stock, double discount_Per_Item, double price, List<GRNDetail> gRNDetailList) {
        this.gRN_ID = gRN_ID;
        this.description = description;
        this.unit_Price = unit_Price;
        this.qty = qty;
        this.discount_Per_Stock = discount_Per_Stock;
        this.discount_Per_Item = discount_Per_Item;
        this.price = price;
        this.gRNDetailList = gRNDetailList;
    }

    public int getgRN_ID() {
        return gRN_ID;
    }

    public void setgRN_ID(int gRN_ID) {
        this.gRN_ID = gRN_ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnit_Price() {
        return unit_Price;
    }

    public void setUnit_Price(double unit_Price) {
        this.unit_Price = unit_Price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getDiscount_Per_Stock() {
        return discount_Per_Stock;
    }

    public void setDiscount_Per_Stock(double discount_Per_Stock) {
        this.discount_Per_Stock = discount_Per_Stock;
    }

    public double getDiscount_Per_Item() {
        return discount_Per_Item;
    }

    public void setDiscount_Per_Item(double discount_Per_Item) {
        this.discount_Per_Item = discount_Per_Item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<GRNDetail> getgRNDetailList() {
        return gRNDetailList;
    }

    public void setgRNDetailList(List<GRNDetail> gRNDetailList) {
        this.gRNDetailList = gRNDetailList;
    }
    
    
    
    
    
}
