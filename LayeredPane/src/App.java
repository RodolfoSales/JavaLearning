import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.security.auth.x500.X500Principal;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class App {
    public static void main(String[] args) throws Exception {
        //JLayeredPane = Swing container that provides a third dimension for positioning components
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        Color[] colors = {Color.BLUE, Color.RED,Color.green};

        JLabel[] label = {label1, label2, label3};
        JLayeredPane layeredpane =  new JLayeredPane();

        for (int i = 1; i <=label.length; i++) {
            label[i-1].setOpaque(true);
            label[i-1].setBackground(colors[i-1]);
            label[i-1].setBounds(50*i,50*i,200,200);
            //layeredpane.add(label[i-1]);
        }
        layeredpane.setBounds(0,0,500,500);
        //layeredpane.add(label1, JLayeredPane.DEFAULT_LAYER);
        //layeredpane.add(label2,JLayeredPane.DEFAULT_LAYER);
        //layeredpane.add(label3, JLayeredPane.DRAG_LAYER);

        layeredpane.add(label1, Integer.valueOf(0));
        layeredpane.add(label2, Integer.valueOf(0));
        layeredpane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.add(layeredpane);
        frame.setVisible(true);


    }
}
