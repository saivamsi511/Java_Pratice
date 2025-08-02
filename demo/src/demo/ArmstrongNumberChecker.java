package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArmstrongNumberChecker extends JFrame implements ActionListener {

    private JTextField inputField;
    private JLabel resultLabel;

    public ArmstrongNumberChecker() {
        // Frame setup
        setTitle("Armstrong Number Checker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        setResizable(false);

        // Main panel with vertical BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(230, 240, 255)); // Light blue

        // Title label
        JLabel titleLabel = new JLabel("Armstrong Number Checker");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setForeground(new Color(50, 50, 150));
        mainPanel.add(titleLabel);

        // Add some vertical spacing
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Input field panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        inputPanel.setBackground(new Color(230, 240, 255)); // Match background

        JLabel inputLabel = new JLabel("Enter a number:");
        inputLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        inputField = new JTextField(10);
        inputField.setFont(new Font("SansSerif", Font.PLAIN, 16));

        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        mainPanel.add(inputPanel);

        // Check button
        JButton checkButton = new JButton("Check");
        checkButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        checkButton.setBackground(new Color(70, 130, 180));
        checkButton.setForeground(Color.WHITE);
        checkButton.setFocusPainted(false);
        checkButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        checkButton.addActionListener(this);

        mainPanel.add(checkButton);

        // Add spacing
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Output Panel (Box for result without "Result" title)
        JPanel outputPanel = new JPanel();
        outputPanel.setPreferredSize(new Dimension(300, 60));
        outputPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); // Simple border without text
        outputPanel.setBackground(Color.WHITE);

        resultLabel = new JLabel("");
        resultLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        resultLabel.setForeground(new Color(0, 100, 0));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        outputPanel.setLayout(new BorderLayout());
        outputPanel.add(resultLabel, BorderLayout.CENTER);

        mainPanel.add(outputPanel);

        // Add the main panel to the frame
        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText().trim();
        try {
            int number = Integer.parseInt(input);
            if (isArmstrong(number)) {
                resultLabel.setText(number + " is an Armstrong number!");
                resultLabel.setForeground(new Color(0, 150, 0));
            } else {
                resultLabel.setText(number + " is NOT an Armstrong number.");
                resultLabel.setForeground(Color.RED);
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid integer.");
            resultLabel.setForeground(Color.RED);
        }
    }

    private boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArmstrongNumberChecker frame = new ArmstrongNumberChecker();
            frame.setVisible(true);
        });
    }
}



