package assignment.assignment.SecurityGuard;

import assignment.assignment.Tenant.TenantMainFrame;
import assignment.assignment.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author leeyu
 */
public class VisitorPassView extends javax.swing.JFrame {
    private User user;
    private String[] columnNames = {"Visitor Name", "Phone No.", "Visit Date", "Tenant ID"};
    private Object[][] tableData;
    /**
     * Creates new form VisitorPassView
     * @param user
     */
    public VisitorPassView(User user) {
        this.user = user;
        // Read data from text file and create Object[][] data
        List<Object[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/assignment/assignment/TxtFile/VisitorPass.txt"))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                if (lineNumber > 0) { // Skip first line (header row)
                    String[] splitLine = line.split(";");
                    Object[] row = new Object[4];
                    row[0] = splitLine[0];
                    row[1] = splitLine[1];
                    row[2] = splitLine[2];
                    row[3] = splitLine[3];
                    data.add(row);
                }
                lineNumber++;
            }
        } catch (IOException e) {
        }
        tableData = data.toArray(new Object[data.size()][4]);
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

        visitorPassLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visitorPassTable = new javax.swing.JTable();
        visitorPassUpdateBtn = new javax.swing.JButton();
        visitorPassDeleteBtn = new javax.swing.JButton();
        visitorPassTableBackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchVisitorNameTF = new javax.swing.JTextField();
        searchTenantIDTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visitorPassLabel.setText("Visitor Pass");

        visitorPassTable.setModel(new javax.swing.table.DefaultTableModel(tableData, columnNames
        ));
        visitorPassTable.setDefaultEditor(Object.class, null); // this makes the table non-editable
        visitorPassTable.setRowSelectionAllowed(true); // this allows the rows to be selected
        jScrollPane1.setViewportView(visitorPassTable);

        visitorPassUpdateBtn.setText("Update");
        visitorPassUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorPassUpdateBtnActionPerformed(evt);
            }
        });

        visitorPassDeleteBtn.setText("Delete");

        visitorPassTableBackBtn.setText("Back");
        visitorPassTableBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorPassTableBackBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Visitor Name:");

        jLabel2.setText("Tenant ID:");

        searchVisitorNameTF.setPreferredSize(new java.awt.Dimension(100, 22));

        searchTenantIDTF.setPreferredSize(new java.awt.Dimension(100, 22));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(visitorPassLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(visitorPassTableBackBtn)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchVisitorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTenantIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(visitorPassUpdateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(visitorPassDeleteBtn)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visitorPassLabel)
                    .addComponent(visitorPassTableBackBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visitorPassUpdateBtn)
                            .addComponent(visitorPassDeleteBtn)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(searchVisitorNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(searchTenantIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visitorPassUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorPassUpdateBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_visitorPassUpdateBtnActionPerformed

    private void visitorPassTableBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorPassTableBackBtnActionPerformed
        // TODO add your handling code here:
        if (user.getRole().equals("security")) {
         new SecurityGuardMain(user).setVisible(true);
         dispose();
        }
        else if (user.getRole().equals("tenant")) {
           new TenantMainFrame(user).setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_visitorPassTableBackBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String visitorName = searchVisitorNameTF.getText();
        String tenantID = searchTenantIDTF.getText();
        List<Object[]> filteredData = new ArrayList<>();
        for (Object[] row : tableData) {
            if ((visitorName.isEmpty() || row[0].toString().toLowerCase().contains(visitorName.toLowerCase()))
                    && (tenantID.isEmpty() || row[3].toString().toLowerCase().equals(tenantID.toLowerCase()))) {
                filteredData.add(row);
            }
        }
        Object[][] filteredTableData = filteredData.toArray(new Object[filteredData.size()][4]);
        visitorPassTable.setModel(new javax.swing.table.DefaultTableModel(
                filteredTableData,
                columnNames
        ));
    }//GEN-LAST:event_searchBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(VisitorPassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisitorPassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisitorPassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisitorPassView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTenantIDTF;
    private javax.swing.JTextField searchVisitorNameTF;
    private javax.swing.JButton visitorPassDeleteBtn;
    private javax.swing.JLabel visitorPassLabel;
    private javax.swing.JTable visitorPassTable;
    private javax.swing.JButton visitorPassTableBackBtn;
    private javax.swing.JButton visitorPassUpdateBtn;
    // End of variables declaration//GEN-END:variables
}