import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class StudentView implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel panel1, panel2;
    private JLabel id, name, money;
    private JTextField txt_id, txt_name, txt_money;
    private JButton dps, wd;
    private Student std;
    private int num;
    
    public StudentView() {
        std = new Student();
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        id = new JLabel(" ID : ");
        name = new JLabel(" Name : ");
        money = new JLabel(" Money : ");
        txt_id = new JTextField(10);
        txt_name = new JTextField(10);
        txt_money = new JTextField("" + std.getMoney());
        dps = new JButton("Deposit");
        wd = new JButton("Withdraw");
        
        txt_money.setEditable(false);
        
        panel1.add(id);
        panel1.add(txt_id);
        panel1.add(name);
        panel1.add(txt_name);
        panel1.add(money);
        panel1.add(txt_money);
        panel1.add(dps);
        panel1.add(wd);
        panel2.add(panel1);
        frame.add(panel2);
        
        dps.addActionListener(this);
        wd.addActionListener(this);
        frame.addWindowListener(this);
        
        panel1.setLayout(new GridLayout(4,2));
        frame.setSize(230,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        num = Integer.parseInt(txt_money.getText());
        if (e.getSource().equals(dps)) {
            txt_money.setText((num + 100) + "");
        } else if (e.getSource().equals(wd)) {
            txt_money.setText((num - 100) + "");
        }
    }

    @Override
    public void windowOpened(WindowEvent we) {
        if (new File ("StudentM.dat").exists()) {
            try (FileInputStream fis = new FileInputStream("StudentM.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            std = (Student) ois.readObject();
            txt_id.setText(std.getID() + "");
            txt_name.setText(std.getName() + "");
            txt_money.setText(std.getMoney() + "");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent we) {
        try (FileOutputStream fos = new FileOutputStream("StudentM.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(std);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}
