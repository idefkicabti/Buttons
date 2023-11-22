package act;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Message{

    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 300;

    private JFrame frame;

    public Message() {
        initializeComponents();
        createAndShowGUI();
    }

    private void initializeComponents() {
        frame = new JFrame("Complex Java App");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null); // Free layout for custom placement

        JLabel label = new JLabel("Initial Message");
        label.setBounds(100, 100, 200, 50);
        panel.add(label);

        JButton button1 = new JButton("Change Message");
        button1.setBounds(50, 150, 150, 30);
        button1.addActionListener(new ChangeMessageButtonListener(label));
        panel.add(button1);

        JButton button2 = new JButton("Hide Message");
        button2.setBounds(210, 150, 150, 30);
        button2.addActionListener(new ToggleVisibilityButtonListener(label, button2));
        panel.add(button2);

        frame.getContentPane().add(panel);
    }

    private void createAndShowGUI() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Message();
    }
}