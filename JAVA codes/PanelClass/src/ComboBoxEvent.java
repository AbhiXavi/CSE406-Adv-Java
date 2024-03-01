import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Myframe4 extends JFrame implements ItemListener {
    JComboBox cb1;
    JTextArea ta1;
    Myframe4() {
        Container c = getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial",Font.BOLD,25);

        String[] s = {"Apple","Bna","org","toma","pota"};
        cb1 = new JComboBox<String>(s);
        cb1.setBounds(100,100,300,50);
        cb1.setFont(f);
        c.add(cb1);
        cb1.addItemListener(this);

        ta1 = new JTextArea(3,10);
        ta1.setBounds(100,300,300,150);
        ta1.setFont(f);
        c.add(ta1);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = ta1.getText();
        ta1.setText(cb1.getSelectedItem().toString());
    }
}
public class ComboBoxEvent {
    public static void main(String[] args) {
        Myframe4 obj1 = new Myframe4();
        obj1.setTitle("Item event handling");
        obj1.setBounds(100,100,600,600);
        obj1.setLocationRelativeTo(null);

        obj1.setVisible(true);
    }
}
