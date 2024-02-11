import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _AddNumbers {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Nums");
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

        JPanel panel_a = new JPanel();
        JPanel panel_b = new JPanel();
        JTextField num1 = new JTextField(10);
        JTextField num2 = new JTextField(10);

        JButton button = new JButton("Add");

        JLabel resuLabel = new JLabel("Result: ");

        panel_a.add(new JLabel("Enter first number: "));
        panel_a.add(num1);
        panel_b.add(new JLabel("Enter Second number: "));
        panel_b.add(num2);
        panel_1.add(panel_a);
        panel_1.add(panel_b);
        panel_1.add(button);
        panel_1.add(resuLabel);
        frame.add(panel_1);
        frame.setSize(300,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(e -> {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());

            try{
                double sum = n1 + n2 ;

                resuLabel.setText("Result: "+sum);
            }
            catch(Exception E){
                resuLabel.setText("Error");
                E.printStackTrace();
            }
        });
    }
}
