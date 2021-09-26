import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.management.ObjectName;

public class App {
    public static void main(String[] args) throws Exception {
        // Step to Deserialize
        // 1- Declare your object(don't instantiate)
        // 2- Your class should implement Serializable interface
        // 3- add import java.ioi.Serializable;
        // 4- File InputStream fileIn = new FileInputStream(file path);
        // 5- ObjectInputStream in =  new ObjectInputStream(fileIn);
        // 6- objectName = (Class) in.readObject();
        // 7- in.close(); fileIn.close();
    
        User user = null;

        FileInputStream fileIn = new FileInputStream("/home/rodolfolms/Desktop/JavaLearning/Serialize/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
    
        System.out.println(user.name);
        System.out.println(user.password);
        
    }
}
