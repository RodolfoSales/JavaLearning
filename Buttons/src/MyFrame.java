import javax.swing.BorderFactory;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    MyFrame(){
        ImageIcon icon = new ImageIcon("download.png");
        
        button = new JButton();
        //button.addActionListener(e -> System.out.println("Clicked"));
        button.addActionListener(this);
        button.setBounds(200,100,200,100);
        button.setText("I'm a button!");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 15));
        button.setIconTextGap(-10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);
        //button.setBorder(BorderFactory.createEmptyBorder());
        //button.setContentAreaFilled(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("Clicked");
        }
    }
}



//ImageIcon icon = ...//;

//JLabel button = new JLabel(icon)//;

//button.addMouseListener(new MouseAdapter() {
//  @Override
//  public void mouseClicked(MouseEvent e) {
//     ... handle the click ...
//  }
//});