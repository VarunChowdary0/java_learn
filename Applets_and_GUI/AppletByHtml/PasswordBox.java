package Applets_and_GUI.AppletByHtml;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordBox extends JFrame {
    private JTextField passwordField;
    private JLabel resultLabel;

    public PasswordBox() {
        setTitle("Enter Your Password");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JLabel titleLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        JButton submitButton = new JButton("Submit");
        resultLabel = new JLabel("");

        add(titleLabel);
        add(passwordField);
        add(submitButton);
        add(resultLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkPassword();
            }
        });
    }

    private void checkPassword() {
        String enteredPassword = passwordField.getText();
        String correctPassword = "your_secret_password"; // Replace with your actual password

        if (enteredPassword.equals(correctPassword)) {
            resultLabel.setText("Password Correct!");
        } else {
            resultLabel.setText("Incorrect Password. Try again.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PasswordBox().setVisible(true);
            }
        });
    }
}
