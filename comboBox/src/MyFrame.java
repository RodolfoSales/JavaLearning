import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
    
    String[] animals = {"dog","cat","bird"};
    JComboBox comboBox = new JComboBox(animals);

    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        this.comboBox.addActionListener(this);
        //this.comboBox.getItemCount();
        this.comboBox.setEditable(true);
        this.comboBox.addItem("horse");
        this.comboBox.insertItemAt("pig", 0);
        this.comboBox.setSelectedIndex(0);
        this.comboBox.removeItem("dog");
        this.comboBox.removeItemAt(0);
        
        this.add(this.comboBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.comboBox){
            //System.out.println(comboBox.getSelectedItem());
            switch (this.comboBox.getSelectedIndex()) {
                case 0: System.out.println(this.animals[0]);
                break;
                case 1: System.out.println(this.animals[1]);
                break;
                case 2: System.out.println(this.animals[2]);
                break;
            
                default:
                    break;
            } 
        }
    }
}
