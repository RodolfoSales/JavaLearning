import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        // Layout Manager = defines the natural layout for components within a container
        //3 commom managers
        //BorderLayout =  A BorderLayout places components in five areas: North, South, West, East, Center
        //                All extra space is placed in the center area
        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));//BorderLayout(10,10) sets margin among panels
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,50));
        panel2.setPreferredSize(new Dimension(100,50));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(50,100));
        panel5.setPreferredSize(new Dimension(50,100));
//------------------------------------------------------------------------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.gray);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.lightGray);
        panel9.setBackground(Color.black);
        panel10.setBackground(Color.white);

        panel3.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel3.add(panel6,BorderLayout.NORTH);
        panel3.add(panel7,BorderLayout.SOUTH);
        panel3.add(panel8,BorderLayout.CENTER);
        panel3.add(panel9,BorderLayout.WEST);
        panel3.add(panel10,BorderLayout.EAST);


        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.EAST);
    }
}
