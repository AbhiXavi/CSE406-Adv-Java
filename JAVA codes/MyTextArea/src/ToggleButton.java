import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyToggleButton extends JFrame implements ActionListener {
    Container c;
    JToggleButton btnTg;
    MyToggleButton() {
        JFrame jf = new JFrame("My toggle Button");
        jf.setBounds(200,200,500,650);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = jf.getContentPane();
        jf.setLayout(null);

        btnTg = new JToggleButton("CLICK ME");
        btnTg.setBounds(200,200,100,50);
        c.add(btnTg);
        btnTg.addActionListener(this);

        jf.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(btnTg.isSelected()) {
            c.setBackground(Color.BLUE);
            btnTg.setText("Click for yellow");
        } else {
            c.setBackground(Color.YELLOW);
            btnTg.setText("click for blue");
        }
    }
}
public class ToggleButton {
    public static void main(String[] args) {
        MyToggleButton b1 = new MyToggleButton();
    }
}
