/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phone_shop.model;

/**
 *
 * @author aDMIN
 */
public class serviceDetail {
    
    private int serviceID;
    private String IMEI_no;
    private String brand;
    private String model;
    private String fault;
    private double price;
    private double discount;

    public serviceDetail() {
    }

    public serviceDetail(int serviceID, String IMEI_no, String brand, String model, String fault, double price, double discount) {
        this.serviceID = serviceID;
        this.IMEI_no = IMEI_no;
        this.brand = brand;
        this.model = model;
        this.fault = fault;
        this.price = price;
        this.discount = discount;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getIMEI_no() {
        return IMEI_no;
    }

    public void setIMEI_no(String IMEI_no) {
        this.IMEI_no = IMEI_no;
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

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
    
}
