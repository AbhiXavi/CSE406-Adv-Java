import javax.swing.*;
import java.awt.*;

class Registration extends JFrame {
    JLabel labName,labPass,labMob,labDob,labGen,labCas,labAdd;
    JTextField jfName,jfPass,jfMob;
    JTextArea address;
    Container c;

    Registration() {
        JFrame jf = new JFrame();
        jf.setBounds(200,200,600,1000);

        c = jf.getContentPane();
        jf.setLayout(null);

        //Name
        labName = new JLabel("Name : ");
        labName.setBounds(10,100,150,50);
        labName.setFont(new Font("Arial",Font.BOLD,20));
        c.add(labName);

        jfName = new JTextField();
        jfName.setBounds(110,100,200,50);
        c.add(jfName);

        //Password
        

        jf.setVisible(true);
    }
}
public class RegForm {
    public static void main(String[] args) {
        Registration rg1 = new Registration();
    }
}
