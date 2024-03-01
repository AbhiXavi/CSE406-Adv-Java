import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame implements ActionListener {
    JTextField ta;
    Container c;

    MyFrame1() {
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        ta = new JTextField();
        ta.setFont(new Font("Verdana",Font.BOLD,20));
        ta.setBounds(100,100,200,50);
        c.add(ta);

        ta.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ta.setText(ta.getText().toUpperCase());
    }
}
public class TextFieldListener {
    public static void main(String[] args) {
        MyFrame1 obj1 = new MyFrame1();
    }
}
