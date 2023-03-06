/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.BuildingExecutive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leeyu
 */
public class ComplaintStatusView extends javax.swing.JFrame {
    private String[] columnNames = {"ComplaintLD", "Complaint Date", "Subject", "Name", "Description", "Reply", "Status"}; //top string
    private Object[][] tableData;

    /**
     * Creates new form ComplaintStatusView
     */
    public ComplaintStatusView() {
                List<Object[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/assignment/assignment/TxtFile/Complaint.txt"))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {  //this is from txt file
                if (lineNumber > 0) { // Skip first line (header row)
                    String[] splitLine = line.split(";");
                    Object[] row = new Object[7];  //this will be 7
                    row[0] = splitLine[0];
                    row[1] = splitLine[2];
                    row[2] = splitLine[3];
                    row[3] = splitLine[4];
                    row[4] = splitLine[5];
                    row[5] = splitLine[6];
                    row[6] = splitLine[7];
                    data.add(row);
                }
                lineNumber++;
            }
        } catch (IOException e) {
        }
        tableData = data.toArray(new Object[data.size()][7]);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        complaintTable = new javax.swing.JTable();
        complaintsLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        replyBtn = new javax.swing.JButton();
        replyTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        complaintTable.setModel(new javax.swing.table.DefaultTableModel(tableData, columnNames
        ));
        complaintTable.setDefaultEditor(Object.class, null); // this makes the table non-editable
        complaintTable.setRowSelectionAllowed(true); // this allows the rows to be selected
        jScrollPane1.setViewportView(complaintTable);

        complaintsLabel.setText("View Complaints");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        replyBtn.setText("Reply");
        replyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replyBtnActionPerformed(evt);
            }
        });

        replyTF.setPreferredSize(new java.awt.Dimension(200, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(complaintsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(replyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(replyBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(complaintsLabel)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(replyBtn)
                    .addComponent(replyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new BuildingExecutiveMainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void replyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replyBtnActionPerformed
        // TODO add your handling code here:
        // Get selected row index
        int selectedRow = complaintTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }        
        if (selectedRow != -1) {
            String reply = replyTF.getText();
            String status = "Replied";
            if (reply.contains(";")) {
                JOptionPane.showMessageDialog(this, "Please remove semicolons (;) from input", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            if (reply.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }            
            complaintTable.setValueAt(reply, selectedRow, 5);
            complaintTable.setValueAt(status, selectedRow, 6);
            List<String> data = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/assignment/assignment/TxtFile/Complaint.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    data.add(line);
                }
                br.close();
                String[] row = data.get(selectedRow + 1).split(";");
                row[5] = reply;
                row[6] = status;
                data.set(selectedRow + 1, String.join(";", row));
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/assignment/assignment/TxtFile/Complaint.txt"));
                for (String updatedLine : data) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                writer.close();
                System.out.println("Complaint updated successfully.");
            } catch (IOException e) {
                System.err.println("Error updating complaint: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_replyBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ComplaintStatusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintStatusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintStatusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintStatusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintStatusView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable complaintTable;
    private javax.swing.JLabel complaintsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton replyBtn;
    private javax.swing.JTextField replyTF;
    // End of variables declaration//GEN-END:variables
}
