/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.Vendor;

import assignment.assignment.Tenant.*;
import static assignment.assignment.SecurityGuard.DateTimeDialog.showDateDialog;
import static assignment.assignment.Tenant.TenantComplaintManagement.generateNewID;
import static assignment.assignment.Tenant.TenantViewProfile.getInfo;
import assignment.assignment.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author TeD
 */
public class VendorComplaintManagement extends javax.swing.JFrame {
    private User user;
    /**
     * Creates new form Complaint_management
     */
    public VendorComplaintManagement(User user) {
        this.user = user;        
        getInfo(user);
        initComponents();
        setLocationRelativeTo(null);
        VendorNameTF.setText(user.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VendorNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        VendorComplaint_subject = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        VendorNewComplaint = new javax.swing.JButton();
        VendorViewComplaint = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        setDateBtn = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        VendorComplaintDescription = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Complaint Management"));
        jPanel1.setPreferredSize(new java.awt.Dimension(533, 363));

        jLabel1.setText("Name :");

        VendorNameTF.setEditable(false);

        jLabel3.setText("Date :");

        jLabel4.setText("Subject :");

        jLabel5.setText("Description");

        VendorNewComplaint.setText("New");
        VendorNewComplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorNewComplaintActionPerformed(evt);
            }
        });

        VendorViewComplaint.setText("View");
        VendorViewComplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorViewComplaintActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        setDateBtn.setText("Set Date");
        setDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDateBtnActionPerformed(evt);
            }
        });

        dateLabel.setText("No Date Selected");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VendorComplaint_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VendorNewComplaint)
                                .addGap(18, 18, 18)
                                .addComponent(VendorViewComplaint))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(setDateBtn)
                                .addGap(18, 18, 18)
                                .addComponent(dateLabel))
                            .addComponent(VendorComplaintDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VendorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(BackBtn)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(VendorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(setDateBtn)
                    .addComponent(dateLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VendorComplaint_subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(VendorComplaintDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VendorNewComplaint)
                    .addComponent(VendorViewComplaint))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new TenantMainFrame(user).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void VendorViewComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorViewComplaintActionPerformed
        // TODO add your handling code here:
        new TenantViewComplaint(user).setVisible(true);
        dispose();
    }//GEN-LAST:event_VendorViewComplaintActionPerformed

    private void VendorNewComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorNewComplaintActionPerformed
        // TODO add your handling code here:
        // Get form data
        String name = VendorNameTF.getText();
        String date = dateLabel.getText();
        String subject = VendorComplaint_subject.getText();
        String description = VendorComplaintDescription.getText();

        // Validate form data
        if (name.isEmpty() || description.isEmpty() || subject.isEmpty() || date.equals("No Date Selected")) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (name.contains(";") || subject.contains(";") || description.contains(";")) {
            JOptionPane.showMessageDialog(this, "Please remove semicolons (;) from input", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Write data to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/assignment/assignment/TxtFile/Complaint.txt", true))) {
            writer.write(generateNewID("Complaint.txt", "Complaint") + ";" + user.getUserId() + ";" + date + ";" + subject + ";" + name + ";" + description + ";;No Reply");
            writer.newLine();
            JOptionPane.showMessageDialog(this, "Complaint recorded successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Clear form fields after successful submission
            VendorComplaintDescription.setText("");
            VendorComplaint_subject.setText("");
            dateLabel.setText("No Time Selected");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error writing to file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_VendorNewComplaintActionPerformed

    private void setDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateBtnActionPerformed
        // TODO add your handling code here:
        showDateDialog(dateLabel);
    }//GEN-LAST:event_setDateBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(VendorComplaintManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorComplaintManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorComplaintManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorComplaintManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField VendorComplaintDescription;
    private javax.swing.JTextField VendorComplaint_subject;
    private javax.swing.JTextField VendorNameTF;
    private javax.swing.JButton VendorNewComplaint;
    private javax.swing.JButton VendorViewComplaint;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton setDateBtn;
    // End of variables declaration//GEN-END:variables
}
