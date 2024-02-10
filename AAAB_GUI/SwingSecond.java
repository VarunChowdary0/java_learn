import javax.swing.*;

/**
 * SwingSecond
 */
public class SwingSecond {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton b1 = new JButton("click");
        JPanel panel = new JPanel();
        JLabel lable1 = new JLabel("This is lable");
        JTextField tf = new JTextField();

        tf.setBounds(10,10,200,50);

        b1.setBounds(30,30,100,50);
        panel.add(lable1);
        frame.add(tf);
        panel.add(b1);
        frame.add(panel);

        frame.setSize(500,400);
        frame.setVisible(true);

    }
}