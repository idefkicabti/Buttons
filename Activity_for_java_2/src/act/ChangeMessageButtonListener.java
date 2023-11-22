package act;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ChangeMessageButtonListener implements ActionListener{
	private JLabel label;

    public ChangeMessageButtonListener(JLabel label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Message Changed!");
    }
}