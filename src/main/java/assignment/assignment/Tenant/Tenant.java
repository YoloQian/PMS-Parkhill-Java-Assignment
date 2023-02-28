/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment.Tenant;
import assignment.assignment.User;

public class Tenant extends User{
    private String residentID;
    private String phone;
    private String unitNumber;

    public Tenant (int userId, String password, String role, String name, String email, String residentID, String phone, String unitNumber){
        super (userId, password, role, name, email);
        this.residentID = residentID;
        this.phone= phone;
        this.unitNumber= unitNumber;
    }
    
    public String getResidentID(){
        return residentID;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getUnitNumber(){
        return unitNumber;
    }
    
    public void setResidentID(String residentID){
        this.residentID = residentID;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setUnitNumber(String unitNumber){
        this.unitNumber = unitNumber;
    }
    
    public void viewProfile(){
        new TenantViewProfile().setVisible(true);
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
