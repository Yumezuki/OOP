import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel balance, num, amount;
    private JTextField box;
    private JButton deposit, withdraw, exit;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        balance = new JLabel("  Balance");
        num = new JLabel("6000");
        amount = new JLabel("  Amount");
        box = new JTextField();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        
        p1.add(balance);
        p1.add(num);
        p1.add(amount);
        p1.add(box);
        p2.add(deposit);
        p2.add(withdraw);
        p2.add(exit);
        fr.add(p1);
        fr.add(p2);
        
        fr.setLayout(new GridLayout(2,1));
        p1.setLayout(new GridLayout(2,2));
        num.setEnabled(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setVisible(true);
    }
}
