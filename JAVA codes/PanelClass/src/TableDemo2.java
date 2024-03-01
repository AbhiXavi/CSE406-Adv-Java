import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableDemo2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Table Demo");
        jf.setSize(800,800);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] col = {"Roll No.","Name","Age"};
        String data[][] = {
                {"100","Abhi","21"},
                {"101","Pun","38"},
                {"102","Kateramma","100"},
                {"103","ksaks","55"}
        };
        DefaultTableModel dtm = new DefaultTableModel(data,col);

        JTable jt = new JTable(dtm);
        jf.add(new JScrollPane(jt));
        jt.setFont(new Font("Verdana",Font.ITALIC,20));

    }
}
