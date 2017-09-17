package com.phone_shop.model;

import java.util.List;

/**
 *
 * @author NisalSP9
 */
public class OrderDetail {
    
    private String orderID;
    private String itemCode;
    private String name;
    private double qty;
    private double unitPrice;
    private double discountPerSell;
    private double discountPerItem;
    private double sellingPrice;
    
    private List<OrderDetail> orderDetailList;

    public OrderDetail() {
    }

    public OrderDetail(String orderID, String itemCode, String name, double qty, double unitPrice, double discountPerSell, double discountPerItem, double sellingPrice) {
        this.orderID = orderID;
        this.itemCode = itemCode;
        this.name = name;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.discountPerSell = discountPerSell;
        this.discountPerItem = discountPerItem;
        this.sellingPrice = sellingPrice;
    }

    public OrderDetail(String orderID, String itemCode, String name, double qty, double unitPrice, double discountPerSell, double discountPerItem, double sellingPrice, List<OrderDetail> orderDetailList) {
        this.orderID = orderID;
        this.itemCode = itemCode;
        this.name = name;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.discountPerSell = discountPerSell;
        this.discountPerItem = discountPerItem;
        this.sellingPrice = sellingPrice;
        this.orderDetailList = orderDetailList;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountPerSell() {
        return discountPerSell;
    }

    public void setDiscountPerSell(double discountPerSell) {
        this.discountPerSell = discountPerSell;
    }

    public double getDiscountPerItem() {
        return discountPerItem;
    }

    public void setDiscountPerItem(double discountPerItem) {
        this.discountPerItem = discountPerItem;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    
    
    
    
    
    
}
