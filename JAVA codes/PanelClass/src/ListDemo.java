// List  - alternative to check box

import javax.swing.*;
import java.awt.*;

class MyList extends JFrame {
    String values[]= {"one","two","three","four","five","six","seven","eight","nine","ten"};
    MyList() {
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JList list = new JList(values);
        list.setFont(new Font("Arial",Font.BOLD,25));
        list.setVisibleRowCount(4); // to set how many options should appear in scroll bar without scrolling
        JPanel jp = new JPanel();
        add(jp);
        jp.add(new JScrollPane(list));
        revalidate();
    }
}
public class ListDemo {
    public static void main(String[] args) {
        MyList obj1 = new MyList();
    }
}
