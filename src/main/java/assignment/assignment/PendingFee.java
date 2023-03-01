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
public class PendingFee extends User {
    
    private int pendingFeeId;
    private int pendingAmount;
    private String description;
    
    public PendingFee(int userId, String password, String role, String name, String email,
            int pendingFeeId, int pendingAmount, String description ) {
        super(userId, password, role, name, email);
        this.pendingFeeId = pendingFeeId;
        this.pendingAmount = pendingAmount;
        this.description = description;
    }
    
    public int getPendingFeeId() {
        return pendingFeeId;
    }

    public void setPendingFeeId(int pendingFeeId) {
        this.pendingFeeId = pendingFeeId;
    }

    public int getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(int pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
