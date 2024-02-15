import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnc, btne, btnp, btnmi, btnmu, btnd;
    double result, num;
    String show="", op="";
    
    public CalculatorSample(){
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
        
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnc.addActionListener(this);
        btne.addActionListener(this);
        btnp.addActionListener(this);
        btnmi.addActionListener(this);
        btnmu.addActionListener(this);
        btnd.addActionListener(this);
        
        p.setLayout(new GridLayout(4,4));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txt.setEditable(false);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn0)){
            txt.setText(show + "0");
            show += "0";
        } else if (e.getSource().equals(btn1)) {
            txt.setText(show + "1");
            show += "1";
        } else if (e.getSource().equals(btn2)) {
            txt.setText(show + "2");
            show += "2";
        } else if (e.getSource().equals(btn3)) {
            txt.setText(show + "3");
            show += "3";
        } else if (e.getSource().equals(btn4)) {
            txt.setText(show + "4");
            show += "4";
        } else if (e.getSource().equals(btn5)) {
            txt.setText(show + "5");
            show += "5";
        } else if (e.getSource().equals(btn6)) {
            txt.setText(show + "6");
            show += "6";
        } else if (e.getSource().equals(btn7)) {
            txt.setText(show + "7");
            show += "7";
        } else if (e.getSource().equals(btn8)) {
            txt.setText(show + "8");
            show += "8";
        } else if (e.getSource().equals(btn9)) {
            txt.setText(show + "9");
            show += "9";
        } else if (e.getSource().equals(btnc)) {
            txt.setText("");
            show = "";
        } else if (e.getSource().equals(btnp)) {
            txt.setText("");
            result = Double.parseDouble(show);
            show = "";
            op = "+";
        } else if (e.getSource().equals(btnmi)) {
            txt.setText("");
            result = Double.parseDouble(show);
            show = "";
            op = "-";
        } else if (e.getSource().equals(btnmu)) {
            txt.setText("");
            result = Double.parseDouble(show);
            show = "";
            op = "*";
        } else if (e.getSource().equals(btnd)) {
            txt.setText("");
            result = Double.parseDouble(show);
            show = "";
            op = "/";
        } else if (e.getSource().equals(btne)) {
            num = Double.parseDouble(show);
            switch (op) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    result /= num;
                    break;
                default:
                    break;
            }
            txt.setText(result + "");
            show = "";
        } 
    }
}
