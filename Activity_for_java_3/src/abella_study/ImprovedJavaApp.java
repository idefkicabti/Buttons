package abella_study;

import java.awt.*;
import javax.swing.*;

public class ImprovedJavaApp {

    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 300;

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button1;
    private JButton button2;

    public ImprovedJavaApp() {
        initializeComponents();
        createAndShowGUI();
    }

    private void initializeComponents() {
        frame = new JFrame("Improved Java App");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Using FlowLayout

        label = new JLabel("Initial Message");
        panel.add(label);

        button1 = new JButton("Change Message");
        button1.addActionListener(e -> label.setText("Message Changed!")); // Using lambda expression
        panel.add(button1);

        button2 = new JButton("Toggle Visibility");
        button2.addActionListener(e -> label.setVisible(!label.isVisible())); // Using lambda expression
        panel.add(button2);
    }

    private void createAndShowGUI() {
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ImprovedJavaApp();
    }
}