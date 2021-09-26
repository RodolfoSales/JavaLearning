import java.io.File;
public class App {
    public static void main(String[] args) throws Exception {
        // file = An abstract representation of file and directory pathnames
        File file = new File("Myfile.txt");

        if (file.exists()) {
            System.out.println("File Exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        } else {
            System.out.println("FIle doens't exist");
        }
    }
}
