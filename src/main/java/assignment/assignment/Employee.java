/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

public class Employee extends User {
    private int employeeID;
    private String name;
    private String phone;

    public Employee (int userId, String password, String role, String name, String email, int employeeID, String phone){
        super (userId, password, role, name, email);
        this.employeeID = employeeID;
        this.name = name;
        this.phone= phone;
    }
    
    public int getEmployeeID(){
        return employeeID;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
}
