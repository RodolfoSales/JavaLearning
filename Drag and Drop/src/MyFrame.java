import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{
    DragPanel drag = new DragPanel();

    MyFrame(){
        this.add(drag);
        this.setTitle("Drag & Drop");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }

}