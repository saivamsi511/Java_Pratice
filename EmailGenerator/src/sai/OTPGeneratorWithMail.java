package sai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.*;

public class OTPGeneratorWithMail extends JFrame {

    private JTextField emailField;
    private JButton generate4DigitButton;
    private JButton generate6DigitButton;
    private JLabel resultLabel;

    // Replace with your email and app password!
    private final String senderEmail = "vamsivasu990@gmail.com";
    private final String senderPassword = "jfymeuaxutucofua";

    public OTPGeneratorWithMail() {
        setTitle("OTP Generator");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen

        // Panel and layout
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 248, 255));
        panel.setLayout(null);

        // Title
        JLabel titleLabel = new JLabel("OTP GENERATOR");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(70, 130, 180));
        titleLabel.setBounds(150, 20, 250, 30);
        panel.add(titleLabel);

        // Email label
        JLabel emailLabel = new JLabel("Enter your Email ID:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        emailLabel.setBounds(50, 80, 200, 25);
        panel.add(emailLabel);

        // Email field
        emailField = new JTextField();
        emailField.setBounds(220, 80, 200, 25);
        panel.add(emailField);

        // 4-digit OTP button
        generate4DigitButton = new JButton("Generate 4-digit OTP");
        generate4DigitButton.setBounds(50, 150, 180, 40);
        generate4DigitButton.setBackground(new Color(100, 149, 237));
        generate4DigitButton.setForeground(Color.WHITE);
        panel.add(generate4DigitButton);

        // 6-digit OTP button
        generate6DigitButton = new JButton("Generate 6-digit OTP");
        generate6DigitButton.setBounds(240, 150, 180, 40);
        generate6DigitButton.setBackground(new Color(100, 149, 237));
        generate6DigitButton.setForeground(Color.WHITE);
        panel.add(generate6DigitButton);

        // Result label
        resultLabel = new JLabel(" ");
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        resultLabel.setBounds(50, 220, 400, 40);
        panel.add(resultLabel);

        // Add action listeners
        generate4DigitButton.addActionListener(e -> generateAndSendOTP(4));
        generate6DigitButton.addActionListener(e -> generateAndSendOTP(6));

        add(panel);
    }

    private void generateAndSendOTP(int length) {
        String recipientEmail = emailField.getText().trim();

        if (recipientEmail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your email!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String otp = generateOTP(length);
        boolean sent = sendEmail(recipientEmail, otp);

        if (sent) {
            resultLabel.setText("OTP " + otp + " sent to " + recipientEmail);
        } else {
            resultLabel.setText("Failed to send OTP.");
        }
    }

    private String generateOTP(int length) {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < length; i++) {
            otp.append(random.nextInt(10));
        }

        return otp.toString();
    }

    private boolean sendEmail(String recipient, String otp) {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject("Your OTP Code");
            message.setText("Hello,\n\nYour OTP is: " + otp + "\n\nRegards,\nOTP Generator App");

            Transport.send(message);
            System.out.println("Email sent!");
            return true;

        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new OTPGeneratorWithMail().setVisible(true);
        });
    }
}
