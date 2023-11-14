package friday;

import java.awt.BorderLayout;

import javax.swing.*;

public class PasscodeVideoDisplay {
    private JFrame frame;
    private JTextField passcodeField;
    private JButton submitButton;

    public PasscodeVideoDisplay() {
        // Create a new frame
        frame = new JFrame();
        
        // Create a text field for the passcode
        passcodeField = new JTextField(9);
        passcodeField.setHorizontalAlignment(JTextField.CENTER);

        // Create a submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            // Get the text from the passcode field
            String passcode = passcodeField.getText();

            // Check if the passcode is correct
            if (passcode.equals("2622")) {
                System.out.println("IMONG MAMA");
            } 
            else {
                // Show an error message
                JOptionPane.showMessageDialog(frame, "Incorrect passcode.");
            }
        });

        // Add the text field and button to the frame
        frame.add(passcodeField, BorderLayout.NORTH);
        frame.add(submitButton, BorderLayout.CENTER);

        // Set the size of the frame and make it visible
        frame.pack();
        frame.setVisible(true);
    }
}