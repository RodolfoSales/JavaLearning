import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
public class MyPanel extends JPanel{

    Image image;

    MyPanel(){
        image =  new ImageIcon("donwload.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        
        //g2d.setPaint(Color.red);
        //g2d.setStroke(new BasicStroke(5));
        //g2d.fillRect(0, 0, 100, 100);;
        //g2d.drawLine(0, 0, 500, 500);
        //g2d.drawRect(0,0,100,100);
        //g2d.setPaint(Color.orange);
        //g2d.drawOval(0, 0, 100, 100);
        //g2d.setPaint(Color.red);
        //g2d.drawArc(0, 0, 100, 100, 0, 180);
        //g2d.fillArc(0, 0, 100, 100, 0, 180);
        
        //int[] xPoints = {150,250,350};
        //int[] yPoints = {300,150,300};
        //g2d.drawPolygon(xPoints,yPoints,3);
        //g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
        //g2d.drawString("You", 50, 50);

        g2d.drawImage(image, 0, 0, null);
    }
}
