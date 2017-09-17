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
public class Item {
    
    private int itemCode;   
    private String name; 
    private String description;
    private String brand;
    private String model;
    private double purchase_price_pre_pack;
    private double purchase_price_pre_peace;
    private double selling_price_pre_pack;
    private double selling_price_pre_peace;
    private String warranty;    
    private int reorder_Level;
    private double qty_On_Hand;

    public Item() {
    }

    public Item(int itemCode, String name, String description, String brand, String model, double purchase_price_pre_pack, double purchase_price_pre_peace, double selling_price_pre_pack, double selling_price_pre_peace, String warranty, int reorder_Level, double qty_On_Hand) {
        this.itemCode = itemCode;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.model = model;
        this.purchase_price_pre_pack = purchase_price_pre_pack;
        this.purchase_price_pre_peace = purchase_price_pre_peace;
        this.selling_price_pre_pack = selling_price_pre_pack;
        this.selling_price_pre_peace = selling_price_pre_peace;
        this.warranty = warranty;
        this.reorder_Level = reorder_Level;
        this.qty_On_Hand = qty_On_Hand;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPurchase_price_pre_pack() {
        return purchase_price_pre_pack;
    }

    public void setPurchase_price_pre_pack(double purchase_price_pre_pack) {
        this.purchase_price_pre_pack = purchase_price_pre_pack;
    }

    public double getPurchase_price_pre_peace() {
        return purchase_price_pre_peace;
    }

    public void setPurchase_price_pre_peace(double purchase_price_pre_peace) {
        this.purchase_price_pre_peace = purchase_price_pre_peace;
    }

    public double getSelling_price_pre_pack() {
        return selling_price_pre_pack;
    }

    public void setSelling_price_pre_pack(double selling_price_pre_pack) {
        this.selling_price_pre_pack = selling_price_pre_pack;
    }

    public double getSelling_price_pre_peace() {
        return selling_price_pre_peace;
    }

    public void setSelling_price_pre_peace(double selling_price_pre_peace) {
        this.selling_price_pre_peace = selling_price_pre_peace;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public int getReorder_Level() {
        return reorder_Level;
    }

    public void setReorder_Level(int reorder_Level) {
        this.reorder_Level = reorder_Level;
    }

    public double getQty_On_Hand() {
        return qty_On_Hand;
    }

    public void setQty_On_Hand(double qty_On_Hand) {
        this.qty_On_Hand = qty_On_Hand;
    }

   
    
}
