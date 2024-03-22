import java.awt.*;
import javax.swing.*;
import java.util.*;

public class BookView {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel n, p, t;
    private JTextField tn, tp, btw;
    private JComboBox cbt;
    private JButton left, right, ad, up, dl;
    private ArrayList<Book> book;
    private String bt[] = {"General", "Computer", "Math&Sci", "Photo"};
    
    public BookView() {
        fr = new JFrame();
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        n = new JLabel(" Name");
        p = new JLabel(" Price");
        t = new JLabel(" Type");
        
        tn = new JTextField();
        tp = new JTextField();
        btw = new JTextField("0",3);
        
        cbt = new JComboBox(bt);
        cbt.setSelectedItem(bt[0]);
        
        left = new JButton("<<<");
        right = new JButton(">>>");
        ad = new JButton("Add");
        up = new JButton("Update");
        dl = new JButton("Delete");
        
        fr.setLayout(new BorderLayout());
        p1.add(n);
        p1.add(tn);
        p1.add(p);
        p1.add(tp);
        p1.add(t);
        p1.add(cbt);
        
        p2.add(left);
        p2.add(btw);
        p2.add(right);
        
        p3.add(ad);
        p3.add(up);
        p3.add(dl);
        
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.add(p3, BorderLayout.SOUTH);
                
        p1.setLayout(new GridLayout(3,2));
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new BookView();
    }
}
