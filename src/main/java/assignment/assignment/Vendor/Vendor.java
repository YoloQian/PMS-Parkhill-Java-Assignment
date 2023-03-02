/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment.Vendor;

import assignment.assignment.User;

public class Vendor extends User{
    private String vendorid;
    private String phone;
    private String unitnumber;

    public Vendor (int userId, String password, String role, String name, String email, String vendorid, String phone, String unitnumber){
        super (userId, password, role, name, email);
        this.vendorid = vendorid;
        this.phone = phone;
        this.unitnumber = unitnumber;
    }
    
    public String getVendorID(){
        return vendorid;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setVendorID(String vendorid){
        this.vendorid = vendorid;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public String getUnitnumber() {
        return unitnumber;
    }

    public void setUnitnumber(String unitnumber) {
        this.unitnumber = unitnumber;
    }
    
    public void viewProfile(){
        // Code to view profile
    }
    
    public void makePayment(){
        // Code to make payment
    }
    
    public void viewPaymentHistory(){
        // Code for check in method
    }
    
    public void logComplaints(){
        // Code to record incident
    }
}
