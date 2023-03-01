/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

import java.time.LocalDate;

/**
 *
 * @author TeD
 */
public class Invoice extends User {
    private int invoiceId;
    private LocalDate issuedDate;
    private LocalDate dueDate;
    private int issuedAmount;
    private String description;
    private String InvoiceStatus;

    public Invoice(int userId, String password, String role, String name, String email, 
            int invoiceId, LocalDate issuedDate, LocalDate dueDate, int issuedAmount, String description, String InvoiceStatus) {
        super(userId, password, role, name, email);
        this.invoiceId = invoiceId;
        this.issuedDate = issuedDate;
        this.dueDate = dueDate;
        this.issuedAmount = issuedAmount;
        this.description = description;
        this.InvoiceStatus = InvoiceStatus;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getIssuedAmount() {
        return issuedAmount;
    }

    public void setIssuedAmount(int issuedAmount) {
        this.issuedAmount = issuedAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getInvoiceStatus() {
        return InvoiceStatus;
    }

    public void setInvoiceStatus(String InvoiceStatus) {
        this.InvoiceStatus = InvoiceStatus;
    }
}
