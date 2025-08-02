package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FriendlyPairChecker extends JFrame implements ActionListener {

    private JTextField inputField1, inputField2;
    private JLabel resultLabel;

    public FriendlyPairChecker() {
        // Frame setup
        setTitle("Friendly Pair Checker");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        setResizable(false);

        // Main panel with vertical BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(240, 230, 255)); // Light purple background

        // Title label
        JLabel titleLabel = new JLabel("Friendly Pair Checker");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setForeground(new Color(75, 0, 130)); // Dark purple
        mainPanel.add(titleLabel);

        // Add some vertical spacing
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Input field panel for first number
        JPanel inputPanel1 = new JPanel();
        inputPanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        inputPanel1.setBackground(new Color(240, 230, 255)); // Match background

        JLabel inputLabel1 = new JLabel("Enter first number:");
        inputLabel1.setFont(new Font("SansSerif", Font.PLAIN, 16));
        inputField1 = new JTextField(10);
        inputField1.setFont(new Font("SansSerif", Font.PLAIN, 16));

        inputPanel1.add(inputLabel1);
        inputPanel1.add(inputField1);

        // Input field panel for second number
        JPanel inputPanel2 = new JPanel();
        inputPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        inputPanel2.setBackground(new Color(240, 230, 255)); // Match background

        JLabel inputLabel2 = new JLabel("Enter second number:");
        inputLabel2.setFont(new Font("SansSerif", Font.PLAIN, 16));
        inputField2 = new JTextField(10);
        inputField2.setFont(new Font("SansSerif", Font.PLAIN, 16));

        inputPanel2.add(inputLabel2);
        inputPanel2.add(inputField2);

        // Add both input panels to main panel
        mainPanel.add(inputPanel1);
        mainPanel.add(inputPanel2);

        // Check button
        JButton checkButton = new JButton("Check");
        checkButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        checkButton.setBackground(new Color(138, 43, 226)); // Deep purple
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
        resultLabel.setForeground(new Color(138, 43, 226)); // Match button color
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        outputPanel.setLayout(new BorderLayout());
        outputPanel.add(resultLabel, BorderLayout.CENTER);

        mainPanel.add(outputPanel);

        // Add the main panel to the frame
        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input1 = inputField1.getText().trim();
        String input2 = inputField2.getText().trim();

        try {
            int number1 = Integer.parseInt(input1);
            int number2 = Integer.parseInt(input2);

            if (number1 <= 0 || number2 <= 0) {
                resultLabel.setText("Enter positive integers.");
                resultLabel.setForeground(Color.RED);
                return;
            }

            if (isFriendlyPair(number1, number2)) {
                resultLabel.setText(number1 + " and " + number2 + " are Friendly Pairs!");
                resultLabel.setForeground(new Color(0, 150, 0)); // Dark green success
            } else {
                resultLabel.setText(number1 + " and " + number2 + " are NOT Friendly Pairs.");
                resultLabel.setForeground(Color.RED);
            }

        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid integers.");
            resultLabel.setForeground(Color.RED);
        }
    }

    private boolean isFriendlyPair(int num1, int num2) {
        double ratio1 = (double) sumOfDivisors(num1) / num1;
        double ratio2 = (double) sumOfDivisors(num2) / num2;

        // Compare ratios up to 4 decimal places for precision
        return Math.abs(ratio1 - ratio2) < 0.0001;
    }

    private int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FriendlyPairChecker frame = new FriendlyPairChecker();
            frame.setVisible(true);
        });
    }
}
