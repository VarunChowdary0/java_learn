import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField displayField;
    private JButton[] digitButtons;
    private JButton[] operatorButtons;

    private String currentInput;
    private String currentOperator;
    private double result;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize variables
        displayField = new JTextField(10);
        displayField.setEditable(false);
        currentInput = "";
        currentOperator = "";
        result = 0;

        // Create digit buttons
        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            digitButtons[i].addActionListener(this);
        }

        // Create operator buttons
        operatorButtons = new JButton[5];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        operatorButtons[4] = new JButton("=");

        for (JButton button : operatorButtons) {
            button.addActionListener(this);
        }

        // Create layout
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        for (int i = 1; i < digitButtons.length; i++) {
            buttonPanel.add(digitButtons[i]);
        }
        buttonPanel.add(operatorButtons[0]);
        buttonPanel.add(digitButtons[0]);
        buttonPanel.add(operatorButtons[1]);
        buttonPanel.add(operatorButtons[2]);
        buttonPanel.add(operatorButtons[3]);
        buttonPanel.add(operatorButtons[4]);

        setLayout(new BorderLayout());
        add(displayField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (Character.isDigit(actionCommand.charAt(0))) {
            currentInput += actionCommand;
            displayField.setText(currentInput);
        } else if (actionCommand.equals("+") || actionCommand.equals("-") ||
                actionCommand.equals("*") || actionCommand.equals("/")) {
            if (!currentInput.isEmpty()) {
                result = Double.parseDouble(currentInput);
                currentOperator = actionCommand;
                currentInput = "";
            }
        } else if (actionCommand.equals("=")) {
            if (!currentInput.isEmpty() && !currentOperator.isEmpty()) {
                try {
                    double secondOperand = Double.parseDouble(currentInput);
                    switch (currentOperator) {
                        case "+":
                            result += secondOperand;
                            break;
                        case "-":
                            result -= secondOperand;
                            break;
                        case "*":
                            result *= secondOperand;
                            break;
                        case "/":
                            if (secondOperand == 0) {
                                throw new ArithmeticException("Division by zero");
                            }
                            result /= secondOperand;
                            break;
                    }
                    displayField.setText(String.valueOf(result));
                    currentInput = "";
                    currentOperator = "";
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(this, "Division by zero", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator());
    }
}
