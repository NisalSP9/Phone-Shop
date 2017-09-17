package com.phone_shop.model;

/**
 *
 * @author NisalSP9
 */
public class Customer {
    
    private int cust_ID;
    private String Name;
    private String Address;
    private String mobile_Number;
    private String land_Line;
    private String email;

    public Customer() {
    }

    public Customer(int NIC_Number, String Name, String Address, String mobile_Number, String land_Line, String email) {
        this.cust_ID = NIC_Number;
        this.Name = Name;
        this.Address = Address;
        this.mobile_Number = mobile_Number;
        this.land_Line = land_Line;
        this.email = email;
    }

   

    public int getCust_ID() {
        return cust_ID;
    }

    public void setCust_ID(int NIC_Number) {
        this.cust_ID = NIC_Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobile_Number() {
        return mobile_Number;
    }

    public void setMobile_Number(String mobile_Number) {
        this.mobile_Number = mobile_Number;
    }

    public String getLand_Line() {
        return land_Line;
    }

    public void setLand_Line(String land_Line) {
        this.land_Line = land_Line;
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
