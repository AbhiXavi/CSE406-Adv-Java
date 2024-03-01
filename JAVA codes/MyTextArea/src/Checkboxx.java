import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Checkboxx {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(1000,800);
        jf.setLocation(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBackground(Color.GRAY);

        Container c = jf.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial", Font.BOLD,20);

        JCheckBox b1 = new JCheckBox("Pizza - 100");
        JCheckBox b2 = new JCheckBox("PaniPuri - 50");
        JCheckBox b3 = new JCheckBox("Noodles - 120");
        JCheckBox b4 = new JCheckBox("Samosa - 15");
        JCheckBox b5 = new JCheckBox("Tea - 10");

        b1.setBounds(100,100,250,50);
        b2.setBounds(100,150,250,50);
        b3.setBounds(100,200,250,50);
        b4.setBounds(100,250,250,50);
        b5.setBounds(100,300,250,50);

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        JButton btn = new JButton("Place order");
        btn.setBounds(100,400,250,50);
        btn.setFont(f);
        btn.setForeground(Color.BLUE);
        c.add(btn);

        JLabel lb = new JLabel("Choose your item from menu");
        lb.setBounds(400,200,500,50);
        lb.setFont(f);
        lb.setForeground(Color.RED);
        c.add(lb);

        JLabel lbamount = new JLabel("Amount");
        lbamount.setBounds(100,350,250,50);
        lbamount.setFont(f);
        lbamount.setForeground(Color.RED);
        c.add(lbamount);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount=0;
                if(b1.isSelected())
                    amount=amount+100;
                if(b2.isSelected())
                    amount+=50;
                if(b3.isSelected())
                    amount+=120;
                if(b4.isSelected())
                    amount+=15;
                if(b5.isSelected())
                    amount+=10;
                lbamount.setText("Total Amount :"+amount);
            }
        });

        jf.setVisible(true);
    }
}
