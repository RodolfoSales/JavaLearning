import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton("SUbmit");
    JTextField textField = new JTextField();
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        
        this.textField.setPreferredSize(new Dimension(250,40));
        this.textField.setFont(new Font(null,Font.PLAIN,35));
        this.textField.setForeground(Color.BLACK);
        this.textField.setBackground(Color.blue);
        this.textField.setCaretColor(Color.white);
        this.textField.setText("user");
        //this.textField.setEditable(false);
        
        
        this.button.addActionListener(this);

        this.add(textField);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.button){
            System.out.println(this.textField.getText()); 
            this.button.setEnabled(false);
            this.textField.setEditable(false);
        }
    }
}
