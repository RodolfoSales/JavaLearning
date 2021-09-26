import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class App {
    public static void main(String[] args) throws Exception {
        //JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("download.png");
        Border border = BorderFactory.createLineBorder(Color.CYAN, 3);
        
        JLabel label = new JLabel("Do you code?");//create a label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left, center, right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, Center, bottom of imageicon
        label.setForeground(new Color(0x00FF00));//set font color of text
        label.setFont(new Font("MV Boli",Font.BOLD,20));//set font of text
        label.setIconTextGap(100);//set gap of text to image
        label.setBackground(Color.black);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,250,250);//set x,y position within frame as well as dimensions

        
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.add(label);
        frame.pack();//adjust the size of your window to the size of the labels that you have
        frame.setVisible(true);
    }
}
