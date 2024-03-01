/*

types of layouts:
1. Null Layout - when component position is defined by us
2. Border layout - top, down, left, right
3. Flow layout - arrange the component automatically
4. Grid layout - matrix
5. Grid bag layout - like grid(matrix) + resizable
6. Group layout - arrange group wise
7. Box layout - box type
8. Card layout - one at a time
        etc....

*/

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Flow Layout");
        jf.setBounds(100,100,600,800);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JButton btn1 = new JButton("button 1");
        JButton btn2 = new JButton("button 2");
        JButton btn3 = new JButton("button 3");
        JButton btn4 = new JButton("button 4");
        JButton btn5 = new JButton("button 5");
        JButton btn6 = new JButton("button 6");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER,20,50); // alligns according to width and height; CENTER,LEFT,RIGHT
        // hgap - horizontal gap; vgap -  vertical gap  (here b/w buttons)
//        fl.setVgap(20); can be defined as a function too
//        fl.setHgap(50);
        c.setLayout(fl);

        jf.setVisible(true);
    }
}
