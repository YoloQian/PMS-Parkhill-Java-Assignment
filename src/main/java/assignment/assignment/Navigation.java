/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment;

/**
 *
 * @author user
 */
public class Navigation extends javax.swing.JFrame {

    /**
     * Creates new form Navigation
     */
    public Navigation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SystemsPanel = new javax.swing.JPanel();
        UserManagementBTN = new javax.swing.JButton();
        PaymentBTN = new javax.swing.JButton();
        TeamStructureBTN = new javax.swing.JButton();
        BuildingManagementBTN = new javax.swing.JButton();
        ReportingBTN = new javax.swing.JButton();
        FeedbackBTN = new javax.swing.JButton();
        SecurityManagementBTN = new javax.swing.JButton();
        LogoutBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SystemsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Systems"));

        UserManagementBTN.setText("User Management");
        UserManagementBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserManagementBTNActionPerformed(evt);
            }
        });

        PaymentBTN.setText("Payment");
        PaymentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentBTNActionPerformed(evt);
            }
        });

        TeamStructureBTN.setText("Team Structure");

        BuildingManagementBTN.setText("Building Management");

        ReportingBTN.setText("Reporting");

        FeedbackBTN.setText("Feedback");

        SecurityManagementBTN.setText("Security Management");

        LogoutBTN.setText("Logout");

        javax.swing.GroupLayout SystemsPanelLayout = new javax.swing.GroupLayout(SystemsPanel);
        SystemsPanel.setLayout(SystemsPanelLayout);
        SystemsPanelLayout.setHorizontalGroup(
            SystemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemsPanelLayout.createSequentialGroup()
                .addGroup(SystemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SystemsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SystemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PaymentBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TeamStructureBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserManagementBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(SystemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SecurityManagementBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FeedbackBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReportingBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(SystemsPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(LogoutBTN))
                    .addGroup(SystemsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuildingManagementBTN)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        SystemsPanelLayout.setVerticalGroup(
            SystemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(SystemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserManagementBTN)
                    .addComponent(ReportingBTN))
                .addGap(33, 33, 33)
                .addGroup(SystemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FeedbackBTN)
                    .addComponent(PaymentBTN))
                .addGap(31, 31, 31)
                .addGroup(SystemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeamStructureBTN)
                    .addComponent(SecurityManagementBTN))
                .addGap(31, 31, 31)
                .addComponent(BuildingManagementBTN)
                .addGap(18, 18, 18)
                .addComponent(LogoutBTN)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(SystemsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(SystemsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserManagementBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserManagementBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserManagementBTNActionPerformed

    private void PaymentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navigation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuildingManagementBTN;
    private javax.swing.JButton FeedbackBTN;
    private javax.swing.JButton LogoutBTN;
    private javax.swing.JButton PaymentBTN;
    private javax.swing.JButton ReportingBTN;
    private javax.swing.JButton SecurityManagementBTN;
    private javax.swing.JPanel SystemsPanel;
    private javax.swing.JButton TeamStructureBTN;
    private javax.swing.JButton UserManagementBTN;
    // End of variables declaration//GEN-END:variables
}
