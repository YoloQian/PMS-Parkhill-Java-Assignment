/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment.FundSystem;

import java.time.LocalDate;

public class Invoice {
    private String invoiceID;
    private LocalDate date;
    private double amount;
    private String description;
    
    public Invoice(String invoiceID, LocalDate date, double amount, String description) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }
    
    public String getInvoiceID() {
        return invoiceID;
    }
    
    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }
    
    public LocalDate getDate() {
        return date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}