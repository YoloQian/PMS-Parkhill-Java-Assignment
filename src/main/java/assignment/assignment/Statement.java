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
    private LocalDate issuedDate;
    private LocalDate paidDate;
    private int paidAmount;
    private String description;
    private String StatementStatus;
    
    public Statement(int userId, String password, String role, String name, String email,
            int statementId, LocalDate issuedDate, LocalDate paidDate, int paidAmount, String description) {
        super(userId, password, role, name, email);
        this.statementId = statementId;
        this.issuedDate = issuedDate;
        this.paidDate = paidDate;
        this.paidAmount = paidAmount;
        this.description = description;
    }
    
    public int getStatementId() {
        return statementId;
    }

    public void setStatementId(int statementId) {
        this.statementId = statementId;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(LocalDate paidDate) {
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
}
