package assignment.assignment.BuildingMangementSystem;

import assignment.assignment.SecurityManagementSystem.*;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author leeyu
 */
public class TenantFacility_booking_view extends javax.swing.JFrame {

    /**
     * Creates new form VisitorPassView
     */
    public TenantFacility_booking_view() {
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

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminViewFacility = new javax.swing.JTable();
        AdminFacilityUpdate = new javax.swing.JButton();
        AdminFacilityDelete = new javax.swing.JButton();
        TenantImportBookingData = new javax.swing.JButton();

        jButton3.setText("Delete");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminViewFacility.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tenant Name", "Facility Name", "Booking Time"
            }
        ));
        jScrollPane1.setViewportView(AdminViewFacility);

        AdminFacilityUpdate.setText("Update");
        AdminFacilityUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminFacilityUpdateActionPerformed(evt);
            }
        });

        AdminFacilityDelete.setText("Cancel");
        AdminFacilityDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminFacilityDeleteActionPerformed(evt);
            }
        });

        TenantImportBookingData.setText("Import Data");
        TenantImportBookingData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantImportBookingDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(TenantImportBookingData)
                .addGap(18, 18, 18)
                .addComponent(AdminFacilityUpdate)
                .addGap(18, 18, 18)
                .addComponent(AdminFacilityDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminFacilityUpdate)
                    .addComponent(AdminFacilityDelete)
                    .addComponent(TenantImportBookingData))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminFacilityUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminFacilityUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminFacilityUpdateActionPerformed

    private void AdminFacilityDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminFacilityDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminFacilityDeleteActionPerformed

    private void TenantImportBookingDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantImportBookingDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenantImportBookingDataActionPerformed

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
            java.util.logging.Logger.getLogger(TenantFacility_booking_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantFacility_booking_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantFacility_booking_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantFacility_booking_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TenantFacility_booking_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminFacilityDelete;
    private javax.swing.JButton AdminFacilityUpdate;
    private javax.swing.JTable AdminViewFacility;
    private javax.swing.JButton TenantImportBookingData;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}