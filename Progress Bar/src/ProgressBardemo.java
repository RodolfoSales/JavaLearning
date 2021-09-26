import java.awt.*;
import javax.swing.*;


public class ProgressBardemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBardemo(){
        this.bar.setValue(0);
        this.bar.setBounds(0, 0, 420, 50);
        this.bar.setStringPainted(true);

        this.frame.add(this.bar);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(420,420);
        this.frame.setLayout(null);
        this.frame.setVisible(true);

        fill();
    }
    public void fill(){
        int counter = 0;
        while (counter<=100) {
            
            this.bar.setValue(counter);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            counter += 10;
        }
        bar.setString("Done!");
    }
    
}
