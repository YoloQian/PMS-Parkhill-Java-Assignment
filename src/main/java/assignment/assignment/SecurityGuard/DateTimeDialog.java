package assignment.assignment.SecurityGuard;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class DateTimeDialog extends JDialog {
    private JSpinner timeSpinner;
    private Date selectedDate;

    public DateTimeDialog(Window owner) {
        super(owner, Dialog.ModalityType.APPLICATION_MODAL);
        setTitle("Choose Date and Time");
        setLayout(new BorderLayout());

        timeSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "yyyy-MM-dd HH:mm:ss");
        timeSpinner.setEditor(timeEditor);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedDate = (Date) timeSpinner.getValue();
                dispose();
            }
        });
        buttonPanel.add(okButton);

        add(timeSpinner, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(owner);
    }

    public Date getSelectedDate() {
        return selectedDate;
    }
    
    public static void showDateTimeDialog(JLabel Label) {
        DateTimeDialog dialog = new DateTimeDialog(null);
        dialog.setVisible(true);
        Date selectedDate = dialog.getSelectedDate();
        if (selectedDate != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Label.setText(format.format(selectedDate));
        }
    }
    public static void setComboBox(JComboBox comboBox, int integer, String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/assignment/assignment/TxtFile/" + filename))) {
            List<String> Names = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String Name = parts[0];
                String checkOutDateTime = "";
                String patrolTime = "";
                
                if (parts.length >= 3) {
                    patrolTime = parts[2];
                }

                if (parts.length >= integer) {
                    checkOutDateTime = parts[integer-1];
                }

                if (filename.equals("PatrolSchedule.txt")) {
                    if (patrolTime.isEmpty()) {
                        Names.add(Name);
                    }
                } else if (parts[4].equals("Open")) {
                    Names.add(Name);
                } else if (filename.equals("VisitorEntry.txt")) {
                    if (checkOutDateTime.isEmpty()) {
                        Names.add(Name);
                    }
                }
            }

            // populate the combo box with visitor names that do not have a check-out date and time
            comboBox.setModel(new DefaultComboBoxModel<>(Names.toArray(String[]::new)));

        } catch (IOException e) {
            // handle exception
        }
        comboBox.setSelectedItem(null);
    }
}