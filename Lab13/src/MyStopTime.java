import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyStopTime implements MouseListener {
    private JFrame frame;
    private Timer time;
    private Thread t;
    
    public MyStopTime() {
        frame = new JFrame();
        time = new Timer();
        t = new Thread(time);
        
        t.start();
        frame.add(time);
        time.addMouseListener(this);
        
        frame.setSize(300,100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(time)) {
            if (! time.isPausing()) {
                time.pause();
            }
            else {
                time.resume();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MyStopTime();
    }
}
