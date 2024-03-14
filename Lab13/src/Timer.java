import java.awt.*;
import javax.swing.*;

public class Timer extends JLabel implements Runnable {
    private int time=0;
    private final Object lock = new Object();
    private boolean pausing;

    public boolean isPausing() {
        return pausing;
    }
    
    public void pause () {
        synchronized (lock) {
            pausing = true;
        }
    }
    
    public void resume () {
        synchronized (lock) {
            pausing = false;
            lock.notifyAll();
        }
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                synchronized (lock) {
                    while (pausing) {
                        lock.wait();
                    }
                }
                time++;

                setFont(new Font("Arial Black", Font.PLAIN, 40));
                setText(String.format("%02d : %02d : %02d", time / 3600, (time / 60) % 60, time % 60));
                
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
