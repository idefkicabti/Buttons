package act;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ToggleVisibilityButtonListener implements ActionListener{
	private JLabel label;
	private JButton button;

    public ToggleVisibilityButtonListener(JLabel label, JButton button) {
        this.label = label;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if (label.isVisible()) {
            label.setVisible(false);
            button.setText("Show Message");
        } else {
            label.setVisible(true);
            button.setText("Hide Message");
        }
    }
}