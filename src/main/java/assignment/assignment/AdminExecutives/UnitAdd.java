/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.AdminExecutives;

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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UnitAdd extends javax.swing.JFrame {

    /**
     * Creates new form Unitadd
     */
    public UnitAdd() {
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

        newunitPANEL = new javax.swing.JPanel();
        tenantidLABEL = new javax.swing.JLabel();
        phoneLABEL = new javax.swing.JLabel();
        unitnoLABEL = new javax.swing.JLabel();
        unitnoTF = new javax.swing.JTextField();
        newBTN = new javax.swing.JButton();
        phoneTF = new javax.swing.JTextField();
        tenantidTF = new javax.swing.JTextField();
        backBTN = new javax.swing.JButton();
        unitnewLABEL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newunitPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("New Unit"));

        tenantidLABEL.setText("TenantID :");

        phoneLABEL.setText("Phone :");

        unitnoLABEL.setText("Unit No :");

        newBTN.setText("New");
        newBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newunitPANELLayout = new javax.swing.GroupLayout(newunitPANEL);
        newunitPANEL.setLayout(newunitPANELLayout);
        newunitPANELLayout.setHorizontalGroup(
            newunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newunitPANELLayout.createSequentialGroup()
                .addGroup(newunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenantidLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitnoLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(newunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneTF)
                    .addComponent(unitnoTF)
                    .addGroup(newunitPANELLayout.createSequentialGroup()
                        .addComponent(newBTN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tenantidTF))
                .addContainerGap())
        );
        newunitPANELLayout.setVerticalGroup(
            newunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newunitPANELLayout.createSequentialGroup()
                .addGroup(newunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenantidLABEL)
                    .addComponent(tenantidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLABEL)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitnoLABEL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newBTN)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        unitnewLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        unitnewLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitnewLABEL.setText("New Unit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newunitPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unitnewLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(backBTN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBTN)
                    .addComponent(unitnewLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newunitPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        UnitManagementMenu UnitManagementMenu = new UnitManagementMenu();
        this.dispose();
        UnitManagementMenu.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void newBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBTNActionPerformed
// TODO add your handling code here:
        String tenantid = tenantidTF.getText();
        String phone = phoneTF.getText();
        String unitno = unitnoTF.getText();
        LocalDate unitissuedate = java.time.LocalDate.now();
        String message = "Are you sure you want to issue this Unit?\n\n"
                + "Tenant ID : " + tenantid + "\n"
                + "Phone ID : " + phone + "\n"
                + "Unit No : " + unitno + "\n"
                + "Unit Issue Date (YY-MM-DD) : " + unitissuedate;
        int confirmation = JOptionPane.showConfirmDialog((Component) null, message, "Confirm Unit", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("src/main/java/assignment/assignment/TxtFile/TenantInfo.txt"));
                List<String> lines = new ArrayList<>();
                String line = reader.readLine();
                while (line != null) {
                    String[] fields = line.split(";");
                    if (fields[0].equals(tenantid)) {
                        fields[2] = phone;
                        fields[3] = unitno;
                        fields[4] = unitissuedate.toString();
                        line = String.join(";", fields);
                    }
                    lines.add(line);
                    line = reader.readLine();
                }
                reader.close();
                FileWriter writer = new FileWriter("src/main/java/assignment/assignment/TxtFile/TenantInfo.txt");
                for (String outputLine : lines) {
                    writer.write(outputLine + "\n");
                }
                writer.close();
                System.out.println("Payment status updated successfully.");
            } catch (IOException e) {
                System.out.println("Error updating payment status: " + e.getMessage());
            }
            System.out.println("Success");
        } else {
            System.out.println("Cancelled by user");
        }
        
    }//GEN-LAST:event_newBTNActionPerformed

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
            java.util.logging.Logger.getLogger(UnitAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnitAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnitAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnitAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnitAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton newBTN;
    private javax.swing.JPanel newunitPANEL;
    private javax.swing.JLabel phoneLABEL;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel tenantidLABEL;
    private javax.swing.JTextField tenantidTF;
    private javax.swing.JLabel unitnewLABEL;
    private javax.swing.JLabel unitnoLABEL;
    private javax.swing.JTextField unitnoTF;
    // End of variables declaration//GEN-END:variables
}
