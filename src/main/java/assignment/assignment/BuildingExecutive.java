/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

/**
 *
 * @author user
 */
public class BuildingExecutive {
    private int buildingExeID;
    private String email;
    private String name;
    private String phone;
    
    public BuildingExecutive(int buildingExeID, String email, String name, String phone){
        this.buildingExeID = buildingExeID;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
    
    public int getbuildingExeID() {
        return buildingExeID;
    }
    
    public void setbuildingExeID(int buildingExeID) {
        this.buildingExeID = buildingExeID;
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
    
    public void assignJobs(){
        
    }
    
    public void viewAssignedJobs(){
        
    }
    
    public void updateComplaintStatus(){
        
    }
    
    public void manageSecurityPatrols(){
        
    }
    
    public void viewReports(){
        
    }
}
