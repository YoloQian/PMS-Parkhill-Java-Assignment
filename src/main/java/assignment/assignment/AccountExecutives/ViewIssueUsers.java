/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.AccountExecutives;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ViewIssueUsers extends javax.swing.JFrame {

    static int IssueNavigate;
    /**
     * Creates new form viewissueusers
     */
    public ViewIssueUsers(int issueNavigate) {
        initComponents();
        setLocationRelativeTo(null);
        IssueNavigate = issueNavigate;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountexecutivesearchPANEL = new javax.swing.JPanel();
        searchidLABEL = new javax.swing.JLabel();
        searchidTF = new javax.swing.JTextField();
        searchidBTN = new javax.swing.JButton();
        issueusersLABEL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueusersTABLE = new javax.swing.JTable();
        backBTN = new javax.swing.JButton();
        showusersBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accountexecutivesearchPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        searchidLABEL.setText("Search ID:");

        searchidBTN.setText("Search ID");
        searchidBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchidBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountexecutivesearchPANELLayout = new javax.swing.GroupLayout(accountexecutivesearchPANEL);
        accountexecutivesearchPANEL.setLayout(accountexecutivesearchPANELLayout);
        accountexecutivesearchPANELLayout.setHorizontalGroup(
            accountexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountexecutivesearchPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountexecutivesearchPANELLayout.createSequentialGroup()
                        .addComponent(searchidLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchidTF, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountexecutivesearchPANELLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchidBTN)))
                .addContainerGap())
        );
        accountexecutivesearchPANELLayout.setVerticalGroup(
            accountexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountexecutivesearchPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchidLABEL)
                    .addComponent(searchidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchidBTN)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        issueusersLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        issueusersLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        issueusersLABEL.setText("View Resident/Tenant/Vendor");

        issueusersTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "UserID", "Name", "Email", "Password", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(issueusersTABLE);

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        showusersBTN.setText("Show Users");
        showusersBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showusersBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(issueusersLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(backBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accountexecutivesearchPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showusersBTN)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(issueusersLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountexecutivesearchPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showusersBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        IssueInvoice IssueInvoice = new IssueInvoice();
        IssueReceipt IssueReceipt = new IssueReceipt();
        IssueStatement IssueStatement = new IssueStatement();
        RecordPayment RecordPayment = new RecordPayment();
        this.dispose();
        if(IssueNavigate == 1){
            IssueInvoice.setVisible(true);
        }
        
        if(IssueNavigate == 2){
            IssueReceipt.setVisible(true);
        }
        
        if(IssueNavigate == 3){
            IssueStatement.setVisible(true);
        }
        
        if(IssueNavigate == 4){
            RecordPayment.setVisible(true);
        }
    }//GEN-LAST:event_backBTNActionPerformed

    private void showusersBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showusersBTNActionPerformed
        // TODO add your handling code here:
        try {
            File file = new File("src/main/java/assignment/assignment/TxtFile/UserInfo.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            DefaultTableModel model = (DefaultTableModel) issueusersTABLE.getModel();
            model.setRowCount(0);
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                String role = data[2].toLowerCase();
                if (role.equals("tenant") || role.equals("vendor")) {
                    Object[] row = { data[0], data[3], data[4], data[1], data[2] };
                    model.addRow(row);
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_showusersBTNActionPerformed

    private void searchidBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchidBTNActionPerformed
        // TODO add your handling code here:
        String searchUserID = searchidTF.getText();
        DefaultTableModel model = (DefaultTableModel) issueusersTABLE.getModel();
        int rowCount = model.getRowCount();
        boolean userFound = false;
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 0).equals(searchUserID)) {
                issueusersTABLE.setRowSelectionInterval(i, i);
                userFound = true;
                break;
            }
        }
        if (!userFound) {
            JOptionPane.showMessageDialog(this, "User with ID " + searchUserID + " not found!");
        }
    }//GEN-LAST:event_searchidBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ViewIssueUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewIssueUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewIssueUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewIssueUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ViewIssueUsers(IssueNavigate).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountexecutivesearchPANEL;
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel issueusersLABEL;
    private javax.swing.JTable issueusersTABLE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchidBTN;
    private javax.swing.JLabel searchidLABEL;
    private javax.swing.JTextField searchidTF;
    private javax.swing.JButton showusersBTN;
    // End of variables declaration//GEN-END:variables
}
