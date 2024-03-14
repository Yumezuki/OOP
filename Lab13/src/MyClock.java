import java.awt.*;
import java.util.*;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {
    private Calendar d;
    private int sec, min, hour;

    @Override
    public void run() {
        while (true) {
            try {
                d = Calendar.getInstance();
                sec = d.get(Calendar.SECOND);
                min = d.get(Calendar.MINUTE);
                hour = d.get(Calendar.HOUR_OF_DAY);

                setFont(new Font("Arial Black", Font.PLAIN, 40));
                setText(String.format("%02d : %02d : %02d", hour, min, sec));
                
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
