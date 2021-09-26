import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.*;


public class MyPanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image image;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 200;
    int yVelocity = 100;
    int x = 0;
    int y = 0;

    MyPanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        image = new ImageIcon("download1.png").getImage();
        backgroundImage = new ImageIcon("download2.png").getImage();
        timer = new Timer(1000, this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(backgroundImage, 0, 0, null);
        g2d.drawImage(image, x, y, null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (x>=PANEL_WIDTH-image.getWidth(null) || x < 0) {
            xVelocity = xVelocity * (-1);
        } 

        if (y>=PANEL_HEIGHT-image.getHeight(null)|| y < 0) {
            yVelocity = yVelocity * (-1);
        }


        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
        
    }


}
