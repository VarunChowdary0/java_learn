// package AAAB_GUI;

import java.awt.*;
public class First extends Frame {
    First(){
        Button button = new Button("click me");
        button.setBounds(30,100,80,30);
        add(button);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        First f  = new First();
    }
}