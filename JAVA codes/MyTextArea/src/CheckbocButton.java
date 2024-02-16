import javax.swing.*;
import java.awt.*;

public class CheckbocButton {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(1000,2000);
        jf.setLocation(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBackground(Color.LIGHT_GRAY);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JCheckBox b1 = new JCheckBox("SSC");
        JCheckBox b2 = new JCheckBox("Intermediate");
        JCheckBox b3 = new JCheckBox("Graduation");
        JCheckBox b4 = new JCheckBox("PG");
        JCheckBox b5 = new JCheckBox("Ph.D");

        b1.setBounds(100,100,250,50);
        b1.setBounds(100,150,250,50);
        b1.setBounds(100,200,250,50);
        b1.setBounds(100,250,250,50);
        b1.setBounds(100,300,250,50);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        Font f = new Font("Arial",Font.BOLD,20);
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);

        b1.setSelected(true);
        b2.setSelected(true);
        //b5.setEnabled(false);


        jf.setVisible(true);
    }
}
