import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class TextEditor implements ActionListener, Serializable {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu fl;
    private JMenuItem nw, op, sv, cl;
    private JPanel pn;
    private JTextArea area;
    
    public TextEditor() {
        fr = new JFrame("My Text Editor");
        mb = new JMenuBar();
        fl = new JMenu("File");
        
        pn = new JPanel();
        area = new JTextArea();
        
        mb.add(fl);
        pn.add(area);
        fr.setJMenuBar(mb);
        fr.add(area);
        
        nw = new JMenuItem("New");
        op = new JMenuItem("Open");
        sv = new JMenuItem("Save");
        cl = new JMenuItem("Close");
        
        fl.add(nw);
        fl.add(op);
        fl.add(sv);
        fl.addSeparator();
        fl.add(cl);
        
        nw.addActionListener(this);
        op.addActionListener(this);
        sv.addActionListener(this);
        cl.addActionListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,300);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nw)) {
            area.setText("");
        } else if (e.getSource().equals(cl)) {
            System.exit(0);
        } else if (e.getSource().equals(op)) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            try {
                FileReader frd = new FileReader(f);
                int st;
                while ((st = frd.read()) != -1) {
                    area.append((char)st + "");
                }
                frd.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        } else if (e.getSource().equals(sv)) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(f);
                fw.write(area.getText());
                fw.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        new TextEditor();
    }

}
