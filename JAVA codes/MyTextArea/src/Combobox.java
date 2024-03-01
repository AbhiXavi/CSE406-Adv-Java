import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combobox {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Combo Box");
        jf.setSize(700,900);
        jf.setLocationRelativeTo(null); // to place frame in middle
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        jf.setLayout(null);

        String[] menu = {"Pepsi", "Cola", "Mirinda", "7Up", "Sprite"};
        JComboBox jcb = new JComboBox(menu);
        jcb.setBounds(100,100,250,50);
        c.add(jcb);
        jcb.setFont(new Font("Arial",Font.ITALIC,25));
        jcb.addItem("Water"); // to add items other than that are present in menu array
        jcb.addItem("Milk");
        //jcb.removeItem("Milk"); // to remove items from list

        //jcb.setEditable(true); // enables editing in items

        //jcb.setSelectedItem("Water"); // by default selects Water, we can change afterwards
        jcb.setSelectedIndex(2); // select through index of arr

        JButton btn = new JButton("Selected item");
        btn.setBounds(120,300,300,50);
        btn.setFont(new Font("Arial",Font.BOLD,20));
        c.add(btn);

        JLabel jbl = new JLabel();
        jbl.setBounds(120,400,300,50);
        jbl.setFont(new Font("Arial",Font.BOLD,20));
        jbl.setForeground(Color.RED);
        c.add(jbl);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jcb.getSelectedItem().toString(); // jcb is an object, we have to convert it to string
                jbl.setText(s);
                // to display index
//                int s = jcb.getSelectedIndex();
//                jbl.setText(String.valueOf(s));

            }
        });

        JLabel price = new JLabel("Price:");
        price.setBounds(100,500,250,50);
        price.setFont(new Font("Arial",Font.BOLD,20));
        c.add(price);



        jf.setVisible(true);
    }
}
