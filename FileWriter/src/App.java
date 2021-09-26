import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("poem.txt");
        try {
            writer.write("Roses are red znViolets are blue \nBooty booty booty booty \n Rockin");
            writer.append("\n(A poem by Bro)");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            writer.close();
        }
    }
}
