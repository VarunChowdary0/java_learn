/**
 * SwingFirst
 */

 import javax.swing.*;
public class SwingFirst {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click !");

        button.setBounds(30,100,80,30);
        button.setBorder(null);
        frame.add(button);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}