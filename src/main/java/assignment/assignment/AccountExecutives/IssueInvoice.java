/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.AccountExecutives;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class IssueInvoice extends javax.swing.JFrame {

    static int IssueNavigate;
    /**
     * Creates new form Issueinvoice
     */
    public IssueInvoice() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoiceLABEL = new javax.swing.JLabel();
        issueinvoicePANEL = new javax.swing.JPanel();
        useridLABEL = new javax.swing.JLabel();
        duedateLABEL = new javax.swing.JLabel();
        issuedamountLABEL = new javax.swing.JLabel();
        descriptionLABEL = new javax.swing.JLabel();
        useridTF = new javax.swing.JTextField();
        duedateTF = new javax.swing.JTextField();
        issuedamountTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTA = new javax.swing.JTextArea();
        issueBTN = new javax.swing.JButton();
        viewusersBTN = new javax.swing.JButton();
        paymentidLABEL = new javax.swing.JLabel();
        paymentidTF = new javax.swing.JTextField();
        viewpaymentsBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        invoiceLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invoiceLABEL.setText("Invoice");

        issueinvoicePANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Issue Invoice"));

        useridLABEL.setText("UserID :");

        duedateLABEL.setText("Due Date (yy-mm-dd) :");

        issuedamountLABEL.setText("Issued Amount (RM) :");

        descriptionLABEL.setText("Description :");

        useridTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridTFActionPerformed(evt);
            }
        });

        duedateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedateTFActionPerformed(evt);
            }
        });

        descriptionTA.setColumns(20);
        descriptionTA.setRows(5);
        jScrollPane1.setViewportView(descriptionTA);

        issueBTN.setText("Issue");
        issueBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBTNActionPerformed(evt);
            }
        });

        viewusersBTN.setText("View Users");
        viewusersBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewusersBTNActionPerformed(evt);
            }
        });

        paymentidLABEL.setText("PaymentID :");

        viewpaymentsBTN.setText("View Payments");
        viewpaymentsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpaymentsBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout issueinvoicePANELLayout = new javax.swing.GroupLayout(issueinvoicePANEL);
        issueinvoicePANEL.setLayout(issueinvoicePANELLayout);
        issueinvoicePANELLayout.setHorizontalGroup(
            issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issueinvoicePANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(issueinvoicePANELLayout.createSequentialGroup()
                        .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(paymentidLABEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descriptionLABEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(useridLABEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(duedateLABEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issuedamountLABEL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(useridTF)
                            .addComponent(jScrollPane1)
                            .addComponent(issuedamountTF)
                            .addComponent(paymentidTF)
                            .addComponent(duedateTF))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(issueinvoicePANELLayout.createSequentialGroup()
                        .addComponent(viewusersBTN)
                        .addGap(18, 18, 18)
                        .addComponent(viewpaymentsBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(issueBTN)))
                .addContainerGap())
        );
        issueinvoicePANELLayout.setVerticalGroup(
            issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issueinvoicePANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useridLABEL)
                    .addComponent(useridTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentidLABEL)
                    .addComponent(paymentidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duedateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duedateLABEL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(issuedamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issuedamountLABEL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLABEL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(issueinvoicePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewusersBTN)
                        .addComponent(viewpaymentsBTN))
                    .addComponent(issueBTN))
                .addGap(19, 19, 19))
        );

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(issueinvoicePANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(invoiceLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBTN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(invoiceLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBTN)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issueinvoicePANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useridTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridTFActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        IssuePaperworksMenu IssuePaperworksMenu = new IssuePaperworksMenu();
        this.dispose();
        IssuePaperworksMenu.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void viewusersBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewusersBTNActionPerformed
        // TODO add your handling code here:
        IssueNavigate = 1;
        ViewIssueUsers ViewIssueUsers = new ViewIssueUsers(IssueNavigate);
        this.dispose();
        ViewIssueUsers.setVisible(true);
    }//GEN-LAST:event_viewusersBTNActionPerformed

    private void duedateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedateTFActionPerformed

    private void issueBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBTNActionPerformed
        // TODO add your handling code here:
        try{
            File invoiceFile = new File("src/main/java/assignment/assignment/TxtFile/Invoice.txt");
            File paymentFile = new File("src/main/java/assignment/assignment/TxtFile/Payment.txt");
            
            String fileName = "src/main/java/assignment/assignment/TxtFile/Invoice.txt";
            String invoiceID = generateNewInvoiceID(fileName);
            String userid = useridTF.getText();
            String paymentID = paymentidTF.getText();
            LocalDate issueddate = java.time.LocalDate.now();
            String duedate = duedateTF.getText();
            String issuedamount = issuedamountTF.getText();
            String description = descriptionTA.getText();
            
            String message = "Are you sure you want to issue this invoice?\n\n"
                    + "User ID : " + userid + "\n"
                    + "Payment ID : " + paymentID + "\n"
                    + "Issued Date : " + issueddate + "\n"
                    + "Due Date (YY-MM-DD) : " + duedate + "\n"
                    + "Issued Amount (RM) : " + issuedamount + "\n"
                    + "Description : " + description;
            
            int confirmation = JOptionPane.showConfirmDialog((Component) null, message, "Confirm Issuance", JOptionPane.YES_NO_OPTION);
            
            if (confirmation == JOptionPane.YES_OPTION) {
                // Write receipt data to Receipt.txt
                try (FileWriter fw = new FileWriter(invoiceFile, true);
                     BufferedWriter bw = new BufferedWriter(fw);
                     PrintWriter pw = new PrintWriter(bw)) {
                    pw.println(invoiceID + ";" + userid + ";" + issueddate + ";" + duedate + ";" + issuedamount + ";" + description + ";Issued;" + paymentID);
                }
                System.out.println("Success");  
                
                // Overwrite Payment.txt data if payment ID matches
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("src/main/java/assignment/assignment/TxtFile/Payment.txt"));
                    List<String> lines = new ArrayList<>();
                    String line = reader.readLine();
                    while (line != null) {
                        String[] fields = line.split(";");
                        if (fields[0].equals(paymentID)) {
                            fields[6] = "Issued";
                            line = String.join(";", fields);
                        }
                        lines.add(line);
                        line = reader.readLine();
                    }
                    reader.close();
                    FileWriter writer = new FileWriter("src/main/java/assignment/assignment/TxtFile/Payment.txt");
                    for (String outputLine : lines) {
                        writer.write(outputLine + "\n");
                    }
                    writer.close();
                    System.out.println("Payment status updated successfully.");
                } catch (IOException e) {
                    System.out.println("Error updating payment status: " + e.getMessage());
                }
            } else {
                System.out.println("Cancelled by user");
            }
        } catch (IOException e) {
            System.out.println("Fail");
        }
    }//GEN-LAST:event_issueBTNActionPerformed

    private void viewpaymentsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpaymentsBTNActionPerformed
        // TODO add your handling code here:
        IssueNavigate = 1;
        ViewPaymentInfo ViewPaymentInfo = new ViewPaymentInfo(IssueNavigate);
        this.dispose();
        ViewPaymentInfo.setVisible(true);
    }//GEN-LAST:event_viewpaymentsBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IssueInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueInvoice().setVisible(true);
            }
        });
    }
    
    public static String generateNewInvoiceID(String fileName) {
        String lastInvoiceID = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                lastInvoiceID = line;
            }
        } catch (IOException e) {
        }
        
        String NewInvoiceID;
        if (lastInvoiceID == null) {
            NewInvoiceID = "Invoice001";
        } else {
            int num = Integer.parseInt(lastInvoiceID.substring(7,10));
            num++;
            NewInvoiceID = "Invoice" + String.format("%03d", num);
        }
        return NewInvoiceID;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel descriptionLABEL;
    private javax.swing.JTextArea descriptionTA;
    private javax.swing.JLabel duedateLABEL;
    private javax.swing.JTextField duedateTF;
    private javax.swing.JLabel invoiceLABEL;
    private javax.swing.JButton issueBTN;
    private javax.swing.JLabel issuedamountLABEL;
    private javax.swing.JTextField issuedamountTF;
    private javax.swing.JPanel issueinvoicePANEL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel paymentidLABEL;
    private javax.swing.JTextField paymentidTF;
    private javax.swing.JLabel useridLABEL;
    private javax.swing.JTextField useridTF;
    private javax.swing.JButton viewpaymentsBTN;
    private javax.swing.JButton viewusersBTN;
    // End of variables declaration//GEN-END:variables

    private static class InvoiceBack {

        public InvoiceBack() {
        }
    }
}
