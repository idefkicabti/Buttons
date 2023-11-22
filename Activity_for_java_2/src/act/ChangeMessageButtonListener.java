package act;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

//This class implements the ActionListener interface, which means it can respond to events (like button clicks)
public class ChangeMessageButtonListener implements ActionListener{
	// A reference to a JLabel that this listener will modify
	private JLabel label;
    // The constructor takes a JLabel as a parameter and stores it in the 'label' field
    public ChangeMessageButtonListener(JLabel label) {
        this.label = label;
    }
    // This method is called whenever the event occurs (in this case, when the button is clicked)
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Message Changed!");
    }
}
