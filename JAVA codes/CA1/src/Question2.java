import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;

class CanMen extends JFrame implements ActionListener {
    JCheckBox piz,sam,bir,pp,cd;
    JLabel label1,label2;
    Container c;

    JButton btn;

    CanMen() {
        setBounds(100,100,800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.LIGHT_GRAY);
        c=getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,25);

        piz = new JCheckBox("PIZZA - 100");
        piz.setBounds(100,100,250,50);
        piz.setFont(f);
        c.add(piz);

        sam = new JCheckBox("SAMOSA-20");
        sam.setBounds(100,150,250,50);
        sam.setFont(f);
        c.add(sam);

        bir = new JCheckBox("BIRYANI-150");
        bir.setBounds(100,200,250,50);
        bir.setFont(f);
        c.add(bir);

        pp = new JCheckBox("PANIPURI-30");
        pp.setBounds(100,250,250,50);
        pp.setFont(f);
        c.add(pp);

        cd = new JCheckBox("COOLDRINK-20");
        cd.setBounds(100,300,250,50);
        cd.setFont(f);
        c.add(cd);

        label1 = new JLabel("Choose your items");
        label1.setBounds(400,200,500,50);
        label1.setFont(f);
        label1.setForeground(Color.BLUE);
        c.add(label1);

        label2 = new JLabel("Amount");
        label2.setBounds(100,350,250,50);
        label2.setForeground(Color.RED);
        label2.setFont(f);
        c.add(label2);

        btn = new JButton("Order");
        btn.setBounds(100,400,250,50);
        btn.setFont(f);
        btn.setBackground(Color.BLUE);
        btn.setForeground(Color.RED);
        btn.addActionListener(this);
        c.add(btn);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int amount=0;
        if(piz.isSelected())
            amount=amount+100;
        if(sam.isSelected())
            amount+=20;
        if(bir.isSelected())
            amount+=150;
        if(pp.isSelected())
            amount+=30;
        if(cd.isSelected())
            amount+=20;
        label2.setText("Total Amount :"+amount);
    }
}

public class Question2 {
    public static void main(String[] args) {
        CanMen obj1 = new CanMen();
        obj1.setTitle("Canteen Menu");
    }
}
