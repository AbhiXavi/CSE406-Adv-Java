import javax.swing.*;
import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("My panel demo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(800,600);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new FlowLayout());

//        JTextArea jta = new JTextArea(10,15);
//        jta.setFont(new Font("Verdana",Font.BOLD,30));
//        JScrollPane jsp = new JScrollPane(jta, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//        jta.setLineWrap(true);
//        jf.add(jsp);

        //////////////////////////////////

        String[] item = {"Tea","Coffee","Noodles","Burger","Pizza","Samosa","Dosa","Punugulu","Biryani"};
        JList<String> list = new JList<>(item);
        list.setFont(new Font("Verdana",Font.BOLD,25));
        JScrollPane jsp = new JScrollPane(list);
        jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jf.add(jsp);
        jsp.setBounds(200,100,100,50);


        jf.setVisible(true);

    }
}
