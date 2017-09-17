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
public class Supplier {
    
    int supID;
    String Name;
    String Discription;
    String address;
    String mobileNumber;
    String landLineNumber;
    String email;

    public Supplier() {
    }

    public Supplier(int supID, String Name, String Discription, String address, String mobileNumber, String landLineNumber, String email) {
        this.supID = supID;
        this.Name = Name;
        this.Discription = Discription;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.landLineNumber = landLineNumber;
        this.email = email;
    }

    public int getSupID() {
        return supID;
    }

    public void setSupID(int supID) {
        this.supID = supID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        this.Discription = discription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public void setLandLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
        public String toString(){
		return Name;
	}
    
    
    
    
    
    
}
