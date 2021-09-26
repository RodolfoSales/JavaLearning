import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        //JPanel =  a GUI component that functions as a contaner to hold other components
        ImageIcon icon = new ImageIcon("download.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel redpanel = new JPanel();
        JPanel bluepanel = new JPanel();
        JPanel greenpanel = new JPanel();
        
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0,0,250,250);
        

        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.add(redpanel);
        frame.add(greenpanel);
        frame.add(bluepanel);
        greenpanel.add(label);
        frame.setVisible(true);
    }
}
