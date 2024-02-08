import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnc, btne, btnp, btnmi, btnmu, btnd;
    
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        txt = new JTextField();
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnc = new JButton("c");
        btne = new JButton("=");
        btnp = new JButton("+");
        btnmi = new JButton("-");
        btnmu = new JButton("X");
        btnd = new JButton("/");
        
        fr.add(txt, BorderLayout.NORTH);
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btnp);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btnmi);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btnmu);
        p.add(btn0);
        p.add(btnc);
        p.add(btne);
        p.add(btnd);
        fr.add(p);
        
        p.setLayout(new GridLayout(4,4));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);
        
    }
}
