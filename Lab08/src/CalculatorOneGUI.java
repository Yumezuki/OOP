import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3, btn4;

    public CalculatorOneGUI() {
        fr = new JFrame("Calculator");
        p = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        btn1 = new JButton("Add");
        btn2 = new JButton("Minus");
        btn3 = new JButton("Multiply");
        btn4 = new JButton("Divide");
        txt3 = new JTextField();
        
        fr.add(txt1);
        fr.add(txt2);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        fr.add(p);
        fr.add(txt3);
        
        fr.setLayout(new GridLayout(4, 1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
