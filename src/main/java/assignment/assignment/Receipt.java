/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

/**
 *
 * @author TeD
 */
public class Receipt extends User {
    
    private int receiptId;
    private String issuedDate;
    private String paidDate;
    private int paidAmount;
    private String description;
    private String receiptstatus;
    
    public Receipt(int userId, String password, String role, String name, String email,
            int receiptId, String issuedDate, String paidDate, int paidAmount, String description, 
                String receiptstatus) {
        super(userId, password, role, name, email);
        this.receiptId = receiptId;
        this.issuedDate = issuedDate;
        this.paidDate = paidDate;
        this.paidAmount = paidAmount;
        this.description = description;
        this.receiptstatus = receiptstatus;
    }
    
    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
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
    
    public String getReceiptstatus() {
        return receiptstatus;
    }

    public void setReceiptstatus(String receiptstatus) {
        this.receiptstatus = receiptstatus;
    }
}
