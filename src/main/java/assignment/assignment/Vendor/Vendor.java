/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment.Vendor;

//public class Vendor {

import assignment.assignment.User;

public class Vendor extends User{
    private String companyName;
    private String password;
    private String phone;
    private String service;

    public Vendor (int userId, String password, String role, String name, String email, String companyName, String phone, String service){
        super (userId, password, role, name, email);
        this.companyName = companyName;
        this.password = password;
        this.phone= phone;
        this.service= service;
    }
    
    public String getCompanyName(){
        return companyName;
    }
    
    public String password(){
        return password;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getService(){
        return service;
    }
    
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setService(String service){
        this.service = service;
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
