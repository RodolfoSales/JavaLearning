import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something

        
        //JOptionPane.showMessageDialog(null, "This is some info","Title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some info","Title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some info","Title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some info","Title",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is some info","Title",JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null, "Body","Title",JOptionPane.OK_CANCEL_OPTION);
        //String name = JOptionPane.showInputDialog(null, "inputdialog");

        String[] responses = {"No","Thankyou","Cy@"};
        ImageIcon icon= new ImageIcon("download.png");
        JOptionPane.showOptionDialog(
            null, "message",
            "title", JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, icon, 
            responses, 0);
    }
}
