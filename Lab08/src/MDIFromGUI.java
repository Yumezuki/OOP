import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu file, edit, view, nev;
    private JMenuItem open, save, exit, win, mes;
    private JDesktopPane desktop;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo");
        desktop = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        nev = new JMenu("New");
        
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");
        win = new JMenuItem("Window");
        mes = new JMenuItem("Message");
        
        fr.setJMenuBar(mb);
        mb.add(file);
        mb.add(edit);
        mb.add(view);
        file.add(nev);
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);
        nev.add(win);
        nev.addSeparator();
        nev.add(mes);
        
        desktop.setBackground(Color.black);
        frame1.setBounds(40, 280, 300, 200);
        frame2.setBounds(280, 50, 300, 200);
        frame3.setBounds(620, 200, 300, 250);
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
        
        desktop.add(frame1);
        desktop.add(frame2);
        desktop.add(frame3);
        fr.add(desktop);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1000, 600);
        fr.setVisible(true);
    }
}
