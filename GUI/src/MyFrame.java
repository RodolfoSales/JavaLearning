import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){

        ImageIcon image = new ImageIcon(App.class.getResource("download.png")); //create an ImageIcon
        this.setTitle("JFrame title goes here");//sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exist out of application
        this.setResizable(false);//prevent this from being resized
        this.setSize(420,420);//sets the x and y
        this.setIconImage(image.getImage());//change icon of this
        this.getContentPane().setBackground(new Color(255,255,255));//change color of background
        
        this.setVisible(true); //make this visible
    }
}
