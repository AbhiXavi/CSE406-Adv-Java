import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calcu extends JFrame implements ActionListener {
    JLabel label1,label2,labelresult;
    JTextField txt1,txt2;
    Container c;
    JButton add,sub,mul;

    Calcu() {
        setTitle("calculator");
        setBounds(100,100,500,500);

        c = getContentPane();
        c.setLayout(null);

        label1 =new JLabel("First Number : ");
        label1.setBounds(50,50,150,50);
        c.add(label1);
        //label1.setFont(f);

        label2 =new JLabel("Second Number : ");
        label2.setBounds(50,150,150,50);
        c.add(label2);
        //label2.setFont(f);

        labelresult =new JLabel("Result : ");
        labelresult.setBounds(50,350,700,50);
        c.add(labelresult);
        //labelresult.setFont(f);
        labelresult.setForeground(Color.RED);

        txt1=new JTextField(0);
        txt1.setBounds(250,50,150,50);
        c.add(txt1);
        //txt1.setFont(f);

        txt2=new JTextField(0);
        txt2.setBounds(250,150,150,50);
        c.add(txt2);
        //txt2.setFont(f);

        add=new JButton("+");
        add.setBounds(50, 250,100,50);
        c.add(add);
        //add.setFont(f);
        add.addActionListener(this);

        sub=new JButton("-");
        sub.setBounds(200, 250,100,50);
        c.add(sub);
        //sub.setFont(f);
        sub.addActionListener(this);

        mul=new JButton("*");
        mul.setBounds(350, 250,100,50);
        c.add(mul);
        //mul.setFont(f);
        mul.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add) {
            txt
        }
    }
}
public class Calc {
    public static void main(String[] args) {

    }
}
