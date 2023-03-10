/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.AccountExecutives;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ViewOutstandingFees extends javax.swing.JFrame {

    /**
     * Creates new form Viewoutstandingfees
     */
    public ViewOutstandingFees() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        outstandingfeesTABLE = new javax.swing.JTable();
        viewoutstandingfeesLABEL = new javax.swing.JLabel();
        viewoutstandingfeesBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backBTN.setText("Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        outstandingfeesTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PendingID", "UserID", "UserType", "Pending Amount", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane1.setViewportView(outstandingfeesTABLE);

        viewoutstandingfeesLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        viewoutstandingfeesLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewoutstandingfeesLABEL.setText("View Outstanding Fees For Resident/Tenant/Vendor");

        viewoutstandingfeesBTN.setText("View Outstanding Fees");
        viewoutstandingfeesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewoutstandingfeesBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewoutstandingfeesLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(backBTN))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewoutstandingfeesBTN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewoutstandingfeesLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewoutstandingfeesBTN)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        ViewOutstandingFeesMenu ViewOutstandingFeesMenu = new ViewOutstandingFeesMenu();
        this.dispose();
        ViewOutstandingFeesMenu.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

    private void viewoutstandingfeesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewoutstandingfeesBTNActionPerformed
        // TODO add your handling code here:
        try {
            File paymentFile = new File("src/main/java/assignment/assignment/TxtFile/Payment.txt");
            File userInfoFile = new File("src/main/java/assignment/assignment/TxtFile/UserInfo.txt");
            FileReader paymentReader = new FileReader(paymentFile);
            FileReader userInfoReader = new FileReader(userInfoFile);
            BufferedReader paymentBufferedReader = new BufferedReader(paymentReader);
            BufferedReader userInfoBufferedReader = new BufferedReader(userInfoReader);
            String paymentLine, userInfoLine;
            DefaultTableModel model = (DefaultTableModel) outstandingfeesTABLE.getModel();
            model.setRowCount(0);
            paymentBufferedReader.readLine();
            userInfoBufferedReader.readLine();
            while ((paymentLine = paymentBufferedReader.readLine()) != null) {
                String[] paymentData = paymentLine.split(";");
                if (paymentData[9].equals("Unpaid")) {
                    while ((userInfoLine = userInfoBufferedReader.readLine()) != null) {
                        String[] userInfoData = userInfoLine.split(";");
                        if (userInfoData[0].equals(paymentData[1])) {
                            Object[] row = {paymentData[0], paymentData[1], userInfoData[2], paymentData[4], paymentData[5]};
                            model.addRow(row);
                            break;
                        }
                    }
                    userInfoReader = new FileReader(userInfoFile); // reset the reader to the beginning of the file
                    userInfoBufferedReader = new BufferedReader(userInfoReader);
                    userInfoBufferedReader.readLine(); // skip the header line
                }
            }
            paymentBufferedReader.close();
            userInfoBufferedReader.close();
            paymentReader.close();
            userInfoReader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_viewoutstandingfeesBTNActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOutstandingFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOutstandingFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOutstandingFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOutstandingFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOutstandingFees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable outstandingfeesTABLE;
    private javax.swing.JButton viewoutstandingfeesBTN;
    private javax.swing.JLabel viewoutstandingfeesLABEL;
    // End of variables declaration//GEN-END:variables
}
