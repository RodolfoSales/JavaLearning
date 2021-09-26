import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button = new JButton("File");
    JFileChooser filechooser = new JFileChooser();
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.button.addActionListener(this);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.button){
            this.filechooser.setCurrentDirectory(new File("."));//opens direct in the project folder
            int response = this.filechooser.showOpenDialog(null);//select file to open
            //int response = this.filechooser.showSaveDialog(null);
            if (response== JFileChooser.APPROVE_OPTION) {
                File file =  new File(this.filechooser.getSelectedFile().getAbsolutePath());
                                
            }
        }
    }
}