/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.Tenant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TeD
 */
public class TenantPaymentHistory extends javax.swing.JFrame {

    /**
     * Creates new form paymentHistory
     */
    public TenantPaymentHistory() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TenantPaymentHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ImportPaymentHistory = new javax.swing.JButton();
        ClosePaymentHistory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TenantPaymentHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment History ID", "RecordDate", "Due Date", "Payment Amount", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TenantPaymentHistory);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Payment History");

        ImportPaymentHistory.setText("View Payment History");
        ImportPaymentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportPaymentHistoryActionPerformed(evt);
            }
        });

        ClosePaymentHistory.setText("Close");
        ClosePaymentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClosePaymentHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(ImportPaymentHistory)
                        .addGap(130, 130, 130)
                        .addComponent(ClosePaymentHistory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImportPaymentHistory)
                    .addComponent(ClosePaymentHistory))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImportPaymentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportPaymentHistoryActionPerformed
        File file = new File("src/main/java/assignment/assignment/TxtFile/Payment.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            DefaultTableModel model = (DefaultTableModel) TenantPaymentHistory.getModel();
            
            Object [] dataRows = br.lines().toArray();
            for (int i = 1; i < dataRows.length; i++){
                String rec = dataRows[i].toString();
                String [] dataRow = rec.split(";");
                String [] tempArray = new String[8];
                System.out.println(Arrays.toString(dataRow));
                System.out.println(Arrays.toString(tempArray));
                tempArray[0] = dataRow[0];
                tempArray[1] = dataRow[2];
                tempArray[2] = dataRow[3];
                tempArray[3] = dataRow[4];
                tempArray[4] = dataRow[5];
                tempArray[5] = dataRow[6];
                tempArray[6] = dataRow[7];
                tempArray[7] = dataRow[8];
                model.addRow(tempArray);
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(TenantPaymentHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImportPaymentHistoryActionPerformed

    private void ClosePaymentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClosePaymentHistoryActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ClosePaymentHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(TenantPaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantPaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantPaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantPaymentHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TenantPaymentHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClosePaymentHistory;
    private javax.swing.JButton ImportPaymentHistory;
    private javax.swing.JTable TenantPaymentHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
