import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
    
    JButton button = new JButton();
    JCheckBox checkBox = new JCheckBox();
    ImageIcon xIcon = new ImageIcon("x.png");
    ImageIcon checkIcon = new ImageIcon("checkmark.png");
    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        this.button.setText("submit");
        this.button.addActionListener(this);


        
        this.checkBox.setText("text");
        this.checkBox.setFocusable(false);
        this.checkBox.setFont(new Font("Consolas",Font.PLAIN,25));
        this.checkBox.setIcon(xIcon);
        this.checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.button){
            System.out.println(this.checkBox.isSelected()); 

        }
    }

}
