import javax.swing.*;

/*
Menu bar parts:
1. menu bar
2. menus
3. menuitem
*/
public class MyMenuBar {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Menu Demo");
        jf.setSize(800,800);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Menubar
        JMenuBar menubar = new JMenuBar();

        //Menus
        JMenu file = new JMenu("File");
        //Menuitem
        JMenuItem f1 = new JMenuItem("new");
        JMenuItem f2 = new JMenuItem("open");
        JMenuItem f3 = new JMenuItem("save");

        file.add(f1);
        file.add(f2);
        file.add(f3);

        //Menus
        JMenu edit = new JMenu("Edit");
        //MenuItem
        JMenuItem e1 = new JMenuItem("cut");
        JMenuItem e2 = new JMenuItem("copy");
        JMenuItem e3 = new JMenuItem("paste");

        edit.add(e1);
        edit.add(e2);
        edit.add(e3);

//        file.add(edit) //add submenu to file option

        //add menus with menubar
        menubar.add(file);
        menubar.add(edit);

        //add menubar to frame
//        jf.add(menubar);
        jf.setJMenuBar(menubar);


        jf.setVisible(true);

    }
}
