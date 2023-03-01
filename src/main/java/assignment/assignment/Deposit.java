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
public class Deposit extends User{
    
    private int depositId;
    private LocalDate recordDate;
    private LocalDate dueDate;
    private int depositAmount;
    private String description;
    
    public Deposit(int userId, String password, String role, String name, String email, 
            int depositId, LocalDate recordDate, LocalDate dueDate, int depositAmount, String description) {
        super(userId, password, role, name, email);
        this.depositId = depositId;
        this.recordDate = recordDate;
        this.dueDate = dueDate;
        this.depositAmount = depositAmount;
        this.description = description;
    }
    
    public int getDepositId() {
        return depositId;
    }

    public void setDepositId(int depositId) {
        this.depositId = depositId;
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

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
