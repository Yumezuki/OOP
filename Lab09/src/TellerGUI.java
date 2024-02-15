import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel balance, amount;
    private JTextField box, num;
    private JButton deposit, withdraw, exit;
    private Account acct;
    private double total;
    
    public TellerGUI(){
        acct = new Account(6000, "");
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        balance = new JLabel("  Balance");
        amount = new JLabel("  Amount");
        num = new JTextField(String.valueOf(acct.getBalance()));
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
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        
        fr.setLayout(new GridLayout(2,1));
        p1.setLayout(new GridLayout(2,2));
        num.setEditable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        total = Double.parseDouble(box.getText());
        if (e.getSource().equals(deposit)) {
            acct.setBalance(acct.getBalance() + total);
        }
        else if (e.getSource().equals(withdraw) && acct.getBalance() >= total) {
            acct.setBalance(acct.getBalance() - total);
        }
        num.setText("" + acct.getBalance());
        box.setText("");
    }
}
