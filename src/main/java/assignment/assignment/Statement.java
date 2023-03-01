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
public class Statement extends User {
    
    private int statementId;
    private String issuedDate;
    private String paidDate;
    private int paidAmount;
    private String description;
    private String statementstatus;
    
    public Statement(int userId, String password, String role, String name, String email,
            int statementId, String issuedDate, String paidDate, int paidAmount, String description,
                String statementstatus) {
        super(userId, password, role, name, email);
        this.statementId = statementId;
        this.issuedDate = issuedDate;
        this.paidDate = paidDate;
        this.paidAmount = paidAmount;
        this.description = description;
        this.statementstatus = statementstatus;
    }
    
    public int getStatementId() {
        return statementId;
    }

    public void setStatementId(int statementId) {
        this.statementId = statementId;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatementStatus() {
        return statementstatus;
    }

    public void setStatementStatus(String statementstatus) {
        this.statementstatus = statementstatus;
    }
}
