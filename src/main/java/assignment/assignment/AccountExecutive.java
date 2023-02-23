/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

/**
 *
 * @author user
 */
public class AccountExecutive {      
    private int AccountExeID;
    private String email;
    private String name;
    private String phone;
    
    public AccountExecutive(int AccountExeID, String email, String name, String phone){
        this.AccountExeID = AccountExeID;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
    
    public int getAccountExeID() {
        return AccountExeID;
    }
    
    public void setAccountExeID(int AccountExeID) {
        this.AccountExeID = AccountExeID;
    }
    
    public String getemail() {
        return email;
    }
    
    public void setemail(String email) {
        this.email = email;
    }
    
    public String getname() {
        return name;
    }
    
    public void setname(String name) {
        this.name = name;
    }
    
    public String getphone() {
        return phone;
    }
    
    public void setphone(String phone) {
        this.phone = phone;
    }
    
    public void issueInvoices(){
        
    }
    
    public void recordPayment(){
        
    }
    
    public void viewOutstandingFees(){
        
    }
    
}
