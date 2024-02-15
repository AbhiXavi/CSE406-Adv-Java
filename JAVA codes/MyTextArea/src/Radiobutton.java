import javax.swing.*;
import java.awt.*;

public class Radiobutton {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(800,600);
        jf.setLocation(100,100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBackground(Color.LIGHT_GRAY);

        Container c = jf.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial", Font.BOLD,20);

        JRadioButton rdm = new JRadioButton("Male");
        rdm.setBounds(100,100,200,50);
        c.add(rdm);
        rdm.setFont(f);


        JRadioButton rdf = new JRadioButton("Female");
        rdf.setBounds(300,100,200,50);
        c.add(rdf);
        rdf.setFont(f);
            /////

        JRadioButton gen = new JRadioButton("General");
        gen.setBounds(100,400,200,50);
        c.add(gen);
        gen.setFont(f);

        JRadioButton obc = new JRadioButton("OBC");
        obc.setBounds(150,400,200,50);
        c.add(obc);
        obc.setFont(f);

        JRadioButton sc = new JRadioButton("SC");
        sc.setBounds(200,400,200,50);
        c.add(sc);
        sc.setFont(f);

        JRadioButton st = new JRadioButton("ST");
        st.setBounds(300,400,200,50);
        c.add(st);
        st.setFont(f);

        JRadioButton oth = new JRadioButton("Others");
        oth.setBounds(350,400,200,50);
        c.add(oth);
        oth.setFont(f);

        ButtonGroup gender = new ButtonGroup();
        gender.add(rdm);
        gender.add(rdf);
        rdf.setSelected(true); // by default female button is selected
        rdf.setEnabled(false); // female button is disabled

        ButtonGroup cas = new ButtonGroup();
        cas.add(gen);
        cas.add(obc);
        cas.add(sc);
        cas.add(st);
        cas.add(oth);

        jf.setVisible(true);

    }
}
