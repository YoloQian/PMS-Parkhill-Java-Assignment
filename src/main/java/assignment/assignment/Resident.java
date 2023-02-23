/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

//public class Resident {
public class Resident extends User{
    private int residentID;
    private String name;
    //private String email;
    private String phone;
    private String unitNumber;
    
    //public Resident (int residentID, String name, String email, String phone, String unitNumber){
    public Resident (String username, String password, String email, int residentID, String name, String phone, String unitNumber){
        super (username, password, email);
        this.residentID = residentID;
        this.name = name;
        //this.email = email;
        this.phone= phone;
        this.unitNumber= unitNumber;
    }
    
    public int getResidentID(){
        return residentID;
    }
    
    public String getName(){
        return name;
    }
    
    //public String getEmail(){
    //    return email;
    //}
    
    public String getPhone(){
        return phone;
    }
    
    public String getUnitNumber(){
        return unitNumber;
    }
    
    public void setResidentID(int residentID){
        this.residentID = residentID;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    //public void setEmail(String email){
    //    this.email = email;
    //}
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setUnitNumber(String unitNumber){
        this.unitNumber = unitNumber;
    }
    
    public void viewProfile(){
        // Code to view profile
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
