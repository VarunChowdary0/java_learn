import javax.swing.*;
import java.awt.*;
public class MyCalCulator {
    public static String validate(char c,double num1,double num2){
        if(c == '+'){
            return (""+(num1+num2));
        }
        else if(c == '-'){
            return (""+(num1-num2));
        }
        else if(c == '*'){
            return (""+(num1*num2));
        }
        else if(c == '/'){
            if(num2==0){
                return ("0");   
            }
            else{
                return (""+(num1/num2));
            }
        }
        return "";
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JPanel main_p  = new JPanel();
        main_p.setLayout(new BoxLayout(main_p, BoxLayout.Y_AXIS));
        JPanel line_1 = new JPanel();
        line_1.setLayout(new BoxLayout(line_1,BoxLayout.X_AXIS));
        line_1.setSize(0, 100);
        JPanel line_2 = new JPanel(new GridLayout(4,4) );
        JTextField tf = new JTextField();
        JButton[] allButtons = new JButton[16];
        String[] butns = {"1","2","3","+","4","5","6","-","7","8","9","*","C","0","solve","/"}; 
        for(int i=0;i<16;i++){
            allButtons[i] = new JButton(butns[i]);
        }
       for(JButton b : allButtons){
        line_2.add(b);
       }
       for(JButton b : allButtons){
        b.addActionListener(e -> {
            JButton clickedButton = (JButton) e.getSource();
            String buttonValue = clickedButton.getText();
            if(!buttonValue.equals("solve") && !buttonValue.equals("C")){
                tf.setText(tf.getText()+buttonValue);
            }
            if(buttonValue.equals("C")){
                tf.setText("");
            }
            if(buttonValue.equals("solve")){
                double num1 = 0 ;
                double num2 = 0 ;
                String temp = "";
                int flag = 0;
                char op = '+';
                String eq_ = tf.getText() + "+100";
                int equation_len = eq_.length();
                for(int i=0;i<equation_len;i++){
                    char c = eq_.charAt(i);
                    if (c!='+' && c != '-' && c != '*' && c != '/') {
                        temp+=c;
                    }
                    else{
                        if (flag==0) {
                            num1 = Double.parseDouble(temp);
                            flag++;
                            op = c;
                        }
                        else if (flag==1){
                            num2 = Double.parseDouble(temp);
                            flag++;
                        }
                        temp = "";
                    }
                }
                if (flag>2) {
                    tf.setText("");
                }
                else{
                    tf.setText(validate(op, num1, num2));
                }
            }
        });
       }
        line_1.add(tf);
        main_p.add(line_1);
        main_p.add(line_2);
        frame.add(main_p);
        frame.setSize(300, 170);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
