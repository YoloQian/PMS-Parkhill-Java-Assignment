/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

/**
 *
 * @author user
 */
public class AdminExecutive {
    private int adminID;
    private String email;
    private String name;
    private String phone;
    
    public AdminExecutive(int adminID, String email, String name, String phone){
        this.adminID = adminID;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
    
    public int getadminID() {
        return adminID;
    }
    
    public void setadminID(int adminID) {
        this.adminID = adminID;
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
    
    public void manageUnits(){
        
    }
    
    public void manageResidents(){
        
    }
    
    public void manageComplaints(){
        
    }
    
    public void manageEmployees(){
        
    }
    
    public void manageFacilities(){
        
    }
    
    public void manageFacilityBookings(){
        
    }
    
}
