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
public class Payment extends User {

    private int paymentId;
    private LocalDate recordDate;
    private LocalDate dueDate;
    private int paymentAmount;
    private String description;
    private String receiptStatus;
    

    public Payment(int userId, String password, String role, String name, String email, 
            int paymentId, LocalDate recordDate, LocalDate dueDate, int paymentAmount, String description, String receiptStatus) {
        super(userId, password, role, name, email);
        this.paymentId = paymentId;
        this.recordDate = recordDate;
        this.dueDate = dueDate;
        this.paymentAmount = paymentAmount;
        this.description = description;
        this.receiptStatus = receiptStatus;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(String receiptStatus) {
        this.receiptStatus = receiptStatus;
    }
}
