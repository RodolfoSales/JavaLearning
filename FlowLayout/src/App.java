import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class App {
    public static void main(String[] args) throws Exception {
        //Layout Manager = Defines the natural layout for components within a container
        //FlowLayout =  places components in a row, sized at their preferred size.
        //              If the horizontal space in the container is too small,
        //              the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));//last two number are needed to specify spacing
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());//by default panel already uses FlowLayout

        for (int i = 1; i <=9 ; i++) {
            panel.add(new JButton(String.format("%d",i)));
        }
        frame.add(panel);
        frame.setVisible(true);
    
    
    }
}
