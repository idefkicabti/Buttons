package act;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

// This class implements ActionListener to respond to button clicks
public class ToggleVisibilityButtonListener implements ActionListener{
    // The JLabel and JButton that this listener will modify
    private JLabel label;
    private JButton button;

    // Constructor for the ToggleVisibilityButtonListener class
    public ToggleVisibilityButtonListener(JLabel label, JButton button) {
        // Initialize the label and button
        this.label = label;
        this.button = button;
    }

    // This method is called whenever the button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        // If the label is currently visible
        if (label.isVisible()) {
            // Hide the label
            label.setVisible(false);
            // Change the button text to "Show Message"
            button.setText("Show Message");
        } else {
            // Otherwise, show the label
            label.setVisible(true);
            // And change the button text to "Hide Message"
            button.setText("Hide Message");
        }
    }
}
