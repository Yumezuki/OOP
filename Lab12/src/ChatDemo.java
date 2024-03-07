import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import javax.swing.*;
import java.io.*;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame frame;
    private JPanel panel1, panel2;
    private JTextArea area;
    private JTextField text;
    private JButton submit, reset;

    public ChatDemo() {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        area = new JTextArea("",20, 45);
        text = new JTextField(45);
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        
        panel2.add(submit);
        panel2.add(reset);
        panel1.add(area);
        panel1.add(text);
        panel1.add(panel2);
        frame.add(panel1);
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        frame.addWindowListener(this);
        
        area.setEnabled(false);
        frame.setVisible(true);
        frame.setSize(470, 435);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submit)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            area.append(dtf.format(LocalDateTime.now()) + ": " + text.getText() + "\n");
            text.setText("");
        }
        else if (e.getSource().equals(reset)) {
            area.setText("");
        }
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
        if (new File ("ChatDemo.dat").exists()) {
            try (FileInputStream fr = new FileInputStream("ChatDemo.dat");) {
                int st = fr.read();
                while (st != -1) {
                    area.setText(area.getText() + (char) st);
                    st = fr.read();
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    @Override
    public void windowClosing(WindowEvent we) {
        try (FileOutputStream fw = new FileOutputStream("ChatDemo.dat");) {
            for (int st = 0; st < area.getText().length(); st++) {
                fw.write(area.getText().charAt(st));
            }
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
