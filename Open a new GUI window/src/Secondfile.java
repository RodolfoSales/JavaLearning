import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class Secondfile implements ActionListener{
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    Secondfile(){
        this.myButton.setBounds(100,160,200,40);
        this.myButton.setFocusable(false);
        this.myButton.addActionListener(this);
        this.frame.add(this.myButton);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(420,420);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.myButton){
            this.frame.dispose();
            Newindow myWindow = new Newindow();

        }
    }
}
