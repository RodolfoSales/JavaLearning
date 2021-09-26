import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        // Jframe =  a GUI window to add components to
        /*
        JFrame frame = new JFrame(); //creates a frame
        ImageIcon image = new ImageIcon(App.class.getResource("download.png")); //create an ImageIcon
        frame.setTitle("JFrame title goes here");//sets title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exist out of application
        frame.setResizable(false);//prevent frame from being resized
        frame.setSize(420,420);//sets the x and y
        frame.setIconImage(image.getImage());//change icon of frame
        frame.getContentPane().setBackground(new Color(255,255,255));//change color of background
        
        frame.setVisible(true); //make frame visible
            */
 
        //MyFrame myframe = new MyFrame();
        new MyFrame();
    }
}
