import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Poring extends Thread implements MouseListener{
    private JFrame frame;
    private JLabel img_num;
    private Random rd;
    private Dimension dms;
    
    public Poring(int num) {
        ImageIcon icon = new ImageIcon(getClass().getResource("img-poring.png"));
        
        frame = new JFrame();
        img_num = new JLabel(String.valueOf(num), icon, JLabel.CENTER);
        rd = new Random();
        dms = Toolkit.getDefaultToolkit().getScreenSize();
        
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        
        frame.add(img_num);
        
        img_num.addMouseListener(this);
        
        frame.setLocation(rd.nextInt(dms.width - frame.getWidth()), rd.nextInt(dms.height - frame.getHeight()));
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(img_num)) {
            frame.dispose();
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
    
    public void run() {
        while(true) {
            try {
                Thread.sleep(120);
                frame.setLocation((frame.getX() + 5), frame.getY() + 5);
                Thread.sleep(120);
                frame.setLocation((frame.getX() - 5), frame.getY() - 5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}