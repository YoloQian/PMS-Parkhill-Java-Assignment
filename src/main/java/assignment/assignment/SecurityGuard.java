/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

//public class SecurityGuard {
public class SecurityGuard extends User {

    private String phone;
    private String securityGuardID;

    public SecurityGuard(String userID, String password, String name, String email, String role, String securityGuardID, String phone) {
        super(userID, password, name, email, role);
        this.phone = phone;
        this.securityGuardID = securityGuardID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecurityGuardID() {
        return securityGuardID;
    }

    public void setSecurityGuardID(String securityGuardID) {
        this.securityGuardID = securityGuardID;
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
