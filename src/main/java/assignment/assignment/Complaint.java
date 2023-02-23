/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Complaint {
    private int complaintID;
    private String subject;
    private String description;
    private LocalDate complaintDate;

    public Complaint(int complaintID, String subject, String description, LocalDate complaintDate){
        this.complaintID =  complaintID;
        this.subject = subject;
        this.description = description;
        this.complaintDate = complaintDate;
    }
    
    public int getcomplaintID(){
        return complaintID;
    }
    
    public void setcomplaintID(int complaintID){
        this.complaintID = complaintID;
    }
    
    public String subject(){
        return subject;
    }
    
    public void setsubject(String subject){
        this.subject = subject;
    }
    
    public String getdescription(){
        return description;
    }
    
    public void setdescription(String description){
        this.description = description;
    }
    
    public LocalDate getcomplaintDate(){
        return complaintDate;
    }
    
    public void setcomplaintDate(LocalDate complaintDate){
        this.complaintDate = complaintDate;
    }
}
