import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Sliderdemo implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    
    Sliderdemo(){
        this.frame = new JFrame("Slider Demo");
        this.panel = new JPanel();
        this.label = new JLabel();
        this.slider = new JSlider(0,100,50);

        this.slider.setPreferredSize(new Dimension(400,200));
        this.slider.setPaintTicks(true);
        this.slider.setMinorTickSpacing(10);

        this.slider.setPaintTrack(true);
        this.slider.setMajorTickSpacing(25);
        this.slider.addChangeListener(this);

        this.label.setText("C = "+this.slider.getValue());

        this.slider.setPaintLabels(true);
        this.slider.setFont(new Font("MV Boli",Font.PLAIN, 15));
        this.slider.setOrientation(SwingConstants.VERTICAL);



        this.panel.add(slider);
        this.panel.add(label);
        this.frame.add(panel);
        this.frame.setSize(420,420);
        this.frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e){
        this.label.setText("C = "+this.slider.getValue());
    }
}
