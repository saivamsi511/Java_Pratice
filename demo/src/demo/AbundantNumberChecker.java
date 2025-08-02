package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AbundantNumberChecker extends JFrame implements ActionListener {

    private JTextField inputField;
    private JLabel resultLabel;

    public AbundantNumberChecker() {
        // Frame setup
        setTitle("Abundant Number Checker");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        setResizable(false);

        // Main panel with vertical BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(255, 255, 220)); // Light yellow background

        // Title label
        JLabel titleLabel = new JLabel("Abundant Number Checker");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setForeground(new Color(139, 69, 19)); // Dark brown color
        mainPanel.add(titleLabel);

        // Add some vertical spacing
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Input field panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        inputPanel.setBackground(new Color(255, 255, 220)); // Match background

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
        checkButton.setBackground(new Color(255, 140, 0)); // Dark orange
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
        resultLabel.setForeground(new Color(255, 140, 0)); // Match button color
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
            if (number <= 0) {
                resultLabel.setText("Enter a positive integer.");
                resultLabel.setForeground(Color.RED);
                return;
            }
            if (isAbundant(number)) {
                resultLabel.setText(number + " is an Abundant number!");
                resultLabel.setForeground(new Color(0, 150, 0)); // Dark green success message
            } else {
                resultLabel.setText(number + " is NOT an Abundant number.");
                resultLabel.setForeground(Color.RED);
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid integer.");
            resultLabel.setForeground(Color.RED);
        }
    }

    private boolean isAbundant(int number) {
        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum > number;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AbundantNumberChecker frame = new AbundantNumberChecker();
            frame.setVisible(true);
        });
    }
}
