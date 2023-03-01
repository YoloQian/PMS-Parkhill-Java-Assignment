package assignment.assignment.SecurityManagementSystem;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
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
}