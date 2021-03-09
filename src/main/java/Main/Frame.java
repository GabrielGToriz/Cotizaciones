package Main;

import javax.swing.*;

public class Frame extends JFrame {
    private JLabel label1;
    public Frame(){
        setLayout(null);
        label1 = new JLabel("Hola mundo");
        label1.setBounds(10,20,200,300);
        add(label1);
    }
}
