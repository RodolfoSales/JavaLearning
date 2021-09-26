import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Newindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");
    
    
    Newindow(){
        this.label.setBounds(0,0,100,50);
        this.label.setFont(new Font(null, Font.PLAIN, 25));
        this.frame.add(this.label);

        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(420,420);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }
}
