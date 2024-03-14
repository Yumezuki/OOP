import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PoringConstructor implements ActionListener{
    private JFrame frame;
    private JButton button;
    private int num;
    
    public PoringConstructor() {
        frame = new JFrame();
        button = new JButton("Add");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(button);
        
        button.addActionListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button)) {
            num += 1;
            new Poring(num).start();
        }
    }
    
    public static void main(String[] args) {
        new PoringConstructor();
    }
}
