/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

/**
 *
 * @author user
 */
public class BuildingManager {
    
    private int buildingManagerID;
    private String name;
    private String email;
    private String phone;
    
    public BuildingManager(int buildingManagerID, String name, String email, String phone){
        this.buildingManagerID = buildingManagerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public int getbuildingManagerID() {
        return buildingManagerID;
    }
    
    public void setabuildingManagerID(int buildingManagerID) {
        this.buildingManagerID = buildingManagerID;
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
    
    public void manageUser(){
        
    }
    
    public void generateReports(){
        
    }

    public void planOperations(){
        
    }

    public void manageTeamStructure(){
        
    }
}
