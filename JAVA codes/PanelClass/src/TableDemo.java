import javax.swing.*;
import java.awt.*;

public class TableDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Table Demo");
        jf.setSize(800,800);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Container c = jf.getContentPane();
//        jf.setLayout(null);

        Object [][]data = {
                {"100","Abhi","21"},
                {"101","Pun","38"},
                {"102","Kateramma","100"},
                {"103","ksaks","55"},
                {"105","aksnaslk","12-12-1212"},
                {"106"},
                {"0","bOKKA"},
                {"0","","nai"}
        };


        String[] col = {"Roll No.","Name","Age"};
//        String data[][] = {
//                {"100","Abhi","21"},
//                {"101","Pun","38"},
//                {"102","Kateramma","100"},
//                {"103","ksaks","55"}
//        };


        JTable jt = new JTable(data,col);
        jf.add(new JScrollPane(jt));
        jt.setFont(new Font("Verdana",Font.BOLD,30));
        jt.setRowHeight(50);

        jf.setVisible(true);
    }
}
