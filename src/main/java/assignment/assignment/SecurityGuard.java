/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

//public class SecurityGuard {
public class SecurityGuard extends User{
    private int guardID;
    private String name;
    //private String email;
    private String phone;
    
    //public SecurityGuard (int guardID, String name, String email, String phone){
    public SecurityGuard (String username, String password, String email, int guardID, String name, String phone){
        super (username, password, email);
        this.guardID = guardID;
        this.name = name;
        //this.email = email;
        this.phone= phone;
    }
    
    public int getGuardID(){
        return guardID;
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
    
    public void setGuardID(int guardID){
        this.guardID = guardID;
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
    
    public void searchVisitorPass(){
        // Code to search visitor pass
    }
    
    public void recordVisitor(){
        // Code to record visitor
    }
    
    public void checkIn(){
        // Code for check in method
    }
    
    public void recordIncident(){
        // Code to record incident
    }
}
