/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment.Tenant;
import assignment.assignment.User;

public class Tenant extends User{
    private String tenantID;
    private String phone;
    private String unitNumber;

    
    
    public Tenant (int userId, String password, String role, String name, String email, String tenantID, String phone, String unitNumber){
        super (userId, password, role, name, email);
        this.tenantID = tenantID;
        this.phone= phone;
        this.unitNumber= unitNumber;
    }
    
    public String getTenantID(){
        return tenantID;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getUnitNumber(){
        return unitNumber;
    }
    
    public void setTenantID(String tenantID){
        this.tenantID = tenantID;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setUnitNumber(String unitNumber){
        this.unitNumber = unitNumber;
    }
    
    public void viewProfile(User user){
        new TenantViewProfile(user).setVisible(true);
    }
    
    public void makePayment(){
        // Code to make payment
    }
    
    public void viewPaymentHistory(){
        // Code to view payment history
    }
    
    public void bookFacility(){
        // Code to book facility
    }
    
    public void applyVisitorPass(){
        // Code to apply visitor pass
    }
    
    public void logComplaints(){
        // Code to log complaints
    }
    
    
}
