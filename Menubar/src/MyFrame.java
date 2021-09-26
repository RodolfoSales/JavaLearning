import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MyFrame extends JFrame implements ActionListener{
    JMenuBar menuBar =  new JMenuBar();
    JMenu fileMenu =  new JMenu("File");
    JMenu editMenu =  new JMenu("edit");
    JMenu helpMenu =  new JMenu("help");
    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        this.loadItem.addActionListener(this);
        this.saveItem.addActionListener(this);
        this.exitItem.addActionListener(this);

        this.loadItem.setMnemonic(KeyEvent.VK_L); //l  for load
        this.saveItem.setMnemonic(KeyEvent.VK_S); //S  for save
        this.exitItem.setMnemonic(KeyEvent.VK_E); //S  for exit
        this.fileMenu.setMnemonic(KeyEvent.VK_F); //alt+F  for File
        this.editMenu.setMnemonic(KeyEvent.VK_E); //alt+E  for edit
        this.helpMenu.setMnemonic(KeyEvent.VK_H); //alt+H  for help

        this.fileMenu.add(loadItem);
        this.fileMenu.add(saveItem);
        this.fileMenu.add(exitItem);

        this.menuBar.add(fileMenu);
        this.menuBar.add(editMenu);
        this.menuBar.add(helpMenu);

        this.setJMenuBar(this.menuBar);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.loadItem){
            System.out.println("Load");
        }
        else if(e.getSource()==this.saveItem){
            System.out.println("save");
        }
        else if(e.getSource()==this.exitItem){
            System.out.println("Exit");
        }

    }
    
}
