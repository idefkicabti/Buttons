import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PorJavaApp {
	public class ComplexJavaApp {

	    private static final int WINDOW_WIDTH = 400;
	    private static final int WINDOW_HEIGHT = 300;

	    private JFrame frame;
	    private JPanel panel;
	    private JLabel label;
	    private JButton button1;
	    private JButton button2;

	    public ComplexJavaApp() {
	        initializeComponents();
	        createAndShowGUI1();
	    }
	    
	    public void initializeComponents() {
	        frame = new JFrame("Complex Java App");
	        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        panel = new JPanel();
	        panel.setLayout(null); // Free layout for custom placement

	        label = new JLabel("Initial Message");
	        label.setBounds(100, 100, 200, 50);
	        panel.add(label);

	        button1 = new JButton("Change Message");
	        button1.setBounds(50, 150, 150, 30);
	        button1.addActionListener(new ChangeMessageButtonListener());
	        panel.add(button1);

	        button2 = new JButton("Toggle Visibility");
	        button2.setBounds(210, 150, 150, 30);
	        button2.addActionListener(new ToggleVisibilityButtonListener());
	        panel.add(button2);
	    }

	    public void createAndShowGUI1() {
	        frame.getContentPane().add(panel);
	        frame.setVisible(true);
	    }
	    public class ChangeMessageButtonListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            label.setText("Message Changed!");
	        }
	    }

	    public class ToggleVisibilityButtonListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            if (label.isVisible()) {
	                label.setVisible(false);
	            } else {
	                label.setVisible(true);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        new PorJavaApp();
	    }
	}
}