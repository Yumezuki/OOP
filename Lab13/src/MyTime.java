import javax.swing.*;
import java.awt.*;

public class MyTime {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Timer time = new Timer();
        Thread t = new Thread(time);
        
        t.start();
        frame.add(time);
        
        frame.setSize(300,100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    }
}
