/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

/**
 *
 * @author TeD
 */
public class Payment extends User {

    private String paymentId;
    private String recordDate;
    private String dueDate;
    private int paymentAmount;
    private String description;
    private String receiptstatus;
    private String invoicestatus;
    private String statementstatus;
    

    public Payment(int userId, String password, String role, String name, String email, 
            String paymentId, String recordDate, String dueDate, int paymentAmount, String description, String receiptstatus
                ,String invoicestatus, String statementstatus) {
        super(userId, password, role, name, email);
        this.paymentId = paymentId;
        this.recordDate = recordDate;
        this.dueDate = dueDate;
        this.paymentAmount = paymentAmount;
        this.description = description;
        this.receiptstatus = receiptstatus;
        this.invoicestatus = invoicestatus;
        this.statementstatus = statementstatus;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
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
        return receiptstatus;
    }

    public void setReceiptStatus(String receiptstatus) {
        this.receiptstatus = receiptstatus;
    }
    
    public String getInvoicestatus() {
        return invoicestatus;
    }

    public void setInvoicestatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;
    }

    public String getStatementstatus() {
        return statementstatus;
    }

    public void setStatementstatus(String statementstatus) {
        this.statementstatus = statementstatus;
    }
    
    
}
