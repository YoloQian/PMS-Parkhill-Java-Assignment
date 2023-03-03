/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.BuildingManagers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class BuildingExecutiveModify extends javax.swing.JFrame {

    /**
     * Creates new form Buildingexecutivemodify
     */
    public BuildingExecutiveModify() {
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

        backBTN = new javax.swing.JButton();
        buildingexecutivesearchPANEL = new javax.swing.JPanel();
        searchidLABEL = new javax.swing.JLabel();
        searchidTF = new javax.swing.JTextField();
        searchidBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        buildingexecutivemodifyLABEL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buildingexecutivemodifyTABLE = new javax.swing.JTable();
        showaccountexecutive = new javax.swing.JButton();
        modifyBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        buildingexecutivesearchPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        searchidLABEL.setText("Search ID:");

        searchidBTN.setText("Search ID");
        searchidBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchidBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buildingexecutivesearchPANELLayout = new javax.swing.GroupLayout(buildingexecutivesearchPANEL);
        buildingexecutivesearchPANEL.setLayout(buildingexecutivesearchPANELLayout);
        buildingexecutivesearchPANELLayout.setHorizontalGroup(
            buildingexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buildingexecutivesearchPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buildingexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buildingexecutivesearchPANELLayout.createSequentialGroup()
                        .addComponent(searchidLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchidTF, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buildingexecutivesearchPANELLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchidBTN)))
                .addContainerGap())
        );
        buildingexecutivesearchPANELLayout.setVerticalGroup(
            buildingexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buildingexecutivesearchPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buildingexecutivesearchPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchidLABEL)
                    .addComponent(searchidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchidBTN)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        buildingexecutivemodifyLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buildingexecutivemodifyLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buildingexecutivemodifyLABEL.setText("Account Executive Modify");

        buildingexecutivemodifyTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserID", "Name", "Email", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(buildingexecutivemodifyTABLE);

        showaccountexecutive.setText("Show Account Executive");
        showaccountexecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showaccountexecutiveActionPerformed(evt);
            }
        });

        modifyBTN.setText("Modify");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buildingexecutivemodifyLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(backBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buildingexecutivesearchPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(modifyBTN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showaccountexecutive))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deleteBTN)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buildingexecutivemodifyLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buildingexecutivesearchPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(modifyBTN)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showaccountexecutive)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        UserManagementMenu UserManagementMenu = new UserManagementMenu();
        this.dispose();
        UserManagementMenu.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void showaccountexecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showaccountexecutiveActionPerformed
        // TODO add your handling code here:
        try {
            File userInfoFile = new File("src/main/java/assignment/assignment/TxtFile/UserInfo.txt");
            File buildingexeInfoFile = new File("src/main/java/assignment/assignment/TxtFile/BuildingExecutiveInfo.txt");
            FileReader userInfoReader = new FileReader(userInfoFile);
            FileReader buildingexeInfoReader = new FileReader(buildingexeInfoFile);
            BufferedReader userInfoBR = new BufferedReader(userInfoReader);
            BufferedReader buildingexeInfoBR = new BufferedReader(buildingexeInfoReader);
            String userInfoLine, buildingexeInfoLine;
            DefaultTableModel model = (DefaultTableModel) buildingexecutivemodifyTABLE.getModel();
            model.setRowCount(0);
            userInfoBR.readLine(); // Skip header row in UserInfo.txt
            buildingexeInfoBR.readLine(); // Skip header row in TenantInfo.txt
            while ((userInfoLine = userInfoBR.readLine()) != null) {
                String[] userInfoData = userInfoLine.split(";");
                while ((buildingexeInfoLine = buildingexeInfoBR.readLine()) != null) {
                    String[] buildingexeInfoData = buildingexeInfoLine.split(";");
                    if (buildingexeInfoData[1].equals(userInfoData[0])) { // Match UserID
                        Object[] row = { buildingexeInfoData[0], userInfoData[0], userInfoData[3], userInfoData[4], userInfoData[1] };
                        model.addRow(row);
                        break; // Exit tenantInfo loop when match is found
                    }
                }
                buildingexeInfoBR.close();
                buildingexeInfoReader = new FileReader(buildingexeInfoFile); // Reset tenantInfoReader
                buildingexeInfoBR = new BufferedReader(buildingexeInfoReader); // Reset tenantInfoBR
                buildingexeInfoBR.readLine(); // Skip header row in TenantInfo.txt
            }
            userInfoBR.close();
            userInfoReader.close();
            buildingexeInfoBR.close();
            buildingexeInfoReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_showaccountexecutiveActionPerformed

    private void searchidBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchidBTNActionPerformed
        // TODO add your handling code here:
        String searchUserID = searchidTF.getText();
        DefaultTableModel model = (DefaultTableModel) buildingexecutivemodifyTABLE.getModel();
        int rowCount = model.getRowCount();
        boolean userFound = false;
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 0).equals(searchUserID)) {
                buildingexecutivemodifyTABLE.setRowSelectionInterval(i, i);
                userFound = true;
                break;
            }
        }
        if (!userFound) {
            JOptionPane.showMessageDialog(this, "User with ID " + searchUserID + " not found!");
        }
    }//GEN-LAST:event_searchidBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        int selectedRow = buildingexecutivemodifyTABLE.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) buildingexecutivemodifyTABLE.getModel();
            model.removeRow(selectedRow);
            // save the updated data back to the file
            try (FileWriter fw = new FileWriter("BuildingExecutiveInfo.txt");
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter pw = new PrintWriter(bw)) {
                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        pw.print(model.getValueAt(i, j));
                        if (j != model.getColumnCount() - 1) {
                            pw.print(";");
                        }
                    }
                    pw.println();
                }
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BuildingExecutiveModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildingExecutiveModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildingExecutiveModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildingExecutiveModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildingExecutiveModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel buildingexecutivemodifyLABEL;
    private javax.swing.JTable buildingexecutivemodifyTABLE;
    private javax.swing.JPanel buildingexecutivesearchPANEL;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyBTN;
    private javax.swing.JButton searchidBTN;
    private javax.swing.JLabel searchidLABEL;
    private javax.swing.JTextField searchidTF;
    private javax.swing.JButton showaccountexecutive;
    // End of variables declaration//GEN-END:variables
}
