/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;
import java.time.LocalDate;
/**
 *
 * @author leeyu
 */
public class Visitor {
    private String name;
    private String phone;
    private LocalDate visitDate;
    private String visitorID;
    
    public Visitor(String name, String phone, LocalDate visitDate, String visitorID) {
        this.name = name;
        this.phone = phone;
        this.visitDate = visitDate;
        this.visitorID = visitorID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public LocalDate getVisitDate() {
        return visitDate;
    }
    
    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }
    
    public String getVisitorID() {
        return visitorID;
    }
    
    public void setVisitorID(String visitorID) {
        this.visitorID = visitorID;
    }
    
    public void viewVisitorPass() {
        // Code to display visitor pass information
    }
}

