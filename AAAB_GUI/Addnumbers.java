// import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Addnumbers implements ActionListener {
    JTextField f1, f2;
    JLabel label;

    public Addnumbers() {
        JFrame frame = new JFrame("Add Numbers");
        JPanel panel = new JPanel();
        f1 = new JTextField(10);
        f2 = new JTextField(10);
        JButton button = new JButton("Solve");
        label = new JLabel("Result: ");

        button.addActionListener(this);

        panel.add(f1);
        panel.add(f2);
        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Solve")) {
            try {
                int num1 = Integer.parseInt(f1.getText());
                int num2 = Integer.parseInt(f2.getText());
                int result = num1 + num2;
                label.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
            }
        }
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(Addnumbers::new);\
            new Addnumbers();
    }
}
