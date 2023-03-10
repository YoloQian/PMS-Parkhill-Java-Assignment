/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.BuildingManagers;

import static assignment.assignment.BuildingManagers.AccountExecutiveAdd.generateNewAccountexeID;
import static assignment.assignment.BuildingManagers.AccountExecutiveAdd.generateNewUserID;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class BuildingExecutiveAdd extends javax.swing.JFrame {

    /**
     * Creates new form Buildingexecutiveadd
     */
    public BuildingExecutiveAdd() {
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

        buildingexecutiveaddPANEL = new javax.swing.JPanel();
        nameLABEL = new javax.swing.JLabel();
        emailLABEL = new javax.swing.JLabel();
        passwordLABEL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        buildingexecutiveaddLABEL = new javax.swing.JLabel();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buildingexecutiveaddPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Add"));

        nameLABEL.setText("Name :");

        emailLABEL.setText("Email :");

        passwordLABEL.setText("Password :");

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buildingexecutiveaddPANELLayout = new javax.swing.GroupLayout(buildingexecutiveaddPANEL);
        buildingexecutiveaddPANEL.setLayout(buildingexecutiveaddPANELLayout);
        buildingexecutiveaddPANELLayout.setHorizontalGroup(
            buildingexecutiveaddPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buildingexecutiveaddPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buildingexecutiveaddPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(passwordLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buildingexecutiveaddPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBTN)
                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(emailTF)
                    .addComponent(passwordTF))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buildingexecutiveaddPANELLayout.setVerticalGroup(
            buildingexecutiveaddPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buildingexecutiveaddPANELLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buildingexecutiveaddPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLABEL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buildingexecutiveaddPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLABEL)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buildingexecutiveaddPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLABEL)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addBTN))
        );

        buildingexecutiveaddLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buildingexecutiveaddLABEL.setText("Building Executive Add");

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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(buildingexecutiveaddPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buildingexecutiveaddLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(backBTN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buildingexecutiveaddLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buildingexecutiveaddPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        try{
                File file = new File("src/main/java/assignment/assignment/TxtFile/UserInfo.txt");
                FileWriter fw = new FileWriter(file,true);
                BufferedWriter bw = new BufferedWriter(fw);
                
                File filebuildingexe = new File("src/main/java/assignment/assignment/TxtFile/BuildingExecutiveInfo.txt");
                FileWriter fwbuildingexe = new FileWriter(filebuildingexe,true);
                BufferedWriter bwbuildingexe = new BufferedWriter(fwbuildingexe);

                String fileName = "src/main/java/assignment/assignment/TxtFile/UserInfo.txt";
                String fileNamebuildingexecutive = "src/main/java/assignment/assignment/TxtFile/BuildingExecutiveInfo.txt";
                String userid = generateNewUserID(fileName);
                String buildingexeid = generateNewAccountexeID(fileNamebuildingexecutive);
                String name = nameTF.getText();
                String email = emailTF.getText();
                String password = passwordTF.getText();

                String message = "Are you sure you want to add this new Building Executive?\n\n"
                        + "User ID : " + userid + "\n"
                        + "Building Executive ID : " + buildingexeid + "\n"
                        + "Name : " + name + "\n"
                        + "Email : " + email + "\n"
                        + "Password : " + password;

                int confirmation = JOptionPane.showConfirmDialog((Component) null, message, "Confirm Add Building Executive", JOptionPane.YES_NO_OPTION);

                if (confirmation == JOptionPane.YES_OPTION) {
                    try (PrintWriter pw = new PrintWriter(bw)) {
                        pw.println(userid + ";" + password + ";" + "buildingexecutive" + ";" + name + ";" + email);
                    }
                    try (PrintWriter pwbuildingexe = new PrintWriter(bwbuildingexe)) {
                        pwbuildingexe.println(buildingexeid + ";" + userid);
                    }
                    System.out.println("Success");  
                } else {
                    System.out.println("Cancelled by user");
                }

            } catch (IOException e) {
                System.out.println("Fail");
            }
    }//GEN-LAST:event_addBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        UserManagementMenu UserManagementMenu = new UserManagementMenu();
        this.dispose();
        UserManagementMenu.setVisible(true);
    }//GEN-LAST:event_backBTNActionPerformed

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
            java.util.logging.Logger.getLogger(BuildingExecutiveAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildingExecutiveAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildingExecutiveAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildingExecutiveAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildingExecutiveAdd().setVisible(true);
            }
        });
    }
    
    public static String generateNewUserID(String fileName) {
            String lastUserID = null;
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(";");
                    lastUserID = parts[0];
                }
            } catch (IOException e) {
            }

            String NewUserID;
            if (lastUserID == null) {
                NewUserID = "1";
            } else {
                int num = Integer.parseInt(lastUserID) + 1;
                NewUserID = String.valueOf(num);
            }
            return NewUserID;
        }

    public static String generateNewBuildingexeID(String fileNamebuildexe) {
            String lastBuildingExecutiveID = null;
            try (BufferedReader brbuildexe = new BufferedReader(new FileReader(fileNamebuildexe))) {
                String line;
                brbuildexe.readLine();
                while ((line = brbuildexe.readLine()) != null) {
                    lastBuildingExecutiveID = line;
                }
            } catch (IOException e) {
            }

            String NewBuildingExecutiveID;
            if (lastBuildingExecutiveID == null) {
                NewBuildingExecutiveID = "BuildExe001";
            } else {
                int num = Integer.parseInt(lastBuildingExecutiveID.substring(8,11));
                num++;
                NewBuildingExecutiveID = "BuildExe" + String.format("%03d", num);
            }
            return NewBuildingExecutiveID;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel buildingexecutiveaddLABEL;
    private javax.swing.JPanel buildingexecutiveaddPANEL;
    private javax.swing.JLabel emailLABEL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel nameLABEL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel passwordLABEL;
    private javax.swing.JTextField passwordTF;
    // End of variables declaration//GEN-END:variables
}
