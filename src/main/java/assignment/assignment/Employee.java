/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

//public class Employee {
public class Employee extends User {
    private int employeeID;
    private String name;
    //private String email;
    private String phone;
    
    //public Employee (int employeeID, String name, String email, String phone){
    public Employee (String username, String password, String email, int employeeID, String name, String phone){
        super (username, password, email);
        this.employeeID = employeeID;
        this.name = name;
        //this.email = email;
        this.phone= phone;
    }
    
    public int getEmployeeID(){
        return employeeID;
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
    
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
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
}
