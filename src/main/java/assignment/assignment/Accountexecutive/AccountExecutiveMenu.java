/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.Accountexecutive;

import assignment.assignment.LoginPage;

/**
 *
 * @author user
 */
public class AccountExecutiveMenu extends javax.swing.JFrame {

    /**
     * Creates new form accountexecutivemenu
     */
    public AccountExecutiveMenu() {
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

        accountexecutiveLABEL = new javax.swing.JLabel();
        issuepaperworkBTN = new javax.swing.JButton();
        managepaymentsBTN = new javax.swing.JButton();
        viewoutstandingfeesBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accountexecutiveLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        accountexecutiveLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountexecutiveLABEL.setText("Account Executive");

        issuepaperworkBTN.setText("Issue Paperwork");
        issuepaperworkBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuepaperworkBTNActionPerformed(evt);
            }
        });

        managepaymentsBTN.setText("Manage Payments");
        managepaymentsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managepaymentsBTNActionPerformed(evt);
            }
        });

        viewoutstandingfeesBTN.setText("View Outstanding Fees");
        viewoutstandingfeesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewoutstandingfeesBTNActionPerformed(evt);
            }
        });

        logoutBTN.setText("LogOut");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(managepaymentsBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewoutstandingfeesBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issuepaperworkBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accountexecutiveLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountexecutiveLABEL)
                .addGap(47, 47, 47)
                .addComponent(issuepaperworkBTN)
                .addGap(18, 18, 18)
                .addComponent(managepaymentsBTN)
                .addGap(18, 18, 18)
                .addComponent(viewoutstandingfeesBTN)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void issuepaperworkBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuepaperworkBTNActionPerformed
        // TODO add your handling code here:
        IssuePaperworksMenu IssuePaperworksMenu = new IssuePaperworksMenu();
        this.dispose();
        IssuePaperworksMenu.setVisible(true);
    }//GEN-LAST:event_issuepaperworkBTNActionPerformed

    private void managepaymentsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managepaymentsBTNActionPerformed
        // TODO add your handling code here:
        ManagePaymentsMenu ManagePaymentsMenu = new ManagePaymentsMenu();
        this.dispose();
        ManagePaymentsMenu.setVisible(true);
    }//GEN-LAST:event_managepaymentsBTNActionPerformed

    private void viewoutstandingfeesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewoutstandingfeesBTNActionPerformed
        // TODO add your handling code here:
        ViewOutstandingFeesMenu ViewOutstandingFeesMenu = new ViewOutstandingFeesMenu();
        this.dispose();
        ViewOutstandingFeesMenu.setVisible(true);
    }//GEN-LAST:event_viewoutstandingfeesBTNActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        LoginPage LoginPage = new LoginPage();
        this.dispose();
        LoginPage.setVisible(true);
    }//GEN-LAST:event_logoutBTNActionPerformed

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
            java.util.logging.Logger.getLogger(AccountExecutiveMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountExecutiveMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountExecutiveMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountExecutiveMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountExecutiveMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountexecutiveLABEL;
    private javax.swing.JButton issuepaperworkBTN;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton managepaymentsBTN;
    private javax.swing.JButton viewoutstandingfeesBTN;
    // End of variables declaration//GEN-END:variables
}
