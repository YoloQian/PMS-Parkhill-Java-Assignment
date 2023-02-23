/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;
import java.time.LocalDate;

public class Incident {
    private String title;
    private String description;
    private LocalDate date;
    private String location;
    private String status;
    
    public Incident (String title, String description, LocalDate date, String location, String status){
        this.title = title;
        this.description = description;
        this.date = date;
        this.location = location;
        this.status= status;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getDescription(){
        return description;
    }
    
    public LocalDate getDate(){
        return date;
    }
    
    public String getLocation(){
        return location;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setDate(LocalDate date){
        this.date = date;
    }
    
    public void setLocation(String location){
        this.location = location;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
}
