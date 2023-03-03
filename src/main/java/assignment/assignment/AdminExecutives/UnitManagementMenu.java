/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.AdminExecutives;

/**
 *
 * @author user
 */
public class UnitManagementMenu extends javax.swing.JFrame {

    /**
     * Creates new form unitmanagementmenu
     */
    public UnitManagementMenu() {
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

        unitmanagementLABEL = new javax.swing.JLabel();
        manageunitPANEL = new javax.swing.JPanel();
        unitaddBTN = new javax.swing.JButton();
        unitmodifyBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        unitmanagementLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        unitmanagementLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitmanagementLABEL.setText("Unit Management");

        manageunitPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Manage Unit"));

        unitaddBTN.setText("Add");
        unitaddBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitaddBTNActionPerformed(evt);
            }
        });

        unitmodifyBTN.setText("Modify");
        unitmodifyBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitmodifyBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageunitPANELLayout = new javax.swing.GroupLayout(manageunitPANEL);
        manageunitPANEL.setLayout(manageunitPANELLayout);
        manageunitPANELLayout.setHorizontalGroup(
            manageunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageunitPANELLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(unitaddBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(unitmodifyBTN)
                .addGap(15, 15, 15))
        );
        manageunitPANELLayout.setVerticalGroup(
            manageunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageunitPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageunitPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitaddBTN)
                    .addComponent(unitmodifyBTN))
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageunitPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unitmanagementLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(backBTN)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitmanagementLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageunitPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        AdminExecutiveMenu AdminExecutiveMenu = new AdminExecutiveMenu();
        this.dispose();
        AdminExecutiveMenu.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void unitaddBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitaddBTNActionPerformed
        // TODO add your handling code here:
        UnitAdd UnitAdd = new UnitAdd();
        this.dispose();
        UnitAdd.setVisible(true);
    }//GEN-LAST:event_unitaddBTNActionPerformed

    private void unitmodifyBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitmodifyBTNActionPerformed
        // TODO add your handling code here:
        UnitModify UnitModify = new UnitModify();
        this.dispose();
        UnitModify.setVisible(true);
    }//GEN-LAST:event_unitmodifyBTNActionPerformed

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
            java.util.logging.Logger.getLogger(UnitManagementMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnitManagementMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnitManagementMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnitManagementMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnitManagementMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JPanel manageunitPANEL;
    private javax.swing.JButton unitaddBTN;
    private javax.swing.JLabel unitmanagementLABEL;
    private javax.swing.JButton unitmodifyBTN;
    // End of variables declaration//GEN-END:variables
}