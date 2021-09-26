import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
public class App {
    public static void main(String[] args) throws Exception {
        // Layout Manager = Defines the natural layout for components within a container
        //GridLayout = places components in a grid of cells.
        //             Each component takes all the available space within its cell,
        //             and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,20,20));


        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton(String.format("%d",i)));
        }


        frame.setVisible(true);

    }
}
