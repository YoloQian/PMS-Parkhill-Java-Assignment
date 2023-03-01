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
public class PaymentHistory extends User {
    
    private int paymentHistoryId;
    private LocalDate paidDate;
    private int paidAmount;
    
    public PaymentHistory(int userId, String password, String role, String name, String email,
            int paymentHistoryId, LocalDate paidDate, int paidAmount) {
        super(userId, password, role, name, email);
        this.paymentHistoryId = paymentHistoryId;
        this.paidDate = paidDate;
        this.paidAmount = paidAmount;
    }
    
    public int getPaymentHistoryId() {
        return paymentHistoryId;
    }

    public void setPaymentHistoryId(int paymentHistoryId) {
        this.paymentHistoryId = paymentHistoryId;
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
}
