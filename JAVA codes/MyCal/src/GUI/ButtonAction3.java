package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RedClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonAction3.c.setBackground(Color.RED);
    }
}
class YellowClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonAction3.c.setBackground(Color.YELLOW);
    }
}
class GreenClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ButtonAction3.c.setBackground(Color.GREEN);
    }
}

public class ButtonAction3 {

    public static Container c;
    public static void main(String[] args) {
        JFrame jf = new JFrame("Button Action 3");
        jf.setBounds(100,200,700,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JButton btnRed = new JButton("RED");
        JButton btnYellow = new JButton("Yellow");
        JButton btnGreen = new JButton("Green");

        btnRed.setBounds(100,50,100,50);
        btnYellow.setBounds(200,50,100,50);
        btnGreen.setBounds(300,50,100,50);

        c.add(btnRed);
        c.add(btnYellow);
        c.add(btnGreen);

        jf.setVisible(true);


    }
}
