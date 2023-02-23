/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

//public class Vendor {
public class Vendor extends User{
    private String companyName;
    private String password;
    private String email;
    private String phone;
    private String service;
    
    //public Vendor (String companyName, String password, String email, String phone, String service){
    public Vendor (String username, String password, String email, String companyName, String phone, String service){
        super (username, password, email);
        this.companyName = companyName;
        this.password = password;
        //this.email = email;
        this.phone= phone;
        this.service= service;
    }
    
    public String getCompanyName(){
        return companyName;
    }
    
    public String password(){
        return password;
    }
    
    //public String getEmail(){
    //    return email;
    //}
    
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
    
    //public void setEmail(String email){
    //    this.email = email;
    //}
    
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
