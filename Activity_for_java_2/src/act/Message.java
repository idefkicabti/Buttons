package act;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Message{
    // Constants for the window size
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 300;

    // The main window frame for the application
    private JFrame frame;

    // Constructor for the Message class
    public Message() {
        // Initialize the components of the application
        initializeComponents();
        // Create and display the GUI
        createAndShowGUI();
    }

    // Method to initialize the components of the application
    private void initializeComponents() {
        // Create a new JFrame with the title "Complex Java App"
        frame = new JFrame("Complex Java App");
        // Set the size of the frame
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new JPanel
        JPanel panel = new JPanel();
        // Set the layout to null for custom placement of components
        panel.setLayout(null); 

        // Create a new JLabel with the initial message
        JLabel label = new JLabel("Initial Message");
        // Set the bounds of the label
        label.setBounds(100, 100, 200, 50);
        // Add the label to the panel
        panel.add(label);

        // Create a new JButton to change the message
        JButton button1 = new JButton("Change Message");
        // Set the bounds of the button
        button1.setBounds(50, 150, 150, 30);
        // Add an ActionListener to the button
        button1.addActionListener(new ChangeMessageButtonListener(label));
        // Add the button to the panel
        panel.add(button1);

        // Create a new JButton to hide the message
        JButton button2 = new JButton("Hide Message");
        // Set the bounds of the button
        button2.setBounds(210, 150, 150, 30);
        // Add an ActionListener to the button
        button2.addActionListener(new ToggleVisibilityButtonListener(label, button2));
        // Add the button to the panel
        panel.add(button2);

        // Add the panel to the frame
        frame.getContentPane().add(panel);
    }

    // Method to create and display the GUI
    private void createAndShowGUI() {
        // Set the frame to visible
        frame.setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        // Create a new instance of the Message class
        new Message();
    }
}
