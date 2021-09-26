import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener{
    JRadioButton radioButton1 = new JRadioButton("op 1");
    JRadioButton radioButton2 = new JRadioButton("op 2");
    JRadioButton radioButton3 = new JRadioButton("op 3");
    ButtonGroup group = new ButtonGroup();
    //ImageIcon op1Icon = new ImageIcon("op1.png");
    //ImageIcon op2Icon = new ImageIcon("op2.png");
    //ImageIcon op3Icon = new ImageIcon("op3.png");

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        this.group.add(radioButton1);
        this.group.add(radioButton2);
        this.group.add(radioButton3);

        this.radioButton1.addActionListener(this);
        this.radioButton2.addActionListener(this);
        this.radioButton3.addActionListener(this);

        //this.radioButton1.setIcon(op1Icon);

        this.add(this.radioButton1);
        this.add(this.radioButton2);
        this.add(this.radioButton3);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.radioButton1){
            System.out.println("op 1");
        }
        else if(e.getSource()==this.radioButton2){
            System.out.println("op 2");
        }
        else if(e.getSource()==this.radioButton3){
            System.out.println("op 3");
        }
    }  
}
