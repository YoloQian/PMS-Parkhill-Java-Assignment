/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.assignment.Buildingmanager;

/**
 *
 * @author user
 */
public class Teamstructurecreate extends javax.swing.JFrame {

    /**
     * Creates new form Teamstructurecreate
     */
    public Teamstructurecreate() {
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

        teamstructurecreateLABEL = new javax.swing.JLabel();
        teamstructurecreatePANEL = new javax.swing.JPanel();
        teamtypeLABEL = new javax.swing.JLabel();
        descriptionsLABEL = new javax.swing.JLabel();
        membersLABEL = new javax.swing.JLabel();
        positionLABEL = new javax.swing.JLabel();
        teamtypeTF = new javax.swing.JTextField();
        membersTF = new javax.swing.JTextField();
        positionsTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionsTA = new javax.swing.JTextArea();
        createBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        teamstructurecreateLABEL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        teamstructurecreateLABEL.setText("Team Structure Create");

        teamstructurecreatePANEL.setBorder(javax.swing.BorderFactory.createTitledBorder("Create"));

        teamtypeLABEL.setText("Team Type :");

        descriptionsLABEL.setText("Descriptions :");

        membersLABEL.setText("Members :");

        positionLABEL.setText("Positions :");

        descriptionsTA.setColumns(20);
        descriptionsTA.setRows(5);
        jScrollPane1.setViewportView(descriptionsTA);

        createBTN.setText("Create");

        javax.swing.GroupLayout teamstructurecreatePANELLayout = new javax.swing.GroupLayout(teamstructurecreatePANEL);
        teamstructurecreatePANEL.setLayout(teamstructurecreatePANELLayout);
        teamstructurecreatePANELLayout.setHorizontalGroup(
            teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamstructurecreatePANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(teamstructurecreatePANELLayout.createSequentialGroup()
                        .addGroup(teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teamtypeLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(positionLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(membersLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(positionsTF)
                            .addComponent(membersTF)
                            .addComponent(teamtypeTF)))
                    .addGroup(teamstructurecreatePANELLayout.createSequentialGroup()
                        .addComponent(descriptionsLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createBTN)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        teamstructurecreatePANELLayout.setVerticalGroup(
            teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamstructurecreatePANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamtypeLABEL)
                    .addComponent(teamtypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membersLABEL)
                    .addComponent(membersTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(positionLABEL)
                    .addComponent(positionsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(teamstructurecreatePANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionsLABEL)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBTN)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        backBTN.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(teamstructurecreatePANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teamstructurecreateLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(backBTN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamstructurecreateLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamstructurecreatePANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Teamstructurecreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teamstructurecreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teamstructurecreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teamstructurecreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teamstructurecreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton createBTN;
    private javax.swing.JLabel descriptionsLABEL;
    private javax.swing.JTextArea descriptionsTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel membersLABEL;
    private javax.swing.JTextField membersTF;
    private javax.swing.JLabel positionLABEL;
    private javax.swing.JTextField positionsTF;
    private javax.swing.JLabel teamstructurecreateLABEL;
    private javax.swing.JPanel teamstructurecreatePANEL;
    private javax.swing.JLabel teamtypeLABEL;
    private javax.swing.JTextField teamtypeTF;
    // End of variables declaration//GEN-END:variables
}